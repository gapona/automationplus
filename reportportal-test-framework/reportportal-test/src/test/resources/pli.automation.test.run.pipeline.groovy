pipeline {

environment {
	PATH_TO_COMMON = "./Jenkins/pli.automation.common.groovy"
}
	
  agent any

  stages {

    stage('Preparetion') {
      steps {
        script {
			def COMMON_LIBRARY = load(env.PATH_TO_COMMON)
			
			 //force assign of run parameters
			env.ReportPortalConfiguration__Launch__Mode = 'Default'
			env.DriverConfiguration__RunType = 'Remote'
	
			env.ReportPortalConfiguration__Launch__Name = env.REPORT_NAME
			env.EnvironmentConfiguration__SelectedEnvironment = env.ENVIRONMENT
            env.SecretKey = COMMON_LIBRARY.GET_SECRET('sensitive_data_secret_key')
			
			def web_project_path = COMMON_LIBRARY.GET_WEB_PROJECT_NAME()
			STAGE_TESTS_RUN(web_project_path)
        }
      }
    }
  }
  post {
    always {
      script {
        echo "********** Post action started ********** "
        def buildStatus = currentBuild.currentResult
        if (buildStatus == 'UNSTABLE') {
          echo 'Some tests failed'
        }
        cleanWs()
        echo "********** Post action completed ********** "
      }
    }
  }
}

def TESTS_RUN(def projectName) {

  def stageName = "Run tests by type"

  echo "********** ${stageName} started ********** "
  catchError(buildResult: 'UNSTABLE', stageResult: 'UNSTABLE') {
    def run_test_command = "dotnet test ${projectName} --filter TestCategory=${TEST_TYPE} --nologo"
    sh "${run_test_command}"
  }

  echo "********** ${stageName} completed ********** "
}

def STAGE_TESTS_RUN(def projectName) {
  def stageName = 'Run tests by type'
  return stage("${stageName}") {
    TESTS_RUN(projectName)
  }
}
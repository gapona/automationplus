pipeline {

  agent any

  environment {
    JAVA_HOME ="C:/Program Files/Java/jdk1.8.0_321"
    PATH = "C:\\WINDOWS\\SYSTEM32"
  }
  tools {
    maven "maven"
    git "Default"
  }
  stages {
    stage('Build') {
      steps {
        git 'https://github.com/gapona/automationplus/'
        dir("C:/Users/Andrii_Hapon/Desktop/automation plus/github/reportportal-test-framework") {
          bat "mvn -Dmaven.test.failure.ignore=true clean package"
        }
      }
    }

    stage('Test') {
      steps {
        dir("C:/Users/Andrii_Hapon/Desktop/automation plus/github/reportportal-test-framework") {
          bat "mvn -Dmaven.test.failure.ignore=true clean package"
          bat "mvn -pl :reportportal-test test"

        }
      }}

  }
}
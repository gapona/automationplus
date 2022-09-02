package core.utils.enums;

import lombok.Getter;

public enum SeverityLevels {

    CRITICAL("CRITICAL"),
    MAJOR("MAJOR"),
    MODERATE("MODERATE"),
    LOW("LOW");

    @Getter
    private String type;

    SeverityLevels(String type) {
        this.type = type;
    }
}

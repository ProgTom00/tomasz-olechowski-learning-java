package com.patterns2.singleton;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public enum SettingsFileEngine {
    INSTANCE;

    private String fileName = "";

    public String getFileName() {
        return fileName;
    }

    public void open(final String fileName) {
        this.fileName = fileName;
        log.info("Opening the settings file");
    }

    public void close() {
        this.fileName = "";
        log.info("Closing the settings file");
    }

    public boolean loadSettings() {
        log.info("Loading settings from file");
        return true;
    }

    public boolean saveSettings() {
        log.info("Saving settings to file");
        return true;

    }
}

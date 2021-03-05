package com.epam.jwd.core_final.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * This class should be IMMUTABLE!
 * <p>
 * Expected fields:
 * <p>
 * inputRootDir {@link String} - base dir for all input files
 * outputRootDir {@link String} - base dir  for all output files
 * crewFileName {@link String}
 * missionsFileName {@link String}
 * spaceshipsFileName {@link String}
 * <p>
 * fileRefreshRate {@link Integer}
 * dateTimeFormat {@link String} - date/time format for {@link java.time.format.DateTimeFormatter} pattern
 */
public class ApplicationProperties {
    //todo
    String inputRootDir="src/main/resources/input";
    String outputRootDir="src/main/resources/output";
    String crewFileName="crew";
    String missionsFileName="spacemap";
    String spaceshipsFileName="spaceships";
    Integer fileRefreshRate;
    String dateTimeFormat;


    public String getInputRootDir() {
        return inputRootDir;
    }

    public void setInputRootDir(String inputRootDir) {
        this.inputRootDir = inputRootDir;
    }

    public String getOutputRootDir() {
        return outputRootDir;
    }

    public void setOutputRootDir(String outputRootDir) {
        this.outputRootDir = outputRootDir;
    }

    public String getCrewFileName() {
        return crewFileName;
    }

    public void setCrewFileName(String crewFileName) {
        this.crewFileName = crewFileName;
    }

    public String getMissionsFileName() {
        return missionsFileName;
    }

    public void setMissionsFileName(String missionsFileName) {
        this.missionsFileName = missionsFileName;
    }

    public String getSpaceshipsFileName() {
        return spaceshipsFileName;
    }

    public void setSpaceshipsFileName(String spaceshipsFileName) {
        this.spaceshipsFileName = spaceshipsFileName;
    }

    public Integer getFileRefreshRate() {
        return fileRefreshRate;
    }

    public void setFileRefreshRate(Integer fileRefreshRate) {
        this.fileRefreshRate = fileRefreshRate;
    }

    public String getDateTimeFormat() {
        return dateTimeFormat;
    }

    public void setDateTimeFormat(String dateTimeFormat) {
        this.dateTimeFormat = dateTimeFormat;
    }
}

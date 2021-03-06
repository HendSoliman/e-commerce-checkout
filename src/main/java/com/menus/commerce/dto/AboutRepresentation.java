package com.menus.commerce.dto;


import lombok.Value;

@Value
public class AboutRepresentation {
    private String appName;
    private String buildNumber;
    private String buildTime;
    private String deployTime;
    private String gitRevision;
    private String gitBranch;
    private String environment;

}

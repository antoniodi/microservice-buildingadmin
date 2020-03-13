package com.org.building.admin.application.acl.dto.http;

import com.org.building.admin.domain.model.BuildingType;

import java.time.LocalDate;

public class BuildingRequestDTO {

    private BuildingType buildingType;
    private LocalDate aRequestDate;
    private CoordinatesDTO aPosition;

    public BuildingType getBuildingType() {
        return buildingType;
    }

    public CoordinatesDTO getPosition() {
        return aPosition;
    }
}

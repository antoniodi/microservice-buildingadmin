package com.org.building.admin.application.services;

import com.org.building.admin.application.acl.dto.http.BuildingRequestDTO;
import com.org.building.admin.domain.contracts.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class BuildingService {

    @Autowired
    private InventoryService anInventoryService;

    @Autowired
    private InventoryRepository anInventoryRepository;

    public Boolean doBuildingRequest(BuildingRequestDTO aBuildingRequest) {
        anInventoryRepository.findExistences()
    }

}

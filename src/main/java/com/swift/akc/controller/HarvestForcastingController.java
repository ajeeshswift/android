package com.swift.akc.controller;

import com.swift.akc.dto.ResponseListDTO;
import com.swift.akc.entity.CommunityHarvestForecasting;
import com.swift.akc.model.HarvestForcastingModel;
import com.swift.akc.repository.CommunityHarvestForecastingRepository;
import com.swift.akc.service.HarvestForcastingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class HarvestForcastingController {
    private final HarvestForcastingService harvestForcastingService;

    @GetMapping("/harvestForcastingList")
    public ResponseListDTO getHarvestForeCasting(){
    final ResponseListDTO responseListDTO = new ResponseListDTO();
    responseListDTO.setData(harvestForcastingService.fetchAllHarvestForecastingDetails());
    return responseListDTO;
    }

    @PostMapping("/harvestForcasting")
    public CommunityHarvestForecasting add(@RequestBody HarvestForcastingModel harvestForcastingModel) {
        return harvestForcastingService.saveorUpdate(harvestForcastingModel);
    }
}

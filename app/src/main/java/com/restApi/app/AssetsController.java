package com.restApi.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/assets")
@CrossOrigin
public class AssetsController {
    @Autowired
    private AssetsRepository assetsRepository;

    @GetMapping
    public List<Asset> getAllAssets() {
        return (List<Asset>) assetsRepository.findAll();
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> insertAsset(@RequestBody Asset asset) {
        try {
            assetsRepository.save(asset);
            return new ResponseEntity<>(null, HttpStatus.OK);
        }
        catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}

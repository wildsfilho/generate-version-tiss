package com.generator.tiss.controllers;

import com.generator.tiss.domain.DtoSendDefault;
import com.generator.tiss.service.DtoSendDefaultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/default")
public class SendDefaultApi {

    @Autowired
    DtoSendDefaultService dtoSendDefaultService;

    @GetMapping("/send-defaults")
    public ResponseEntity<DtoSendDefault> getSendDefault() {
        DtoSendDefault dtoSendDefault = dtoSendDefaultService.returnResultDefault();
        return ResponseEntity.ok(dtoSendDefault);
    }
}

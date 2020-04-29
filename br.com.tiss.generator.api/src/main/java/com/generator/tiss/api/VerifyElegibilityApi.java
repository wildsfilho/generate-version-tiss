package com.generator.tiss.api;

import com.generator.tiss.domain.DtoResponseStandard;
import com.generator.tiss.service.VerifiyElegibilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/verify-elegibility")
public class VerifyElegibilityApi {

    @Autowired
    VerifiyElegibilityService verifiyElegibilityService;

    @GetMapping("/get-verify-elegibility/{version}")
    public ResponseEntity<DtoResponseStandard> getVerifyElegibility(@PathVariable("version") String version) {
        DtoResponseStandard dtoResponseStandard = verifiyElegibilityService.choiceVersion(version);
        return ResponseEntity.ok(dtoResponseStandard);
    }
}

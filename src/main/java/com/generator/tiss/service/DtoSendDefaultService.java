package com.generator.tiss.service;

import com.generator.tiss.domain.DtoSendDefault;
import org.springframework.stereotype.Service;

@Service
public class DtoSendDefaultService {

    DtoSendDefault dtoSendDefault;


    public DtoSendDefault returnResultDefault(){
        DtoSendDefault dtoSendDefault = new DtoSendDefault("Teste", "ServiceTiss", 1L);
        return dtoSendDefault;
    }
}

package com.generator.tiss.service;

import com.generator.tiss.domain.DtoResponseStandard;
import com.generator.tiss.translator.TranslatorV30305;
import com.generator.tiss.translator.Versions;
import com.generator.tiss.versions.v30305.PedidoElegibilidadeWS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VerifiyElegibilityService {


    @Autowired
    TranslatorV30305 translatorV30305;

    public DtoResponseStandard choiceVersion(String version) {

        switch (version) {
            case Versions.VERSION_v3_03_05:
                PedidoElegibilidadeWS pedidoElegibilidadeWS = translatorV30305.translate_order_eligibity();
                DtoResponseStandard dtoSendDefault = new DtoResponseStandard("teste", "PedidoElegibilidade", pedidoElegibilidadeWS, 1);
                return dtoSendDefault;
            case Versions.VERSION_v3_03_06:
                return null;
        }
        return null;
    }

}

package com.generator.tiss.service;

import br.gov.ans.padroes.tiss.schemas.v30500.PedidoElegibilidadeWS;
import com.generator.tiss.domain.DtoResponseStandard;
import com.generator.tiss.translator.TranslatorV30305;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.generator.tiss.translator.Versions.VERSION_v3_03_06;
import static com.generator.tiss.translator.Versions.VERSION_v3_05_00;

@Service
public class VerifiyElegibilityService {


    @Autowired
    TranslatorV30305 translatorV30305;

    public DtoResponseStandard choiceVersion(String version) {

        switch (version) {
            case VERSION_v3_05_00:
                PedidoElegibilidadeWS pedidoElegibilidadeWS = translatorV30305.translate_order_eligibity();
                DtoResponseStandard dtoSendDefault = new DtoResponseStandard("teste", "PedidoElegibilidade", pedidoElegibilidadeWS, 1);
                return dtoSendDefault;
            case VERSION_v3_03_06:
                return null;
        }
        return null;
    }

}

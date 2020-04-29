package com.generator.tiss.translator;

import br.gov.ans.padroes.tiss.schemas.v30500.*;
import com.generator.tiss.utils.GeneratorHashMd5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.xml.datatype.XMLGregorianCalendar;

import static com.generator.tiss.translator.Versions.VERSION_v3_05_00;

@Component
public class TranslatorV30305 {


    @Autowired
    private GeneratorHashMd5Utils generatorHashMd5Utils;

    public PedidoElegibilidadeWS translate_order_eligibity() {

        PedidoElegibilidadeWS pedidoElegibilidadeWS = new PedidoElegibilidadeWS();
        pedidoElegibilidadeWS.setCabecalho(createHeaderTransaction());
        pedidoElegibilidadeWS.setPedidoElegibilidade(createElegibilityVerify());

        // gerar o verifica Elegibilidade montar o xml e mandar para o gerador de hash;
        // talvez usar o XStream para gerar;

        pedidoElegibilidadeWS.setHash(generatorHashMd5Utils.generateHash(pedidoElegibilidadeWS.getPedidoElegibilidade()));

        //validar se precisa do signature;
        //pedidoElegibilidadeWS.setSignature();

        return pedidoElegibilidadeWS;
    }

    private CtElegibilidadeVerifica createElegibilityVerify() {
        CtContratadoDados dadosContratado = new CtContratadoDados();
        dadosContratado.setCnpjContratado("123");
        dadosContratado.setCodigoPrestadorNaOperadora("1234");
        dadosContratado.setCpfContratado("123");
        dadosContratado.setNomeContratado("nome");

        String numeroCarteira = "";
        String nomeBeneficiario = "";
        String numeroCNS = "";
        String tipoIdent = "";
        XMLGregorianCalendar validadeCarteira = null;
        String ausenciaCodValidacao = "";
        String codValidacao = "";


        CtElegibilidadeVerifica ctElegibilidadeVerifica = new CtElegibilidadeVerifica();
        ctElegibilidadeVerifica.setAusenciaCodValidacao(ausenciaCodValidacao);
        ctElegibilidadeVerifica.setCodValidacao(codValidacao);
        ctElegibilidadeVerifica.setDadosPrestador(dadosContratado);
        ctElegibilidadeVerifica.setNomeBeneficiario(nomeBeneficiario);
        ctElegibilidadeVerifica.setNumeroCarteira(numeroCarteira);
        ctElegibilidadeVerifica.setNumeroCNS(numeroCNS);
        ctElegibilidadeVerifica.setTipoIdent(tipoIdent);
        ctElegibilidadeVerifica.setValidadeCarteira(validadeCarteira);

        return ctElegibilidadeVerifica;
    }

    private CabecalhoTransacao createHeaderTransaction() {

        CabecalhoTransacao.IdentificacaoTransacao identificacaoTransacao = new CabecalhoTransacao.IdentificacaoTransacao();

        identificacaoTransacao.setDataRegistroTransacao(null);
        identificacaoTransacao.setHoraRegistroTransacao(null);
        identificacaoTransacao.setSequencialTransacao(null);
        identificacaoTransacao.setTipoTransacao(DmTipoTransacao.VERIFICA_ELEGIBILIDADE);

        CabecalhoTransacao.Origem origem = new CabecalhoTransacao.Origem();


        CabecalhoTransacao.Destino destino = new CabecalhoTransacao.Destino();

        CtLoginSenha loginSenha = new CtLoginSenha();

        CabecalhoTransacao cabecalhoTransacao = new CabecalhoTransacao(identificacaoTransacao, origem, destino, VERSION_v3_05_00, loginSenha);

        return cabecalhoTransacao;
    }
}

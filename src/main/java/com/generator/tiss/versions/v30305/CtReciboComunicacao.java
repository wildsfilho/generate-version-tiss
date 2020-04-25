//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2020.04.25 �s 04:37:47 AM BRT 
//


package com.generator.tiss.versions.v30305;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ct_reciboComunicacao complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_reciboComunicacao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="mensagemErro" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_motivoGlosa"/>
 *         &lt;element name="reciboComunicacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}ctm_beneficiarioComunicacaoRecibo"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_reciboComunicacao", propOrder = {
    "mensagemErro",
    "reciboComunicacao"
})
public class CtReciboComunicacao {

    protected CtMotivoGlosa mensagemErro;
    protected CtmBeneficiarioComunicacaoRecibo reciboComunicacao;

    /**
     * Obt�m o valor da propriedade mensagemErro.
     * 
     * @return
     *     possible object is
     *     {@link CtMotivoGlosa }
     *     
     */
    public CtMotivoGlosa getMensagemErro() {
        return mensagemErro;
    }

    /**
     * Define o valor da propriedade mensagemErro.
     * 
     * @param value
     *     allowed object is
     *     {@link CtMotivoGlosa }
     *     
     */
    public void setMensagemErro(CtMotivoGlosa value) {
        this.mensagemErro = value;
    }

    /**
     * Obt�m o valor da propriedade reciboComunicacao.
     * 
     * @return
     *     possible object is
     *     {@link CtmBeneficiarioComunicacaoRecibo }
     *     
     */
    public CtmBeneficiarioComunicacaoRecibo getReciboComunicacao() {
        return reciboComunicacao;
    }

    /**
     * Define o valor da propriedade reciboComunicacao.
     * 
     * @param value
     *     allowed object is
     *     {@link CtmBeneficiarioComunicacaoRecibo }
     *     
     */
    public void setReciboComunicacao(CtmBeneficiarioComunicacaoRecibo value) {
        this.reciboComunicacao = value;
    }

}

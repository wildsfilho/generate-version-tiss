//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2020.04.26 �s 04:32:18 AM BRT 
//


package com.generator.tiss.versions.v30305;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ct_situacaoAutorizacao complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_situacaoAutorizacao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="mensagemErro" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_motivoGlosa"/>
 *         &lt;element name="autorizacaoInternacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}ctm_autorizacaoInternacao"/>
 *         &lt;element name="autorizacaoServico" type="{http://www.ans.gov.br/padroes/tiss/schemas}ctm_autorizacaoServico"/>
 *         &lt;element name="autorizacaoProrrogacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}ctm_autorizacaoProrrogacao"/>
 *         &lt;element name="autorizacaoServicoOdonto" type="{http://www.ans.gov.br/padroes/tiss/schemas}cto_autorizacaoServico"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_situacaoAutorizacao", propOrder = {
    "mensagemErro",
    "autorizacaoInternacao",
    "autorizacaoServico",
    "autorizacaoProrrogacao",
    "autorizacaoServicoOdonto"
})
public class CtSituacaoAutorizacao {

    protected CtMotivoGlosa mensagemErro;
    protected CtmAutorizacaoInternacao autorizacaoInternacao;
    protected CtmAutorizacaoServico autorizacaoServico;
    protected CtmAutorizacaoProrrogacao autorizacaoProrrogacao;
    protected CtoAutorizacaoServico autorizacaoServicoOdonto;

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
     * Obt�m o valor da propriedade autorizacaoInternacao.
     * 
     * @return
     *     possible object is
     *     {@link CtmAutorizacaoInternacao }
     *     
     */
    public CtmAutorizacaoInternacao getAutorizacaoInternacao() {
        return autorizacaoInternacao;
    }

    /**
     * Define o valor da propriedade autorizacaoInternacao.
     * 
     * @param value
     *     allowed object is
     *     {@link CtmAutorizacaoInternacao }
     *     
     */
    public void setAutorizacaoInternacao(CtmAutorizacaoInternacao value) {
        this.autorizacaoInternacao = value;
    }

    /**
     * Obt�m o valor da propriedade autorizacaoServico.
     * 
     * @return
     *     possible object is
     *     {@link CtmAutorizacaoServico }
     *     
     */
    public CtmAutorizacaoServico getAutorizacaoServico() {
        return autorizacaoServico;
    }

    /**
     * Define o valor da propriedade autorizacaoServico.
     * 
     * @param value
     *     allowed object is
     *     {@link CtmAutorizacaoServico }
     *     
     */
    public void setAutorizacaoServico(CtmAutorizacaoServico value) {
        this.autorizacaoServico = value;
    }

    /**
     * Obt�m o valor da propriedade autorizacaoProrrogacao.
     * 
     * @return
     *     possible object is
     *     {@link CtmAutorizacaoProrrogacao }
     *     
     */
    public CtmAutorizacaoProrrogacao getAutorizacaoProrrogacao() {
        return autorizacaoProrrogacao;
    }

    /**
     * Define o valor da propriedade autorizacaoProrrogacao.
     * 
     * @param value
     *     allowed object is
     *     {@link CtmAutorizacaoProrrogacao }
     *     
     */
    public void setAutorizacaoProrrogacao(CtmAutorizacaoProrrogacao value) {
        this.autorizacaoProrrogacao = value;
    }

    /**
     * Obt�m o valor da propriedade autorizacaoServicoOdonto.
     * 
     * @return
     *     possible object is
     *     {@link CtoAutorizacaoServico }
     *     
     */
    public CtoAutorizacaoServico getAutorizacaoServicoOdonto() {
        return autorizacaoServicoOdonto;
    }

    /**
     * Define o valor da propriedade autorizacaoServicoOdonto.
     * 
     * @param value
     *     allowed object is
     *     {@link CtoAutorizacaoServico }
     *     
     */
    public void setAutorizacaoServicoOdonto(CtoAutorizacaoServico value) {
        this.autorizacaoServicoOdonto = value;
    }

}

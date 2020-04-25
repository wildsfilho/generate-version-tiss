//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2020.04.25 �s 04:37:47 AM BRT 
//


package com.generator.tiss.versions.v30305;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ctm_autorizacaoServico complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ctm_autorizacaoServico">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dadosAutorizacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_autorizacaoDados"/>
 *         &lt;element name="tipoEtapaAutorizacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_etapasAutorizacao"/>
 *         &lt;element name="dadosBeneficiario" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_beneficiarioDados"/>
 *         &lt;element name="prestadorAutorizado" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="dadosContratado" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_contratadoDados"/>
 *                   &lt;element name="cnesContratado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto7"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="statusSolicitacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_statusSolicitacao"/>
 *         &lt;element name="motivosNegativa" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="motivoNegativa" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_motivoGlosa" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="servicosAutorizados" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="servicoAutorizado" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentoAutorizado" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="observacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto1000" minOccurs="0"/>
 *         &lt;element name="autorizacaoQuimio" type="{http://www.ans.gov.br/padroes/tiss/schemas}ctm_autorizacaoQuimio" minOccurs="0"/>
 *         &lt;element name="autorizacaoRadio" type="{http://www.ans.gov.br/padroes/tiss/schemas}ctm_autorizacaoRadio" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ctm_autorizacaoServico", propOrder = {
    "dadosAutorizacao",
    "tipoEtapaAutorizacao",
    "dadosBeneficiario",
    "prestadorAutorizado",
    "statusSolicitacao",
    "motivosNegativa",
    "servicosAutorizados",
    "observacao",
    "autorizacaoQuimio",
    "autorizacaoRadio"
})
public class CtmAutorizacaoServico {

    @XmlElement(required = true)
    protected CtAutorizacaoDados dadosAutorizacao;
    @XmlElement(required = true)
    protected String tipoEtapaAutorizacao;
    @XmlElement(required = true)
    protected CtBeneficiarioDados dadosBeneficiario;
    protected PrestadorAutorizado prestadorAutorizado;
    @XmlElement(required = true)
    protected String statusSolicitacao;
    protected MotivosNegativa motivosNegativa;
    protected ServicosAutorizados servicosAutorizados;
    protected String observacao;
    protected CtmAutorizacaoQuimio autorizacaoQuimio;
    protected CtmAutorizacaoRadio autorizacaoRadio;

    /**
     * Obt�m o valor da propriedade dadosAutorizacao.
     * 
     * @return
     *     possible object is
     *     {@link CtAutorizacaoDados }
     *     
     */
    public CtAutorizacaoDados getDadosAutorizacao() {
        return dadosAutorizacao;
    }

    /**
     * Define o valor da propriedade dadosAutorizacao.
     * 
     * @param value
     *     allowed object is
     *     {@link CtAutorizacaoDados }
     *     
     */
    public void setDadosAutorizacao(CtAutorizacaoDados value) {
        this.dadosAutorizacao = value;
    }

    /**
     * Obt�m o valor da propriedade tipoEtapaAutorizacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoEtapaAutorizacao() {
        return tipoEtapaAutorizacao;
    }

    /**
     * Define o valor da propriedade tipoEtapaAutorizacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoEtapaAutorizacao(String value) {
        this.tipoEtapaAutorizacao = value;
    }

    /**
     * Obt�m o valor da propriedade dadosBeneficiario.
     * 
     * @return
     *     possible object is
     *     {@link CtBeneficiarioDados }
     *     
     */
    public CtBeneficiarioDados getDadosBeneficiario() {
        return dadosBeneficiario;
    }

    /**
     * Define o valor da propriedade dadosBeneficiario.
     * 
     * @param value
     *     allowed object is
     *     {@link CtBeneficiarioDados }
     *     
     */
    public void setDadosBeneficiario(CtBeneficiarioDados value) {
        this.dadosBeneficiario = value;
    }

    /**
     * Obt�m o valor da propriedade prestadorAutorizado.
     * 
     * @return
     *     possible object is
     *     {@link PrestadorAutorizado }
     *     
     */
    public PrestadorAutorizado getPrestadorAutorizado() {
        return prestadorAutorizado;
    }

    /**
     * Define o valor da propriedade prestadorAutorizado.
     * 
     * @param value
     *     allowed object is
     *     {@link PrestadorAutorizado }
     *     
     */
    public void setPrestadorAutorizado(PrestadorAutorizado value) {
        this.prestadorAutorizado = value;
    }

    /**
     * Obt�m o valor da propriedade statusSolicitacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusSolicitacao() {
        return statusSolicitacao;
    }

    /**
     * Define o valor da propriedade statusSolicitacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusSolicitacao(String value) {
        this.statusSolicitacao = value;
    }

    /**
     * Obt�m o valor da propriedade motivosNegativa.
     * 
     * @return
     *     possible object is
     *     {@link MotivosNegativa }
     *     
     */
    public MotivosNegativa getMotivosNegativa() {
        return motivosNegativa;
    }

    /**
     * Define o valor da propriedade motivosNegativa.
     * 
     * @param value
     *     allowed object is
     *     {@link MotivosNegativa }
     *     
     */
    public void setMotivosNegativa(MotivosNegativa value) {
        this.motivosNegativa = value;
    }

    /**
     * Obt�m o valor da propriedade servicosAutorizados.
     * 
     * @return
     *     possible object is
     *     {@link ServicosAutorizados }
     *     
     */
    public ServicosAutorizados getServicosAutorizados() {
        return servicosAutorizados;
    }

    /**
     * Define o valor da propriedade servicosAutorizados.
     * 
     * @param value
     *     allowed object is
     *     {@link ServicosAutorizados }
     *     
     */
    public void setServicosAutorizados(ServicosAutorizados value) {
        this.servicosAutorizados = value;
    }

    /**
     * Obt�m o valor da propriedade observacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservacao() {
        return observacao;
    }

    /**
     * Define o valor da propriedade observacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservacao(String value) {
        this.observacao = value;
    }

    /**
     * Obt�m o valor da propriedade autorizacaoQuimio.
     * 
     * @return
     *     possible object is
     *     {@link CtmAutorizacaoQuimio }
     *     
     */
    public CtmAutorizacaoQuimio getAutorizacaoQuimio() {
        return autorizacaoQuimio;
    }

    /**
     * Define o valor da propriedade autorizacaoQuimio.
     * 
     * @param value
     *     allowed object is
     *     {@link CtmAutorizacaoQuimio }
     *     
     */
    public void setAutorizacaoQuimio(CtmAutorizacaoQuimio value) {
        this.autorizacaoQuimio = value;
    }

    /**
     * Obt�m o valor da propriedade autorizacaoRadio.
     * 
     * @return
     *     possible object is
     *     {@link CtmAutorizacaoRadio }
     *     
     */
    public CtmAutorizacaoRadio getAutorizacaoRadio() {
        return autorizacaoRadio;
    }

    /**
     * Define o valor da propriedade autorizacaoRadio.
     * 
     * @param value
     *     allowed object is
     *     {@link CtmAutorizacaoRadio }
     *     
     */
    public void setAutorizacaoRadio(CtmAutorizacaoRadio value) {
        this.autorizacaoRadio = value;
    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="motivoNegativa" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_motivoGlosa" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "motivoNegativa"
    })
    public static class MotivosNegativa {

        @XmlElement(required = true)
        protected List<CtMotivoGlosa> motivoNegativa;

        /**
         * Gets the value of the motivoNegativa property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the motivoNegativa property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMotivoNegativa().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CtMotivoGlosa }
         * 
         * 
         */
        public List<CtMotivoGlosa> getMotivoNegativa() {
            if (motivoNegativa == null) {
                motivoNegativa = new ArrayList<CtMotivoGlosa>();
            }
            return this.motivoNegativa;
        }

    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="dadosContratado" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_contratadoDados"/>
     *         &lt;element name="cnesContratado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto7"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "dadosContratado",
        "cnesContratado"
    })
    public static class PrestadorAutorizado {

        @XmlElement(required = true)
        protected CtContratadoDados dadosContratado;
        @XmlElement(required = true)
        protected String cnesContratado;

        /**
         * Obt�m o valor da propriedade dadosContratado.
         * 
         * @return
         *     possible object is
         *     {@link CtContratadoDados }
         *     
         */
        public CtContratadoDados getDadosContratado() {
            return dadosContratado;
        }

        /**
         * Define o valor da propriedade dadosContratado.
         * 
         * @param value
         *     allowed object is
         *     {@link CtContratadoDados }
         *     
         */
        public void setDadosContratado(CtContratadoDados value) {
            this.dadosContratado = value;
        }

        /**
         * Obt�m o valor da propriedade cnesContratado.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCnesContratado() {
            return cnesContratado;
        }

        /**
         * Define o valor da propriedade cnesContratado.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCnesContratado(String value) {
            this.cnesContratado = value;
        }

    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="servicoAutorizado" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentoAutorizado" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "servicoAutorizado"
    })
    public static class ServicosAutorizados {

        @XmlElement(required = true)
        protected List<CtProcedimentoAutorizado> servicoAutorizado;

        /**
         * Gets the value of the servicoAutorizado property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the servicoAutorizado property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getServicoAutorizado().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CtProcedimentoAutorizado }
         * 
         * 
         */
        public List<CtProcedimentoAutorizado> getServicoAutorizado() {
            if (servicoAutorizado == null) {
                servicoAutorizado = new ArrayList<CtProcedimentoAutorizado>();
            }
            return this.servicoAutorizado;
        }

    }

}

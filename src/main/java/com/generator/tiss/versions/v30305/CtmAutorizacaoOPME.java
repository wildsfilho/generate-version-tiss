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
 * <p>Classe Java de ctm_autorizacaoOPME complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ctm_autorizacaoOPME">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dadosAutorizacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_autorizacaoDados"/>
 *         &lt;element name="dadosBeneficiario" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_beneficiarioDados"/>
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
 *         &lt;element name="prestadorAutorizado" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_contratadoDados" minOccurs="0"/>
 *         &lt;element name="servicosAutorizadosOPME" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentoAutorizado">
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ctm_autorizacaoOPME", propOrder = {
    "dadosAutorizacao",
    "dadosBeneficiario",
    "statusSolicitacao",
    "motivosNegativa",
    "prestadorAutorizado",
    "servicosAutorizadosOPME"
})
public class CtmAutorizacaoOPME {

    @XmlElement(required = true)
    protected CtAutorizacaoDados dadosAutorizacao;
    @XmlElement(required = true)
    protected CtBeneficiarioDados dadosBeneficiario;
    @XmlElement(required = true)
    protected String statusSolicitacao;
    protected MotivosNegativa motivosNegativa;
    protected CtContratadoDados prestadorAutorizado;
    protected List<ServicosAutorizadosOPME> servicosAutorizadosOPME;

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
     * Obt�m o valor da propriedade prestadorAutorizado.
     * 
     * @return
     *     possible object is
     *     {@link CtContratadoDados }
     *     
     */
    public CtContratadoDados getPrestadorAutorizado() {
        return prestadorAutorizado;
    }

    /**
     * Define o valor da propriedade prestadorAutorizado.
     * 
     * @param value
     *     allowed object is
     *     {@link CtContratadoDados }
     *     
     */
    public void setPrestadorAutorizado(CtContratadoDados value) {
        this.prestadorAutorizado = value;
    }

    /**
     * Gets the value of the servicosAutorizadosOPME property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the servicosAutorizadosOPME property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServicosAutorizadosOPME().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServicosAutorizadosOPME }
     * 
     * 
     */
    public List<ServicosAutorizadosOPME> getServicosAutorizadosOPME() {
        if (servicosAutorizadosOPME == null) {
            servicosAutorizadosOPME = new ArrayList<ServicosAutorizadosOPME>();
        }
        return this.servicosAutorizadosOPME;
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
     *     &lt;extension base="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentoAutorizado">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ServicosAutorizadosOPME
        extends CtProcedimentoAutorizado
    {


    }

}

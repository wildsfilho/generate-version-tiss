//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2020.04.26 �s 04:32:18 AM BRT 
//


package br.gov.ans.padroes.tiss.schemas.v30500;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * resposta a uma solicita��o de situa��o de protocolo
 * 
 * <p>Classe Java de ct_loteAnexoStatus complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_loteAnexoStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="statusProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_statusProtocolo"/>
 *         &lt;element name="numeroProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto12"/>
 *         &lt;element name="numeroLote" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto12"/>
 *         &lt;element name="dataEnvioLote" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
 *         &lt;element name="anexosClinicos">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="anexoOPME" type="{http://www.ans.gov.br/padroes/tiss/schemas}ctm_autorizacaoOPME"/>
 *                   &lt;element name="anexoQuimio" type="{http://www.ans.gov.br/padroes/tiss/schemas}ctm_autorizacaoQuimio"/>
 *                   &lt;element name="anexoRadio" type="{http://www.ans.gov.br/padroes/tiss/schemas}ctm_autorizacaoRadio"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
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
@XmlType(name = "ct_loteAnexoStatus", propOrder = {
    "statusProtocolo",
    "numeroProtocolo",
    "numeroLote",
    "dataEnvioLote",
    "anexosClinicos"
})
public class CtLoteAnexoStatus {

    @XmlElement(required = true)
    protected String statusProtocolo;
    @XmlElement(required = true)
    protected String numeroProtocolo;
    @XmlElement(required = true)
    protected String numeroLote;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataEnvioLote;
    @XmlElement(required = true)
    protected AnexosClinicos anexosClinicos;

    /**
     * Obt�m o valor da propriedade statusProtocolo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusProtocolo() {
        return statusProtocolo;
    }

    /**
     * Define o valor da propriedade statusProtocolo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusProtocolo(String value) {
        this.statusProtocolo = value;
    }

    /**
     * Obt�m o valor da propriedade numeroProtocolo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroProtocolo() {
        return numeroProtocolo;
    }

    /**
     * Define o valor da propriedade numeroProtocolo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroProtocolo(String value) {
        this.numeroProtocolo = value;
    }

    /**
     * Obt�m o valor da propriedade numeroLote.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroLote() {
        return numeroLote;
    }

    /**
     * Define o valor da propriedade numeroLote.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroLote(String value) {
        this.numeroLote = value;
    }

    /**
     * Obt�m o valor da propriedade dataEnvioLote.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataEnvioLote() {
        return dataEnvioLote;
    }

    /**
     * Define o valor da propriedade dataEnvioLote.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataEnvioLote(XMLGregorianCalendar value) {
        this.dataEnvioLote = value;
    }

    /**
     * Obt�m o valor da propriedade anexosClinicos.
     * 
     * @return
     *     possible object is
     *     {@link AnexosClinicos }
     *     
     */
    public AnexosClinicos getAnexosClinicos() {
        return anexosClinicos;
    }

    /**
     * Define o valor da propriedade anexosClinicos.
     * 
     * @param value
     *     allowed object is
     *     {@link AnexosClinicos }
     *     
     */
    public void setAnexosClinicos(AnexosClinicos value) {
        this.anexosClinicos = value;
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
     *       &lt;choice>
     *         &lt;element name="anexoOPME" type="{http://www.ans.gov.br/padroes/tiss/schemas}ctm_autorizacaoOPME"/>
     *         &lt;element name="anexoQuimio" type="{http://www.ans.gov.br/padroes/tiss/schemas}ctm_autorizacaoQuimio"/>
     *         &lt;element name="anexoRadio" type="{http://www.ans.gov.br/padroes/tiss/schemas}ctm_autorizacaoRadio"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "anexoOPME",
        "anexoQuimio",
        "anexoRadio"
    })
    public static class AnexosClinicos {

        protected CtmAutorizacaoOPME anexoOPME;
        protected CtmAutorizacaoQuimio anexoQuimio;
        protected CtmAutorizacaoRadio anexoRadio;

        /**
         * Obt�m o valor da propriedade anexoOPME.
         * 
         * @return
         *     possible object is
         *     {@link CtmAutorizacaoOPME }
         *     
         */
        public CtmAutorizacaoOPME getAnexoOPME() {
            return anexoOPME;
        }

        /**
         * Define o valor da propriedade anexoOPME.
         * 
         * @param value
         *     allowed object is
         *     {@link CtmAutorizacaoOPME }
         *     
         */
        public void setAnexoOPME(CtmAutorizacaoOPME value) {
            this.anexoOPME = value;
        }

        /**
         * Obt�m o valor da propriedade anexoQuimio.
         * 
         * @return
         *     possible object is
         *     {@link CtmAutorizacaoQuimio }
         *     
         */
        public CtmAutorizacaoQuimio getAnexoQuimio() {
            return anexoQuimio;
        }

        /**
         * Define o valor da propriedade anexoQuimio.
         * 
         * @param value
         *     allowed object is
         *     {@link CtmAutorizacaoQuimio }
         *     
         */
        public void setAnexoQuimio(CtmAutorizacaoQuimio value) {
            this.anexoQuimio = value;
        }

        /**
         * Obt�m o valor da propriedade anexoRadio.
         * 
         * @return
         *     possible object is
         *     {@link CtmAutorizacaoRadio }
         *     
         */
        public CtmAutorizacaoRadio getAnexoRadio() {
            return anexoRadio;
        }

        /**
         * Define o valor da propriedade anexoRadio.
         * 
         * @param value
         *     allowed object is
         *     {@link CtmAutorizacaoRadio }
         *     
         */
        public void setAnexoRadio(CtmAutorizacaoRadio value) {
            this.anexoRadio = value;
        }

    }

}

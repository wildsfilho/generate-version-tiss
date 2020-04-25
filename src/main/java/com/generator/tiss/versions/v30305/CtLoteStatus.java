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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * resposta a uma solicita��o de situa��o de protocolo
 * 
 * <p>Classe Java de ct_loteStatus complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_loteStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="statusProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_statusProtocolo"/>
 *         &lt;element name="numeroProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto12"/>
 *         &lt;element name="numeroLote" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto12"/>
 *         &lt;element name="dataEnvioLote" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
 *         &lt;element name="valorTotalLote" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_valorTotal"/>
 *         &lt;element name="guiasTISS">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="guiasMedicas" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="guias" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_guiaDados"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="guiasOdonto" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="guias" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_guiaDadosOdonto"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
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
@XmlType(name = "ct_loteStatus", propOrder = {
    "statusProtocolo",
    "numeroProtocolo",
    "numeroLote",
    "dataEnvioLote",
    "valorTotalLote",
    "guiasTISS"
})
public class CtLoteStatus {

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
    protected CtValorTotal valorTotalLote;
    @XmlElement(required = true)
    protected GuiasTISS guiasTISS;

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
     * Obt�m o valor da propriedade valorTotalLote.
     * 
     * @return
     *     possible object is
     *     {@link CtValorTotal }
     *     
     */
    public CtValorTotal getValorTotalLote() {
        return valorTotalLote;
    }

    /**
     * Define o valor da propriedade valorTotalLote.
     * 
     * @param value
     *     allowed object is
     *     {@link CtValorTotal }
     *     
     */
    public void setValorTotalLote(CtValorTotal value) {
        this.valorTotalLote = value;
    }

    /**
     * Obt�m o valor da propriedade guiasTISS.
     * 
     * @return
     *     possible object is
     *     {@link GuiasTISS }
     *     
     */
    public GuiasTISS getGuiasTISS() {
        return guiasTISS;
    }

    /**
     * Define o valor da propriedade guiasTISS.
     * 
     * @param value
     *     allowed object is
     *     {@link GuiasTISS }
     *     
     */
    public void setGuiasTISS(GuiasTISS value) {
        this.guiasTISS = value;
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
     *         &lt;element name="guiasMedicas" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="guias" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_guiaDados"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="guiasOdonto" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="guias" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_guiaDadosOdonto"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "guiasMedicas",
        "guiasOdonto"
    })
    public static class GuiasTISS {

        protected List<GuiasMedicas> guiasMedicas;
        protected List<GuiasOdonto> guiasOdonto;

        /**
         * Gets the value of the guiasMedicas property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the guiasMedicas property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGuiasMedicas().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GuiasMedicas }
         * 
         * 
         */
        public List<GuiasMedicas> getGuiasMedicas() {
            if (guiasMedicas == null) {
                guiasMedicas = new ArrayList<GuiasMedicas>();
            }
            return this.guiasMedicas;
        }

        /**
         * Gets the value of the guiasOdonto property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the guiasOdonto property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGuiasOdonto().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GuiasOdonto }
         * 
         * 
         */
        public List<GuiasOdonto> getGuiasOdonto() {
            if (guiasOdonto == null) {
                guiasOdonto = new ArrayList<GuiasOdonto>();
            }
            return this.guiasOdonto;
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
         *         &lt;element name="guias" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_guiaDados"/>
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
            "guias"
        })
        public static class GuiasMedicas {

            @XmlElement(required = true)
            protected CtGuiaDados guias;

            /**
             * Obt�m o valor da propriedade guias.
             * 
             * @return
             *     possible object is
             *     {@link CtGuiaDados }
             *     
             */
            public CtGuiaDados getGuias() {
                return guias;
            }

            /**
             * Define o valor da propriedade guias.
             * 
             * @param value
             *     allowed object is
             *     {@link CtGuiaDados }
             *     
             */
            public void setGuias(CtGuiaDados value) {
                this.guias = value;
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
         *         &lt;element name="guias" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_guiaDadosOdonto"/>
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
            "guias"
        })
        public static class GuiasOdonto {

            @XmlElement(required = true)
            protected CtGuiaDadosOdonto guias;

            /**
             * Obt�m o valor da propriedade guias.
             * 
             * @return
             *     possible object is
             *     {@link CtGuiaDadosOdonto }
             *     
             */
            public CtGuiaDadosOdonto getGuias() {
                return guias;
            }

            /**
             * Define o valor da propriedade guias.
             * 
             * @param value
             *     allowed object is
             *     {@link CtGuiaDadosOdonto }
             *     
             */
            public void setGuias(CtGuiaDadosOdonto value) {
                this.guias = value;
            }

        }

    }

}

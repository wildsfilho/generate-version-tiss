//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2020.04.26 �s 04:32:18 AM BRT 
//


package br.gov.ans.padroes.tiss.schemas.v30500;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ct_guiaCancelamentoRecibo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_guiaCancelamentoRecibo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="registroANS" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_registroANS"/>
 *         &lt;element name="dadosPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_contratadoDados"/>
 *         &lt;element name="guiasCanceladas">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="dadosGuia" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="numeroGuiaPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20"/>
 *                             &lt;element name="tipoGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoGuia"/>
 *                             &lt;element name="statusCancelamento" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_statusCancelamento"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
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
@XmlType(name = "ct_guiaCancelamentoRecibo", propOrder = {
    "registroANS",
    "dadosPrestador",
    "guiasCanceladas"
})
public class CtGuiaCancelamentoRecibo {

    @XmlElement(required = true)
    protected String registroANS;
    @XmlElement(required = true)
    protected CtContratadoDados dadosPrestador;
    @XmlElement(required = true)
    protected GuiasCanceladas guiasCanceladas;

    /**
     * Obt�m o valor da propriedade registroANS.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistroANS() {
        return registroANS;
    }

    /**
     * Define o valor da propriedade registroANS.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistroANS(String value) {
        this.registroANS = value;
    }

    /**
     * Obt�m o valor da propriedade dadosPrestador.
     * 
     * @return
     *     possible object is
     *     {@link CtContratadoDados }
     *     
     */
    public CtContratadoDados getDadosPrestador() {
        return dadosPrestador;
    }

    /**
     * Define o valor da propriedade dadosPrestador.
     * 
     * @param value
     *     allowed object is
     *     {@link CtContratadoDados }
     *     
     */
    public void setDadosPrestador(CtContratadoDados value) {
        this.dadosPrestador = value;
    }

    /**
     * Obt�m o valor da propriedade guiasCanceladas.
     * 
     * @return
     *     possible object is
     *     {@link GuiasCanceladas }
     *     
     */
    public GuiasCanceladas getGuiasCanceladas() {
        return guiasCanceladas;
    }

    /**
     * Define o valor da propriedade guiasCanceladas.
     * 
     * @param value
     *     allowed object is
     *     {@link GuiasCanceladas }
     *     
     */
    public void setGuiasCanceladas(GuiasCanceladas value) {
        this.guiasCanceladas = value;
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
     *         &lt;element name="dadosGuia" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="numeroGuiaPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20"/>
     *                   &lt;element name="tipoGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoGuia"/>
     *                   &lt;element name="statusCancelamento" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_statusCancelamento"/>
     *                 &lt;/sequence>
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
    @XmlType(name = "", propOrder = {
        "dadosGuia"
    })
    public static class GuiasCanceladas {

        @XmlElement(required = true)
        protected List<DadosGuia> dadosGuia;

        /**
         * Gets the value of the dadosGuia property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the dadosGuia property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDadosGuia().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DadosGuia }
         * 
         * 
         */
        public List<DadosGuia> getDadosGuia() {
            if (dadosGuia == null) {
                dadosGuia = new ArrayList<DadosGuia>();
            }
            return this.dadosGuia;
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
         *         &lt;element name="numeroGuiaPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20"/>
         *         &lt;element name="tipoGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoGuia"/>
         *         &lt;element name="statusCancelamento" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_statusCancelamento"/>
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
            "numeroGuiaPrestador",
            "tipoGuia",
            "statusCancelamento"
        })
        public static class DadosGuia {

            @XmlElement(required = true)
            protected String numeroGuiaPrestador;
            @XmlElement(required = true)
            protected String tipoGuia;
            @XmlElement(required = true)
            protected String statusCancelamento;

            /**
             * Obt�m o valor da propriedade numeroGuiaPrestador.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumeroGuiaPrestador() {
                return numeroGuiaPrestador;
            }

            /**
             * Define o valor da propriedade numeroGuiaPrestador.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumeroGuiaPrestador(String value) {
                this.numeroGuiaPrestador = value;
            }

            /**
             * Obt�m o valor da propriedade tipoGuia.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTipoGuia() {
                return tipoGuia;
            }

            /**
             * Define o valor da propriedade tipoGuia.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTipoGuia(String value) {
                this.tipoGuia = value;
            }

            /**
             * Obt�m o valor da propriedade statusCancelamento.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStatusCancelamento() {
                return statusCancelamento;
            }

            /**
             * Define o valor da propriedade statusCancelamento.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStatusCancelamento(String value) {
                this.statusCancelamento = value;
            }

        }

    }

}

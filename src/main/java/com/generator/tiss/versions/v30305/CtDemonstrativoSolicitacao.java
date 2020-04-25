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
 * estrutura para solicita��o de demonstrativo de pagamento
 * 
 * <p>Classe Java de ct_demonstrativoSolicitacao complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_demonstrativoSolicitacao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="demonstrativoPagamento">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="dadosPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_contratadoDados"/>
 *                   &lt;element name="dataSolicitacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
 *                   &lt;element name="tipoDemonstrativo" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoDemonstrativoPagamento"/>
 *                   &lt;element name="periodo">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;choice>
 *                             &lt;element name="dataPagamento" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
 *                             &lt;element name="competencia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_competencia"/>
 *                           &lt;/choice>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="demonstrativoAnalise">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="dadosPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_contratadoDados"/>
 *                   &lt;element name="dataSolicitacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
 *                   &lt;element name="protocolos">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="numeroProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto12" maxOccurs="30"/>
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
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_demonstrativoSolicitacao", propOrder = {
    "demonstrativoPagamento",
    "demonstrativoAnalise"
})
public class CtDemonstrativoSolicitacao {

    protected DemonstrativoPagamento demonstrativoPagamento;
    protected DemonstrativoAnalise demonstrativoAnalise;

    /**
     * Obt�m o valor da propriedade demonstrativoPagamento.
     * 
     * @return
     *     possible object is
     *     {@link DemonstrativoPagamento }
     *     
     */
    public DemonstrativoPagamento getDemonstrativoPagamento() {
        return demonstrativoPagamento;
    }

    /**
     * Define o valor da propriedade demonstrativoPagamento.
     * 
     * @param value
     *     allowed object is
     *     {@link DemonstrativoPagamento }
     *     
     */
    public void setDemonstrativoPagamento(DemonstrativoPagamento value) {
        this.demonstrativoPagamento = value;
    }

    /**
     * Obt�m o valor da propriedade demonstrativoAnalise.
     * 
     * @return
     *     possible object is
     *     {@link DemonstrativoAnalise }
     *     
     */
    public DemonstrativoAnalise getDemonstrativoAnalise() {
        return demonstrativoAnalise;
    }

    /**
     * Define o valor da propriedade demonstrativoAnalise.
     * 
     * @param value
     *     allowed object is
     *     {@link DemonstrativoAnalise }
     *     
     */
    public void setDemonstrativoAnalise(DemonstrativoAnalise value) {
        this.demonstrativoAnalise = value;
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
     *         &lt;element name="dadosPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_contratadoDados"/>
     *         &lt;element name="dataSolicitacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
     *         &lt;element name="protocolos">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="numeroProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto12" maxOccurs="30"/>
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
        "dadosPrestador",
        "dataSolicitacao",
        "protocolos"
    })
    public static class DemonstrativoAnalise {

        @XmlElement(required = true)
        protected CtContratadoDados dadosPrestador;
        @XmlElement(required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar dataSolicitacao;
        @XmlElement(required = true)
        protected Protocolos protocolos;

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
         * Obt�m o valor da propriedade dataSolicitacao.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDataSolicitacao() {
            return dataSolicitacao;
        }

        /**
         * Define o valor da propriedade dataSolicitacao.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDataSolicitacao(XMLGregorianCalendar value) {
            this.dataSolicitacao = value;
        }

        /**
         * Obt�m o valor da propriedade protocolos.
         * 
         * @return
         *     possible object is
         *     {@link Protocolos }
         *     
         */
        public Protocolos getProtocolos() {
            return protocolos;
        }

        /**
         * Define o valor da propriedade protocolos.
         * 
         * @param value
         *     allowed object is
         *     {@link Protocolos }
         *     
         */
        public void setProtocolos(Protocolos value) {
            this.protocolos = value;
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
         *         &lt;element name="numeroProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto12" maxOccurs="30"/>
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
            "numeroProtocolo"
        })
        public static class Protocolos {

            @XmlElement(required = true)
            protected List<String> numeroProtocolo;

            /**
             * Gets the value of the numeroProtocolo property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the numeroProtocolo property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getNumeroProtocolo().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getNumeroProtocolo() {
                if (numeroProtocolo == null) {
                    numeroProtocolo = new ArrayList<String>();
                }
                return this.numeroProtocolo;
            }

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
     *         &lt;element name="dadosPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_contratadoDados"/>
     *         &lt;element name="dataSolicitacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
     *         &lt;element name="tipoDemonstrativo" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoDemonstrativoPagamento"/>
     *         &lt;element name="periodo">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;choice>
     *                   &lt;element name="dataPagamento" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
     *                   &lt;element name="competencia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_competencia"/>
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
    @XmlType(name = "", propOrder = {
        "dadosPrestador",
        "dataSolicitacao",
        "tipoDemonstrativo",
        "periodo"
    })
    public static class DemonstrativoPagamento {

        @XmlElement(required = true)
        protected CtContratadoDados dadosPrestador;
        @XmlElement(required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar dataSolicitacao;
        @XmlElement(required = true)
        protected String tipoDemonstrativo;
        @XmlElement(required = true)
        protected Periodo periodo;

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
         * Obt�m o valor da propriedade dataSolicitacao.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDataSolicitacao() {
            return dataSolicitacao;
        }

        /**
         * Define o valor da propriedade dataSolicitacao.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDataSolicitacao(XMLGregorianCalendar value) {
            this.dataSolicitacao = value;
        }

        /**
         * Obt�m o valor da propriedade tipoDemonstrativo.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTipoDemonstrativo() {
            return tipoDemonstrativo;
        }

        /**
         * Define o valor da propriedade tipoDemonstrativo.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTipoDemonstrativo(String value) {
            this.tipoDemonstrativo = value;
        }

        /**
         * Obt�m o valor da propriedade periodo.
         * 
         * @return
         *     possible object is
         *     {@link Periodo }
         *     
         */
        public Periodo getPeriodo() {
            return periodo;
        }

        /**
         * Define o valor da propriedade periodo.
         * 
         * @param value
         *     allowed object is
         *     {@link Periodo }
         *     
         */
        public void setPeriodo(Periodo value) {
            this.periodo = value;
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
         *         &lt;element name="dataPagamento" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
         *         &lt;element name="competencia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_competencia"/>
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
            "dataPagamento",
            "competencia"
        })
        public static class Periodo {

            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar dataPagamento;
            protected String competencia;

            /**
             * Obt�m o valor da propriedade dataPagamento.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDataPagamento() {
                return dataPagamento;
            }

            /**
             * Define o valor da propriedade dataPagamento.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDataPagamento(XMLGregorianCalendar value) {
                this.dataPagamento = value;
            }

            /**
             * Obt�m o valor da propriedade competencia.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCompetencia() {
                return competencia;
            }

            /**
             * Define o valor da propriedade competencia.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCompetencia(String value) {
                this.competencia = value;
            }

        }

    }

}

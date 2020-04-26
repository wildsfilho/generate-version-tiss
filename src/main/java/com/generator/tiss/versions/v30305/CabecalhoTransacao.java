//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2020.04.25 �s 04:40:31 AM BRT 
//


package com.generator.tiss.versions.v30305;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de cabecalhoTransacao complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="cabecalhoTransacao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificacaoTransacao">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="tipoTransacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoTransacao"/>
 *                   &lt;element name="sequencialTransacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto12"/>
 *                   &lt;element name="dataRegistroTransacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
 *                   &lt;element name="horaRegistroTransacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_hora"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="falhaNegocio" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoGlosa" minOccurs="0"/>
 *         &lt;element name="origem">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="identificacaoPrestador">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.ans.gov.br/padroes/tiss/schemas}ct_prestadorIdentificacao">
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="registroANS" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_registroANS"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="destino">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="identificacaoPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_prestadorIdentificacao"/>
 *                   &lt;element name="registroANS" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_registroANS"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Padrao" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_versao"/>
 *         &lt;element name="loginSenhaPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_loginSenha" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cabecalhoTransacao", propOrder = {
    "identificacaoTransacao",
    "falhaNegocio",
    "origem",
    "destino",
    "padrao",
    "loginSenhaPrestador"
})
public class CabecalhoTransacao {

    @XmlElement(required = true)
    protected IdentificacaoTransacao identificacaoTransacao;
    protected String falhaNegocio;
    @XmlElement(required = true)
    protected Origem origem;
    @XmlElement(required = true)
    protected Destino destino;
    @XmlElement(name = "Padrao", required = true)
    protected String padrao;
    protected CtLoginSenha loginSenhaPrestador;

    public CabecalhoTransacao(IdentificacaoTransacao identificacaoTransacao, Origem origem, Destino destino, String padrao, CtLoginSenha loginSenhaPrestador) {
        this.identificacaoTransacao = identificacaoTransacao;
        this.origem = origem;
        this.destino = destino;
        this.padrao = padrao;
        this.loginSenhaPrestador = loginSenhaPrestador;
    }

    /**
     * Obt�m o valor da propriedade identificacaoTransacao.
     * 
     * @return
     *     possible object is
     *     {@link IdentificacaoTransacao }
     *     
     */
    public IdentificacaoTransacao getIdentificacaoTransacao() {
        return identificacaoTransacao;
    }

    /**
     * Define o valor da propriedade identificacaoTransacao.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificacaoTransacao }
     *     
     */
    public void setIdentificacaoTransacao(IdentificacaoTransacao value) {
        this.identificacaoTransacao = value;
    }

    /**
     * Obt�m o valor da propriedade falhaNegocio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFalhaNegocio() {
        return falhaNegocio;
    }

    /**
     * Define o valor da propriedade falhaNegocio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFalhaNegocio(String value) {
        this.falhaNegocio = value;
    }

    /**
     * Obt�m o valor da propriedade origem.
     * 
     * @return
     *     possible object is
     *     {@link Origem }
     *     
     */
    public Origem getOrigem() {
        return origem;
    }

    /**
     * Define o valor da propriedade origem.
     * 
     * @param value
     *     allowed object is
     *     {@link Origem }
     *     
     */
    public void setOrigem(Origem value) {
        this.origem = value;
    }

    /**
     * Obt�m o valor da propriedade destino.
     * 
     * @return
     *     possible object is
     *     {@link Destino }
     *     
     */
    public Destino getDestino() {
        return destino;
    }

    /**
     * Define o valor da propriedade destino.
     * 
     * @param value
     *     allowed object is
     *     {@link Destino }
     *     
     */
    public void setDestino(Destino value) {
        this.destino = value;
    }

    /**
     * Obt�m o valor da propriedade padrao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPadrao() {
        return padrao;
    }

    /**
     * Define o valor da propriedade padrao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPadrao(String value) {
        this.padrao = value;
    }

    /**
     * Obt�m o valor da propriedade loginSenhaPrestador.
     * 
     * @return
     *     possible object is
     *     {@link CtLoginSenha }
     *     
     */
    public CtLoginSenha getLoginSenhaPrestador() {
        return loginSenhaPrestador;
    }

    /**
     * Define o valor da propriedade loginSenhaPrestador.
     * 
     * @param value
     *     allowed object is
     *     {@link CtLoginSenha }
     *     
     */
    public void setLoginSenhaPrestador(CtLoginSenha value) {
        this.loginSenhaPrestador = value;
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
     *         &lt;element name="identificacaoPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_prestadorIdentificacao"/>
     *         &lt;element name="registroANS" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_registroANS"/>
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
        "identificacaoPrestador",
        "registroANS"
    })
    public static class Destino {

        protected CtPrestadorIdentificacao identificacaoPrestador;
        protected String registroANS;

        /**
         * Obt�m o valor da propriedade identificacaoPrestador.
         * 
         * @return
         *     possible object is
         *     {@link CtPrestadorIdentificacao }
         *     
         */
        public CtPrestadorIdentificacao getIdentificacaoPrestador() {
            return identificacaoPrestador;
        }

        /**
         * Define o valor da propriedade identificacaoPrestador.
         * 
         * @param value
         *     allowed object is
         *     {@link CtPrestadorIdentificacao }
         *     
         */
        public void setIdentificacaoPrestador(CtPrestadorIdentificacao value) {
            this.identificacaoPrestador = value;
        }

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
     *         &lt;element name="tipoTransacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoTransacao"/>
     *         &lt;element name="sequencialTransacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto12"/>
     *         &lt;element name="dataRegistroTransacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
     *         &lt;element name="horaRegistroTransacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_hora"/>
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
        "tipoTransacao",
        "sequencialTransacao",
        "dataRegistroTransacao",
        "horaRegistroTransacao"
    })
    public static class IdentificacaoTransacao {

        @XmlElement(required = true)
        @XmlSchemaType(name = "string")
        protected DmTipoTransacao tipoTransacao;
        @XmlElement(required = true)
        protected String sequencialTransacao;
        @XmlElement(required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar dataRegistroTransacao;
        @XmlElement(required = true)
        @XmlSchemaType(name = "time")
        protected XMLGregorianCalendar horaRegistroTransacao;

        /**
         * Obt�m o valor da propriedade tipoTransacao.
         * 
         * @return
         *     possible object is
         *     {@link DmTipoTransacao }
         *     
         */
        public DmTipoTransacao getTipoTransacao() {
            return tipoTransacao;
        }

        /**
         * Define o valor da propriedade tipoTransacao.
         * 
         * @param value
         *     allowed object is
         *     {@link DmTipoTransacao }
         *     
         */
        public void setTipoTransacao(DmTipoTransacao value) {
            this.tipoTransacao = value;
        }

        /**
         * Obt�m o valor da propriedade sequencialTransacao.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSequencialTransacao() {
            return sequencialTransacao;
        }

        /**
         * Define o valor da propriedade sequencialTransacao.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSequencialTransacao(String value) {
            this.sequencialTransacao = value;
        }

        /**
         * Obt�m o valor da propriedade dataRegistroTransacao.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDataRegistroTransacao() {
            return dataRegistroTransacao;
        }

        /**
         * Define o valor da propriedade dataRegistroTransacao.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDataRegistroTransacao(XMLGregorianCalendar value) {
            this.dataRegistroTransacao = value;
        }

        /**
         * Obt�m o valor da propriedade horaRegistroTransacao.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getHoraRegistroTransacao() {
            return horaRegistroTransacao;
        }

        /**
         * Define o valor da propriedade horaRegistroTransacao.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setHoraRegistroTransacao(XMLGregorianCalendar value) {
            this.horaRegistroTransacao = value;
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
     *       &lt;choice>
     *         &lt;element name="identificacaoPrestador">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.ans.gov.br/padroes/tiss/schemas}ct_prestadorIdentificacao">
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="registroANS" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_registroANS"/>
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
        "identificacaoPrestador",
        "registroANS"
    })
    public static class Origem {

        protected IdentificacaoPrestador identificacaoPrestador;
        protected String registroANS;

        /**
         * Obt�m o valor da propriedade identificacaoPrestador.
         * 
         * @return
         *     possible object is
         *     {@link IdentificacaoPrestador }
         *     
         */
        public IdentificacaoPrestador getIdentificacaoPrestador() {
            return identificacaoPrestador;
        }

        /**
         * Define o valor da propriedade identificacaoPrestador.
         * 
         * @param value
         *     allowed object is
         *     {@link IdentificacaoPrestador }
         *     
         */
        public void setIdentificacaoPrestador(IdentificacaoPrestador value) {
            this.identificacaoPrestador = value;
        }

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
         * <p>Classe Java de anonymous complex type.
         * 
         * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.ans.gov.br/padroes/tiss/schemas}ct_prestadorIdentificacao">
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class IdentificacaoPrestador
            extends CtPrestadorIdentificacao
        {


        }

    }

}

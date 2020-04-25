//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2020.04.25 �s 04:37:47 AM BRT 
//


package com.generator.tiss.versions.v30305;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de ct_respostaRecursoItemOdonto complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_respostaRecursoItemOdonto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numeroGuiaPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20"/>
 *         &lt;element name="numeroGuiaOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20" minOccurs="0"/>
 *         &lt;element name="senha" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20" minOccurs="0"/>
 *         &lt;element name="nomeBeneficiario" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto70"/>
 *         &lt;element name="recursoProcedimento" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="sequencialItem" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numerico4"/>
 *                   &lt;element name="dataRealizacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
 *                   &lt;element name="denteRegiao" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;choice>
 *                             &lt;element name="codDente" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_dente"/>
 *                             &lt;element name="codRegiao" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_regiao"/>
 *                           &lt;/choice>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="denteFace" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_face" minOccurs="0"/>
 *                   &lt;element name="quantidade" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numerico2"/>
 *                   &lt;element name="procRecurso" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentoDados"/>
 *                   &lt;element name="codGlosaProc" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoGlosa"/>
 *                   &lt;element name="valorRecursado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
 *                   &lt;element name="justificativaPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto150"/>
 *                   &lt;element name="valorAcatado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
 *                   &lt;element name="justificativaOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto150" minOccurs="0"/>
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
@XmlType(name = "ct_respostaRecursoItemOdonto", propOrder = {
    "numeroGuiaPrestador",
    "numeroGuiaOperadora",
    "senha",
    "nomeBeneficiario",
    "recursoProcedimento"
})
public class CtRespostaRecursoItemOdonto {

    @XmlElement(required = true)
    protected String numeroGuiaPrestador;
    protected String numeroGuiaOperadora;
    protected String senha;
    @XmlElement(required = true)
    protected String nomeBeneficiario;
    @XmlElement(required = true)
    protected List<RecursoProcedimento> recursoProcedimento;

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
     * Obt�m o valor da propriedade numeroGuiaOperadora.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroGuiaOperadora() {
        return numeroGuiaOperadora;
    }

    /**
     * Define o valor da propriedade numeroGuiaOperadora.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroGuiaOperadora(String value) {
        this.numeroGuiaOperadora = value;
    }

    /**
     * Obt�m o valor da propriedade senha.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenha() {
        return senha;
    }

    /**
     * Define o valor da propriedade senha.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenha(String value) {
        this.senha = value;
    }

    /**
     * Obt�m o valor da propriedade nomeBeneficiario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeBeneficiario() {
        return nomeBeneficiario;
    }

    /**
     * Define o valor da propriedade nomeBeneficiario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeBeneficiario(String value) {
        this.nomeBeneficiario = value;
    }

    /**
     * Gets the value of the recursoProcedimento property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recursoProcedimento property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecursoProcedimento().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RecursoProcedimento }
     * 
     * 
     */
    public List<RecursoProcedimento> getRecursoProcedimento() {
        if (recursoProcedimento == null) {
            recursoProcedimento = new ArrayList<RecursoProcedimento>();
        }
        return this.recursoProcedimento;
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
     *         &lt;element name="sequencialItem" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numerico4"/>
     *         &lt;element name="dataRealizacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
     *         &lt;element name="denteRegiao" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;choice>
     *                   &lt;element name="codDente" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_dente"/>
     *                   &lt;element name="codRegiao" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_regiao"/>
     *                 &lt;/choice>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="denteFace" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_face" minOccurs="0"/>
     *         &lt;element name="quantidade" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numerico2"/>
     *         &lt;element name="procRecurso" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentoDados"/>
     *         &lt;element name="codGlosaProc" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoGlosa"/>
     *         &lt;element name="valorRecursado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
     *         &lt;element name="justificativaPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto150"/>
     *         &lt;element name="valorAcatado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
     *         &lt;element name="justificativaOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto150" minOccurs="0"/>
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
        "sequencialItem",
        "dataRealizacao",
        "denteRegiao",
        "denteFace",
        "quantidade",
        "procRecurso",
        "codGlosaProc",
        "valorRecursado",
        "justificativaPrestador",
        "valorAcatado",
        "justificativaOperadora"
    })
    public static class RecursoProcedimento {

        @XmlElement(required = true)
        protected BigInteger sequencialItem;
        @XmlElement(required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar dataRealizacao;
        protected DenteRegiao denteRegiao;
        protected String denteFace;
        @XmlElement(required = true)
        protected BigInteger quantidade;
        @XmlElement(required = true)
        protected CtProcedimentoDados procRecurso;
        @XmlElement(required = true)
        protected String codGlosaProc;
        @XmlElement(required = true)
        protected BigDecimal valorRecursado;
        @XmlElement(required = true)
        protected String justificativaPrestador;
        @XmlElement(required = true)
        protected BigDecimal valorAcatado;
        protected String justificativaOperadora;

        /**
         * Obt�m o valor da propriedade sequencialItem.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getSequencialItem() {
            return sequencialItem;
        }

        /**
         * Define o valor da propriedade sequencialItem.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setSequencialItem(BigInteger value) {
            this.sequencialItem = value;
        }

        /**
         * Obt�m o valor da propriedade dataRealizacao.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDataRealizacao() {
            return dataRealizacao;
        }

        /**
         * Define o valor da propriedade dataRealizacao.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDataRealizacao(XMLGregorianCalendar value) {
            this.dataRealizacao = value;
        }

        /**
         * Obt�m o valor da propriedade denteRegiao.
         * 
         * @return
         *     possible object is
         *     {@link DenteRegiao }
         *     
         */
        public DenteRegiao getDenteRegiao() {
            return denteRegiao;
        }

        /**
         * Define o valor da propriedade denteRegiao.
         * 
         * @param value
         *     allowed object is
         *     {@link DenteRegiao }
         *     
         */
        public void setDenteRegiao(DenteRegiao value) {
            this.denteRegiao = value;
        }

        /**
         * Obt�m o valor da propriedade denteFace.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDenteFace() {
            return denteFace;
        }

        /**
         * Define o valor da propriedade denteFace.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDenteFace(String value) {
            this.denteFace = value;
        }

        /**
         * Obt�m o valor da propriedade quantidade.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getQuantidade() {
            return quantidade;
        }

        /**
         * Define o valor da propriedade quantidade.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setQuantidade(BigInteger value) {
            this.quantidade = value;
        }

        /**
         * Obt�m o valor da propriedade procRecurso.
         * 
         * @return
         *     possible object is
         *     {@link CtProcedimentoDados }
         *     
         */
        public CtProcedimentoDados getProcRecurso() {
            return procRecurso;
        }

        /**
         * Define o valor da propriedade procRecurso.
         * 
         * @param value
         *     allowed object is
         *     {@link CtProcedimentoDados }
         *     
         */
        public void setProcRecurso(CtProcedimentoDados value) {
            this.procRecurso = value;
        }

        /**
         * Obt�m o valor da propriedade codGlosaProc.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodGlosaProc() {
            return codGlosaProc;
        }

        /**
         * Define o valor da propriedade codGlosaProc.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodGlosaProc(String value) {
            this.codGlosaProc = value;
        }

        /**
         * Obt�m o valor da propriedade valorRecursado.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getValorRecursado() {
            return valorRecursado;
        }

        /**
         * Define o valor da propriedade valorRecursado.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setValorRecursado(BigDecimal value) {
            this.valorRecursado = value;
        }

        /**
         * Obt�m o valor da propriedade justificativaPrestador.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getJustificativaPrestador() {
            return justificativaPrestador;
        }

        /**
         * Define o valor da propriedade justificativaPrestador.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setJustificativaPrestador(String value) {
            this.justificativaPrestador = value;
        }

        /**
         * Obt�m o valor da propriedade valorAcatado.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getValorAcatado() {
            return valorAcatado;
        }

        /**
         * Define o valor da propriedade valorAcatado.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setValorAcatado(BigDecimal value) {
            this.valorAcatado = value;
        }

        /**
         * Obt�m o valor da propriedade justificativaOperadora.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getJustificativaOperadora() {
            return justificativaOperadora;
        }

        /**
         * Define o valor da propriedade justificativaOperadora.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setJustificativaOperadora(String value) {
            this.justificativaOperadora = value;
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
         *         &lt;element name="codDente" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_dente"/>
         *         &lt;element name="codRegiao" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_regiao"/>
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
            "codDente",
            "codRegiao"
        })
        public static class DenteRegiao {

            protected String codDente;
            @XmlSchemaType(name = "string")
            protected DmRegiao codRegiao;

            /**
             * Obt�m o valor da propriedade codDente.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCodDente() {
                return codDente;
            }

            /**
             * Define o valor da propriedade codDente.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCodDente(String value) {
                this.codDente = value;
            }

            /**
             * Obt�m o valor da propriedade codRegiao.
             * 
             * @return
             *     possible object is
             *     {@link DmRegiao }
             *     
             */
            public DmRegiao getCodRegiao() {
                return codRegiao;
            }

            /**
             * Define o valor da propriedade codRegiao.
             * 
             * @param value
             *     allowed object is
             *     {@link DmRegiao }
             *     
             */
            public void setCodRegiao(DmRegiao value) {
                this.codRegiao = value;
            }

        }

    }

}

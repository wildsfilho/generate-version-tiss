//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2020.04.26 �s 04:32:18 AM BRT 
//


package br.gov.ans.padroes.tiss.schemas.v30500;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de cto_autorizacaoServico complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="cto_autorizacaoServico">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dadosAutorizacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_autorizacaoDados"/>
 *         &lt;element name="numeroCarteira" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20"/>
 *         &lt;element name="nomeBeneficiario" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto70"/>
 *         &lt;element name="numeroCNS" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto15" minOccurs="0"/>
 *         &lt;element name="tipoIdent" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoIdent" minOccurs="0"/>
 *         &lt;element name="identificadorBeneficiario" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="templateBiometrico" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="statusSolicitacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_statusSolicitacao"/>
 *         &lt;element name="prestadorAutorizado" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_contratadoDados" minOccurs="0"/>
 *         &lt;element name="procedimentosAutorizados" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="sequencialItem" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numerico4"/>
 *                   &lt;element name="procSolic" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentoDados"/>
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
 *                   &lt;element name="denteFace" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto5" minOccurs="0"/>
 *                   &lt;element name="qtdProc" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numerico2"/>
 *                   &lt;element name="qtdUS" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2" minOccurs="0"/>
 *                   &lt;element name="valorProc" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
 *                   &lt;element name="valorFranquia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2" minOccurs="0"/>
 *                   &lt;element name="aut" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_simNao"/>
 *                   &lt;element name="motivosNegativa" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_motivoGlosa" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cto_autorizacaoServico", propOrder = {
    "dadosAutorizacao",
    "numeroCarteira",
    "nomeBeneficiario",
    "numeroCNS",
    "tipoIdent",
    "identificadorBeneficiario",
    "templateBiometrico",
    "statusSolicitacao",
    "prestadorAutorizado",
    "procedimentosAutorizados",
    "motivosNegativa"
})
public class CtoAutorizacaoServico {

    @XmlElement(required = true)
    protected CtAutorizacaoDados dadosAutorizacao;
    @XmlElement(required = true)
    protected String numeroCarteira;
    @XmlElement(required = true)
    protected String nomeBeneficiario;
    protected String numeroCNS;
    protected String tipoIdent;
    protected byte[] identificadorBeneficiario;
    protected byte[] templateBiometrico;
    @XmlElement(required = true)
    protected String statusSolicitacao;
    protected CtContratadoDados prestadorAutorizado;
    protected List<ProcedimentosAutorizados> procedimentosAutorizados;
    protected MotivosNegativa motivosNegativa;

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
     * Obt�m o valor da propriedade numeroCarteira.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroCarteira() {
        return numeroCarteira;
    }

    /**
     * Define o valor da propriedade numeroCarteira.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroCarteira(String value) {
        this.numeroCarteira = value;
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
     * Obt�m o valor da propriedade numeroCNS.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroCNS() {
        return numeroCNS;
    }

    /**
     * Define o valor da propriedade numeroCNS.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroCNS(String value) {
        this.numeroCNS = value;
    }

    /**
     * Obt�m o valor da propriedade tipoIdent.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoIdent() {
        return tipoIdent;
    }

    /**
     * Define o valor da propriedade tipoIdent.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoIdent(String value) {
        this.tipoIdent = value;
    }

    /**
     * Obt�m o valor da propriedade identificadorBeneficiario.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getIdentificadorBeneficiario() {
        return identificadorBeneficiario;
    }

    /**
     * Define o valor da propriedade identificadorBeneficiario.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setIdentificadorBeneficiario(byte[] value) {
        this.identificadorBeneficiario = value;
    }

    /**
     * Obt�m o valor da propriedade templateBiometrico.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getTemplateBiometrico() {
        return templateBiometrico;
    }

    /**
     * Define o valor da propriedade templateBiometrico.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setTemplateBiometrico(byte[] value) {
        this.templateBiometrico = value;
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
     * Gets the value of the procedimentosAutorizados property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the procedimentosAutorizados property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProcedimentosAutorizados().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProcedimentosAutorizados }
     * 
     * 
     */
    public List<ProcedimentosAutorizados> getProcedimentosAutorizados() {
        if (procedimentosAutorizados == null) {
            procedimentosAutorizados = new ArrayList<ProcedimentosAutorizados>();
        }
        return this.procedimentosAutorizados;
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
     *         &lt;element name="sequencialItem" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numerico4"/>
     *         &lt;element name="procSolic" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentoDados"/>
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
     *         &lt;element name="denteFace" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto5" minOccurs="0"/>
     *         &lt;element name="qtdProc" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numerico2"/>
     *         &lt;element name="qtdUS" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2" minOccurs="0"/>
     *         &lt;element name="valorProc" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
     *         &lt;element name="valorFranquia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2" minOccurs="0"/>
     *         &lt;element name="aut" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_simNao"/>
     *         &lt;element name="motivosNegativa" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_motivoGlosa" maxOccurs="unbounded" minOccurs="0"/>
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
        "procSolic",
        "denteRegiao",
        "denteFace",
        "qtdProc",
        "qtdUS",
        "valorProc",
        "valorFranquia",
        "aut",
        "motivosNegativa"
    })
    public static class ProcedimentosAutorizados {

        @XmlElement(required = true)
        protected BigInteger sequencialItem;
        @XmlElement(required = true)
        protected CtProcedimentoDados procSolic;
        protected DenteRegiao denteRegiao;
        protected String denteFace;
        @XmlElement(required = true)
        protected BigInteger qtdProc;
        protected BigDecimal qtdUS;
        @XmlElement(required = true)
        protected BigDecimal valorProc;
        protected BigDecimal valorFranquia;
        @XmlElement(required = true)
        @XmlSchemaType(name = "string")
        protected DmSimNao aut;
        protected List<CtMotivoGlosa> motivosNegativa;

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
         * Obt�m o valor da propriedade procSolic.
         * 
         * @return
         *     possible object is
         *     {@link CtProcedimentoDados }
         *     
         */
        public CtProcedimentoDados getProcSolic() {
            return procSolic;
        }

        /**
         * Define o valor da propriedade procSolic.
         * 
         * @param value
         *     allowed object is
         *     {@link CtProcedimentoDados }
         *     
         */
        public void setProcSolic(CtProcedimentoDados value) {
            this.procSolic = value;
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
         * Obt�m o valor da propriedade qtdProc.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getQtdProc() {
            return qtdProc;
        }

        /**
         * Define o valor da propriedade qtdProc.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setQtdProc(BigInteger value) {
            this.qtdProc = value;
        }

        /**
         * Obt�m o valor da propriedade qtdUS.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getQtdUS() {
            return qtdUS;
        }

        /**
         * Define o valor da propriedade qtdUS.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setQtdUS(BigDecimal value) {
            this.qtdUS = value;
        }

        /**
         * Obt�m o valor da propriedade valorProc.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getValorProc() {
            return valorProc;
        }

        /**
         * Define o valor da propriedade valorProc.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setValorProc(BigDecimal value) {
            this.valorProc = value;
        }

        /**
         * Obt�m o valor da propriedade valorFranquia.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getValorFranquia() {
            return valorFranquia;
        }

        /**
         * Define o valor da propriedade valorFranquia.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setValorFranquia(BigDecimal value) {
            this.valorFranquia = value;
        }

        /**
         * Obt�m o valor da propriedade aut.
         * 
         * @return
         *     possible object is
         *     {@link DmSimNao }
         *     
         */
        public DmSimNao getAut() {
            return aut;
        }

        /**
         * Define o valor da propriedade aut.
         * 
         * @param value
         *     allowed object is
         *     {@link DmSimNao }
         *     
         */
        public void setAut(DmSimNao value) {
            this.aut = value;
        }

        /**
         * Gets the value of the motivosNegativa property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the motivosNegativa property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMotivosNegativa().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CtMotivoGlosa }
         * 
         * 
         */
        public List<CtMotivoGlosa> getMotivosNegativa() {
            if (motivosNegativa == null) {
                motivosNegativa = new ArrayList<CtMotivoGlosa>();
            }
            return this.motivosNegativa;
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

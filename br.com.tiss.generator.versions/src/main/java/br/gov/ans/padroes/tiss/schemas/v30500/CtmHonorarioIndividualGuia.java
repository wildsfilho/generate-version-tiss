//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2020.04.26 �s 04:32:18 AM BRT 
//


package br.gov.ans.padroes.tiss.schemas.v30500;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de ctm_honorarioIndividualGuia complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ctm_honorarioIndividualGuia">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cabecalhoGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_guiaCabecalho"/>
 *         &lt;element name="guiaSolicInternacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20"/>
 *         &lt;element name="senha" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20" minOccurs="0"/>
 *         &lt;element name="numeroGuiaOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20" minOccurs="0"/>
 *         &lt;element name="beneficiario">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="numeroCarteira" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20"/>
 *                   &lt;element name="nomeBeneficiario" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto70"/>
 *                   &lt;element name="atendimentoRN" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_simNao"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="localContratado">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="codigoContratado">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;choice>
 *                             &lt;element name="codigoNaOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto14"/>
 *                             &lt;element name="cnpjLocalExecutante" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_CNPJ"/>
 *                           &lt;/choice>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="nomeContratado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto70"/>
 *                   &lt;element name="cnes" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto7"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="dadosContratadoExecutante">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="codigonaOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto14"/>
 *                   &lt;element name="nomeContratadoExecutante" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto70"/>
 *                   &lt;element name="cnesContratadoExecutante" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto7"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="dadosInternacao">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="dataInicioFaturamento" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
 *                   &lt;element name="dataFimFaturamento" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="procedimentosRealizados">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="procedimentoRealizado" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentoExecutadoHonorIndiv" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="observacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto500" minOccurs="0"/>
 *         &lt;element name="valorTotalHonorarios" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
 *         &lt;element name="dataEmissaoGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
 *         &lt;element name="assinaturaDigitalGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}Signature" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ctm_honorarioIndividualGuia", propOrder = {
    "cabecalhoGuia",
    "guiaSolicInternacao",
    "senha",
    "numeroGuiaOperadora",
    "beneficiario",
    "localContratado",
    "dadosContratadoExecutante",
    "dadosInternacao",
    "procedimentosRealizados",
    "observacao",
    "valorTotalHonorarios",
    "dataEmissaoGuia",
    "assinaturaDigitalGuia"
})
public class CtmHonorarioIndividualGuia {

    @XmlElement(required = true)
    protected CtGuiaCabecalho cabecalhoGuia;
    @XmlElement(required = true)
    protected String guiaSolicInternacao;
    protected String senha;
    protected String numeroGuiaOperadora;
    @XmlElement(required = true)
    protected Beneficiario beneficiario;
    @XmlElement(required = true)
    protected LocalContratado localContratado;
    @XmlElement(required = true)
    protected DadosContratadoExecutante dadosContratadoExecutante;
    @XmlElement(required = true)
    protected DadosInternacao dadosInternacao;
    @XmlElement(required = true)
    protected ProcedimentosRealizados procedimentosRealizados;
    protected String observacao;
    @XmlElement(required = true)
    protected BigDecimal valorTotalHonorarios;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataEmissaoGuia;
    protected Signature assinaturaDigitalGuia;

    /**
     * Obt�m o valor da propriedade cabecalhoGuia.
     * 
     * @return
     *     possible object is
     *     {@link CtGuiaCabecalho }
     *     
     */
    public CtGuiaCabecalho getCabecalhoGuia() {
        return cabecalhoGuia;
    }

    /**
     * Define o valor da propriedade cabecalhoGuia.
     * 
     * @param value
     *     allowed object is
     *     {@link CtGuiaCabecalho }
     *     
     */
    public void setCabecalhoGuia(CtGuiaCabecalho value) {
        this.cabecalhoGuia = value;
    }

    /**
     * Obt�m o valor da propriedade guiaSolicInternacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuiaSolicInternacao() {
        return guiaSolicInternacao;
    }

    /**
     * Define o valor da propriedade guiaSolicInternacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuiaSolicInternacao(String value) {
        this.guiaSolicInternacao = value;
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
     * Obt�m o valor da propriedade beneficiario.
     * 
     * @return
     *     possible object is
     *     {@link Beneficiario }
     *     
     */
    public Beneficiario getBeneficiario() {
        return beneficiario;
    }

    /**
     * Define o valor da propriedade beneficiario.
     * 
     * @param value
     *     allowed object is
     *     {@link Beneficiario }
     *     
     */
    public void setBeneficiario(Beneficiario value) {
        this.beneficiario = value;
    }

    /**
     * Obt�m o valor da propriedade localContratado.
     * 
     * @return
     *     possible object is
     *     {@link LocalContratado }
     *     
     */
    public LocalContratado getLocalContratado() {
        return localContratado;
    }

    /**
     * Define o valor da propriedade localContratado.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalContratado }
     *     
     */
    public void setLocalContratado(LocalContratado value) {
        this.localContratado = value;
    }

    /**
     * Obt�m o valor da propriedade dadosContratadoExecutante.
     * 
     * @return
     *     possible object is
     *     {@link DadosContratadoExecutante }
     *     
     */
    public DadosContratadoExecutante getDadosContratadoExecutante() {
        return dadosContratadoExecutante;
    }

    /**
     * Define o valor da propriedade dadosContratadoExecutante.
     * 
     * @param value
     *     allowed object is
     *     {@link DadosContratadoExecutante }
     *     
     */
    public void setDadosContratadoExecutante(DadosContratadoExecutante value) {
        this.dadosContratadoExecutante = value;
    }

    /**
     * Obt�m o valor da propriedade dadosInternacao.
     * 
     * @return
     *     possible object is
     *     {@link DadosInternacao }
     *     
     */
    public DadosInternacao getDadosInternacao() {
        return dadosInternacao;
    }

    /**
     * Define o valor da propriedade dadosInternacao.
     * 
     * @param value
     *     allowed object is
     *     {@link DadosInternacao }
     *     
     */
    public void setDadosInternacao(DadosInternacao value) {
        this.dadosInternacao = value;
    }

    /**
     * Obt�m o valor da propriedade procedimentosRealizados.
     * 
     * @return
     *     possible object is
     *     {@link ProcedimentosRealizados }
     *     
     */
    public ProcedimentosRealizados getProcedimentosRealizados() {
        return procedimentosRealizados;
    }

    /**
     * Define o valor da propriedade procedimentosRealizados.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcedimentosRealizados }
     *     
     */
    public void setProcedimentosRealizados(ProcedimentosRealizados value) {
        this.procedimentosRealizados = value;
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
     * Obt�m o valor da propriedade valorTotalHonorarios.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorTotalHonorarios() {
        return valorTotalHonorarios;
    }

    /**
     * Define o valor da propriedade valorTotalHonorarios.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorTotalHonorarios(BigDecimal value) {
        this.valorTotalHonorarios = value;
    }

    /**
     * Obt�m o valor da propriedade dataEmissaoGuia.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataEmissaoGuia() {
        return dataEmissaoGuia;
    }

    /**
     * Define o valor da propriedade dataEmissaoGuia.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataEmissaoGuia(XMLGregorianCalendar value) {
        this.dataEmissaoGuia = value;
    }

    /**
     * Obt�m o valor da propriedade assinaturaDigitalGuia.
     * 
     * @return
     *     possible object is
     *     {@link Signature }
     *     
     */
    public Signature getAssinaturaDigitalGuia() {
        return assinaturaDigitalGuia;
    }

    /**
     * Define o valor da propriedade assinaturaDigitalGuia.
     * 
     * @param value
     *     allowed object is
     *     {@link Signature }
     *     
     */
    public void setAssinaturaDigitalGuia(Signature value) {
        this.assinaturaDigitalGuia = value;
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
     *         &lt;element name="numeroCarteira" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20"/>
     *         &lt;element name="nomeBeneficiario" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto70"/>
     *         &lt;element name="atendimentoRN" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_simNao"/>
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
        "numeroCarteira",
        "nomeBeneficiario",
        "atendimentoRN"
    })
    public static class Beneficiario {

        @XmlElement(required = true)
        protected String numeroCarteira;
        @XmlElement(required = true)
        protected String nomeBeneficiario;
        @XmlElement(required = true)
        @XmlSchemaType(name = "string")
        protected DmSimNao atendimentoRN;

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
         * Obt�m o valor da propriedade atendimentoRN.
         * 
         * @return
         *     possible object is
         *     {@link DmSimNao }
         *     
         */
        public DmSimNao getAtendimentoRN() {
            return atendimentoRN;
        }

        /**
         * Define o valor da propriedade atendimentoRN.
         * 
         * @param value
         *     allowed object is
         *     {@link DmSimNao }
         *     
         */
        public void setAtendimentoRN(DmSimNao value) {
            this.atendimentoRN = value;
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
     *         &lt;element name="codigonaOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto14"/>
     *         &lt;element name="nomeContratadoExecutante" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto70"/>
     *         &lt;element name="cnesContratadoExecutante" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto7"/>
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
        "codigonaOperadora",
        "nomeContratadoExecutante",
        "cnesContratadoExecutante"
    })
    public static class DadosContratadoExecutante {

        @XmlElement(required = true)
        protected String codigonaOperadora;
        @XmlElement(required = true)
        protected String nomeContratadoExecutante;
        @XmlElement(required = true)
        protected String cnesContratadoExecutante;

        /**
         * Obt�m o valor da propriedade codigonaOperadora.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodigonaOperadora() {
            return codigonaOperadora;
        }

        /**
         * Define o valor da propriedade codigonaOperadora.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodigonaOperadora(String value) {
            this.codigonaOperadora = value;
        }

        /**
         * Obt�m o valor da propriedade nomeContratadoExecutante.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNomeContratadoExecutante() {
            return nomeContratadoExecutante;
        }

        /**
         * Define o valor da propriedade nomeContratadoExecutante.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNomeContratadoExecutante(String value) {
            this.nomeContratadoExecutante = value;
        }

        /**
         * Obt�m o valor da propriedade cnesContratadoExecutante.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCnesContratadoExecutante() {
            return cnesContratadoExecutante;
        }

        /**
         * Define o valor da propriedade cnesContratadoExecutante.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCnesContratadoExecutante(String value) {
            this.cnesContratadoExecutante = value;
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
     *         &lt;element name="dataInicioFaturamento" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
     *         &lt;element name="dataFimFaturamento" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
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
        "dataInicioFaturamento",
        "dataFimFaturamento"
    })
    public static class DadosInternacao {

        @XmlElement(required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar dataInicioFaturamento;
        @XmlElement(required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar dataFimFaturamento;

        /**
         * Obt�m o valor da propriedade dataInicioFaturamento.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDataInicioFaturamento() {
            return dataInicioFaturamento;
        }

        /**
         * Define o valor da propriedade dataInicioFaturamento.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDataInicioFaturamento(XMLGregorianCalendar value) {
            this.dataInicioFaturamento = value;
        }

        /**
         * Obt�m o valor da propriedade dataFimFaturamento.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDataFimFaturamento() {
            return dataFimFaturamento;
        }

        /**
         * Define o valor da propriedade dataFimFaturamento.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDataFimFaturamento(XMLGregorianCalendar value) {
            this.dataFimFaturamento = value;
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
     *         &lt;element name="codigoContratado">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;choice>
     *                   &lt;element name="codigoNaOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto14"/>
     *                   &lt;element name="cnpjLocalExecutante" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_CNPJ"/>
     *                 &lt;/choice>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="nomeContratado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto70"/>
     *         &lt;element name="cnes" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto7"/>
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
        "codigoContratado",
        "nomeContratado",
        "cnes"
    })
    public static class LocalContratado {

        @XmlElement(required = true)
        protected CodigoContratado codigoContratado;
        @XmlElement(required = true)
        protected String nomeContratado;
        @XmlElement(required = true)
        protected String cnes;

        /**
         * Obt�m o valor da propriedade codigoContratado.
         * 
         * @return
         *     possible object is
         *     {@link CodigoContratado }
         *     
         */
        public CodigoContratado getCodigoContratado() {
            return codigoContratado;
        }

        /**
         * Define o valor da propriedade codigoContratado.
         * 
         * @param value
         *     allowed object is
         *     {@link CodigoContratado }
         *     
         */
        public void setCodigoContratado(CodigoContratado value) {
            this.codigoContratado = value;
        }

        /**
         * Obt�m o valor da propriedade nomeContratado.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNomeContratado() {
            return nomeContratado;
        }

        /**
         * Define o valor da propriedade nomeContratado.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNomeContratado(String value) {
            this.nomeContratado = value;
        }

        /**
         * Obt�m o valor da propriedade cnes.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCnes() {
            return cnes;
        }

        /**
         * Define o valor da propriedade cnes.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCnes(String value) {
            this.cnes = value;
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
         *         &lt;element name="codigoNaOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto14"/>
         *         &lt;element name="cnpjLocalExecutante" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_CNPJ"/>
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
            "codigoNaOperadora",
            "cnpjLocalExecutante"
        })
        public static class CodigoContratado {

            protected String codigoNaOperadora;
            protected String cnpjLocalExecutante;

            /**
             * Obt�m o valor da propriedade codigoNaOperadora.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCodigoNaOperadora() {
                return codigoNaOperadora;
            }

            /**
             * Define o valor da propriedade codigoNaOperadora.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCodigoNaOperadora(String value) {
                this.codigoNaOperadora = value;
            }

            /**
             * Obt�m o valor da propriedade cnpjLocalExecutante.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCnpjLocalExecutante() {
                return cnpjLocalExecutante;
            }

            /**
             * Define o valor da propriedade cnpjLocalExecutante.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCnpjLocalExecutante(String value) {
                this.cnpjLocalExecutante = value;
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
     *         &lt;element name="procedimentoRealizado" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentoExecutadoHonorIndiv" maxOccurs="unbounded"/>
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
        "procedimentoRealizado"
    })
    public static class ProcedimentosRealizados {

        @XmlElement(required = true)
        protected List<CtProcedimentoExecutadoHonorIndiv> procedimentoRealizado;

        /**
         * Gets the value of the procedimentoRealizado property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the procedimentoRealizado property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProcedimentoRealizado().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CtProcedimentoExecutadoHonorIndiv }
         * 
         * 
         */
        public List<CtProcedimentoExecutadoHonorIndiv> getProcedimentoRealizado() {
            if (procedimentoRealizado == null) {
                procedimentoRealizado = new ArrayList<CtProcedimentoExecutadoHonorIndiv>();
            }
            return this.procedimentoRealizado;
        }

    }

}

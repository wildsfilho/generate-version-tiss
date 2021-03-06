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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de cto_anexoSituacaoInicial complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="cto_anexoSituacaoInicial">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="registroANS" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_registroANS"/>
 *         &lt;element name="numeroGuiaAnexo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20"/>
 *         &lt;element name="numeroGuiaReferenciada" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20"/>
 *         &lt;element name="numeroGuiaOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20" minOccurs="0"/>
 *         &lt;element name="nomeBeneficiario" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto70"/>
 *         &lt;element name="numeroCarteira" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20"/>
 *         &lt;element name="ct_situacaoInicial">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="situacaoClinica" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_situacaoClinica"/>
 *                   &lt;element name="doencaPeriodontal" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_logico"/>
 *                   &lt;element name="alteracaoTecidoMole" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_logico"/>
 *                   &lt;element name="observacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto500" minOccurs="0"/>
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
@XmlType(name = "cto_anexoSituacaoInicial", propOrder = {
    "registroANS",
    "numeroGuiaAnexo",
    "numeroGuiaReferenciada",
    "numeroGuiaOperadora",
    "nomeBeneficiario",
    "numeroCarteira",
    "ctSituacaoInicial"
})
public class CtoAnexoSituacaoInicial {

    @XmlElement(required = true)
    protected String registroANS;
    @XmlElement(required = true)
    protected String numeroGuiaAnexo;
    @XmlElement(required = true)
    protected String numeroGuiaReferenciada;
    protected String numeroGuiaOperadora;
    @XmlElement(required = true)
    protected String nomeBeneficiario;
    @XmlElement(required = true)
    protected String numeroCarteira;
    @XmlElement(name = "ct_situacaoInicial", required = true)
    protected CtSituacaoInicial ctSituacaoInicial;

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
     * Obt�m o valor da propriedade numeroGuiaAnexo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroGuiaAnexo() {
        return numeroGuiaAnexo;
    }

    /**
     * Define o valor da propriedade numeroGuiaAnexo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroGuiaAnexo(String value) {
        this.numeroGuiaAnexo = value;
    }

    /**
     * Obt�m o valor da propriedade numeroGuiaReferenciada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroGuiaReferenciada() {
        return numeroGuiaReferenciada;
    }

    /**
     * Define o valor da propriedade numeroGuiaReferenciada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroGuiaReferenciada(String value) {
        this.numeroGuiaReferenciada = value;
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
     * Obt�m o valor da propriedade ctSituacaoInicial.
     * 
     * @return
     *     possible object is
     *     {@link CtSituacaoInicial }
     *     
     */
    public CtSituacaoInicial getCtSituacaoInicial() {
        return ctSituacaoInicial;
    }

    /**
     * Define o valor da propriedade ctSituacaoInicial.
     * 
     * @param value
     *     allowed object is
     *     {@link CtSituacaoInicial }
     *     
     */
    public void setCtSituacaoInicial(CtSituacaoInicial value) {
        this.ctSituacaoInicial = value;
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
     *         &lt;element name="situacaoClinica" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_situacaoClinica"/>
     *         &lt;element name="doencaPeriodontal" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_logico"/>
     *         &lt;element name="alteracaoTecidoMole" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_logico"/>
     *         &lt;element name="observacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto500" minOccurs="0"/>
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
        "situacaoClinica",
        "doencaPeriodontal",
        "alteracaoTecidoMole",
        "observacao"
    })
    public static class CtSituacaoInicial {

        @XmlElement(required = true)
        protected CtSituacaoClinica situacaoClinica;
        protected boolean doencaPeriodontal;
        protected boolean alteracaoTecidoMole;
        protected String observacao;

        /**
         * Obt�m o valor da propriedade situacaoClinica.
         * 
         * @return
         *     possible object is
         *     {@link CtSituacaoClinica }
         *     
         */
        public CtSituacaoClinica getSituacaoClinica() {
            return situacaoClinica;
        }

        /**
         * Define o valor da propriedade situacaoClinica.
         * 
         * @param value
         *     allowed object is
         *     {@link CtSituacaoClinica }
         *     
         */
        public void setSituacaoClinica(CtSituacaoClinica value) {
            this.situacaoClinica = value;
        }

        /**
         * Obt�m o valor da propriedade doencaPeriodontal.
         * 
         */
        public boolean isDoencaPeriodontal() {
            return doencaPeriodontal;
        }

        /**
         * Define o valor da propriedade doencaPeriodontal.
         * 
         */
        public void setDoencaPeriodontal(boolean value) {
            this.doencaPeriodontal = value;
        }

        /**
         * Obt�m o valor da propriedade alteracaoTecidoMole.
         * 
         */
        public boolean isAlteracaoTecidoMole() {
            return alteracaoTecidoMole;
        }

        /**
         * Define o valor da propriedade alteracaoTecidoMole.
         * 
         */
        public void setAlteracaoTecidoMole(boolean value) {
            this.alteracaoTecidoMole = value;
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

    }

}

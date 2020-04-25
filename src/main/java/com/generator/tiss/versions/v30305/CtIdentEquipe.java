//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2020.04.25 �s 04:37:47 AM BRT 
//


package com.generator.tiss.versions.v30305;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ct_identEquipe complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_identEquipe">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="grauPart" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_grauPart"/>
 *         &lt;element name="codProfissional">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="codigoPrestadorNaOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto14"/>
 *                   &lt;element name="cpfContratado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_CPF"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="nomeProf" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto70"/>
 *         &lt;element name="conselho" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_conselhoProfissional"/>
 *         &lt;element name="numeroConselhoProfissional" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto15"/>
 *         &lt;element name="UF" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_UF"/>
 *         &lt;element name="CBOS" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_CBOS"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_identEquipe", propOrder = {
    "grauPart",
    "codProfissional",
    "nomeProf",
    "conselho",
    "numeroConselhoProfissional",
    "uf",
    "cbos"
})
public class CtIdentEquipe {

    @XmlElement(required = true)
    protected String grauPart;
    @XmlElement(required = true)
    protected CodProfissional codProfissional;
    @XmlElement(required = true)
    protected String nomeProf;
    @XmlElement(required = true)
    protected String conselho;
    @XmlElement(required = true)
    protected String numeroConselhoProfissional;
    @XmlElement(name = "UF", required = true)
    protected String uf;
    @XmlElement(name = "CBOS", required = true)
    protected String cbos;

    /**
     * Obt�m o valor da propriedade grauPart.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrauPart() {
        return grauPart;
    }

    /**
     * Define o valor da propriedade grauPart.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrauPart(String value) {
        this.grauPart = value;
    }

    /**
     * Obt�m o valor da propriedade codProfissional.
     * 
     * @return
     *     possible object is
     *     {@link CodProfissional }
     *     
     */
    public CodProfissional getCodProfissional() {
        return codProfissional;
    }

    /**
     * Define o valor da propriedade codProfissional.
     * 
     * @param value
     *     allowed object is
     *     {@link CodProfissional }
     *     
     */
    public void setCodProfissional(CodProfissional value) {
        this.codProfissional = value;
    }

    /**
     * Obt�m o valor da propriedade nomeProf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeProf() {
        return nomeProf;
    }

    /**
     * Define o valor da propriedade nomeProf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeProf(String value) {
        this.nomeProf = value;
    }

    /**
     * Obt�m o valor da propriedade conselho.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConselho() {
        return conselho;
    }

    /**
     * Define o valor da propriedade conselho.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConselho(String value) {
        this.conselho = value;
    }

    /**
     * Obt�m o valor da propriedade numeroConselhoProfissional.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroConselhoProfissional() {
        return numeroConselhoProfissional;
    }

    /**
     * Define o valor da propriedade numeroConselhoProfissional.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroConselhoProfissional(String value) {
        this.numeroConselhoProfissional = value;
    }

    /**
     * Obt�m o valor da propriedade uf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUF() {
        return uf;
    }

    /**
     * Define o valor da propriedade uf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUF(String value) {
        this.uf = value;
    }

    /**
     * Obt�m o valor da propriedade cbos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCBOS() {
        return cbos;
    }

    /**
     * Define o valor da propriedade cbos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCBOS(String value) {
        this.cbos = value;
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
     *         &lt;element name="codigoPrestadorNaOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto14"/>
     *         &lt;element name="cpfContratado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_CPF"/>
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
        "codigoPrestadorNaOperadora",
        "cpfContratado"
    })
    public static class CodProfissional {

        protected String codigoPrestadorNaOperadora;
        protected String cpfContratado;

        /**
         * Obt�m o valor da propriedade codigoPrestadorNaOperadora.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodigoPrestadorNaOperadora() {
            return codigoPrestadorNaOperadora;
        }

        /**
         * Define o valor da propriedade codigoPrestadorNaOperadora.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodigoPrestadorNaOperadora(String value) {
            this.codigoPrestadorNaOperadora = value;
        }

        /**
         * Obt�m o valor da propriedade cpfContratado.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCpfContratado() {
            return cpfContratado;
        }

        /**
         * Define o valor da propriedade cpfContratado.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCpfContratado(String value) {
            this.cpfContratado = value;
        }

    }

}

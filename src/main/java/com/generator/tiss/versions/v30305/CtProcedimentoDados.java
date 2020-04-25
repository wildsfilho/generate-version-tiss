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
 * <p>Classe Java de ct_procedimentoDados complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_procedimentoDados">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoTabela" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tabela"/>
 *         &lt;element name="codigoProcedimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto10"/>
 *         &lt;element name="descricaoProcedimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto150"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_procedimentoDados", propOrder = {
    "codigoTabela",
    "codigoProcedimento",
    "descricaoProcedimento"
})
public class CtProcedimentoDados {

    @XmlElement(required = true)
    protected String codigoTabela;
    @XmlElement(required = true)
    protected String codigoProcedimento;
    @XmlElement(required = true)
    protected String descricaoProcedimento;

    /**
     * Obt�m o valor da propriedade codigoTabela.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoTabela() {
        return codigoTabela;
    }

    /**
     * Define o valor da propriedade codigoTabela.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoTabela(String value) {
        this.codigoTabela = value;
    }

    /**
     * Obt�m o valor da propriedade codigoProcedimento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoProcedimento() {
        return codigoProcedimento;
    }

    /**
     * Define o valor da propriedade codigoProcedimento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoProcedimento(String value) {
        this.codigoProcedimento = value;
    }

    /**
     * Obt�m o valor da propriedade descricaoProcedimento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricaoProcedimento() {
        return descricaoProcedimento;
    }

    /**
     * Define o valor da propriedade descricaoProcedimento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricaoProcedimento(String value) {
        this.descricaoProcedimento = value;
    }

}

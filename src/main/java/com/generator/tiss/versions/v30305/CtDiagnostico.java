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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ct_diagnostico complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_diagnostico">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tabelaDiagnostico" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tabelasDiagnostico"/>
 *         &lt;element name="codigoDiagnostico" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto4"/>
 *         &lt;element name="descricaoDiagnostico" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto150"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_diagnostico", propOrder = {
    "tabelaDiagnostico",
    "codigoDiagnostico",
    "descricaoDiagnostico"
})
public class CtDiagnostico {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected DmTabelasDiagnostico tabelaDiagnostico;
    @XmlElement(required = true)
    protected String codigoDiagnostico;
    @XmlElement(required = true)
    protected String descricaoDiagnostico;

    /**
     * Obt�m o valor da propriedade tabelaDiagnostico.
     * 
     * @return
     *     possible object is
     *     {@link DmTabelasDiagnostico }
     *     
     */
    public DmTabelasDiagnostico getTabelaDiagnostico() {
        return tabelaDiagnostico;
    }

    /**
     * Define o valor da propriedade tabelaDiagnostico.
     * 
     * @param value
     *     allowed object is
     *     {@link DmTabelasDiagnostico }
     *     
     */
    public void setTabelaDiagnostico(DmTabelasDiagnostico value) {
        this.tabelaDiagnostico = value;
    }

    /**
     * Obt�m o valor da propriedade codigoDiagnostico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoDiagnostico() {
        return codigoDiagnostico;
    }

    /**
     * Define o valor da propriedade codigoDiagnostico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoDiagnostico(String value) {
        this.codigoDiagnostico = value;
    }

    /**
     * Obt�m o valor da propriedade descricaoDiagnostico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricaoDiagnostico() {
        return descricaoDiagnostico;
    }

    /**
     * Define o valor da propriedade descricaoDiagnostico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricaoDiagnostico(String value) {
        this.descricaoDiagnostico = value;
    }

}

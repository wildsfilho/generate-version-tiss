//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2020.04.25 �s 04:37:47 AM BRT 
//


package com.generator.tiss.versions.v30305;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ct_valorTotal complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_valorTotal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="valorProcessado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
 *         &lt;element name="valorGlosa" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
 *         &lt;element name="valorLiberado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_valorTotal", propOrder = {
    "valorProcessado",
    "valorGlosa",
    "valorLiberado"
})
public class CtValorTotal {

    @XmlElement(required = true)
    protected BigDecimal valorProcessado;
    @XmlElement(required = true)
    protected BigDecimal valorGlosa;
    @XmlElement(required = true)
    protected BigDecimal valorLiberado;

    /**
     * Obt�m o valor da propriedade valorProcessado.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorProcessado() {
        return valorProcessado;
    }

    /**
     * Define o valor da propriedade valorProcessado.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorProcessado(BigDecimal value) {
        this.valorProcessado = value;
    }

    /**
     * Obt�m o valor da propriedade valorGlosa.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorGlosa() {
        return valorGlosa;
    }

    /**
     * Define o valor da propriedade valorGlosa.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorGlosa(BigDecimal value) {
        this.valorGlosa = value;
    }

    /**
     * Obt�m o valor da propriedade valorLiberado.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorLiberado() {
        return valorLiberado;
    }

    /**
     * Define o valor da propriedade valorLiberado.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorLiberado(BigDecimal value) {
        this.valorLiberado = value;
    }

}

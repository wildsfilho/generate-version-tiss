//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2020.04.25 �s 04:37:47 AM BRT 
//


package com.generator.tiss.versions.v30305;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ct_procedimentoSolicitado complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_procedimentoSolicitado">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="procedimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentoDados"/>
 *         &lt;element name="unidadeMedida" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_unidadeMedida"/>
 *         &lt;element name="quantidadeSolicitada" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numerico3"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_procedimentoSolicitado", propOrder = {
    "procedimento",
    "unidadeMedida",
    "quantidadeSolicitada"
})
public class CtProcedimentoSolicitado {

    @XmlElement(required = true)
    protected CtProcedimentoDados procedimento;
    @XmlElement(required = true)
    protected String unidadeMedida;
    @XmlElement(required = true)
    protected BigInteger quantidadeSolicitada;

    /**
     * Obt�m o valor da propriedade procedimento.
     * 
     * @return
     *     possible object is
     *     {@link CtProcedimentoDados }
     *     
     */
    public CtProcedimentoDados getProcedimento() {
        return procedimento;
    }

    /**
     * Define o valor da propriedade procedimento.
     * 
     * @param value
     *     allowed object is
     *     {@link CtProcedimentoDados }
     *     
     */
    public void setProcedimento(CtProcedimentoDados value) {
        this.procedimento = value;
    }

    /**
     * Obt�m o valor da propriedade unidadeMedida.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnidadeMedida() {
        return unidadeMedida;
    }

    /**
     * Define o valor da propriedade unidadeMedida.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnidadeMedida(String value) {
        this.unidadeMedida = value;
    }

    /**
     * Obt�m o valor da propriedade quantidadeSolicitada.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQuantidadeSolicitada() {
        return quantidadeSolicitada;
    }

    /**
     * Define o valor da propriedade quantidadeSolicitada.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQuantidadeSolicitada(BigInteger value) {
        this.quantidadeSolicitada = value;
    }

}

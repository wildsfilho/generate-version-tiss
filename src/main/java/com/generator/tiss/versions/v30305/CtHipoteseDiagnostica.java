//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2020.04.26 �s 04:32:18 AM BRT 
//


package com.generator.tiss.versions.v30305;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ct_hipoteseDiagnostica complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_hipoteseDiagnostica">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="diagnostico" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_diagnostico"/>
 *         &lt;element name="indicacaoAcidente" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_indicadorAcidente"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_hipoteseDiagnostica", propOrder = {
    "diagnostico",
    "indicacaoAcidente"
})
public class CtHipoteseDiagnostica {

    @XmlElement(required = true)
    protected CtDiagnostico diagnostico;
    @XmlElement(required = true)
    protected String indicacaoAcidente;

    /**
     * Obt�m o valor da propriedade diagnostico.
     * 
     * @return
     *     possible object is
     *     {@link CtDiagnostico }
     *     
     */
    public CtDiagnostico getDiagnostico() {
        return diagnostico;
    }

    /**
     * Define o valor da propriedade diagnostico.
     * 
     * @param value
     *     allowed object is
     *     {@link CtDiagnostico }
     *     
     */
    public void setDiagnostico(CtDiagnostico value) {
        this.diagnostico = value;
    }

    /**
     * Obt�m o valor da propriedade indicacaoAcidente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicacaoAcidente() {
        return indicacaoAcidente;
    }

    /**
     * Define o valor da propriedade indicacaoAcidente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicacaoAcidente(String value) {
        this.indicacaoAcidente = value;
    }

}

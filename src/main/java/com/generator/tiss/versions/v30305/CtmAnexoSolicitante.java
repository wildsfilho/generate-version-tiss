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
 * <p>Classe Java de ctm_anexoSolicitante complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ctm_anexoSolicitante">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nomeProfissional" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto70"/>
 *         &lt;element name="telefoneProfissional" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto11"/>
 *         &lt;element name="emailProfissional" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto60" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ctm_anexoSolicitante", propOrder = {
    "nomeProfissional",
    "telefoneProfissional",
    "emailProfissional"
})
public class CtmAnexoSolicitante {

    @XmlElement(required = true)
    protected String nomeProfissional;
    @XmlElement(required = true)
    protected String telefoneProfissional;
    protected String emailProfissional;

    /**
     * Obt�m o valor da propriedade nomeProfissional.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeProfissional() {
        return nomeProfissional;
    }

    /**
     * Define o valor da propriedade nomeProfissional.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeProfissional(String value) {
        this.nomeProfissional = value;
    }

    /**
     * Obt�m o valor da propriedade telefoneProfissional.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefoneProfissional() {
        return telefoneProfissional;
    }

    /**
     * Define o valor da propriedade telefoneProfissional.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefoneProfissional(String value) {
        this.telefoneProfissional = value;
    }

    /**
     * Obt�m o valor da propriedade emailProfissional.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailProfissional() {
        return emailProfissional;
    }

    /**
     * Define o valor da propriedade emailProfissional.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailProfissional(String value) {
        this.emailProfissional = value;
    }

}

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
 * <p>Classe Java de ct_loginSenha complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_loginSenha">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="loginPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20"/>
 *         &lt;element name="senhaPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto32"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_loginSenha", propOrder = {
    "loginPrestador",
    "senhaPrestador"
})
public class CtLoginSenha {

    @XmlElement(required = true)
    protected String loginPrestador;
    @XmlElement(required = true)
    protected String senhaPrestador;

    /**
     * Obt�m o valor da propriedade loginPrestador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoginPrestador() {
        return loginPrestador;
    }

    /**
     * Define o valor da propriedade loginPrestador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoginPrestador(String value) {
        this.loginPrestador = value;
    }

    /**
     * Obt�m o valor da propriedade senhaPrestador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenhaPrestador() {
        return senhaPrestador;
    }

    /**
     * Define o valor da propriedade senhaPrestador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenhaPrestador(String value) {
        this.senhaPrestador = value;
    }

}

//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2020.04.25 �s 04:40:31 AM BRT 
//


package com.generator.tiss.versions.v30305;


import com.generator.tiss.versions.v30305.org.SignatureType;

import javax.xml.bind.annotation.*;


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
 *         &lt;element name="cabecalho" type="{http://www.ans.gov.br/padroes/tiss/schemas}cabecalhoTransacao"/>
 *         &lt;choice>
 *           &lt;element name="operadoraParaPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}operadoraPrestador" minOccurs="0"/>
 *           &lt;element name="prestadorParaOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}prestadorOperadora" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="epilogo" type="{http://www.ans.gov.br/padroes/tiss/schemas}epilogo"/>
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Signature" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "cabecalho",
        "operadoraParaPrestador",
        "prestadorParaOperadora",
        "epilogo",
        "signature"
})
@XmlRootElement(name = "mensagemTISS")
public class MensagemTISS {

    @XmlElement(required = true)
    protected CabecalhoTransacao cabecalho;
    protected OperadoraPrestador operadoraParaPrestador;
    protected PrestadorOperadora prestadorParaOperadora;
    @XmlElement(required = true)
    protected Epilogo epilogo;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#")
    protected SignatureType signature;

    /**
     * Obt�m o valor da propriedade cabecalho.
     *
     * @return possible object is
     * {@link CabecalhoTransacao }
     */
    public CabecalhoTransacao getCabecalho() {
        return cabecalho;
    }

    /**
     * Define o valor da propriedade cabecalho.
     *
     * @param value allowed object is
     *              {@link CabecalhoTransacao }
     */
    public void setCabecalho(CabecalhoTransacao value) {
        this.cabecalho = value;
    }

    /**
     * Obt�m o valor da propriedade operadoraParaPrestador.
     *
     * @return possible object is
     * {@link OperadoraPrestador }
     */
    public OperadoraPrestador getOperadoraParaPrestador() {
        return operadoraParaPrestador;
    }

    /**
     * Define o valor da propriedade operadoraParaPrestador.
     *
     * @param value allowed object is
     *              {@link OperadoraPrestador }
     */
    public void setOperadoraParaPrestador(OperadoraPrestador value) {
        this.operadoraParaPrestador = value;
    }

    /**
     * Obt�m o valor da propriedade prestadorParaOperadora.
     *
     * @return possible object is
     * {@link PrestadorOperadora }
     */
    public PrestadorOperadora getPrestadorParaOperadora() {
        return prestadorParaOperadora;
    }

    /**
     * Define o valor da propriedade prestadorParaOperadora.
     *
     * @param value allowed object is
     *              {@link PrestadorOperadora }
     */
    public void setPrestadorParaOperadora(PrestadorOperadora value) {
        this.prestadorParaOperadora = value;
    }

    /**
     * Obt�m o valor da propriedade epilogo.
     *
     * @return possible object is
     * {@link Epilogo }
     */
    public Epilogo getEpilogo() {
        return epilogo;
    }

    /**
     * Define o valor da propriedade epilogo.
     *
     * @param value allowed object is
     *              {@link Epilogo }
     */
    public void setEpilogo(Epilogo value) {
        this.epilogo = value;
    }

    /**
     * Obt�m o valor da propriedade signature.
     *
     * @return possible object is
     * {@link SignatureType }
     */
    public SignatureType getSignature() {
        return signature;
    }

    /**
     * Define o valor da propriedade signature.
     *
     * @param value allowed object is
     *              {@link SignatureType }
     */
    public void setSignature(SignatureType value) {
        this.signature = value;
    }

}

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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ctm_beneficiarioComunicacaoRecibo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ctm_beneficiarioComunicacaoRecibo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="statusComunicacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_simNao"/>
 *         &lt;element name="beneficiarioComunicacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}ctm_beneficiarioComunicacao"/>
 *         &lt;element name="mensagemErro" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_motivoGlosa" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ctm_beneficiarioComunicacaoRecibo", propOrder = {
    "statusComunicacao",
    "beneficiarioComunicacao",
    "mensagemErro"
})
public class CtmBeneficiarioComunicacaoRecibo {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected DmSimNao statusComunicacao;
    @XmlElement(required = true)
    protected CtmBeneficiarioComunicacao beneficiarioComunicacao;
    protected CtMotivoGlosa mensagemErro;

    /**
     * Obt�m o valor da propriedade statusComunicacao.
     * 
     * @return
     *     possible object is
     *     {@link DmSimNao }
     *     
     */
    public DmSimNao getStatusComunicacao() {
        return statusComunicacao;
    }

    /**
     * Define o valor da propriedade statusComunicacao.
     * 
     * @param value
     *     allowed object is
     *     {@link DmSimNao }
     *     
     */
    public void setStatusComunicacao(DmSimNao value) {
        this.statusComunicacao = value;
    }

    /**
     * Obt�m o valor da propriedade beneficiarioComunicacao.
     * 
     * @return
     *     possible object is
     *     {@link CtmBeneficiarioComunicacao }
     *     
     */
    public CtmBeneficiarioComunicacao getBeneficiarioComunicacao() {
        return beneficiarioComunicacao;
    }

    /**
     * Define o valor da propriedade beneficiarioComunicacao.
     * 
     * @param value
     *     allowed object is
     *     {@link CtmBeneficiarioComunicacao }
     *     
     */
    public void setBeneficiarioComunicacao(CtmBeneficiarioComunicacao value) {
        this.beneficiarioComunicacao = value;
    }

    /**
     * Obt�m o valor da propriedade mensagemErro.
     * 
     * @return
     *     possible object is
     *     {@link CtMotivoGlosa }
     *     
     */
    public CtMotivoGlosa getMensagemErro() {
        return mensagemErro;
    }

    /**
     * Define o valor da propriedade mensagemErro.
     * 
     * @param value
     *     allowed object is
     *     {@link CtMotivoGlosa }
     *     
     */
    public void setMensagemErro(CtMotivoGlosa value) {
        this.mensagemErro = value;
    }

}

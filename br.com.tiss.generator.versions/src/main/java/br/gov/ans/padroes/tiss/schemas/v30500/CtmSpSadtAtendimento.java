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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ctm_sp-sadtAtendimento complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ctm_sp-sadtAtendimento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tipoAtendimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoAtendimento"/>
 *         &lt;element name="indicacaoAcidente" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_indicadorAcidente"/>
 *         &lt;element name="tipoConsulta" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoConsulta" minOccurs="0"/>
 *         &lt;element name="motivoEncerramento" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_motivoSaidaObito" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ctm_sp-sadtAtendimento", propOrder = {
    "tipoAtendimento",
    "indicacaoAcidente",
    "tipoConsulta",
    "motivoEncerramento"
})
public class CtmSpSadtAtendimento {

    @XmlElement(required = true)
    protected String tipoAtendimento;
    @XmlElement(required = true)
    protected String indicacaoAcidente;
    protected String tipoConsulta;
    protected String motivoEncerramento;

    /**
     * Obt�m o valor da propriedade tipoAtendimento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoAtendimento() {
        return tipoAtendimento;
    }

    /**
     * Define o valor da propriedade tipoAtendimento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoAtendimento(String value) {
        this.tipoAtendimento = value;
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

    /**
     * Obt�m o valor da propriedade tipoConsulta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoConsulta() {
        return tipoConsulta;
    }

    /**
     * Define o valor da propriedade tipoConsulta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoConsulta(String value) {
        this.tipoConsulta = value;
    }

    /**
     * Obt�m o valor da propriedade motivoEncerramento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotivoEncerramento() {
        return motivoEncerramento;
    }

    /**
     * Define o valor da propriedade motivoEncerramento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotivoEncerramento(String value) {
        this.motivoEncerramento = value;
    }

}

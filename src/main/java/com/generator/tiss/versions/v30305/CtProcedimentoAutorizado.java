//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2020.04.25 �s 04:37:47 AM BRT 
//


package com.generator.tiss.versions.v30305;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ct_procedimentoAutorizado complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_procedimentoAutorizado">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sequencialItem" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numerico4"/>
 *         &lt;element name="procedimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentoDados"/>
 *         &lt;element name="quantidadeSolicitada" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numerico3"/>
 *         &lt;element name="quantidadeAutorizada" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numerico3"/>
 *         &lt;element name="valorSolicitado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2" minOccurs="0"/>
 *         &lt;element name="valorAutorizado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2" minOccurs="0"/>
 *         &lt;element name="opcaoFabricante" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_opcaoFabricante" minOccurs="0"/>
 *         &lt;element name="registroANVISA" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto15" minOccurs="0"/>
 *         &lt;element name="codigoRefFabricante" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto60" minOccurs="0"/>
 *         &lt;element name="autorizacaoFuncionamento" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto30" minOccurs="0"/>
 *         &lt;element name="motivosNegativa" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="motivoNegativa" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_motivoGlosa" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_procedimentoAutorizado", propOrder = {
    "sequencialItem",
    "procedimento",
    "quantidadeSolicitada",
    "quantidadeAutorizada",
    "valorSolicitado",
    "valorAutorizado",
    "opcaoFabricante",
    "registroANVISA",
    "codigoRefFabricante",
    "autorizacaoFuncionamento",
    "motivosNegativa"
})
@XmlSeeAlso({
    br.gov.ans.padroes.tiss.schemas.CtmAutorizacaoOPME.ServicosAutorizadosOPME.class
})
public class CtProcedimentoAutorizado {

    @XmlElement(required = true)
    protected BigInteger sequencialItem;
    @XmlElement(required = true)
    protected CtProcedimentoDados procedimento;
    @XmlElement(required = true)
    protected BigInteger quantidadeSolicitada;
    @XmlElement(required = true)
    protected BigInteger quantidadeAutorizada;
    protected BigDecimal valorSolicitado;
    protected BigDecimal valorAutorizado;
    protected String opcaoFabricante;
    protected String registroANVISA;
    protected String codigoRefFabricante;
    protected String autorizacaoFuncionamento;
    protected MotivosNegativa motivosNegativa;

    /**
     * Obt�m o valor da propriedade sequencialItem.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSequencialItem() {
        return sequencialItem;
    }

    /**
     * Define o valor da propriedade sequencialItem.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSequencialItem(BigInteger value) {
        this.sequencialItem = value;
    }

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

    /**
     * Obt�m o valor da propriedade quantidadeAutorizada.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQuantidadeAutorizada() {
        return quantidadeAutorizada;
    }

    /**
     * Define o valor da propriedade quantidadeAutorizada.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQuantidadeAutorizada(BigInteger value) {
        this.quantidadeAutorizada = value;
    }

    /**
     * Obt�m o valor da propriedade valorSolicitado.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorSolicitado() {
        return valorSolicitado;
    }

    /**
     * Define o valor da propriedade valorSolicitado.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorSolicitado(BigDecimal value) {
        this.valorSolicitado = value;
    }

    /**
     * Obt�m o valor da propriedade valorAutorizado.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorAutorizado() {
        return valorAutorizado;
    }

    /**
     * Define o valor da propriedade valorAutorizado.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorAutorizado(BigDecimal value) {
        this.valorAutorizado = value;
    }

    /**
     * Obt�m o valor da propriedade opcaoFabricante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpcaoFabricante() {
        return opcaoFabricante;
    }

    /**
     * Define o valor da propriedade opcaoFabricante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpcaoFabricante(String value) {
        this.opcaoFabricante = value;
    }

    /**
     * Obt�m o valor da propriedade registroANVISA.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistroANVISA() {
        return registroANVISA;
    }

    /**
     * Define o valor da propriedade registroANVISA.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistroANVISA(String value) {
        this.registroANVISA = value;
    }

    /**
     * Obt�m o valor da propriedade codigoRefFabricante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoRefFabricante() {
        return codigoRefFabricante;
    }

    /**
     * Define o valor da propriedade codigoRefFabricante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoRefFabricante(String value) {
        this.codigoRefFabricante = value;
    }

    /**
     * Obt�m o valor da propriedade autorizacaoFuncionamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutorizacaoFuncionamento() {
        return autorizacaoFuncionamento;
    }

    /**
     * Define o valor da propriedade autorizacaoFuncionamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutorizacaoFuncionamento(String value) {
        this.autorizacaoFuncionamento = value;
    }

    /**
     * Obt�m o valor da propriedade motivosNegativa.
     * 
     * @return
     *     possible object is
     *     {@link MotivosNegativa }
     *     
     */
    public MotivosNegativa getMotivosNegativa() {
        return motivosNegativa;
    }

    /**
     * Define o valor da propriedade motivosNegativa.
     * 
     * @param value
     *     allowed object is
     *     {@link MotivosNegativa }
     *     
     */
    public void setMotivosNegativa(MotivosNegativa value) {
        this.motivosNegativa = value;
    }


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
     *         &lt;element name="motivoNegativa" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_motivoGlosa" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "motivoNegativa"
    })
    public static class MotivosNegativa {

        @XmlElement(required = true)
        protected List<CtMotivoGlosa> motivoNegativa;

        /**
         * Gets the value of the motivoNegativa property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the motivoNegativa property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMotivoNegativa().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CtMotivoGlosa }
         * 
         * 
         */
        public List<CtMotivoGlosa> getMotivoNegativa() {
            if (motivoNegativa == null) {
                motivoNegativa = new ArrayList<CtMotivoGlosa>();
            }
            return this.motivoNegativa;
        }

    }

}

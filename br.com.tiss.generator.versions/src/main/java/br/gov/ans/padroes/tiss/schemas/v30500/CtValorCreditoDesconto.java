//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2020.04.26 �s 04:32:18 AM BRT 
//


package br.gov.ans.padroes.tiss.schemas.v30500;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ct_valorCreditoDesconto complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_valorCreditoDesconto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tipoLancamento" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoLancamento"/>
 *         &lt;element name="descricao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto100"/>
 *         &lt;element name="valor" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_valorCreditoDesconto", propOrder = {
    "tipoLancamento",
    "descricao",
    "valor"
})
public class CtValorCreditoDesconto {

    @XmlElement(required = true)
    protected String tipoLancamento;
    @XmlElement(required = true)
    protected String descricao;
    @XmlElement(required = true)
    protected BigDecimal valor;

    /**
     * Obt�m o valor da propriedade tipoLancamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoLancamento() {
        return tipoLancamento;
    }

    /**
     * Define o valor da propriedade tipoLancamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoLancamento(String value) {
        this.tipoLancamento = value;
    }

    /**
     * Obt�m o valor da propriedade descricao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Define o valor da propriedade descricao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricao(String value) {
        this.descricao = value;
    }

    /**
     * Obt�m o valor da propriedade valor.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValor() {
        return valor;
    }

    /**
     * Define o valor da propriedade valor.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValor(BigDecimal value) {
        this.valor = value;
    }

}

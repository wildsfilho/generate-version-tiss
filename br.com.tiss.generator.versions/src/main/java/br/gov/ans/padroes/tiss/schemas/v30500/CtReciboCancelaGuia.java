//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2020.04.26 �s 04:32:18 AM BRT 
//


package br.gov.ans.padroes.tiss.schemas.v30500;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ct_reciboCancelaGuia complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_reciboCancelaGuia">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="mensagemErro" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_motivoGlosa"/>
 *         &lt;element name="reciboCancelaGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_guiaCancelamentoRecibo"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_reciboCancelaGuia", propOrder = {
    "mensagemErro",
    "reciboCancelaGuia"
})
public class CtReciboCancelaGuia {

    protected CtMotivoGlosa mensagemErro;
    protected CtGuiaCancelamentoRecibo reciboCancelaGuia;

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

    /**
     * Obt�m o valor da propriedade reciboCancelaGuia.
     * 
     * @return
     *     possible object is
     *     {@link CtGuiaCancelamentoRecibo }
     *     
     */
    public CtGuiaCancelamentoRecibo getReciboCancelaGuia() {
        return reciboCancelaGuia;
    }

    /**
     * Define o valor da propriedade reciboCancelaGuia.
     * 
     * @param value
     *     allowed object is
     *     {@link CtGuiaCancelamentoRecibo }
     *     
     */
    public void setReciboCancelaGuia(CtGuiaCancelamentoRecibo value) {
        this.reciboCancelaGuia = value;
    }

}

//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2020.04.26 �s 04:32:18 AM BRT 
//


package br.gov.ans.padroes.tiss.schemas.v30500;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ctm_guiaLote complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ctm_guiaLote">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numeroLote" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto12"/>
 *         &lt;element name="guiasTISS">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="guiaSP-SADT" type="{http://www.ans.gov.br/padroes/tiss/schemas}ctm_sp-sadtGuia" maxOccurs="100"/>
 *                   &lt;element name="guiaResumoInternacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}ctm_internacaoResumoGuia" maxOccurs="100"/>
 *                   &lt;element name="guiaHonorarios" type="{http://www.ans.gov.br/padroes/tiss/schemas}ctm_honorarioIndividualGuia" maxOccurs="100"/>
 *                   &lt;element name="guiaConsulta" type="{http://www.ans.gov.br/padroes/tiss/schemas}ctm_consultaGuia" maxOccurs="100"/>
 *                   &lt;element name="guiaOdonto" type="{http://www.ans.gov.br/padroes/tiss/schemas}cto_guiaOdontologia" maxOccurs="100"/>
 *                 &lt;/choice>
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
@XmlType(name = "ctm_guiaLote", propOrder = {
    "numeroLote",
    "guiasTISS"
})
public class CtmGuiaLote {

    @XmlElement(required = true)
    protected String numeroLote;
    @XmlElement(required = true)
    protected GuiasTISS guiasTISS;

    /**
     * Obt�m o valor da propriedade numeroLote.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroLote() {
        return numeroLote;
    }

    /**
     * Define o valor da propriedade numeroLote.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroLote(String value) {
        this.numeroLote = value;
    }

    /**
     * Obt�m o valor da propriedade guiasTISS.
     * 
     * @return
     *     possible object is
     *     {@link GuiasTISS }
     *     
     */
    public GuiasTISS getGuiasTISS() {
        return guiasTISS;
    }

    /**
     * Define o valor da propriedade guiasTISS.
     * 
     * @param value
     *     allowed object is
     *     {@link GuiasTISS }
     *     
     */
    public void setGuiasTISS(GuiasTISS value) {
        this.guiasTISS = value;
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
     *       &lt;choice>
     *         &lt;element name="guiaSP-SADT" type="{http://www.ans.gov.br/padroes/tiss/schemas}ctm_sp-sadtGuia" maxOccurs="100"/>
     *         &lt;element name="guiaResumoInternacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}ctm_internacaoResumoGuia" maxOccurs="100"/>
     *         &lt;element name="guiaHonorarios" type="{http://www.ans.gov.br/padroes/tiss/schemas}ctm_honorarioIndividualGuia" maxOccurs="100"/>
     *         &lt;element name="guiaConsulta" type="{http://www.ans.gov.br/padroes/tiss/schemas}ctm_consultaGuia" maxOccurs="100"/>
     *         &lt;element name="guiaOdonto" type="{http://www.ans.gov.br/padroes/tiss/schemas}cto_guiaOdontologia" maxOccurs="100"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "guiaSPSADT",
        "guiaResumoInternacao",
        "guiaHonorarios",
        "guiaConsulta",
        "guiaOdonto"
    })
    public static class GuiasTISS {

        @XmlElement(name = "guiaSP-SADT")
        protected List<CtmSpSadtGuia> guiaSPSADT;
        protected List<CtmInternacaoResumoGuia> guiaResumoInternacao;
        protected List<CtmHonorarioIndividualGuia> guiaHonorarios;
        protected List<CtmConsultaGuia> guiaConsulta;
        protected List<CtoGuiaOdontologia> guiaOdonto;

        /**
         * Gets the value of the guiaSPSADT property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the guiaSPSADT property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGuiaSPSADT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CtmSpSadtGuia }
         * 
         * 
         */
        public List<CtmSpSadtGuia> getGuiaSPSADT() {
            if (guiaSPSADT == null) {
                guiaSPSADT = new ArrayList<CtmSpSadtGuia>();
            }
            return this.guiaSPSADT;
        }

        /**
         * Gets the value of the guiaResumoInternacao property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the guiaResumoInternacao property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGuiaResumoInternacao().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CtmInternacaoResumoGuia }
         * 
         * 
         */
        public List<CtmInternacaoResumoGuia> getGuiaResumoInternacao() {
            if (guiaResumoInternacao == null) {
                guiaResumoInternacao = new ArrayList<CtmInternacaoResumoGuia>();
            }
            return this.guiaResumoInternacao;
        }

        /**
         * Gets the value of the guiaHonorarios property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the guiaHonorarios property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGuiaHonorarios().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CtmHonorarioIndividualGuia }
         * 
         * 
         */
        public List<CtmHonorarioIndividualGuia> getGuiaHonorarios() {
            if (guiaHonorarios == null) {
                guiaHonorarios = new ArrayList<CtmHonorarioIndividualGuia>();
            }
            return this.guiaHonorarios;
        }

        /**
         * Gets the value of the guiaConsulta property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the guiaConsulta property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGuiaConsulta().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CtmConsultaGuia }
         * 
         * 
         */
        public List<CtmConsultaGuia> getGuiaConsulta() {
            if (guiaConsulta == null) {
                guiaConsulta = new ArrayList<CtmConsultaGuia>();
            }
            return this.guiaConsulta;
        }

        /**
         * Gets the value of the guiaOdonto property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the guiaOdonto property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGuiaOdonto().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CtoGuiaOdontologia }
         * 
         * 
         */
        public List<CtoGuiaOdontologia> getGuiaOdonto() {
            if (guiaOdonto == null) {
                guiaOdonto = new ArrayList<CtoGuiaOdontologia>();
            }
            return this.guiaOdonto;
        }

    }

}

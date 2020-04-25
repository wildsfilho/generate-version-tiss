//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2020.04.25 �s 04:37:47 AM BRT 
//


package com.generator.tiss.versions.v30305;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ct_situacaoClinica complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_situacaoClinica">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dentes" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="elementoDentario" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_dente"/>
 *                   &lt;element name="condicaoClinica" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_condicaoClinica"/>
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
@XmlType(name = "ct_situacaoClinica", propOrder = {
    "dentes"
})
public class CtSituacaoClinica {

    @XmlElement(required = true)
    protected List<Dentes> dentes;

    /**
     * Gets the value of the dentes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dentes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDentes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Dentes }
     * 
     * 
     */
    public List<Dentes> getDentes() {
        if (dentes == null) {
            dentes = new ArrayList<Dentes>();
        }
        return this.dentes;
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
     *         &lt;element name="elementoDentario" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_dente"/>
     *         &lt;element name="condicaoClinica" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_condicaoClinica"/>
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
        "elementoDentario",
        "condicaoClinica"
    })
    public static class Dentes {

        @XmlElement(required = true)
        protected String elementoDentario;
        @XmlElement(required = true)
        @XmlSchemaType(name = "string")
        protected DmCondicaoClinica condicaoClinica;

        /**
         * Obt�m o valor da propriedade elementoDentario.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getElementoDentario() {
            return elementoDentario;
        }

        /**
         * Define o valor da propriedade elementoDentario.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setElementoDentario(String value) {
            this.elementoDentario = value;
        }

        /**
         * Obt�m o valor da propriedade condicaoClinica.
         * 
         * @return
         *     possible object is
         *     {@link DmCondicaoClinica }
         *     
         */
        public DmCondicaoClinica getCondicaoClinica() {
            return condicaoClinica;
        }

        /**
         * Define o valor da propriedade condicaoClinica.
         * 
         * @param value
         *     allowed object is
         *     {@link DmCondicaoClinica }
         *     
         */
        public void setCondicaoClinica(DmCondicaoClinica value) {
            this.condicaoClinica = value;
        }

    }

}

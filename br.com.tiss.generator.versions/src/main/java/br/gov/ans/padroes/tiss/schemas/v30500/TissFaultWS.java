//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2020.04.25 �s 04:40:31 AM BRT 
//


package br.gov.ans.padroes.tiss.schemas.v30500;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="tissFault" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_tissFault"/>
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
    "tissFault"
})
@XmlRootElement(name = "tissFaultWS")
public class TissFaultWS {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected StTissFault tissFault;

    /**
     * Obt�m o valor da propriedade tissFault.
     * 
     * @return
     *     possible object is
     *     {@link StTissFault }
     *     
     */
    public StTissFault getTissFault() {
        return tissFault;
    }

    /**
     * Define o valor da propriedade tissFault.
     * 
     * @param value
     *     allowed object is
     *     {@link StTissFault }
     *     
     */
    public void setTissFault(StTissFault value) {
        this.tissFault = value;
    }

}

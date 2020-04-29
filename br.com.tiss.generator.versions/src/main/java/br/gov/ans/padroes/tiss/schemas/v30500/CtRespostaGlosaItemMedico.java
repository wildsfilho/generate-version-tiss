//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2020.04.26 �s 04:32:18 AM BRT 
//


package br.gov.ans.padroes.tiss.schemas.v30500;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de ct_respostaGlosaItemMedico complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_respostaGlosaItemMedico">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numeroGuiaPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20"/>
 *         &lt;element name="numeroGuiaOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20" minOccurs="0"/>
 *         &lt;element name="senha" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20" minOccurs="0"/>
 *         &lt;element name="dataRealizacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
 *         &lt;element name="dataFim" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data" minOccurs="0"/>
 *         &lt;element name="sequencialItem" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numerico4"/>
 *         &lt;element name="procRecurso" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentoDados"/>
 *         &lt;element name="codGlosa" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoGlosa"/>
 *         &lt;element name="valorRecursado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
 *         &lt;element name="justificativaPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto150"/>
 *         &lt;element name="valorAcatadado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
 *         &lt;element name="justificativaOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto150" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_respostaGlosaItemMedico", propOrder = {
    "numeroGuiaPrestador",
    "numeroGuiaOperadora",
    "senha",
    "dataRealizacao",
    "dataFim",
    "sequencialItem",
    "procRecurso",
    "codGlosa",
    "valorRecursado",
    "justificativaPrestador",
    "valorAcatadado",
    "justificativaOperadora"
})
public class CtRespostaGlosaItemMedico {

    @XmlElement(required = true)
    protected String numeroGuiaPrestador;
    protected String numeroGuiaOperadora;
    protected String senha;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataRealizacao;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataFim;
    @XmlElement(required = true)
    protected BigInteger sequencialItem;
    @XmlElement(required = true)
    protected CtProcedimentoDados procRecurso;
    @XmlElement(required = true)
    protected String codGlosa;
    @XmlElement(required = true)
    protected BigDecimal valorRecursado;
    @XmlElement(required = true)
    protected String justificativaPrestador;
    @XmlElement(required = true)
    protected BigDecimal valorAcatadado;
    protected String justificativaOperadora;

    /**
     * Obt�m o valor da propriedade numeroGuiaPrestador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroGuiaPrestador() {
        return numeroGuiaPrestador;
    }

    /**
     * Define o valor da propriedade numeroGuiaPrestador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroGuiaPrestador(String value) {
        this.numeroGuiaPrestador = value;
    }

    /**
     * Obt�m o valor da propriedade numeroGuiaOperadora.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroGuiaOperadora() {
        return numeroGuiaOperadora;
    }

    /**
     * Define o valor da propriedade numeroGuiaOperadora.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroGuiaOperadora(String value) {
        this.numeroGuiaOperadora = value;
    }

    /**
     * Obt�m o valor da propriedade senha.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenha() {
        return senha;
    }

    /**
     * Define o valor da propriedade senha.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenha(String value) {
        this.senha = value;
    }

    /**
     * Obt�m o valor da propriedade dataRealizacao.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataRealizacao() {
        return dataRealizacao;
    }

    /**
     * Define o valor da propriedade dataRealizacao.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataRealizacao(XMLGregorianCalendar value) {
        this.dataRealizacao = value;
    }

    /**
     * Obt�m o valor da propriedade dataFim.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataFim() {
        return dataFim;
    }

    /**
     * Define o valor da propriedade dataFim.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataFim(XMLGregorianCalendar value) {
        this.dataFim = value;
    }

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
     * Obt�m o valor da propriedade procRecurso.
     * 
     * @return
     *     possible object is
     *     {@link CtProcedimentoDados }
     *     
     */
    public CtProcedimentoDados getProcRecurso() {
        return procRecurso;
    }

    /**
     * Define o valor da propriedade procRecurso.
     * 
     * @param value
     *     allowed object is
     *     {@link CtProcedimentoDados }
     *     
     */
    public void setProcRecurso(CtProcedimentoDados value) {
        this.procRecurso = value;
    }

    /**
     * Obt�m o valor da propriedade codGlosa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodGlosa() {
        return codGlosa;
    }

    /**
     * Define o valor da propriedade codGlosa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodGlosa(String value) {
        this.codGlosa = value;
    }

    /**
     * Obt�m o valor da propriedade valorRecursado.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorRecursado() {
        return valorRecursado;
    }

    /**
     * Define o valor da propriedade valorRecursado.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorRecursado(BigDecimal value) {
        this.valorRecursado = value;
    }

    /**
     * Obt�m o valor da propriedade justificativaPrestador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJustificativaPrestador() {
        return justificativaPrestador;
    }

    /**
     * Define o valor da propriedade justificativaPrestador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJustificativaPrestador(String value) {
        this.justificativaPrestador = value;
    }

    /**
     * Obt�m o valor da propriedade valorAcatadado.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorAcatadado() {
        return valorAcatadado;
    }

    /**
     * Define o valor da propriedade valorAcatadado.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorAcatadado(BigDecimal value) {
        this.valorAcatadado = value;
    }

    /**
     * Obt�m o valor da propriedade justificativaOperadora.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJustificativaOperadora() {
        return justificativaOperadora;
    }

    /**
     * Define o valor da propriedade justificativaOperadora.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJustificativaOperadora(String value) {
        this.justificativaOperadora = value;
    }

}

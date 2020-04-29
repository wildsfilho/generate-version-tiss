//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2020.04.26 �s 04:32:18 AM BRT 
//


package br.gov.ans.padroes.tiss.schemas.v30500;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigDecimal;
import java.math.BigInteger;


/**
 * <p>Classe Java de ct_procedimentoExecutadoOdonto complex type.
 *
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 *
 * <pre>
 * &lt;complexType name="ct_procedimentoExecutadoOdonto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sequencialItem" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numerico4"/>
 *         &lt;element name="procedimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentoDados"/>
 *         &lt;element name="denteRegiao" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="codDente" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_dente"/>
 *                   &lt;element name="codRegiao" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_regiao"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="denteFace" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_face" minOccurs="0"/>
 *         &lt;element name="qtdProc" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numerico2" minOccurs="0"/>
 *         &lt;element name="qtdUS" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2" minOccurs="0"/>
 *         &lt;element name="valorProc" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2" minOccurs="0"/>
 *         &lt;element name="valorFranquia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2" minOccurs="0"/>
 *         &lt;element name="autorizado" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_simNao" minOccurs="0"/>
 *         &lt;element name="dataRealizacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_procedimentoExecutadoOdonto", propOrder = {
        "sequencialItem",
        "procedimento",
        "denteRegiao",
        "denteFace",
        "qtdProc",
        "qtdUS",
        "valorProc",
        "valorFranquia",
        "autorizado",
        "dataRealizacao"
})
@XmlSeeAlso({
        CtGuiaDadosOdonto.ProcedimentosRealizados.ProcedimentoRealizado.class
})
public class CtProcedimentoExecutadoOdonto {

    @XmlElement(required = true)
    protected BigInteger sequencialItem;
    @XmlElement(required = true)
    protected CtProcedimentoDados procedimento;
    protected DenteRegiao denteRegiao;
    protected String denteFace;
    protected BigInteger qtdProc;
    protected BigDecimal qtdUS;
    protected BigDecimal valorProc;
    protected BigDecimal valorFranquia;
    @XmlSchemaType(name = "string")
    protected DmSimNao autorizado;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataRealizacao;

    /**
     * Obt�m o valor da propriedade sequencialItem.
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getSequencialItem() {
        return sequencialItem;
    }

    /**
     * Define o valor da propriedade sequencialItem.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setSequencialItem(BigInteger value) {
        this.sequencialItem = value;
    }

    /**
     * Obt�m o valor da propriedade procedimento.
     *
     * @return possible object is
     * {@link CtProcedimentoDados }
     */
    public CtProcedimentoDados getProcedimento() {
        return procedimento;
    }

    /**
     * Define o valor da propriedade procedimento.
     *
     * @param value allowed object is
     *              {@link CtProcedimentoDados }
     */
    public void setProcedimento(CtProcedimentoDados value) {
        this.procedimento = value;
    }

    /**
     * Obt�m o valor da propriedade denteRegiao.
     *
     * @return possible object is
     * {@link DenteRegiao }
     */
    public DenteRegiao getDenteRegiao() {
        return denteRegiao;
    }

    /**
     * Define o valor da propriedade denteRegiao.
     *
     * @param value allowed object is
     *              {@link DenteRegiao }
     */
    public void setDenteRegiao(DenteRegiao value) {
        this.denteRegiao = value;
    }

    /**
     * Obt�m o valor da propriedade denteFace.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDenteFace() {
        return denteFace;
    }

    /**
     * Define o valor da propriedade denteFace.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDenteFace(String value) {
        this.denteFace = value;
    }

    /**
     * Obt�m o valor da propriedade qtdProc.
     *
     * @return possible object is
     * {@link BigInteger }
     */
    public BigInteger getQtdProc() {
        return qtdProc;
    }

    /**
     * Define o valor da propriedade qtdProc.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setQtdProc(BigInteger value) {
        this.qtdProc = value;
    }

    /**
     * Obt�m o valor da propriedade qtdUS.
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getQtdUS() {
        return qtdUS;
    }

    /**
     * Define o valor da propriedade qtdUS.
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setQtdUS(BigDecimal value) {
        this.qtdUS = value;
    }

    /**
     * Obt�m o valor da propriedade valorProc.
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getValorProc() {
        return valorProc;
    }

    /**
     * Define o valor da propriedade valorProc.
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setValorProc(BigDecimal value) {
        this.valorProc = value;
    }

    /**
     * Obt�m o valor da propriedade valorFranquia.
     *
     * @return possible object is
     * {@link BigDecimal }
     */
    public BigDecimal getValorFranquia() {
        return valorFranquia;
    }

    /**
     * Define o valor da propriedade valorFranquia.
     *
     * @param value allowed object is
     *              {@link BigDecimal }
     */
    public void setValorFranquia(BigDecimal value) {
        this.valorFranquia = value;
    }

    /**
     * Obt�m o valor da propriedade autorizado.
     *
     * @return possible object is
     * {@link DmSimNao }
     */
    public DmSimNao getAutorizado() {
        return autorizado;
    }

    /**
     * Define o valor da propriedade autorizado.
     *
     * @param value allowed object is
     *              {@link DmSimNao }
     */
    public void setAutorizado(DmSimNao value) {
        this.autorizado = value;
    }

    /**
     * Obt�m o valor da propriedade dataRealizacao.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getDataRealizacao() {
        return dataRealizacao;
    }

    /**
     * Define o valor da propriedade dataRealizacao.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setDataRealizacao(XMLGregorianCalendar value) {
        this.dataRealizacao = value;
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
     *         &lt;element name="codDente" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_dente"/>
     *         &lt;element name="codRegiao" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_regiao"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "codDente",
            "codRegiao"
    })
    public static class DenteRegiao {

        protected String codDente;
        @XmlSchemaType(name = "string")
        protected DmRegiao codRegiao;

        /**
         * Obt�m o valor da propriedade codDente.
         *
         * @return possible object is
         * {@link String }
         */
        public String getCodDente() {
            return codDente;
        }

        /**
         * Define o valor da propriedade codDente.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setCodDente(String value) {
            this.codDente = value;
        }

        /**
         * Obt�m o valor da propriedade codRegiao.
         *
         * @return possible object is
         * {@link DmRegiao }
         */
        public DmRegiao getCodRegiao() {
            return codRegiao;
        }

        /**
         * Define o valor da propriedade codRegiao.
         *
         * @param value allowed object is
         *              {@link DmRegiao }
         */
        public void setCodRegiao(DmRegiao value) {
            this.codRegiao = value;
        }

    }

}

//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2020.04.26 �s 04:32:18 AM BRT 
//


package br.gov.ans.padroes.tiss.schemas.v30500;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de st_tissFault.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="st_tissFault">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DestinatarioInvalido"/>
 *     &lt;enumeration value="RemetenteInvalido"/>
 *     &lt;enumeration value="LoginInvalido"/>
 *     &lt;enumeration value="VersaoInvalida"/>
 *     &lt;enumeration value="HashInvalido"/>
 *     &lt;enumeration value="SchemaInvalido"/>
 *     &lt;enumeration value="ErroInesperadoServidor"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "st_tissFault")
@XmlEnum
public enum StTissFault {

    @XmlEnumValue("DestinatarioInvalido")
    DESTINATARIO_INVALIDO("DestinatarioInvalido"),
    @XmlEnumValue("RemetenteInvalido")
    REMETENTE_INVALIDO("RemetenteInvalido"),
    @XmlEnumValue("LoginInvalido")
    LOGIN_INVALIDO("LoginInvalido"),
    @XmlEnumValue("VersaoInvalida")
    VERSAO_INVALIDA("VersaoInvalida"),
    @XmlEnumValue("HashInvalido")
    HASH_INVALIDO("HashInvalido"),
    @XmlEnumValue("SchemaInvalido")
    SCHEMA_INVALIDO("SchemaInvalido"),
    @XmlEnumValue("ErroInesperadoServidor")
    ERRO_INESPERADO_SERVIDOR("ErroInesperadoServidor");
    private final String value;

    StTissFault(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StTissFault fromValue(String v) {
        for (StTissFault c: StTissFault.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2020.04.26 �s 04:32:18 AM BRT 
//


package com.generator.tiss.versions.v30305;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de dm_tabelasDiagnostico.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="dm_tabelasDiagnostico">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CID-10"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dm_tabelasDiagnostico")
@XmlEnum
public enum DmTabelasDiagnostico {

    @XmlEnumValue("CID-10")
    CID_10("CID-10");
    private final String value;

    DmTabelasDiagnostico(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DmTabelasDiagnostico fromValue(String v) {
        for (DmTabelasDiagnostico c: DmTabelasDiagnostico.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

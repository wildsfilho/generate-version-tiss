//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2020.04.25 �s 04:37:47 AM BRT 
//


package com.generator.tiss.versions.v30305;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de dm_condicaoClinica.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="dm_condicaoClinica">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;maxLength value="1"/>
 *     &lt;enumeration value="A"/>
 *     &lt;enumeration value="E"/>
 *     &lt;enumeration value="H"/>
 *     &lt;enumeration value="C"/>
 *     &lt;enumeration value="R"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dm_condicaoClinica")
@XmlEnum
public enum DmCondicaoClinica {

    A,
    E,
    H,
    C,
    R;

    public String value() {
        return name();
    }

    public static DmCondicaoClinica fromValue(String v) {
        return valueOf(v);
    }

}

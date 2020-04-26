package com.generator.tiss.utils;

import com.thoughtworks.xstream.XStream;
import org.springframework.stereotype.Component;

@Component
public class GeneratorHashMd5Utils {

    public String generateHash(Object object){
        XStream xml = new XStream();
        xml.toXML(object);
        return "";
    }
}

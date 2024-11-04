package pe.edu.cibertec.ws_soap_bd.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@Configuration
public class DomicilioWsdlConfig {

    @Bean(name = "domicilios")
    public DefaultWsdl11Definition domicilioWsdl(XsdSchema domicilioEsquema) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("DomicilioPort");
        wsdl11Definition.setLocationUri("/ws/domicilio");
        wsdl11Definition.setTargetNamespace("http://www.cibertec.edu.pe/ws/objects");
        wsdl11Definition.setSchema(domicilioEsquema);
        return wsdl11Definition;
    }

    @Bean
    public XsdSchema domicilioEsquema() {
        return new SimpleXsdSchema(new ClassPathResource("xsd/domicilio.xsd"));//busca el directorio y busca el archivo xsd
    }
}

package pe.edu.cibertec.ws_soap_bd.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@Configuration
public class PaisWsdlConfig {

    @Bean(name = "paises")
    public DefaultWsdl11Definition paisWsdl(XsdSchema paisEsquema) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("PaisesPort");
        wsdl11Definition.setLocationUri("/ws/paises");
        wsdl11Definition.setTargetNamespace("http://www.cibertec.edu.pe/ws/objects");
        wsdl11Definition.setSchema(paisEsquema);
        return wsdl11Definition;
    }

    @Bean
    public XsdSchema paisEsquema() {
        return new SimpleXsdSchema(new ClassPathResource("xsd/paises.xsd")); //busca el directorio y busca el archivo xsd
    }
}

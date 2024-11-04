//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.10.28 a las 08:47:30 PM PET 
//


package pe.edu.cibertec.ws.objects;

import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pe.edu.cibertec.ws.objects package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pe.edu.cibertec.ws.objects
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetPaisRequest }
     * 
     */
    public GetPaisRequest createGetPaisRequest() {
        return new GetPaisRequest();
    }

    /**
     * Create an instance of {@link GetPaisResponse }
     * 
     */
    public GetPaisResponse createGetPaisResponse() {
        return new GetPaisResponse();
    }

    /**
     * Create an instance of {@link Pais }
     * 
     */
    public Pais createPais() {
        return new Pais();
    }

}

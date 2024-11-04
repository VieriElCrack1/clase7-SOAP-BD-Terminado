package pe.edu.cibertec.ws_soap_bd.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import pe.edu.cibertec.ws.objects.*;
import pe.edu.cibertec.ws_soap_bd.service.IDomicilioService;

@Endpoint
public class DomicilioEndPoint {
    private static final String NAMESPACE_URI = "http://www.cibertec.edu.pe/ws/objects";

    @Autowired
    private IDomicilioService domicilioService;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getListDomicilioRequest")
    @ResponsePayload
    public GetListDomicilioResponse getListDomicilios() {
        return domicilioService.obtenerDomicilios();
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getDomicilioRequest")
    @ResponsePayload
    public GetDomicilioResponse getDomicilioResponse(@RequestPayload GetDomicilioRequest request) {
        return domicilioService.obtenerDomicilio(request.getId());
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "postDomicilioRequest")
    @ResponsePayload
    public PostDomicilioResponse postDomicilioResponse(@RequestPayload PostDomicilioRequest request) {
        return domicilioService.guardarDomicilio(request);
    }
}

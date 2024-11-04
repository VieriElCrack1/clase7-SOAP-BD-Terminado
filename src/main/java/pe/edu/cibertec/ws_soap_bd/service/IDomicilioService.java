package pe.edu.cibertec.ws_soap_bd.service;

import pe.edu.cibertec.ws.objects.GetDomicilioResponse;
import pe.edu.cibertec.ws.objects.GetListDomicilioResponse;
import pe.edu.cibertec.ws.objects.PostDomicilioRequest;
import pe.edu.cibertec.ws.objects.PostDomicilioResponse;

public interface IDomicilioService {
    GetListDomicilioResponse obtenerDomicilios();
    GetDomicilioResponse obtenerDomicilio(int id);
    PostDomicilioResponse guardarDomicilio(PostDomicilioRequest domicilio);
}

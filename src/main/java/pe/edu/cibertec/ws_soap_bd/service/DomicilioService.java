package pe.edu.cibertec.ws_soap_bd.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.ws.objects.GetDomicilioResponse;
import pe.edu.cibertec.ws.objects.GetListDomicilioResponse;
import pe.edu.cibertec.ws.objects.PostDomicilioRequest;
import pe.edu.cibertec.ws.objects.PostDomicilioResponse;
import pe.edu.cibertec.ws_soap_bd.model.db.Domicilio;
import pe.edu.cibertec.ws_soap_bd.repository.DomicilioRepository;
import pe.edu.cibertec.ws_soap_bd.util.convert.DomicilioConvert;

@RequiredArgsConstructor
@Service
public class DomicilioService implements IDomicilioService {

    private final DomicilioRepository domicilioRepository;
    private final DomicilioConvert domicilioConvert;

    @Override
    public GetListDomicilioResponse obtenerDomicilios() {
        GetListDomicilioResponse response = new GetListDomicilioResponse();
        response.getListdomicilios().addAll(domicilioConvert.convertDomicilioSoapList(domicilioRepository.findAll()));
        return response;
    }

    @Override
    public GetDomicilioResponse obtenerDomicilio(int id) {
        GetDomicilioResponse response = new GetDomicilioResponse();
        Domicilio domicilio = domicilioRepository.findById(id).orElse(null);
        if (domicilio != null) {
            response.setDomicilio(domicilioConvert.convertDomiciliosoap(domicilio));
        }
        return response;
    }

    @Override
    public PostDomicilioResponse guardarDomicilio(PostDomicilioRequest domicilio) {
        PostDomicilioResponse response = new PostDomicilioResponse();
        Domicilio nuevoDomicilio = domicilioRepository.save(domicilioConvert.convertDomicilioBD(domicilio.getDomicilio()));
        response.setDomicilio(domicilioConvert.convertDomiciliosoap(nuevoDomicilio));
        return response;
    }
}

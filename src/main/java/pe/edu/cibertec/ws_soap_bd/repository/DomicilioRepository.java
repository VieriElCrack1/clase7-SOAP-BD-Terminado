package pe.edu.cibertec.ws_soap_bd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.ws_soap_bd.model.db.Domicilio;

@Repository
public interface DomicilioRepository extends JpaRepository<Domicilio, Integer> {
}

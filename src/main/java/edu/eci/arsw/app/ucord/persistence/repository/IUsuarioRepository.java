package edu.eci.arsw.app.ucord.persistence.repository;

import edu.eci.arsw.app.ucord.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository //Springboot necesita saber que esto es un repositorio
public interface IUsuarioRepository extends JpaRepository<Usuario, Integer> {
    Usuario findByCorreo( String correo );
}

package edu.eci.arsw.app.repositoriocentral.persistence.repository;

import edu.eci.arsw.app.repositoriocentral.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository //Springboot necesita saber que esto es un repositorio
public interface IUsuarioRepository extends JpaRepository<Usuario, Integer> {
    Usuario findByCorreo( String correo );
}

package edu.eci.arsw.app.repositoriocentral.persistence.repository;

import edu.eci.arsw.app.repositoriocentral.model.Materia;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IMateriaRepository extends JpaRepository<Materia, String> {
}

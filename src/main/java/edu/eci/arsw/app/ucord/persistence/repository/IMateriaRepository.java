package edu.eci.arsw.app.ucord.persistence.repository;

import edu.eci.arsw.app.ucord.model.Materia;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IMateriaRepository extends JpaRepository<Materia, String> {
}

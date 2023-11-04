package edu.eci.arsw.app.ucord.persistence.repository;

import edu.eci.arsw.app.ucord.model.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IEstudianteRepository extends JpaRepository<Estudiante, Integer> {
}

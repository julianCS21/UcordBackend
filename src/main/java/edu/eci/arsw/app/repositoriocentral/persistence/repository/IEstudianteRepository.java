package edu.eci.arsw.app.repositoriocentral.persistence.repository;

import edu.eci.arsw.app.repositoriocentral.model.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IEstudianteRepository extends JpaRepository<Estudiante, Integer> {
}

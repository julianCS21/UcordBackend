package edu.eci.arsw.app.repositoriocentral.persistence.repository;

import edu.eci.arsw.app.repositoriocentral.model.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProfesorRepository extends JpaRepository<Profesor, Integer> {
}

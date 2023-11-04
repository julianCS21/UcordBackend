-- -----------------------------------------------------
-- Table `Estudiante`
-- -----------------------------------------------------
ALTER TABLE Estudiante
ADD CONSTRAINT CK_semestre_Estudiante
CHECK(
	semestre BETWEEN 1 AND 10
);

-- -----------------------------------------------------
-- Table `HaAprobado`
-- -----------------------------------------------------
ALTER TABLE HaAprobado
ADD CONSTRAINT CK_nota_HaAprobado
CHECK(
	nota BETWEEN 0 AND 5
);

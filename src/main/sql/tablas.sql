-- -----------------------------------------------------
-- Table `Materia`
-- -----------------------------------------------------

CREATE TABLE IF NOT EXISTS Materia(
  sigla VARCHAR(15) PRIMARY KEY ,
  nombre VARCHAR(40)  NOT NULL,
  creditos INTEGER NOT NULL,
  UNIQUE(nombre)
);

-- -----------------------------------------------------
-- Table `PreRequistioDe`
-- -----------------------------------------------------

CREATE TABLE IF NOT EXISTS PreRequistioDe(
  idMateria1 VARCHAR(15) NOT NULL,
  idMateria2 VARCHAR(15) NOT NULL,
  PRIMARY KEY(idMateria1, idMateria2)
);

-- -----------------------------------------------------
-- Table `Persona`
-- -----------------------------------------------------

CREATE TABLE IF NOT EXISTS Persona(
  idPersona INTEGER PRIMARY KEY ,
  nombre VARCHAR(40)  NOT NULL,
  apellido VARCHAR(50)  NOT NULL,
  correo VARCHAR(50) NOT NULL,
  contraseña VARCHAR(80)  NOT NULL,
  UNIQUE(correo )
);

-- -----------------------------------------------------
-- Table `Estudiante`
-- -----------------------------------------------------

CREATE TABLE IF NOT EXISTS Estudiante(
  idEstudiante INTEGER REFERENCES Persona( idPersona ) DEFERRABLE,
  semestre INTEGER,
  PRIMARY KEY( idEstudiante )
);

-- -----------------------------------------------------
-- Table `Profesor`
-- -----------------------------------------------------

CREATE TABLE IF NOT EXISTS Profesor(
  idProfesor INTEGER REFERENCES Persona( idPersona ) DEFERRABLE,
  PRIMARY KEY( idProfesor )
);

-- -----------------------------------------------------
-- Table `Decanatura`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS Decanatura(
  idDecanatura serial PRIMARY KEY,
  nombre VARCHAR(40)  NOT NULL,
  idDecano INTEGER REFERENCES Profesor( idProfesor ) DEFERRABLE,
  UNIQUE(nombre)
);

-- -----------------------------------------------------
-- Table `PerteneceA`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS PerteneceA(
  idPersona INTEGER,
  idDecanatura INTEGER,
  PRIMARY KEY(idPersona, idDecanatura )
);

-- -----------------------------------------------------
-- Table `HaAprobado`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS HaAprobado(
  idEstudiante INTEGER REFERENCES Estudiante( idEstudiante ) DEFERRABLE,
  idMateria VARCHAR(15) REFERENCES Materia( sigla ) DEFERRABLE,
  nota INTEGER,
  PRIMARY KEY(idEstudiante, idMateria)
);

-- -----------------------------------------------------
-- Table `Cursa`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS Cursa(
  idEstudiante INTEGER REFERENCES Estudiante( idEstudiante ) DEFERRABLE,
  idMateria VARCHAR(15) REFERENCES Materia( sigla ) DEFERRABLE,
  PRIMARY KEY(idEstudiante, idMateria)
);

-- -----------------------------------------------------
-- Table `Dicta`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS Dicta(
  idProfesor INTEGER REFERENCES Profesor( idProfesor ) DEFERRABLE,
  idMateria VARCHAR(15) REFERENCES Materia( sigla ) DEFERRABLE,
  PRIMARY KEY(idProfesor, idMateria)
);

-- -----------------------------------------------------
-- Table `MateriaPerteneceA`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS MateriaPerteneceA(
  idDecanatura INTEGER REFERENCES Decanatura( idDecanatura ) DEFERRABLE,
  idMateria VARCHAR(15) REFERENCES Materia( sigla ) DEFERRABLE,
  PRIMARY KEY(idDecanatura, idMateria)
);
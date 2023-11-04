package edu.eci.arsw.app.ucord.controllers;

import edu.eci.arsw.app.ucord.service.IMateriaService;
import edu.eci.arsw.app.ucord.service.UCordServicesException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
@RequestMapping(value = "/U-cord/materias")
@CrossOrigin( origins = "*",  methods = {RequestMethod.POST, RequestMethod.GET, RequestMethod.DELETE}) //es un protocolo estándar que define la interacción entre un navegador y un servidor para manejar de forma segura las solicitudes HTTP de origen cruzado.
public class MateriaAPIController {

    @Autowired
    private IMateriaService service;

    @RequestMapping( method = RequestMethod.GET )
    public ResponseEntity<?> getMaterias() {
        try {
            return new ResponseEntity<>(service.getMaterias(), HttpStatus.CREATED);
        } catch ( UCordServicesException ex ) {
            Logger.getLogger(MateriaAPIController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>(ex.getMessage(),HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping( path="/decanatura/{idDecanatura}", method = RequestMethod.GET)
    public ResponseEntity<?> getMateriasPorDecanaturas(@PathVariable Integer idDecanatura){
        try {
            return new ResponseEntity<>(service.getMateriasPorDecanatura(idDecanatura), HttpStatus.CREATED);
        } catch (UCordServicesException e) {
            Logger.getLogger(MateriaAPIController.class.getName()).log(Level.SEVERE, null, e);
            return new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping (path = "/siglas/{siglas}", method = RequestMethod.GET)
    public ResponseEntity<?> getMateriaPorSiglas(@PathVariable String siglas){
        try{
            return new ResponseEntity<>(service.getMateriaPorSiglas(siglas), HttpStatus.CREATED);
        }catch( UCordServicesException e){
            Logger.getLogger(MateriaAPIController.class.getName()).log(Level.SEVERE, null, e);
            return new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);
        }
    }
}

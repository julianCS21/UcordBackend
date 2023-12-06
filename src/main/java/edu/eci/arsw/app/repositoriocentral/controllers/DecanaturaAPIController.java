package edu.eci.arsw.app.repositoriocentral.controllers;

import edu.eci.arsw.app.repositoriocentral.service.IDecanaturaService;
import edu.eci.arsw.app.repositoriocentral.service.UCordServicesException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Level;
import java.util.logging.Logger;



@RestController
@RequestMapping(value = "/repositoriocentral/decanaturas")
@CrossOrigin( origins = "*" ) //es un protocolo estándar que define la interacción entre un navegador y un servidor para manejar de forma segura las solicitudes HTTP de origen cruzado.
public class DecanaturaAPIController {

  @Autowired
  IDecanaturaService decanaturaService;

  public DecanaturaAPIController() {}

  @RequestMapping(method = RequestMethod.GET)
  public ResponseEntity<?> getDecanaturas(){
    try {
      return new ResponseEntity<>(decanaturaService.getDecanaturas(),HttpStatus.CREATED);
    } catch (UCordServicesException e) {
      Logger.getLogger(DecanaturaAPIController.class.getName()).log(Level.SEVERE, null, e);
          return new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);
     
    }
  }

  @RequestMapping (path = "/nombre/{nombre}", method = RequestMethod.GET)
    public ResponseEntity<?> getDecanaturaPorNombre(@PathVariable String nombre){
        try{
            return new ResponseEntity<>(decanaturaService.getDecanaturaPorNombre(nombre), HttpStatus.CREATED);
        }catch( UCordServicesException e){
            Logger.getLogger(DecanaturaAPIController.class.getName()).log(Level.SEVERE, null, e);
            return new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);
        }
    }
  
  @RequestMapping( path="/materia/{sigla}", method = RequestMethod.GET)
  public ResponseEntity<?> getDecanaturaPorMateria(@PathVariable String sigla ){
      try {
          return new ResponseEntity<>(decanaturaService.getDecanaturaPorMateria(sigla), HttpStatus.CREATED);
      } catch (UCordServicesException e) {
          Logger.getLogger(DecanaturaAPIController.class.getName()).log(Level.SEVERE, null, e);
          return new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);
      }
  }

}

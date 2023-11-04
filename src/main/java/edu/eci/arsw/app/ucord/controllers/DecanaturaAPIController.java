package edu.eci.arsw.app.ucord.controllers;

import edu.eci.arsw.app.ucord.service.IDecanaturaService;
import edu.eci.arsw.app.ucord.service.UCordServicesException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * @author Ana Gabriela Silva
 * @author Leonardo Galeano
 * @author Iván Camilo Rincón Saavedra
 * @version 9/28/2021
 */

@RestController
@RequestMapping(value = "/U-cord/decanaturas")
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

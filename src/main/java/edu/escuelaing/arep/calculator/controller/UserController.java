package edu.escuelaing.arep.calculator.controller;

import edu.escuelaing.arep.calculator.service.Services;
import edu.escuelaing.arep.calculator.service.ServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping( "/v1/oper" )
public class UserController {
    private final Services calcService;

    public UserController(@Autowired Services calcService ) {
        this.calcService = calcService;
    }

    @GetMapping( "/{oper}" )
    public String calculate( @PathVariable("oper") String oper, @RequestParam(name= "value") Double value ) {
        String resOper="";
        if (oper.equals("sqrt")){
            resOper  = calcService.getSquareRoot(value).getOutput()+"";
        }
        if (oper.equals("cos")){
            resOper  = calcService.getCosine(value).getOutput()+"";
        }
        String json = "{'operation':"+oper+",'input':"+value+",'output':"+resOper+"}" ;
        //return new String(json, HttpStatus.OK);
        return json;
    }
}


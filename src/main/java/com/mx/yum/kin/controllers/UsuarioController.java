package com.mx.yum.kin.controllers;


import com.mx.yum.kin.dto.request.OrdenNamesDto;
import com.mx.yum.kin.dto.responses.ResponseService;
import com.mx.yum.kin.exception.ErrorResponse;
import com.mx.yum.kin.services.implement.OrdenarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/user/v1")
@Validated
public class UsuarioController {

  private final OrdenarService ordenarService;


  @Autowired
  public UsuarioController(OrdenarService ordenarService) {
    this.ordenarService = ordenarService;
  }

  @PostMapping("/sort-names")
  public ResponseEntity<ResponseService<Object>>  ordenaNombre(@RequestBody OrdenNamesDto ordenNamesDto) {
    final ResponseService<Object> response = new ResponseService<>();
    try {
      List<String>  resp = ordenarService.ordenaNombres(ordenNamesDto);
      return response.obtenerRespuesta(resp, "200");
    } catch (ErrorResponse e) {
      throw new ErrorResponse(e.getMessage(), List.of(e.getDetails().get(0)), e.getCode());
    }
  }

}


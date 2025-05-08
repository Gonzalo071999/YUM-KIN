package com.mx.yum.kin.services.implement;

import com.mx.yum.kin.dto.request.OrdenNamesDto;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class OrdenarService {

  public List<String> ordenaNombres(OrdenNamesDto ordenNamesDto) {
    Collections.sort(ordenNamesDto.getNames());
    return ordenNamesDto.getNames();
  }


}

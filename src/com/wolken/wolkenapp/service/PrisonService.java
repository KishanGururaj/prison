package com.wolken.wolkenapp.service;

import com.wolken.wolkenapp.DTO.PrisonDTO;

public interface PrisonService {
 public void  validate(PrisonDTO prisonDTO);
 public void validateUpdate(int no,int years);
 public void validateDelete(int id);

}

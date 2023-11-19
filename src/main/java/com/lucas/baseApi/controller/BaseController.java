package com.lucas.baseApi.controller;

import com.lucas.baseApi.dto.BaseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("base")
public class BaseController {

    @GetMapping
    public ResponseEntity<BaseDTO> baseController() {

        var baseDTO = new BaseDTO();
        baseDTO.setName("Lucas");

        return ResponseEntity.ok().body(baseDTO);
    }
}

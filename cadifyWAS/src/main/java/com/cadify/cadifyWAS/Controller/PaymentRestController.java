package com.cadify.cadifyWAS.controller;

import com.cadify.cadifyWAS.DTO.PaymentDTO.PaymentReqDTO;
import com.cadify.cadifyWAS.DTO.PaymentDTO.PaymentResDTO;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
@RequestMapping("/payment")
public class PaymentRestController {

    @PostMapping()
    public ResponseEntity<PaymentResDTO> requestPayment(@ModelAttribute PaymentReqDTO paymentReqDTO){
        PaymentResDTO paymentResDTO = new PaymentResDTO();
        log.info(paymentReqDTO);

        return ResponseEntity.ok(paymentResDTO);
    }
}

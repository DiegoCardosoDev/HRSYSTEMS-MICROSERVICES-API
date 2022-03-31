package br.com.diego.payrollapi.resources;

import br.com.diego.payrollapi.domain.PayRoll;
import br.com.diego.payrollapi.services.PayRollService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/api/payments")
public class PayRollResouce {

    private final PayRollService service;

    @GetMapping(value = "/{workerId}")
    public ResponseEntity<PayRoll> getPayment(@PathVariable Long workerId, @RequestBody PayRoll payment) {
        return ResponseEntity.ok().body(service.getpayment(workerId, payment));


    }
}

package br.com.diego.payrollapi.resources;

import br.com.diego.payrollapi.domain.PayRoll;
<<<<<<< HEAD
import br.com.diego.payrollapi.services.PayRollService;
import lombok.RequiredArgsConstructor;
=======
import br.com.diego.payrollapi.domain.User;
import br.com.diego.payrollapi.feingclients.UserFeing;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
>>>>>>> origin/developer
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/api/payments")
public class PayRollResouce {

<<<<<<< HEAD
    private final PayRollService service;

    @GetMapping(value = "/{workerId}")
    public ResponseEntity<PayRoll> getPayment(@PathVariable Long workerId, @RequestBody PayRoll payment) {
        return ResponseEntity.ok().body(service.getpayment(workerId, payment));
=======

    private final  UserFeing feing;

    @GetMapping(value = "/{workerId}")
    public ResponseEntity<PayRoll> getPayment(@PathVariable  Long workerId, @RequestBody PayRoll payment){

        User user = feing.findById(workerId).getBody();

        return ResponseEntity.ok().body(
                new PayRoll(user.getName(),
                        payment.getDescription(),
                        user.getHourlyPrice(),
                        payment.getWorkedHours(),
                        user.getHourlyPrice() * payment.getWorkedHours())

        );
>>>>>>> origin/developer


    }
}
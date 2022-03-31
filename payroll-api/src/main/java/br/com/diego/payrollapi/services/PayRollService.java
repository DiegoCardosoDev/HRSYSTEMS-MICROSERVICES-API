package br.com.diego.payrollapi.services;

import br.com.diego.payrollapi.domain.PayRoll;
import br.com.diego.payrollapi.feingclients.UserFeing;
import br.com.diego.payrollapi.services.exeptions.ObjectNotFoundExeption;
import feign.FeignException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Objects;

@RequiredArgsConstructor
@Slf4j
@Service
public class PayRollService {


    private final Environment env;
    private final UserFeing feing;

    @GetMapping(value = "/{workedId}")
    public PayRoll getpayment(Long workedId, PayRoll payRoll) {
        log.info("PAYROLL_SERVICE ::: Get Request on " + env.getProperty("local.server.port ") + "port");
        try {

            var user = feing.findById(workedId).getBody();
            if (Objects.nonNull(user)) {
                return new PayRoll(
                        user.getName(),
                        payRoll.getDescription(),
                        user.getHourlyPrice(),
                        payRoll.getWorkedHours(),
                        payRoll.getWorkedHours() * user.getHourlyPrice()
                );

            }

        } catch (FeignException.NotFound ex) {
            throw new ObjectNotFoundExeption("object not found");

        } catch (Exception exception) {
            throw new IllegalArgumentException("ilegal argument exeption");

        }
        return null;


    }
}

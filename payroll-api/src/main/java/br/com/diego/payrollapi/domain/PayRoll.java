package br.com.diego.payrollapi.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class PayRoll {

    private String workerName;
    private String description;
    private  Double hourlyPrice;
    private Double workedHours;
    public Double totalPayment;
}

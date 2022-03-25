package br.com.diego.apiuser.domain;

import lombok.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import  static  lombok.EqualsAndHashCode.Include;
import static javax.persistence.GenerationType.IDENTITY;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "TB_USER")
public class User {


    @GeneratedValue(strategy = IDENTITY)
    @Include
    @Id
    private Long id;
    private  String name;
    private  String email;
    private  String password;
    private  Double hourlyPrice;
}

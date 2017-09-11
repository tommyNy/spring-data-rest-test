package pl.tomihome.springdataresttest;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
@Data
public class Employee {
    @Id
    private Long id;
    private String firstName;
    private String lastName;
    private BigDecimal salary;
}

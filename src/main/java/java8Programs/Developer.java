package java8Programs;
import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author PUNITH
 */

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Developer {
	private String name;
	private BigDecimal salary;
	int age;	
}
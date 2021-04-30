package w5;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class User {
    private int id;
    private String email;
    private String password;
    private LocalDate bithDate;
    private boolean status;
}

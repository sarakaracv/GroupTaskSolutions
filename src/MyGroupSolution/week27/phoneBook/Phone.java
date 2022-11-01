package MyGroupSolution.week27.phoneBook;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor

public class Phone {
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;

}

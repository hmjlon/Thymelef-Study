package my.app.first_Project.dto;

import lombok.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserData {
    private String userName;
    private int userAge;
    private String userAddress;
}
//
//    public UserData(String userName, int userAge) {
//        this.userName = userName;
//        this.userAge = userAge;
//    }
//}


//@AllArgsConstructor
//@NoArgsConstructor
//@RequiredArgsConstructor
//@Getter
//@Setter
//@Data
//@ToString
//@EqualsAndHashCode
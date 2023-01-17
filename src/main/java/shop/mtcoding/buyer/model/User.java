package shop.mtcoding.buyer.model;

import java.security.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class User {
    private int id;
    private String username;
    private String password;
    private String email;
    private Timestamp createdAt;

}
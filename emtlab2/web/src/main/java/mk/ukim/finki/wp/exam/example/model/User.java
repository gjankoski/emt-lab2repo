package mk.ukim.finki.wp.exam.example.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "library_users")
@Data

public class User {
    @Id
    String username;
    String password;
    @Enumerated(EnumType.STRING)
    Role role;

    public User() {
    }

    public User(String username, String password, Role role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}

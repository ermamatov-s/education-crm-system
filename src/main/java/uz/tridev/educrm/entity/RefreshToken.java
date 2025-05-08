package uz.tridev.educrm.entity;

import jakarta.persistence.*;
import lombok.*;
import uz.tridev.educrm.entity.enums.TokenType;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
public class RefreshToken extends BaseEntity {

    private String token;

    @Enumerated(EnumType.STRING)
    private TokenType tokenType;

    private boolean expired;
    private boolean revoked;

    @ManyToOne
    private Users user;
}

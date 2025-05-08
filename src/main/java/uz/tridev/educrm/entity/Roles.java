package uz.tridev.educrm.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import uz.tridev.educrm.entity.enums.RoleName;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Roles extends BaseEntity implements GrantedAuthority {

    @Enumerated(EnumType.STRING)
    private RoleName roleName;

    @Override
    public String getAuthority() {
        return this.roleName.name();
    }
}

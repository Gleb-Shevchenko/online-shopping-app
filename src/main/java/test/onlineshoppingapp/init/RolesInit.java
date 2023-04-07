package test.onlineshoppingapp.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import test.onlineshoppingapp.model.Role;
import test.onlineshoppingapp.repository.RoleRepository;
import test.onlineshoppingapp.service.RoleService;

import javax.annotation.PostConstruct;

@AllArgsConstructor
@Component
public class RolesInit {
    private final RoleRepository roleRepository;

    @PostConstruct
    public void postConstruct() {
        Role manager = new Role(Role.RoleName.MANAGER);
        Role user = new Role(Role.RoleName.USER);
        roleRepository.save(manager);
        roleRepository.save(user);
    }
}

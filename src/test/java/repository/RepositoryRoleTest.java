package repository;

import model.Duration;
import model.Role;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RepositoryRoleTest {
    @Test
    public void insertRoles() {
        RepositoryRole repositoryRole = new RepositoryRole();
        Role role = new Role(1, "profesor", "matematica");
        repositoryRole.insertRole(role);
    }

    @Test
    public void deleteById() {
        RepositoryRole repositoryRole = new RepositoryRole();
        repositoryRole.stergeRoleById(5);

    }

    @Test
    public void update() {
        RepositoryRole repositoryRole = new RepositoryRole();

        repositoryRole.updateTitle(1, "profesor");

    }


    @Test
    public void allList() {
        RepositoryRole repositoryRole = new RepositoryRole();
        List<Role> roles = repositoryRole.allRoles();
        for (Role r : roles) {
            System.out.println(r.toString());
        }

    }


}
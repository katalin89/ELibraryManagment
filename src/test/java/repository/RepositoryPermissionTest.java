package repository;

import model.Duration;
import model.Permission;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RepositoryPermissionTest {
    @Test
    public void insertPermission() {
        RepositoryPermission repositoryPermission = new RepositoryPermission();
        Permission permission = new Permission(1, 1, "user", "modul5", "valalbil pana la 2023");
        repositoryPermission.insertPermission(permission);
    }

    @Test
    public void deleteById() {
        RepositoryPermission repositoryPermission = new RepositoryPermission();
        repositoryPermission.stergePermissionById(5);

    }

    @Test
    public void update() {
        RepositoryPermission repositoryPermission = new RepositoryPermission();
        repositoryPermission.updateDescription(1, "valabil pana la 2031");

    }


    @Test
    public void allList() {
        RepositoryPermission repositoryPermission = new RepositoryPermission();
        List<Permission> permissions = repositoryPermission.allPermission();
        for (Permission p : permissions) {
            System.out.println(p.toString());
        }

    }

}
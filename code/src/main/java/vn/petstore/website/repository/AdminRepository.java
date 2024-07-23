package vn.petstore.website.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import vn.petstore.website.model.Admin;

@Component
public interface AdminRepository extends JpaRepository<Admin, String> {
    Admin findByUsername(String username);
}

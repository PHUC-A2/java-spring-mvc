package vn.hoidanit.laptopshop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import vn.hoidanit.laptopshop.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User save(User hoidanit);

    // // lấy 1 ng dùng
    // User findByEmaill(String email);

    // List<User> findByEmailAndAddRess(String email, String address);
    List<User> findByEmail(String email);
}
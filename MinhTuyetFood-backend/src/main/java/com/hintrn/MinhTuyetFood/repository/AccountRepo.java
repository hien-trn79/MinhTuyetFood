package com.hintrn.MinhTuyetFood.repository;

import com.hintrn.MinhTuyetFood.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface AccountRepo extends JpaRepository<Account, Integer> {

    @Query("SELECT a FROM accounts a WHERE a.accountEmail = :email")
    Account findByEmail(@Param("email") String email);
}

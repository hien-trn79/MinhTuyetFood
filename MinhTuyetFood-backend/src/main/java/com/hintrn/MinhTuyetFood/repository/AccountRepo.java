package com.hintrn.MinhTuyetFood.repository;

import com.hintrn.MinhTuyetFood.model.Account;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccountRepo extends JpaRepository<Account, Integer> {

    @Query("SELECT a FROM accounts a WHERE a.accountEmail = :email")
    Account findByEmail(@Param("email") String email);

    @Modifying
    @Transactional
    @Query("DELETE FROM accounts a WHERE a.accountEmail = :email")
    void deleteByEmail(@Param("email") String email);
}

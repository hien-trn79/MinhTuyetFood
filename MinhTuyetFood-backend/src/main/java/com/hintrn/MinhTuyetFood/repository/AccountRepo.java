package com.hintrn.MinhTuyetFood.repository;

import com.hintrn.MinhTuyetFood.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepo extends JpaRepository<Account, Integer> {
}

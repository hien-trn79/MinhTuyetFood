package com.hintrn.MinhTuyetFood.repository;

import com.hintrn.MinhTuyetFood.model.TypeAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeAccountRepo extends JpaRepository<TypeAccount,Integer> {
}

package com.zerobase.fastlms.member.repository;


import com.zerobase.fastlms.member.entity.LoginHistory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface LoginHistoryRepository extends JpaRepository<LoginHistory, Long> {
    Optional<LoginHistory> findFirstByUserIdOrderByNumberDesc(String userId);

    List<LoginHistory> findAllByUserIdOrderByNumberDesc(String userId);


}

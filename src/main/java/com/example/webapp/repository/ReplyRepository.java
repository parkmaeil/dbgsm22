package com.example.webapp.repository;

import com.example.webapp.entity.Reply;
import org.springframework.data.jpa.repository.JpaRepository;
// Hibernate API가 -> ReplyRepository를 접근해서 활용
public interface ReplyRepository extends JpaRepository<Reply, Long> {

}

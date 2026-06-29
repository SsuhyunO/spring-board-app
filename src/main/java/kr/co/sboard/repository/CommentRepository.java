package kr.co.sboard.repository;

import kr.co.sboard.entity.ArticleEntity;
import kr.co.sboard.entity.CommentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<CommentEntity, Integer> {
}

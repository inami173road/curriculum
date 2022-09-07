package project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import project.entity.UserAccuontEntiy;

/**
 * user_accountテーブルを操作するためのRepositoryクラスです
 */
public interface UserAccuontRepository extends JpaRepository<UserAccuontEntiy, Integer> {
}
package com.caholic.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.caholic.blog.model.Board;

public interface BoardRepository extends JpaRepository<Board, Integer>{

}

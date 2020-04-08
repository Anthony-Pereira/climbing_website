package com.openclassrooms.climbing.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.openclassrooms.climbing.entities.Comment;

public interface CommentRepository extends JpaRepository <Comment,Long> {

}

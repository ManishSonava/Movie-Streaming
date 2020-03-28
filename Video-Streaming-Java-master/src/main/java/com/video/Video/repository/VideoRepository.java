package com.video.Video.repository;

import com.video.Video.entity.Video;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface VideoRepository extends CrudRepository<Video, Integer>{
	
	@Query("SELECT * Video v WHERE v.file_name LIKE %search%")
    List<Video> searchByFileNameLike(@Param("search") String search);
	
}

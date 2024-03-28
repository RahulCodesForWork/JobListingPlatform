package com.project.joblisting.repository;

import com.project.joblisting.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface SearchRepository {

    List<Post> findByText(String text);
}


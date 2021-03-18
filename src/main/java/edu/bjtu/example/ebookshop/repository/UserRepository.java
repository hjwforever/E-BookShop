package edu.bjtu.example.ebookshop.repository;

import edu.bjtu.example.ebookshop.entity.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
import java.util.Optional;

/**
 * Copyright(C), 2020-2021, aruoxi.com
 * FileName: UserRepository
 * Author: hjwforever
 * Date: 2021/3/14 001421:51
 * Description:
 */
@RepositoryRestResource(collectionResourceRel = "user", path = "user")
public interface UserRepository extends PagingAndSortingRepository<User, Long> {

//    List<User> findByAgeBetween(int minAge, int maxAge);

//    Optional<User> findById(Long id);
}

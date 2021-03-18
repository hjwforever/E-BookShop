package edu.bjtu.example.ebookshop.repository;

import edu.bjtu.example.ebookshop.entity.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

/**
 * Copyright(C), 2020-2021, aruoxi.com
 * FileName: RolesRepository
 * Author: hjwforever
 * Date: 2021/3/18 00186:24
 * Description:
 */
public interface RolesRepository extends CrudRepository<Roles,Long> {
}

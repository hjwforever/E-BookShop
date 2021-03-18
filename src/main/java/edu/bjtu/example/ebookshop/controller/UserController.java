package edu.bjtu.example.ebookshop.controller;

import edu.bjtu.example.ebookshop.entity.Roles;
import edu.bjtu.example.ebookshop.entity.User;
import edu.bjtu.example.ebookshop.repository.RolesRepository;
import edu.bjtu.example.ebookshop.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

//import javax.validation.Valid;
import javax.annotation.PostConstruct;
import java.time.Duration;
import java.util.Optional;

/**
 * Copyright(C), 2020-2021, aruoxi.com
 * FileName: UserController
 * Author: hjwforever
 * Date: 2021/3/14 001414:37
 * Description:
 */
@Controller
@RequestMapping(path = "/user")
public class UserController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RolesRepository rolesRepository;

    @PostConstruct
    public void init() throws Exception {
        Roles role = new Roles();
        role.setRoles(1L,"admin");
        this.rolesRepository.save(role);
        role.setRoles(2L,"user");
        this.rolesRepository.save(role);
        role.setRoles(3L,"vip");
        this.rolesRepository.save(role);


        User user = new User();
        user.setUser(1L,"test", "18811111111", "test@ebookshop.com", rolesRepository.findById(2L).get(), "adress1", "adress2", "adress3","123456","If you tell the truth, you don't have to remember anything.");
        this.userRepository.save(user);

        user.setUser(2L,"aruoxi", "18811111111", "aruoxi@ebookshop.com", rolesRepository.findById(3L).get(), "adress1", "adress2", "adress3","123456","Everything you can imagine is real.");
        this.userRepository.save(user);

        user.setUser(3L,"hjw", "18811111111", "hjw@ebookshop.com", rolesRepository.findById(1L).get(), "adress1", "adress2", "adress3","123456","Be yourself; everyone else is already taken.");
        this.userRepository.save(user);

        System.out.println("user = " + user);
        System.out.println("user = " + userRepository.findById(3L).get());
    }

    /**
     * 获取所有用户
     *
     * @return
     */
//    @GetMapping("/list")
//    public Flux<User> getAll() {
//        return userRepository.findAll();
//    }
//
//    @GetMapping(value = "/listdelay", produces = MediaType.APPLICATION_STREAM_JSON_VALUE)
//    public Flux<User> getAllDelay() {
//        return userRepository.findAll().delayElements(Duration.ofSeconds(1));
//    }

    /**
     * 获取单个用户
     *
     * @param id
     * @return
     */
//    @GetMapping("/{id}")
//    public String getUser(@PathVariable String id) {
//        return "index";
//    }
//    public Mono<ResponseEntity<User>> getUser(@PathVariable String id) {
//        return userRepository.findById(id)
//                .map(ResponseEntity::ok)
//                .defaultIfEmpty(ResponseEntity.notFound().build());
//    }

    /**
     * 创建用户
     *
     * @param user
     * @return
     */
//    @PostMapping("")
//    public Mono<User> addUser(User user) {
//        return userRepository.save(user);
//    }

    /**
     * 修改用户
     *
     * @param id
     * @param user
     * @return
     */
//    @PutMapping("/{id}")
//    public Mono updateUser(@PathVariable(value = "id") String id, @Valid User user) {
//        return userRepository.findById(id)
//                .flatMap(existingUser -> {
//                    existingUser.setName(user.getName());
//                    existingUser.setAge(user.getAge());
//                    return userRepository.save(existingUser);
//                })
//                .map(updateUser -> new ResponseEntity<>(updateUser, HttpStatus.OK))
//                .defaultIfEmpty(new ResponseEntity<>(HttpStatus.NOT_FOUND));
//    }

    /**
     * 删除用户
     *
     * @param id
     * @return
     */
//    @DeleteMapping("/{id}")
//    public Mono<ResponseEntity<Void>> deleteUser(@PathVariable(value = "id") String id) {
//        return userRepository.findById(id)
//                .flatMap(existingUser ->
//                    userRepository.delete(existingUser)
//                            .then(Mono.just(new ResponseEntity<Void>(HttpStatus.OK)))
//                )
//                .defaultIfEmpty(new ResponseEntity<>(HttpStatus.NOT_FOUND));
//    }
}
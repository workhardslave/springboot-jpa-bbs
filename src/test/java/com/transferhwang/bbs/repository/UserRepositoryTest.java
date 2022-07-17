package com.transferhwang.bbs.repository;

import com.transferhwang.bbs.entity.User;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
class UserRepositoryTest {

    @Autowired
    UserRepository userRepository;

    @DisplayName("User 데이터를 저장 후, 조회한다.")
    @Test
    void saveAndFindUser() {
        // given
        User user = User.builder()
                .name("홍길동")
                .age(20)
                .build();

        // when
        userRepository.save(user);
        List<User> users = userRepository.findAll();

        // then
        Assertions.assertThat(users).isNotNull();
        Assertions.assertThat(users.size()).isEqualTo(1);
        Assertions.assertThat(users.get(0).getName()).isEqualTo(user.getName());
        Assertions.assertThat(users.get(0).getAge()).isEqualTo(user.getAge());
    }
}
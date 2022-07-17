package com.transferhwang.bbs.entity;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class User {

    @Id // PK 설정
    @GeneratedValue // PK 값을 위한 자동 생성 전략 명시
    private Long id;
    @Column // 컬럼
    private String name;
    @Column // 컬럼
    private int age;

    @Builder
    public User(Long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}

package com.sparta.springBasic.week02.domain;

import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@MappedSuperclass // 상속했을 때, 컬럼으로 인식하게 된다.
@EntityListeners(AuditingEntityListener.class) // 생성/수정 시간을 자동으로 반영하도록 설정
public class Timestamped {
    @CreatedDate // 생성일자임을 나타낸다.
    private LocalDateTime createdAt;

    @LastModifiedDate // 마지막 수정일자임을 나타낸다.
    private LocalDateTime modifiedAt;
}

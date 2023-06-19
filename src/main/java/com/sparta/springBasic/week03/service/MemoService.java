package com.sparta.springBasic.week03.service;

import com.sparta.springBasic.week03.domain.Memo;
import com.sparta.springBasic.week03.domain.MemoRepository;
import com.sparta.springBasic.week03.models.MemoRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class MemoService {

    private final MemoRepository memoRepository;

    @Transactional
    public Long update(Long id, MemoRequestDto requestDto) {
        Memo memo1 = memoRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("아이디가 존재하지 않는다.")
        );
        memo1.update(requestDto);
        return memo1.getId();
    }
}

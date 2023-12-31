package com.sparta.springBasic.week04.service;

import com.sparta.springBasic.week04.domain.Product;
import com.sparta.springBasic.week04.domain.ProductRepository;
import com.sparta.springBasic.week04.models.ItemDto;
import com.sparta.springBasic.week04.models.ProductMypriceRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor // final로 선언된 멤버 변수를 자동으로 생성한다.
@Service // 서비스임을 선언한다.
public class ProductService {

    private final ProductRepository productRepository;

    @Transactional // 메소드 동작이 SQL 쿼리문임을 선언한다.
    public Long update(Long id, ProductMypriceRequestDto requestDto) {
        Product product = productRepository.findById(id).orElseThrow(
                () -> new NullPointerException("해당 아이디가 존재하지 않습니다.")
        );
        product.update(requestDto);
        return id;
    }

    @Transactional // 메소드 동작이 SQL 쿼리문임을 선언한다.
    public Long updateBySearch(Long id, ItemDto itemDto) {
        Product product = productRepository.findById(id).orElseThrow(
                () -> new NullPointerException("해당 아이디가 존재하지 않는다.")
        );
        product.updateByItemDto(itemDto);
        return id;
    }
}

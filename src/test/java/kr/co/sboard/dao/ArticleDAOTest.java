package kr.co.sboard.dao;

import kr.co.sboard.dto.ArticleDTO;
import kr.co.sboard.dto.PageRequestDTO;
import kr.co.sboard.dto.PageResponseDTO;
import kr.co.sboard.service.ArticleService;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@Log4j2
@SpringBootTest
class ArticleDAOTest {
    @Autowired
    private ArticleDAO dao;
    @Autowired
    private ArticleService service;

    @Test
    void insert() {
    }

    @Test
    void select() {
    }

    @Test
    void selectAll() {
        int start = 0;
        /*
        List<ArticleDTO> dtoList = dao.selectAll(start);

        for(ArticleDTO dto:dtoList){
            log.info(dto);
        }
        */
    }

    @Test
    void getAll(){
        PageRequestDTO pageRequestDTO = PageRequestDTO.builder()
                .page(1)
                .build();

        PageResponseDTO pageResponseDTO = service.getAll(pageRequestDTO);

        log.info(pageResponseDTO);
    }

    @Test
    void selectCountAll(){
        int total = dao.selectCountAll();
        log.info(total);
    }

    @Test
    void update() {
    }

    @Test
    void delete() {
    }
}
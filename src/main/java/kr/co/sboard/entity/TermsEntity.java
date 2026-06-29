package kr.co.sboard.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import kr.co.sboard.dto.TermsDTO;
import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TermsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int no;

    private String basic;
    private String privacy;

    public TermsDTO toDTO(){
        return TermsDTO.builder()
                .no(no)
                .basic(basic)
                .privacy(privacy)
                .build();
    }

}

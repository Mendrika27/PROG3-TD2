package com.example.PROG3TD2.controller.mapper;

import com.example.PROG3TD2.controller.responses.SponsorResponse;
import com.example.PROG3TD2.model.SponsorEntity;
import com.example.PROG3TD2.model.TeamEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class SponsorRestMapper {
    public SponsorResponse toRest(SponsorEntity domain){
        return SponsorResponse.builder()
                .id(domain.getId())
                .name(domain.getName())
                .build();
    }


}

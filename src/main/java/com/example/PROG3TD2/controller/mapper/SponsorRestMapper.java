package com.example.PROG3TD2.controller.mapper;

import com.example.PROG3TD2.controller.responses.CreateSponsorResponse;
import com.example.PROG3TD2.controller.responses.SponsorResponse;
import com.example.PROG3TD2.controller.responses.UpdateSponsorResponse;
import com.example.PROG3TD2.model.SponsorEntity;
import com.example.PROG3TD2.model.TeamEntity;
import org.springframework.stereotype.Component;

@Component
public class SponsorRestMapper {
    public SponsorResponse toRest(SponsorEntity domain){
        return SponsorResponse.builder()
                .id(domain.getId())
                .name(domain.getName())
                .team((TeamEntity) domain.getTeam())
                .build();
    }

    public SponsorEntity toDomain(CreateSponsorResponse rest){
        return SponsorEntity.builder()
                .name(rest.getName())
                .team(rest.getTeam())
                .build();
    }

    public SponsorEntity toDomain(UpdateSponsorResponse rest){
        return SponsorEntity.builder()
                .id(rest.getId())
                .name(rest.getName())
                .team(rest.getTeam())
                .build();
    }
}

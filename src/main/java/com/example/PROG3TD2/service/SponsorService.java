package com.example.PROG3TD2.service;

import com.example.PROG3TD2.model.SponsorEntity;
import com.example.PROG3TD2.repository.SponsorRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class SponsorService {
    private final SponsorRepository repository;

    public List<SponsorEntity> getSponsor(){
        return repository.findAll();
    }

    public List<SponsorEntity> createSponsor(List<SponsorEntity> toCreate){
        return repository.saveAll(toCreate);
    }

    public List<SponsorEntity> updateSponsor(List<SponsorEntity> toUpdate){
        return repository.saveAll(toUpdate);
    }

    public SponsorEntity deleteSponsor(int sponsorId){
        Optional<SponsorEntity> optional = repository.findById(String.valueOf(sponsorId));
        if(optional.isPresent()){
            repository.delete(optional.get());
            return optional.get();
        }else{
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Sponsor "+sponsorId+" not found");
        }
    }
}

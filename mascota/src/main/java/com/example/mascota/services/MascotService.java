package com.example.mascota.services;

import com.example.mascota.entities.Mascot;
import com.example.mascota.repositories.MascotRepository;

import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class MascotService implements BaseService<Mascot>{
    private MascotRepository mascotRepository;
    public MascotService(MascotRepository mascotRepository){
        this.mascotRepository = mascotRepository;
    }

    @Override
    @Transactional
    public List<Mascot> finalAll() throws Exception {
        try {
            List<Mascot> entities = mascotRepository.findAll();
            return entities;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Mascot findById(Long id) throws Exception {
        try {
            Optional<Mascot> entityOptional = mascotRepository.findById(id);
            return entityOptional.get();
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Mascot save(Mascot entity) throws Exception {
        try {
            entity = mascotRepository.save(entity);
            return entity;
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Mascot update(Long id, Mascot entity) throws Exception {
        try {
            Optional<Mascot> entityOptional = mascotRepository.findById(id);
            Mascot mascot = entityOptional.get();
            mascot = mascotRepository.save(entity);
            return mascot;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public boolean delete(Long id) throws Exception {
        try {
            if (mascotRepository.existsById(id)){
                mascotRepository.deleteById(id);
                return true;
            }else{
                throw new Exception();
            }
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}

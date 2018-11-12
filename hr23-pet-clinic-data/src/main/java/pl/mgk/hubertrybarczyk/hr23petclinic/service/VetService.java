package pl.mgk.hubertrybarczyk.hr23petclinic.service;

import pl.mgk.hubertrybarczyk.hr23petclinic.model.Pet;

import java.util.Set;

public interface VetService {
    Pet findById(Long id);

    Pet save(Pet Pet);

    Set<Pet> findAll();
}

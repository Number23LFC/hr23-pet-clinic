package pl.mgk.hubertrybarczyk.hr23petclinic.service;

import pl.mgk.hubertrybarczyk.hr23petclinic.model.Vet;

import java.util.Set;

public interface PetService {

    Vet findById(Long id);

    Vet save(Vet Vet);

    Set<Vet> findAll();
}

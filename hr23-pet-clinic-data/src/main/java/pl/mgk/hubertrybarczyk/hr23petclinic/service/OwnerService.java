package pl.mgk.hubertrybarczyk.hr23petclinic.service;

import pl.mgk.hubertrybarczyk.hr23petclinic.model.Owner;

import java.util.Set;

public interface OwnerService  {

    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}

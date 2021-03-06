package pl.mgk.hubertrybarczyk.hr23petclinic.service.map;

import pl.mgk.hubertrybarczyk.hr23petclinic.model.Pet;
import pl.mgk.hubertrybarczyk.hr23petclinic.service.CrudService;

import java.util.Set;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public void deleteId(Long id) {
        super.deleteById(id);
    }
}

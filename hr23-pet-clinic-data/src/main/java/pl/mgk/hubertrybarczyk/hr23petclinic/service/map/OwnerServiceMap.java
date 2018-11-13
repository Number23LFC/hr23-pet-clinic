package pl.mgk.hubertrybarczyk.hr23petclinic.service.map;

import pl.mgk.hubertrybarczyk.hr23petclinic.model.Owner;
import pl.mgk.hubertrybarczyk.hr23petclinic.service.CrudService;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public void deleteId(Long id) {
        super.deleteById(id);
    }
}

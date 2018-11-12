package pl.mgk.hubertrybarczyk.hr23petclinic.service;

import pl.mgk.hubertrybarczyk.hr23petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>  {

    Owner findByLastName(String lastName);

}

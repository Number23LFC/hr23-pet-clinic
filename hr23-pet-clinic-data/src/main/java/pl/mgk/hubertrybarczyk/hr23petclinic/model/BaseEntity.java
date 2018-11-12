package pl.mgk.hubertrybarczyk.hr23petclinic.model;

import java.io.Serializable;

public class BaseEntity implements Serializable {
    private Long id; // use Box type - JPA recommendation

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
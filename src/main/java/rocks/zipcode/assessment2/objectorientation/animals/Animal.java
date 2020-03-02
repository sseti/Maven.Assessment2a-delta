package rocks.zipcode.assessment2.objectorientation.animals;

import rocks.zipcode.assessment2.objectorientation.Address;
import rocks.zipcode.assessment2.objectorientation.Person;

/**
 * @author leon on 29/11/2018.
 * @ATTENTION_TO_STUDENTS - Ensure that you have completed the `Person` class before attempting this class.
 */
public class Animal {
    Long id;
    Person owner;
    Address address;

    public Animal() {
        this.id = id;
        this.owner = new Person();
        this.address = owner.getAddress();

    }

    /**
     * @param id - id of animal
     * @param owner - owner of animal
     */
    public Animal(Long id, Person owner) {
        this.id = null;
        this.owner = new Person();
        this.address = owner.getAddress();

    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
    }

    public Address getAddress() {
        return address;
    }
}

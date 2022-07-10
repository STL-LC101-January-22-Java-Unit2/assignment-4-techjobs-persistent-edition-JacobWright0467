package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Employer extends AbstractEntity {

    public Employer() {
    }

    public Employer(String aLocation) {
        super();
        this.location = aLocation;
    }

    @NotBlank
    @Size(min=3, message="Location must be between 3 and 100 characters long")
    public String location;

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return this.location;
    }
}

//JAKE section 2 Models part 2 last half says Employer needs
//non arg constructor required for Hibernate to create object
//may need to come back to this to see if that's something you
//missed because i'm not sure what that means.  Maybe what I
//put on line 10?

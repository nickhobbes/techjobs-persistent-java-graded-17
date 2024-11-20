package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class Employer extends AbstractEntity {

    @NotBlank(message = "Location is required")
    @Size(max = 75, message = "Location is too long!")
    private String location;

    public Employer() {}

    public @NotBlank(message = "Location is required") @Size(max = 75, message = "Location is too long!") String getLocation() {
        return location;
    }

    public void setLocation(@NotBlank(message = "Location is required") @Size(max = 75, message = "Location is too long!") String location) {
        this.location = location;
    }
}


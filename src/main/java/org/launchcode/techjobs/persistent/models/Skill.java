package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {

    @NotBlank(message = "Description is required")
    @Size(max = 255, message = "Description is too long!")
    private String description;

    public Skill() {}

    public @NotBlank(message = "Description is required") @Size(max = 255, message = "Description is too long!") String getDescription() {
        return description;
    }

    public void setDescription(@NotBlank(message = "Description is required") @Size(max = 255, message = "Description is too long!") String description) {
        this.description = description;
    }
}

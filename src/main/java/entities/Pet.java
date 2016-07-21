package entities;

import java.time.LocalDate;

/**
 * Created by perrythomson on 7/21/16.
 */
public class Pet {

    public Pet(Long petId, String rudolph, LocalDate of, PetType dog, Long ownerId) {

    }

    public static enum PetType {DOG, CAT, FISH, BIRD};

    private Long petID;
    private String name;
    private LocalDate dob;
    private PetType petType;
    private Long ownerID;


    public Long getPetID() {
        return petID;
    }

    public void setPetID(Long petID) {
        this.petID = petID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public Long getOwnerID() {
        return ownerID;
    }

    public void setOwnerID(Long ownerID) {
        this.ownerID = ownerID;
    }
}

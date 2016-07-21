package entities;

import java.time.LocalDate;

/**
 * Created by perrythomson on 7/21/16.
 */
public class Appointment {

    public Appointment(Long appointmentId, LocalDate of, AptType groom, Long ownerId, Long petId) {
    }

    public static enum AptType { GROOM, CHECKUP, SURGERY };

    private Long appointmentID;
    private LocalDate aptDate;
    private AptType aptType;
    private Long ownerID;
    private Long petID;

    public Long getAppointmentID() {
        return appointmentID;
    }

    public void setAppointmentID(Long appointmentID) {
        this.appointmentID = appointmentID;
    }

    public LocalDate getAptDate() {
        return aptDate;
    }

    public void setAptDate(LocalDate aptDate) {
        this.aptDate = aptDate;
    }

    public AptType getAptType() {
        return aptType;
    }

    public void setAptType(AptType aptType) {
        this.aptType = aptType;
    }

    public Long getOwnerID() {
        return ownerID;
    }

    public void setOwnerID(Long ownerID) {
        this.ownerID = ownerID;
    }

    public Long getPetID() {
        return petID;
    }

    public void setPetID(Long petID) {
        this.petID = petID;
    }
}

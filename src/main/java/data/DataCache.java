package data;

import entities.*;
import java.time.LocalDate;
import java.util.HashMap;

/**
 * Created by perrythomson on 7/21/16.
 */
public class DataCache {
    private static DataCache instance = null;
    private static HashMap<Long, Pet> petsHashMap;
    private static HashMap<Long, Owner> ownersHashMap;
    private static HashMap<Long, Product> productsHashMap;
    private static HashMap<Long, Order> ordersHashMap;
    private static HashMap<Long, Appointment> appointmentsHashMap;

    private DataCache() {
        // Exists only to defeat instantiation.
    }
    public static synchronized DataCache getInstance() {
        if(instance == null) {
            instance = new DataCache();
        }
        return instance;
    }

    public static HashMap<Long, Pet> getPets() {
        if(petsHashMap==null || petsHashMap.isEmpty()) {
            loadDataCache();
        }
        return petsHashMap;
    }

    public static Pet getPet(Long petId) {
        if(petsHashMap==null || petsHashMap.isEmpty()) {
            loadDataCache();
        }
        Pet pet = null;
        if(petsHashMap.containsKey(petId)) {
            pet = petsHashMap.get(petId);
        }
        return pet;
    }

    public static HashMap<Long, Owner> getOwners() {
        if(ownersHashMap==null || ownersHashMap.isEmpty()) {
            loadDataCache();
        }
        return ownersHashMap;
    }

    public static Owner getOwner(Long ownerId) {
        if(ownersHashMap==null || ownersHashMap.isEmpty()) {
            loadDataCache();
        }
        Owner owner = null;
        if(ownersHashMap.containsKey(ownerId)) {
            owner = ownersHashMap.get(ownerId);
        }
        return owner;
    }

    public static HashMap<Long, Product> getProducts() {
        if(productsHashMap==null || productsHashMap.isEmpty()) {
            loadDataCache();
        }
        return productsHashMap;
    }

    public static Product getProduct(Long productId) {
        if(productsHashMap==null || productsHashMap.isEmpty()) {
            loadDataCache();
        }
        Product product = null;
        if(productsHashMap.containsKey(productId)) {
            product = productsHashMap.get(productId);
        }
        return product;
    }

    public static HashMap<Long, Appointment> getAppointments() {
        if(appointmentsHashMap==null || appointmentsHashMap.isEmpty()) {
            loadDataCache();
        }
        return appointmentsHashMap;
    }

    public static Appointment getAppointment(Long appointmentId) {
        if(appointmentsHashMap==null || appointmentsHashMap.isEmpty()) {
            loadDataCache();
        }
        Appointment appointment = null;
        if(appointmentsHashMap.containsKey(appointmentId)) {
            appointment = appointmentsHashMap.get(appointmentId);
        }
        return appointment;
    }

    public static HashMap<Long, Order> getOrders() {
        if(ordersHashMap==null) {
            loadDataCache();
        }
        return ordersHashMap;
    }

    public static Order getOrder(Long orderId) {
        if(ordersHashMap==null) {
            loadDataCache();
        }
        Order order = null;
        if(ordersHashMap.containsKey(orderId)) {
            order = ordersHashMap.get(orderId);
        }
        return order;
    }

    private static void loadDataCache() {
        petsHashMap = new HashMap<>();
        ownersHashMap = new HashMap<>();
        productsHashMap = new HashMap<>();
        ordersHashMap = new HashMap<>();
        appointmentsHashMap = new HashMap<>();

        Long ownerId = System.currentTimeMillis();
        ownersHashMap.put(ownerId,new Owner(ownerId,"Bob","Denver","801-111-2222","123 Desert Island"));

        Long petId = System.currentTimeMillis();
        petsHashMap.put(petId, new Pet(petId,"Nemo",LocalDate.of(2014,7,15),Pet.PetType.FISH,ownerId));

        Long appointmentId = System.currentTimeMillis();
        appointmentsHashMap.put(appointmentId, new Appointment(appointmentId, LocalDate.of(2016,9,15), Appointment.AptType.CHECKUP, ownerId, petId));

        ownerId = System.currentTimeMillis();
        ownersHashMap.put(ownerId,new Owner(ownerId,"Jane","Doe","801-333-4444","345 Avenue A."));

        petId = System.currentTimeMillis();
        petsHashMap.put(petId, new Pet(petId,"Kat",LocalDate.of(2010,3,1),Pet.PetType.CAT,ownerId));

        appointmentId = System.currentTimeMillis();
        appointmentsHashMap.put(appointmentId, new Appointment(appointmentId, LocalDate.of(2016,7,30), Appointment.AptType.SURGERY, ownerId, petId));
        appointmentId = System.currentTimeMillis();
        appointmentsHashMap.put(appointmentId, new Appointment(appointmentId, LocalDate.of(2016,8,15), Appointment.AptType.CHECKUP, ownerId, petId));
        appointmentId = System.currentTimeMillis();
        appointmentsHashMap.put(appointmentId, new Appointment(appointmentId, LocalDate.of(2016,8,28), Appointment.AptType.CHECKUP, ownerId, petId));

        ownerId = System.currentTimeMillis();
        ownersHashMap.put(ownerId,new Owner(ownerId,"Master","Chief","801-555-6666","678 Halo Way"));

        petId = System.currentTimeMillis();
        petsHashMap.put(petId, new Pet(petId,"Cortana",LocalDate.of(1999,5,12),Pet.PetType.BIRD,ownerId));

        ownerId = System.currentTimeMillis();
        ownersHashMap.put(ownerId,new Owner(ownerId,"Santa","Clause","801-777-8888","1 North Pole"));

        petId = System.currentTimeMillis();
        petsHashMap.put(petId, new Pet(petId,"Rudolph",LocalDate.of(1980,12,25),Pet.PetType.DOG,ownerId));

        appointmentId = System.currentTimeMillis();
        appointmentsHashMap.put(appointmentId, new Appointment(appointmentId, LocalDate.of(2016,8,15), Appointment.AptType.GROOM, ownerId, petId));
        appointmentId = System.currentTimeMillis();
        appointmentsHashMap.put(appointmentId, new Appointment(appointmentId, LocalDate.of(2016,9,5), Appointment.AptType.CHECKUP, ownerId, petId));
        appointmentId = System.currentTimeMillis();
        appointmentsHashMap.put(appointmentId, new Appointment(appointmentId, LocalDate.of(2016,10,15), Appointment.AptType.GROOM, ownerId, petId));
        appointmentId = System.currentTimeMillis();
        appointmentsHashMap.put(appointmentId, new Appointment(appointmentId, LocalDate.of(2016,12,15), Appointment.AptType.GROOM, ownerId, petId));
        appointmentId = System.currentTimeMillis();
        appointmentsHashMap.put(appointmentId, new Appointment(appointmentId, LocalDate.of(2016,2,15), Appointment.AptType.GROOM, ownerId, petId));

        Long productId = System.currentTimeMillis();
        productsHashMap.put(productId,new Product(productId,"Dog Food","Food for dogs.",23.77));
        productId = System.currentTimeMillis();
        productsHashMap.put(productId,new Product(productId,"Dog Toy","Toy for dogs.",6.99));
        productId = System.currentTimeMillis();
        productsHashMap.put(productId,new Product(productId,"Dog Leash","Black leather dog leash.",27.99));
        productId = System.currentTimeMillis();
        productsHashMap.put(productId,new Product(productId,"Dog Collar","Black nylon dog collar.",14.99));
        productId = System.currentTimeMillis();
        productsHashMap.put(productId,new Product(productId,"Bird Food","Food for birds.",2.50));
        productId = System.currentTimeMillis();
        productsHashMap.put(productId,new Product(productId,"Bird Cage","Large white metal bird cage.",75.25));
        productId = System.currentTimeMillis();
        productsHashMap.put(productId,new Product(productId,"Cat Food","Food for cats.",12.99));
        productId = System.currentTimeMillis();
        productsHashMap.put(productId,new Product(productId,"Cat Toy","Toy for cats.",1.25));
        productId = System.currentTimeMillis();
        productsHashMap.put(productId,new Product(productId,"Cat Collar","Blue nylon cat collar.",7.99));
        productId = System.currentTimeMillis();
        productsHashMap.put(productId,new Product(productId,"Fish Food","Food for fish.",3.25));
        productId = System.currentTimeMillis();
        productsHashMap.put(productId,new Product(productId,"Fish Bowl","Small glass fish bowl.",13.33));
        productId = System.currentTimeMillis();
        productsHashMap.put(productId,new Product(productId,"Fish Aquarium","Large glass fish aquarium.",120.99));
        productId = System.currentTimeMillis();
        productsHashMap.put(productId,new Product(productId,"Fish Heater","Electric fish tank heater.",37.50));
        productId = System.currentTimeMillis();
        productsHashMap.put(productId,new Product(productId,"Small Red Fish","Live fish, red, small.",7.50));
        productId = System.currentTimeMillis();
        productsHashMap.put(productId,new Product(productId,"Medium Blue Fish","Live fish, blue, medium.",17.50));
        productId = System.currentTimeMillis();
        productsHashMap.put(productId,new Product(productId,"Large White Fish","Live fish, white, large.",17.50));
    }

}

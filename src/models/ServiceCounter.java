package models;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Random;

// Balcão
public class ServiceCounter {
    private Long id;

    private String storeName;

    private ZonedDateTime serviceStartTime;

    private ZonedDateTime serviceEndTime;

    private Clerk clerk;

    public void startCustomerService() {
        this.serviceStartTime = ZonedDateTime.now(ZoneId.of("America/Sao_Paulo"));
    }

    public void finishCustomerService() {
        this.serviceEndTime = ZonedDateTime.now(ZoneId.of("America/Sao_Paulo"));
    }

    public Clerk getClerk() {
        return clerk;
    }

    public void setClerk(Clerk clerk) {
        this.clerk = clerk;
    }

    public Long getId() {
        return id;
    }

    private void setId() {
        Random random = new Random();
        this.id = random.nextLong();
    }

    public String getStoreName() {
        return storeName;
    }

    private void setStoreName(String storeName) {
        if(storeName.isBlank()) throw new RuntimeException("Store name is blank.");
        this.storeName = storeName;
    }

    public ServiceCounter(String storeName) {
        this.setStoreName(storeName);
        this.setId();
    }
}

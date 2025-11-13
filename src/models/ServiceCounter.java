package models;

import interfaces.Report;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// Balcão
public class ServiceCounter implements Report {
    private Long id;

    private String storeName;

    private ZonedDateTime serviceStartTime;

    private ZonedDateTime serviceEndTime;

    private Clerk clerk;

    private List<Ticket> tickets;

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

    private void startCustomerService() {
        this.serviceStartTime = ZonedDateTime.now(ZoneId.of("America/Sao_Paulo"));
    }

    public ZonedDateTime getServiceStartTime() {
        return serviceStartTime;
    }

    public void finishCustomerService() {
        this.serviceEndTime = ZonedDateTime.now(ZoneId.of("America/Sao_Paulo"));
    }

    public ZonedDateTime getServiceEndTime() {
        return serviceEndTime;
    }

    public Clerk getClerk() {
        return clerk;
    }

    public void setClerk(Clerk clerk) {
        this.clerk = clerk;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTicket(Ticket ticket) {
        this.tickets.add(ticket);
    }

    public ServiceCounter(String storeName) {
        this.setStoreName(storeName);
        this.startCustomerService();
        this.setId();
        this.tickets = new ArrayList<>();
    }

    @Override
    public String generateReport() {
        return "Ticket {"
                    + "Clerk : '" + this.clerk.getName()
                    + '\''
                    + ", Store : " + this.getStoreName()
                    + '\''
                    + ", Tickets : " + this.tickets.size()
                    + '\''
                    + ", Start Time : " + this.getServiceStartTime()
                + '}';
    }
}

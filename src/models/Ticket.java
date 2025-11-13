package models;

import enums.TicketStatus;
import interfaces.Report;

import java.time.ZoneId;
import java.time.ZonedDateTime;

// Chamado
public class Ticket implements Report {
    private String clientName;
    private Clerk clerk;
    private TicketStatus status;

    private ZonedDateTime ticketStartTime;

    private ZonedDateTime ticketEndTime;

    public String getClientName() {
        return clientName;
    }

    public void startCustomerService() {
        this.ticketStartTime = ZonedDateTime.now(ZoneId.of("America/Sao_Paulo"));
    }

    public void finishCustomerService() {
        this.ticketEndTime = ZonedDateTime.now(ZoneId.of("America/Sao_Paulo"));
    }


    private void setClientName(String clientName) {
        if (clientName.isBlank()) throw new RuntimeException("Client name is blank.");
        this.clientName = clientName;
    }

    public Clerk getClerk() {
        return clerk;
    }

    public void setClerk(Clerk clerk) {
        this.clerk = clerk;
    }

    public TicketStatus getStatus() {
        return status;
    }

    public void changeStatus(TicketStatus status){
        this.status = status;
    }

    public Ticket(
            String clientName,
            Clerk clerk
    ) {
        this.setClientName(clientName);
        this.clerk = clerk;
        this.changeStatus(TicketStatus.ABERTO);
        this.startCustomerService();
    }

    @Override
    public String generateReport() {
        return "Ticket {" +
                    "clientName : '" + clientName
                    + '\''
                    + ", status : " + status
                + '}';

    }
}

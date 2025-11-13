import enums.TicketStatus;
import models.Clerk;
import models.ServiceCounter;
import models.Ticket;

public class Main {
    public static void main(String[] args) {
        Clerk firstClerk = new Clerk("Aline");
        Clerk secondClerk = new Clerk("Jane");

        Ticket ticket1 = new Ticket(
                "Emerson",
                firstClerk
        );

        Ticket ticket2 = new Ticket(
                "Ana",
                firstClerk
        );

        ticket2.changeStatus(TicketStatus.EM_ATENDIMENTO);

        Ticket ticket3 = new Ticket(
                "Lais",
                firstClerk
        );

        ticket3.changeStatus(TicketStatus.FECHADO);

        ServiceCounter serviceCounter = new ServiceCounter(
            "Steam",
                firstClerk
        );

        serviceCounter.setTicket(ticket1);
        serviceCounter.setTicket(ticket2);
        serviceCounter.setTicket(ticket3);

        for (Ticket ticket : serviceCounter.getTickets()) {
            System.out.println(ticket.generateReport());
        }

        System.out.println("\n"+serviceCounter.generateReport());;
    }
}

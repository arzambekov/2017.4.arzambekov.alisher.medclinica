package kz.greetgo.education.controller.register;

import kz.greetgo.education.controller.model.Ticket;

public interface TicketRegister {
    Ticket getTicket(String docname);
}

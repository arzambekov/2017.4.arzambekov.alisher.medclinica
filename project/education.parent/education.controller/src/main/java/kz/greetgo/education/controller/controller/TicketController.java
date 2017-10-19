package kz.greetgo.education.controller.controller;

import kz.greetgo.depinject.core.Bean;
import kz.greetgo.depinject.core.BeanGetter;
import kz.greetgo.education.controller.model.Ticket;
import kz.greetgo.education.controller.register.TicketRegister;
import kz.greetgo.education.controller.utils.Controller;
import kz.greetgo.mvc.annotations.Mapping;
import kz.greetgo.mvc.annotations.Par;
import kz.greetgo.mvc.annotations.ToJson;

@Bean
@Mapping("/ticket")
public class TicketController implements Controller{

    public BeanGetter<TicketRegister> TicketRegister;

    @ToJson
    @Mapping("/info")
    public Ticket getTicket(@Par("docname")String docname) {
        return TicketRegister.get().getTicket(docname);
    }
}

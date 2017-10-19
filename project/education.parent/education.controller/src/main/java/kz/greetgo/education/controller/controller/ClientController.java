package kz.greetgo.education.controller.controller;

import kz.greetgo.depinject.core.Bean;
import kz.greetgo.depinject.core.BeanGetter;
import kz.greetgo.education.controller.model.Client;
import kz.greetgo.education.controller.register.ClientRegister;
import kz.greetgo.education.controller.utils.Controller;
import kz.greetgo.mvc.annotations.Mapping;
import kz.greetgo.mvc.annotations.Par;
import kz.greetgo.mvc.annotations.ToJson;

@Bean
@Mapping("/client")
public class ClientController implements Controller{

    public BeanGetter<ClientRegister> clientRegister;

    @ToJson
    @Mapping("/info")
    public Client getClient(@Par("name")String name,@Par("surname") String surname, @Par("Doctor") String Doctor) {
        return ClientRegister.get().getClient(name, surname, Doctor);
    }
}

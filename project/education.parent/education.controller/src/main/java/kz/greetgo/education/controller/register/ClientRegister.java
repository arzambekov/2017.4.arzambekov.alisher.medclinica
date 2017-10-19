package kz.greetgo.education.controller.register;

import kz.greetgo.education.controller.model.Client;

public interface ClientRegister {
    Client getClient(String name, String surname, String Doctor);
}

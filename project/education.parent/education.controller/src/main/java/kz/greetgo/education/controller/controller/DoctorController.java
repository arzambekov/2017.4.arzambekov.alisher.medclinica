package kz.greetgo.education.controller.controller;

import kz.greetgo.depinject.core.Bean;
import kz.greetgo.depinject.core.BeanGetter;
import kz.greetgo.education.controller.model.Doctor;
import kz.greetgo.education.controller.register.DoctorRegister;
import kz.greetgo.education.controller.utils.Controller;
import kz.greetgo.mvc.annotations.Mapping;
import kz.greetgo.mvc.annotations.Par;
import kz.greetgo.mvc.annotations.ToJson;

@Bean
@Mapping("/client")
public class DoctorController implements Controller{

    public BeanGetter<DoctorRegister> doctorRegister;

    @ToJson
    @Mapping("/info")
    public Doctor getDoctor(@Par("name")String name,@Par("surname") String surname, @Par("Specialization") String Specialization) {
        return DoctorRegister.get().getDoctor(name, surname, Specialization);
    }
}
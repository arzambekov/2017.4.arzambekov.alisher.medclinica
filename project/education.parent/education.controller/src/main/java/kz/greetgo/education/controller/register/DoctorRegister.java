package kz.greetgo.education.controller.register;

import kz.greetgo.education.controller.model.Doctor;

public interface DoctorRegister {
    Doctor getDoctor(String name, String surname, String Specialization);
}

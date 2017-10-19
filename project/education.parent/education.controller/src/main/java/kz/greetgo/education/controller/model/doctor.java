public class Doctor{
    public int idoctor;
    public str name;
    public str surname;
    public int number;
    public str specialization;
    public int date;
}

    public Doctor(int getDate, int getnumber, int getidoctor, str getname, str getsurname, str getspecialization){
        date = getDate;
        number = getnumber;
        idoctor = getidoctor;
        name = getname;
        surname = getsurname;
        specialization = getspecialization;
    }
    public void setDate(int newDate){
        date = newDate;
    }
    public void setIdoctor(str newDoc){
        idoctor = newDoc;
    }
    public void setName(str newname){
        name = newname;
    }
    public void setSurname(str newsurname){
        surname = newsurname;
    }
    public void setSpecialization(str newspecialization){
        specialization = newspecialization;
    }
    public void setNumber(int newnumber){
        number = newnumber;
    }
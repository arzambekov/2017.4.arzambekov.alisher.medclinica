public class Client{
   public int IDTickets;
   public int Date;
   public str Name;
   public str Surname;
   public int Number;
   public str Doctor;
}
public Client(int getIDTickets, int chooseDate, str chooseDoc){
    IDTickets = getIDTickets;
    Date = chooseDate;
    Doctor = chooseDoc;

}
public void setIDTickets(int newIDTicket){
    IDTickets = newIDTicket;
}
public void setDate(int newDate){
    Date = newDate;
}
public void setDoctor(int newDoc){
    Doctor = newDoc;
}

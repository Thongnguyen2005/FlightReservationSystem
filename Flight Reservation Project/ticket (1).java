import java.lang.Math;

public class ticket {
  private static int ticketId = 0;

  // constructors
  public ticket() {
    ticketId = 1 + (int) (Math.random() * 999);
  }

  // methods
  public String getTicketID() {
    return "P" + ticketId;// P stands for person
  }
}
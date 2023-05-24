
/*

Thong Nguyen - nminhthong849@gmail.com
Liam Kennedy - liamkennedysocal@gmail.com
Flight Reservation System

*/
import java.util.*;
import java.io.*;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Name:");
    String name = scan.nextLine();
    System.out.println("Do you have account ID? Y/N");
    String ans = scan.nextLine();
    String id = null;
    if (ans.toLowerCase().equals("y")) {
      System.out.println("What is your ID?");
      id = scan.nextLine();
    } else { // create a new id
      ticket t = new ticket();
      id = t.getTicketID();
    }
    System.out.println("Your ID is: " + id);

    // Show map to costumer
    seatingMap m = new seatingMap();
    m.createMap();
    System.out.println("      A B  C  D E");
    m.printMap(); // number of columns and rows are fixed. 10 rows and 5 columns

    System.out.println("Enter row:");
    int r = scan.nextInt() - 1;
    scan.nextLine(); // consume the newline character
    System.out.println("Enter column:");
    String c = scan.nextLine();
    person seat = new person(r, c);

    // check if seat is opened
    while (!(m.isOpened(r, seat.getColumn())))
    // column is already converted from character to int
    {
      // column is already converted from character to int
      System.out.print("\nUnfortunately, that seat is already taken, would you consider (Y/N): ");
      System.out.println(m.suggestSeat(r, seat.getColumn()));
      // recomend other available seats the same row to cosutmer
      String option = scan.nextLine();
      if (option.equals("N")) {
        System.out.println("If not, please rechoose the seat.\nEnter row:");
        r = scan.nextInt() - 1;
        scan.nextLine(); // consume the newline character
        System.out.println("Enter column:");
        c = scan.nextLine();
      } else {
        System.out.println("Which column do you want?");
        c = scan.nextLine();
      }
      seat = new person(r, c);
    }
    System.out
        .print("Name: " + name + "\nID: " + id + "\nSeat number: " + (r + 1) + seat.getChar() + "\nStatus: Booked");
  }
}
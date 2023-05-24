import java.lang.Math;

public class seatingMap {
  private String airline;// airline name
  // private int[][] seatMap;
  private int[][] seatMap = new int[10][5];
  private int row;
  private int column;
  private int n;

  public seatingMap()// default
  {
    row = 10;
    column = 5;
  }

  public void createMap() {
    for (int r = 0; r < row; r++) {
      for (int c = 0; c < column; c++) {
        n = 1 + (int) (4 * Math.random());// number between 1 and 4
        if (n % 2 == 0)
          seatMap[r][c] = 1;// setting opened seat
        else
          seatMap[r][c] = 0;// setting take seat
      }
    }
  }

  public void printMap() {
    for (int r = 0; r < row; r++) {
      if (r < 9) {
        System.out.print(r + 1 + ":    ");
      } else {
        System.out.print(r + 1 + ":   ");
      }

      for (int c = 0; c < column; c++) {
        if (c == 1 || c == 2) {
          System.out.print("x  ");
        } else {
          System.out.print("x ");
        }
      }
      System.out.println();
    }
  }

  public boolean isOpened(int r, int c) {
    if (seatMap[r][c] == 0)
      return false;
    else
      return true;
  }

  // seats on the same row
  public String suggestSeat(int r, int c) {
    String s = new String();
    for (int x = 0; x < 5; x++) {
      if (seatMap[r][c] != seatMap[r][x] && isOpened(r, x)) {
        s += (r + 1) + getCharr(x) + " ";
      }
    }
    return s;
  }

  public String getCharr(int c) {
    String s = new String();
    if (c == 0)
      s = "A";
    else if (c == 1)
      s = "B";
    else if (c == 2)
      s = "C";
    else if (c == 3)
      s = "D";
    else if (c == 4)
      s = "E";
    return s;
  }
}
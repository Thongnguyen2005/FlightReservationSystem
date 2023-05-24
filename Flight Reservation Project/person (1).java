public class person{
  private int row;
  private int column;
  private String character;//column but under character form
  
  public person(int r, String c)
  {
    row = r;
    if (c.equals("A"))
      column = 0;
    else if (c.equals("B"))
      column = 1;
    else if (c.equals("C"))
      column = 2;
    else if (c.equals("D"))
      column = 3;
    else if (c.equals("E"))
      column = 4;
  }

  public int getColumn()
  {
    return column;
  }

  public String getChar()
  {
    if (column == 0)
      character = "A";
    else if (column == 1)
      character = "B";
    else if (column == 2)
      character = "C";
    else if (column == 3)
      character = "D";
    else if (column == 4)
      character = "E";
    return character;
  }
}
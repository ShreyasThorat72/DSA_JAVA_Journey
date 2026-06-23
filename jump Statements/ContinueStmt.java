class ContinueStmt
{
  public static void main(String[] args) {
      {
        for (int i = 0; i < 6; i++) {
            if(i==3)
            {
                System.out.println("  ");
                continue;
            }
            System.out.println(i);
        }
      }
  }
}
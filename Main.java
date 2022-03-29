class Main {
  public static void main(String[] args) {
    String znakChoinki = "*";
		for (int z=1; z<4; z++)
			{
		for (int x=1; x<5; x++)
			{
				for (int y=1; y<5; y++)
					{
						if (y<(5-x))
						{
								System.out.print(" ");
						}
						else
						{
							System.out.print(znakChoinki);
						}
					}
				System.out.println();
			}
		}
	}
}
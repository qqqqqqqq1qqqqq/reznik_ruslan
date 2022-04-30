package individual;

public class counter {
	public static void count(int number) 
	{
		
        int [] nn = new int[10];
        while (number > 0) {
            nn[number%10]++;
            number /= 10;
        }
        for (int i = 0; i < nn.length; i++) {
            if (nn[i] != 0)
                System.out.printf("%d - %d %n times", i, nn[i]);
        }
	}

}

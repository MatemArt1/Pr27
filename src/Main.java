public class Main {
    public class Dinglemouse {

        public static int howManyBees(final char [][] hive) {
            // Your bee counting code here
            int c = 0;
            if (hive.length == 0) return 0;
            for (int i = 0; i < hive.length; i++)
            {
                for(int j=0; j < hive[i].length; j++)
                {
                    if (hive[i][j] == 'b')
                    {
                        if (j <= hive[i].length - 3 && hive[i][j+1] == 'e' && hive[i][j+2] == 'e') c++;
                        if (i <= hive.length - 3 && hive[i+1][j] == 'e' && hive[i+2][j] == 'e') c++;
                    }
                    if (hive[i][j] == 'e')
                    {
                        if (j <= hive[i].length - 3 && hive[i][j+1] == 'e' && hive[i][j+2] == 'b') c++;
                        if (i <= hive.length - 3 && hive[i+1][j] == 'e' && hive[i+2][j] == 'b') c++;
                    }
                }
            }
            return c;
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
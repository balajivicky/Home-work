import java.util.Scanner;

class SpotifyMusic 
{
    public static void main(String[] args) 
	{

        Scanner sc = new Scanner(System.in);

        System.out.println(" Welcome to Spotify Music ");
        System.out.println("Select Music Director:");
        System.out.println("1 -> A R Rahman");
        System.out.println("2 -> Anirudh");
        System.out.println("3 -> Yuvan Shankar Raja");

        int director = sc.nextInt();

        switch (director) 
		{
            case 1:
                System.out.println("You selected A R Rahman");
                musicTypeMenu(sc, "A R Rahman");
                break;

            case 2:
                System.out.println("You selected Anirudh");
                musicTypeMenu(sc, "Anirudh");
                break;

            case 3:
                System.out.println("You selected Yuvan Shankar Raja");
                musicTypeMenu(sc, "Yuvan Shankar Raja");
                break;

            default:
                System.out.println("Invalid Music Director Selection");
        }
       }

    public static void musicTypeMenu(Scanner sc, String directorName) 
	{
        System.out.println("Select Music Type:");
        System.out.println("1 -> Melody");
        System.out.println("2 -> Folk");

        int type = sc.nextInt();

        if (type == 1) 
		{
            System.out.println("Melody Songs:");
            System.out.println("1 -> Song A");
            System.out.println("2 -> Song B");

            int song = sc.nextInt();

            if (song == 1) 
			{
                System.out.println("Now Playing: Song A by " + directorName);
            } else if (song == 2) 
			{
                System.out.println("Now Playing: Song B by " + directorName);
            } else 
			{
                System.out.println("Invalid Song Selection");
            }

        } else if (type == 2) 
		{
            System.out.println("Folk Songs:");
            System.out.println("1 -> Song C");
            System.out.println("2 -> Song D");

            int song = sc.nextInt();

            if (song == 1) 
			{
                System.out.println("Now Playing: Song C by " + directorName);
            } else if (song == 2) 
			{
                System.out.println("Now Playing: Song D by " + directorName);
            } else 
			{
                System.out.println("Invalid Song Selection");
            }

        } 
		 else 
		{
            System.out.println("Invalid Music Type Selection");
        }
    }
}

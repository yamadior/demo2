//import java.util.*
import java.util.Scanner;
public class MonApplicationa7{
    public static void main(String arg[]){
	 System.out.println("demo boucle while");
     String prenom;
char reponse = 'o';
Scanner sc = new Scanner(System.in);
while (reponse =='o')
{	 
	System.out.println("donnez un prenom :");
	prenom = sc.nextLine();
	System.out.println("bonjour "+prenom+ ",comment vas-tu?");
	System.out.println("voulez-vous reesayer? (0/N)");
	reponse=sc.nextLine().charAt(0);
	}
	System.out.println("au revoir");
	
	
	
	
	}
}
 
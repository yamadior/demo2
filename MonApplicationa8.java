import java.util.Scanner;
public class MonApplicationa8{
    public static void main(String arg[]){
	 System.out.println("demo boucle do..while");
     String prenom = new String();
	char reponse = ' ';
	Scanner sc = new Scanner(System.in);
do{ 
 
	System.out.println("donnez un prenom :");
	prenom = sc.nextLine();
	System.out.println("bonjour "+prenom+ ",comment vas-tu?");
do{
	System.out.println("voulez-vous reesayer? (0/N)");
	reponse=sc.nextLine().charAt(0);
	}while(reponse != 'o' );
	}while(reponse == 'o');
	System.out.println("au revoir");
	
	
	
	
	}
}
 
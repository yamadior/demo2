public class MonApplicationb4{
    public static void main(String arg[]){
	 System.out.println("Bienvenue dans mon application de gestion ressources humaine");
	 String employe1= "Yves";
	 ServicePaye servicePaye;
	 servicePaye = new ServicePaye();
	int salaire1= servicePaye.calculerSalaire (employe1);
	System.out.println(employe1 +" a un salaire de " +salaire1);
	
	
	
	
	
	
	}
}
 
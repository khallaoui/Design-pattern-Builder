package ExempleMonteur;
import MonteurPizza.MonteurPizza;
import MonteurPizzaPiquante.MonteurPizzaPiquante;
import MonteurPizzaReine.MonteurPizzaReine;
import Pizza.Pizza;
import Serveur.Serveur;

public class ExempleMonteur {
	  public static void main(String[] args) {
		    Serveur serveur = new Serveur();
		    MonteurPizza monteurPizzaReine  = new MonteurPizzaReine();
		    MonteurPizza monteurPizzaPiquante = new MonteurPizzaPiquante();

		    serveur.setMonteurPizza(monteurPizzaReine);
		    serveur.construirePizza();

		    Pizza pizzas = serveur.getPizza();
		  }
		}
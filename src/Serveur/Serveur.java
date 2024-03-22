package Serveur;

import MonteurPizza.MonteurPizza;
import Pizza.Pizza;

public class Serveur {
	  private MonteurPizza monteurPizza;

	  public void setMonteurPizza(MonteurPizza mp) { monteurPizza = mp; }
	  public Pizza getPizza() { return monteurPizza.getPizza(); }

	  public void construirePizza() {
	    monteurPizza.creerNouvellePizza();
	    monteurPizza.monterPate();
	    monteurPizza.monterSauce();
	    monteurPizza.monterGarniture();
	  }
	}
package MonteurPizzaPiquante;

import MonteurPizza.MonteurPizza;

public class MonteurPizzaPiquante extends MonteurPizza {
	  public void monterPate()      { pizza.setPate("feuilletée"); }
	  public void monterSauce()     { pizza.setSauce("piquante"); }
	  public void monterGarniture() { pizza.setGarniture("pepperoni+salami"); }
	}
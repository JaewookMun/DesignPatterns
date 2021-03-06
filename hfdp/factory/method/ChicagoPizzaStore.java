package hfdp.factory.method;

import hfdp.factory.basic.Pizza;
import hfdp.factory.method.pizza.ChicagoStyleCheesePizza;
import hfdp.factory.method.pizza.ChicagoStyleClamPizza;
import hfdp.factory.method.pizza.ChicagoStylePepperoniPizza;
import hfdp.factory.method.pizza.ChicagoStyleVeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {
	// 어느순간부터 Pizza 객체의 자료형이 꼬임...
	@Override
	Pizza createPizza(String type) {
		Pizza pizza=null;
		
		if(type.equals("cheese")) {
			pizza=new ChicagoStyleCheesePizza();
		} else if (type.equals("pepperoni")) {
			pizza=new ChicagoStylePepperoniPizza();
		} else if (type.equals("clam")) {
			pizza=new ChicagoStyleClamPizza();
		} else if (type.equals("veggie")) {
			pizza=new ChicagoStyleVeggiePizza();
		}
		
		return pizza;
	}

}

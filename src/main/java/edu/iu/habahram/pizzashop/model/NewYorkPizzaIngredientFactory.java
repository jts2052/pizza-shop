package edu.iu.habahram.pizzashop.model;

public class NewYorkPizzaIngredientFactory implements PizzaIngredientFactory {

        public Dough createDough() {
            return new ThinCrustDough();
        }

        public Sauce createSauce() {
            return new MarinaraSauce();
        }

        public Cheese createCheese() {
            return new ReggianoCheese();
        }

        public Veggies[] createVeggies() {
            Veggies veggies[] = {new Mushroom(),
                                new RedPeppers(),
                                new Onion()};
            return veggies;
        }

        public Pepperoni createPepperoni() {
            return new SlicedPepperoni();
        }

        public Clams createClam() {
            return new FreshClams();
        }
}

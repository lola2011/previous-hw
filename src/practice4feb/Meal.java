package practice4feb;

import java.util.Arrays;

public class Meal {
    Dish[]dishes;

    public Dish[] getDishes() {
        return dishes;
    }

    public void setDishes(Dish[] dishes) {
        this.dishes = dishes;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Meal meal = (Meal) o;
        return Arrays.equals(dishes, meal.dishes);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(dishes);
    }

    public Meal(Dish[] dishes) {
        this.dishes = dishes;
    }
public void Meal(){

}
    @Override
    public String toString() {
        return "Meal{" +
                "dishes=" + Arrays.toString(dishes) +
                '}';
    }
}

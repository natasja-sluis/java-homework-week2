public class Ingredient {
    private double amount;
    private String unit;
    private String name;

//    Ik print nu voor ieder ingredient een double uit omdat ik een double nodig heb voor de hoeveelheid van de appels.
//    Maar dit wil ik natuurlijk niet voor alle ingredienten doen. Ik weet alleen even niet hoe ik de rest van de
//    ingredienten als een int moet instantieren en de appels als een double.

    public Ingredient(double amount, String unit, String name) {
        this.amount = amount;
        this.unit = unit;
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
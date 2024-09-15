public class ApplePieRecipe {
    Ingredient ongezoutenBoter = new Ingredient(200, "gram", "ongezouten roomboter");
    Ingredient witteBastardSuiker = new Ingredient(200, "gram", "witte bastard suiker");
    Ingredient zelfrijzendBakmeel = new Ingredient(400, "gram", "zelfrijzend bakmeel");
    Ingredient ei = new Ingredient(1, "stuk(s)", "ei");
    Ingredient vanilleSuiker = new Ingredient(8, "gram", "vanille suiker");
    Ingredient zout = new Ingredient(1, "snuf", "zout");
    Ingredient zoetZureAppel = new Ingredient(1.5, "kilo", "zoetzure appels");
    Ingredient kristalSuiker = new Ingredient(75, "gram", "kristal suiker");
    Ingredient kaneel = new Ingredient(2, "theelepels", "kaneel");
    Ingredient paneerMeel = new Ingredient(15, "gram", "paneermeel");

    public void heatOven() {
        System.out.println("1. Verwarm de oven van te voren op 170 graden Celsius (boven en onderwarmte)");
    }

    public void eggInstructions() {
        System.out.println("2. Klop het ei los en verdeel deze in twee delen. De ene helft is voor het deeg, het andere deel is voor het bestrijken van de appeltaart.");
    }

    public void mixIngredients() {
        System.out.println(
                "3. Meng de boter, bastard suiker, zelfrijzend bakmeel, een helft van het ei, vanille suiker en een snufje zout tot een stevig deeg en verdeel deze in 3 gelijke delen."
        );
    }

    public void peelApple() {
        System.out.println("4. Schil nu de appels en snij deze in plakjes. Vermeng in een kopje de suiker en kaneel.");
    }

    public void grease() {
        System.out.println("5. Vet de springvorm in en bestrooi deze met bloem");
    }

    public void makeBottom() {
        System.out.println("6. Gebruik een deel van het deeg om de bodem van de vorm te bedekken. Gebruik een deel van het deeg om de rand van de springvorm te bekleden. Strooi het paneermeel op de bodem van de beklede vorm. De paneermeel neemt het vocht van de appels op.");
    }

    public void makeStuffing() {
        System.out.println("7. Doe de heft van de appels in de vorm en strooi hier 1/3 van het kaneel-suiker mengsel overheen. Meng de ander helft van de appels met het overgebleven kaneel-suiker mengsel en leg deze in de vorm.");
    }

    public void rollDough() {
        System.out.println("8. Rol het laatste deel van de deeg uit tot een dunne lap en snij stroken van ongeveer 1 cm breed.");
    }

    public void finishPie() {
        System.out.println("9. Leg de stroken kuislings op de appeltaart. Met wat extra deegstroken werk je de rand rondom af. Gebruik het overgebleven ei om de bovenkant van het deeg te bestrijken");
    }

    public void bakePie() {
        System.out.println("10. Zet de taart iets onder het midden van de oven. Bak de taart in 60 minuten op 170 graden Celsius (boven en onderwarmte) gaar en goudbruin.");
    }

    public void printInstructions() {
        heatOven();
        eggInstructions();
        mixIngredients();
        peelApple();
        grease();
        makeBottom();
        makeStuffing();
        rollDough();
        finishPie();
        bakePie();
    }

    public void printIngredients() {
        System.out.println(ongezoutenBoter.getAmount() + " " + ongezoutenBoter.getUnit() + " " + ongezoutenBoter.getName());
        System.out.println(witteBastardSuiker.getAmount() + " " + witteBastardSuiker.getUnit() + " " + witteBastardSuiker.getName() );
        System.out.println(zelfrijzendBakmeel.getAmount() + " " + zelfrijzendBakmeel.getUnit() + " " + zelfrijzendBakmeel.getName() );
        System.out.println(ei.getAmount() + " " + ei.getUnit() + " " + ei.getName() );
        System.out.println(vanilleSuiker.getAmount() + " " + vanilleSuiker.getUnit() + " " + vanilleSuiker.getName() );
        System.out.println(zout.getAmount() + " " + zout.getUnit() + " " + zout.getName() );
        System.out.println(zoetZureAppel.getAmount() + " " + zoetZureAppel.getUnit() + " " + zoetZureAppel.getName() );
        System.out.println(kristalSuiker.getAmount() + " " + kristalSuiker.getUnit() + " " + kristalSuiker.getName() );
        System.out.println(kaneel.getAmount() + " " + kaneel.getUnit() + " " + kaneel.getName() );
        System.out.println(paneerMeel.getAmount() + " " + paneerMeel.getUnit() + " " + paneerMeel.getName() );
    }
}


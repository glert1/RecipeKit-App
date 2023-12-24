import java.util.ArrayList;

public class sys {
    ArrayList<String> tips = new ArrayList<>();
    ArrayList<String> funfacts = new ArrayList<>();
    Button b = new Button();
   public  Recipe recipe = new Recipe();
   void welcome(){
        System.out.println("Welcome to RecipeKit App!");
        System.out.println("Here is what you can do with The RecipeKit App.Please select the operation you want to do \n" +
                "\n" +
                "1: Find a recipe\n" +
                "2: Add a recipe\n" +
                "3: Get tips and fun facts");
        System.out.println("*********************");
        System.out.println();
        actions(1);
        actions(2);
        actions(3);
    }
    public void actions(int option) {

        if (option == 1 || option == 2 || option == 3) {
            switch (option) {
                case 1 -> {
                    System.out.println("*********************");
                    System.out.println("User selected option 1");
                    System.out.println("*********************");
                    System.out.println();
                    System.out.println("Please choose category.");
                    Recipe recipe = new Recipe();
                    recipe.chooseCategory();
                    recipe.selectRecipe("random");
                    recipe.selectRecipe("choose myself");




                }
                case 2 -> {
                    System.out.println("*********************");
                    System.out.println("User selected option 2");
                    System.out.println("*********************");
                    System.out.println();
                    System.out.println("Please choose a category.");
                    SystemRecipes newRecipe = new SystemRecipes();
                    recipe.iterateCategories();
                    System.out.println("Please enter the name of the recipe");
                    System.out.println("✓");
                    newRecipe.setName("Spicy Beef Tacos");
                    System.out.println("Please enter the ingredients of the recipe");
                    System.out.println("✓");
                    newRecipe.setIngredients("1 lb (450g) ground beef\n" +
                            "1 onion, finely chopped\n" +
                            "2 cloves garlic, minced\n" +
                            "1 packet taco seasoning\n" +
                            "1/2 cup water\n" +
                            "8 small flour or corn tortillas\n" +
                            "Shredded lettuce\n" +
                            "Diced tomatoes\n" +
                            "Shredded cheddar cheese\n" +
                            "Sour cream\n" +
                            "Salsa\n" +
                            "Fresh cilantro for garnish (optional)");

                    System.out.println("Please enter the process of the recipe");
                    newRecipe.setProcess("In a skillet over medium heat, brown the ground beef. \n" +
                            "\n Add chopped onions and garlic, sauté until onions are translucent.\n" +
                            "\n Drain any excess fat, then add taco seasoning and water\n" +
                            "\n Simmer for 5 minutes or until the mixture thickens.\n" +
                            "\n Heat the tortillas according to the package instructions.\n" +
                            "\n Spoon the spicy beef mixture onto each tortilla.\n" +
                            "\n Top with shredded lettuce, diced tomatoes, cheddar cheese, sour cream, and salsa.\n" +
                            "\n Garnish with fresh cilantro if desired.");
                    System.out.println("✓");
                    System.out.println("NAME OF THE RECIPE : " + newRecipe.getName().toUpperCase());
                    System.out.println();
                    System.out.println("INGREDIENTS OF THE RECIPE : " + newRecipe.getIngredients());
                    System.out.println();
                    System.out.println("PROCESS OF THE RECIPE : " + newRecipe.getProcess());
                    System.out.println();
                    System.out.println("Are you sure that you want to add the recipe to the RecipeKit");
                    b.addButton(newRecipe.getName() , newRecipe.getIngredients() , newRecipe.getProcess());
                    b.deleteButton(newRecipe);
                    //b.exitButton();
                }
                case 3 -> {
                    System.out.println("*********************");
                    System.out.println("User selected option 3");
                    System.out.println("*********************");
                    System.out.println();
                    System.out.println("Please choose button.");
                    b.tipButton();
                    b.funfactButton();
                    b.exitButton();

                }

            }
        } else {
            System.out.println(" Please choose invalid option (one of the following options )" +
                    "\n** 1: Find a recipe ******************** 2: Add a recipe ******************** 3: Get tips and fun facts ");

        }

    }
    void createTips(){
        tips.add("** To prevent butter from over-browning in your pan, add a little bit of lemon juice.");
        tips.add("** No luck finding shallots? Replace with a combination of onions and garlic.");
        tips.add("** After handling garlic, rub your fingers on stainless steel, like your sink, to get rid of the odor.");
        tips.add("** When poaching an egg, add a teaspoon of white vinegar to simmering water to help keep the yolk from breaking.");
        tips.add("** Substitute half a lemon and half an orange as a replacement for a Meyer lemon.");
        tips.add("** Save old, stale bread to make breadcrumbs in a food processor; you can freeze them for up to 6 months.");
        tips.add("** For crispy fries or chips: slice the potato, then remove the starch by soaking in water for one hour before baking.");
        tips.add("** Mushrooms should be kept dry, as they can easily soak and store water.");
        tips.add("** Honey stuck in a jam? Place the container in hot water for about 5 minutes to loosen up the sticky residue.");
        tips.add("** If you need to grate soft cheeses, freeze the cheese for 30 minutes for a cleaner slice.");
        tips.add("** For easy clean-up, line baking sheets with parchment paper.");
    }
    void createFunFacts(){
        funfacts.add("* Humans have been cooking for millions of years.\n" +
                "** If you feel uncomfortable in the kitchen, you’re not alone. But remember that humans have been cooking for a very long time, we’re talking since about 2 million years ago. And the earliest oven dates back to 29,000 B.C. So take a step back and be confident! ");
        funfacts.add("* Cooking leads to more mindful eating.\n" +
                "** According to studies, people eat more mindful portions when they make home-cooked meals. While there’s so much in life we cannot control, cooking puts you in control of every ingredient you use and the portions you eat.  ");
        funfacts.add("* It’s a proven stress-relieving practice.\n" +
                "** Studies show that baking and cooking helps relieve stress. In fact, it’s often suggested as an activity to help with anxiety and depression. Experts say the soothing act of cooking helps boost confidence and keeps thoughts focused to ultimately avoid negative self-talk. ");
        funfacts.add("* Bananas are berries (but strawberries aren’t).\n" +
                "** This is a fun fact that reminds us there’s always so much more to learn about the foods we eat every day. Just when we think we know it all, we learn something new. ");
        funfacts.add("* Salt is a universal flavor enhancer. \n" +
                "** Adding salt is a flavor enhancer shown to improve the “sensory properties'' of essentially every food. So if you want to cut down on your salt intake, it’s recommended to dial it back slowly in your cooking practices while also skipping processed food, cutting back on condiments, and dialing up peppers to substitute for flavor.  ");
        funfacts.add("* Fun fact: if you need to cool down your drink, don’t stir. \n" +
                "** Blowing in your hot drink (or lifting it with your spoon) is more efficient to cool it down compared to stirring. Why? Stirring adds kinetic energy to the drink, which increases its temperature. So if you’re trying our Masala Chai or a soup dish, keep this tip in mind! ");
        funfacts.add("* Cooking is a form of altruism.\n" +
                "** Research has shown that altruistic cooking and sharing food has a strong, bonding role in many cultures. Think of times of celebration, crisis, connection, and entertaining. Is food often at the center of those experiences? We thought so! Cooking is a way to give back to others just as much as it’s a way to give love to ourselves. ");
        funfacts.add("* Your plates might make a difference in your taste. \n" +
                "** According to NPR, “In general, round, white plates tend to enhance sweet flavors in food, whereas black, angular plates tend to bring out more savory flavors… And serving food on a red plate tends to reduce the amount diners eat.” Now you know! ");

    }
    public ArrayList<String> getFunfacts() {
       createFunFacts();
       return funfacts;
    }

    public ArrayList<String> getTips() {
       createTips();
        return tips;
    }



}

import java.util.ArrayList;

public class Button {
    Recipe recipe = new Recipe();
    String x;


    void button(String option){
        if(option.equals("YES")){
            System.out.println("User selected Yes button");
            yesButton();
            System.out.println("****************");
            System.out.println();
        }else{
            System.out.println("User Selected No button");
            System.out.println();
            noButton();
            System.out.println();
            System.out.println("****************");
        }

    }
    void yesButton(){
        display();
    }
    void display(){
        System.out.println("****************");
        recipe.getChosenCategory();
        if(recipe.getCategory().equals("CHICKEN_RECIPES")){
            if(getX().equals("Lemon Garlic Roast Chicken")){
                displayR1();
            }else if(getX().equals("Honey Mustard Baked Chicken")){
                displayR2();
            }else if(getX().equals("Chicken Alfredo Pasta")){
                displayR11();
            }else{
                displayR12();
            }
        }else if(recipe.getCategory().equals("FISH_RECIPES")){
            if(getX().equals("Grilled Salmon With Lemon And Dill")){
                displayR3();
            }else if(getX().equals("Baked Cod With Herb Butter")){
                displayR4();
            }else if(getX().equals("Garlic Butter Shrimp Scampi")){
                displayR13();
            }else{
                displayR14();
            }
        }else if(recipe.getCategory().equals("MEAT_RECIPES")){
            if(getX().equals("Beef And Broccoli Stir-Fry")){
                displayR5();
            }else if(getX().equals("Classic Beef Lasagna")){
                displayR6();
            }else if(getX().equals("Slow Cooker Pulled Pork")){
                displayR15();
            }else{
                displayR16();
            }
        }else if(recipe.getCategory().equals("SOUP_RECIPES")){
            if(getX().equals("Chicken And Vegetable Soup")){
                displayR7();
            }else if(getX().equals("Tomato Basil Soup")){
                displayR8();
            }else if(getX().equals("Butternut Squash Soup")){
                displayR17();
            }else{
                displayR18();
            }
        }else{
            if(getX().equals("Strawberry SortCake")){
                displayR9();
            }else if(getX().equals("Chocolate Lava Cakes")){
                displayR10();
            }else if(getX().equals("Classic Chocolate Chip Cookies")){
                displayR19();
            }else{
                displayR20();
            }
        }

    }
    void noButton(){
        System.out.println("Regenerating a new recipe...");
        System.out.println();
        RandomRecipe(getX());
        display();


    }
     public void chooseYourselfButton(String name){
        if(name.equals("Lemon Garlic Roast Chicken")){
            displayR1();
        }else if(name.equals("Honey Mustard Baked Chicken")){
            displayR2();
        }else if(name.equals("Grilled Salmon With Lemon And Dill")){
            displayR3();
        }else if(name.equals("Baked Cod With Herb Butter")){
            displayR4();
        }else if(name.equals("Beef And Broccoli Stir-Fry")){
            displayR5();
        }else if(name.equals("Classic Beef Lasagna")){
            displayR6();
        }else if(name.equals("Chicken And Vegetable Soup")){
            displayR7();
        }else if(name.equals("Tomato Basil Soup")){
            displayR8();
        }else if(name.equals("Strawberry SortCake")){
            displayR9();
        }else{
            displayR10();

        }

     }
    public static String RandomButton(ArrayList<String> names) {
        int randomindex = (int)(Math.random() * names.size());
        String name = names.get(randomindex);
        System.out.println(name);
        return name;

    }
    public  String RandomRecipe(String category){
        recipe.getChosenCategory();
        if(recipe.getCategory().equals("CHICKEN_RECIPES")){
            x =  RandomButton(recipe.chicken);
        }else if(recipe.getCategory().equals("FISH_RECIPES")){
            x =  RandomButton(recipe.fish);
        }else if(recipe.getCategory().equals("MEAT_RECIPES")){
            x = RandomButton(recipe.meat);
        }else if(recipe.getCategory().equals("SOUP_RECIPES")){
            x =  RandomButton(recipe.soup);
        }else{
            x = RandomButton(recipe.desert);
        }
        return x;

    }
    public String getX() {
        return x;
    }
    public void displayR1(){
        System.out.println("RECIPE NAME : " + recipe.recipe1.getName().toUpperCase());
        System.out.println();
        System.out.println("INGREDIENTS : " +  recipe.recipe1.getIngredients());
        System.out.println();
        System.out.println("PROCESS OF RECIPE : " + recipe.recipe1.getProcess());
        System.out.println();
    }
    public void displayR2(){
        System.out.println("RECIPE NAME : " + recipe.recipe2.getName().toUpperCase());
        System.out.println();
        System.out.println("INGREDIENTS : " +  recipe.recipe2.getIngredients());
        System.out.println();
        System.out.println("PROCESS OF RECIPE : " + recipe.recipe2.getProcess());
        System.out.println();
    }
    public void displayR3(){
        System.out.println("RECIPE NAME : " + recipe.recipe3.getName().toUpperCase());
        System.out.println();
        System.out.println("INGREDIENTS : " +  recipe.recipe3.getIngredients());
        System.out.println();
        System.out.println("PROCESS OF RECIPE : " + recipe.recipe3.getProcess());
        System.out.println();
    }
    public void displayR4(){
        System.out.println("RECIPE NAME : " + recipe.recipe4.getName().toUpperCase());
        System.out.println();
        System.out.println("INGREDIENTS : " +  recipe.recipe4.getIngredients());
        System.out.println();
        System.out.println("PROCESS OF RECIPE : " + recipe.recipe4.getProcess());
        System.out.println();
    }
    public void displayR5(){
        System.out.println("RECIPE NAME : " + recipe.recipe5.getName().toUpperCase());
        System.out.println();
        System.out.println("INGREDIENTS : " +  recipe.recipe5.getIngredients());
        System.out.println();
        System.out.println("PROCESS OF RECIPE : " + recipe.recipe5.getProcess());
        System.out.println();
    }
    public void displayR6(){
        System.out.println("RECIPE NAME : " + recipe.recipe6.getName().toUpperCase());
        System.out.println();
        System.out.println("INGREDIENTS : " +  recipe.recipe6.getIngredients());
        System.out.println();
        System.out.println("PROCESS OF RECIPE : " + recipe.recipe6.getProcess());
        System.out.println();
    }
    public void displayR7(){
        System.out.println("RECIPE NAME : " + recipe.recipe7.getName().toUpperCase());
        System.out.println();
        System.out.println("INGREDIENTS : " +  recipe.recipe7.getIngredients());
        System.out.println();
        System.out.println("PROCESS OF RECIPE : " + recipe.recipe7.getProcess());
        System.out.println();
    }
    public void displayR8(){
        System.out.println("RECIPE NAME : " + recipe.recipe8.getName().toUpperCase());
        System.out.println();
        System.out.println("INGREDIENTS : " +  recipe.recipe8.getIngredients());
        System.out.println();
        System.out.println("PROCESS OF RECIPE : " + recipe.recipe8.getProcess());
        System.out.println();
    }
    public void displayR9(){
        System.out.println("RECIPE NAME : " + recipe.recipe9.getName().toUpperCase());
        System.out.println();
        System.out.println("INGREDIENTS : " +  recipe.recipe9.getIngredients());
        System.out.println();
        System.out.println("PROCESS OF RECIPE : " + recipe.recipe9.getProcess());
        System.out.println();
    }
    public void displayR10(){
        System.out.println("RECIPE NAME : " + recipe.recipe10.getName().toUpperCase());
        System.out.println();
        System.out.println("INGREDIENTS : " +  recipe.recipe10.getIngredients());
        System.out.println();
        System.out.println("PROCESS OF RECIPE : " + recipe.recipe10.getProcess());
        System.out.println();
    }
    public void displayR11(){
        System.out.println("RECIPE NAME : " + recipe.recipe11.getName().toUpperCase());
        System.out.println();
        System.out.println("INGREDIENTS : " +  recipe.recipe11.getIngredients());
        System.out.println();
        System.out.println("PROCESS OF RECIPE : " + recipe.recipe11.getProcess());
        System.out.println();
    }
    public void displayR12(){
        System.out.println("RECIPE NAME : " + recipe.recipe12.getName().toUpperCase());
        System.out.println();
        System.out.println("INGREDIENTS : " +  recipe.recipe12.getIngredients());
        System.out.println();
        System.out.println("PROCESS OF RECIPE : " + recipe.recipe12.getProcess());
        System.out.println();
    }
    public void displayR13(){
        System.out.println("RECIPE NAME : " + recipe.recipe13.getName().toUpperCase());
        System.out.println();
        System.out.println("INGREDIENTS : " +  recipe.recipe13.getIngredients());
        System.out.println();
        System.out.println("PROCESS OF RECIPE : " + recipe.recipe13.getProcess());
        System.out.println();
    }
    public void displayR14(){
        System.out.println("RECIPE NAME : " + recipe.recipe14.getName().toUpperCase());
        System.out.println();
        System.out.println("INGREDIENTS : " +  recipe.recipe14.getIngredients());
        System.out.println();
        System.out.println("PROCESS OF RECIPE : " + recipe.recipe14.getProcess());
        System.out.println();
    }
    public void displayR15(){
        System.out.println("RECIPE NAME : " + recipe.recipe15.getName().toUpperCase());
        System.out.println();
        System.out.println("INGREDIENTS : " +  recipe.recipe15.getIngredients());
        System.out.println();
        System.out.println("PROCESS OF RECIPE : " + recipe.recipe15.getProcess());
        System.out.println();
    }
    public void displayR16(){
        System.out.println("RECIPE NAME : " + recipe.recipe16.getName().toUpperCase());
        System.out.println();
        System.out.println("INGREDIENTS : " +  recipe.recipe16.getIngredients());
        System.out.println();
        System.out.println("PROCESS OF RECIPE : " + recipe.recipe16.getProcess());
        System.out.println();
    }
    public void displayR17(){
        System.out.println("RECIPE NAME : " + recipe.recipe17.getName().toUpperCase());
        System.out.println();
        System.out.println("INGREDIENTS : " +  recipe.recipe17.getIngredients());
        System.out.println();
        System.out.println("PROCESS OF RECIPE : " + recipe.recipe17.getProcess());
        System.out.println();
    }
    public void displayR18(){
        System.out.println("RECIPE NAME : " + recipe.recipe18.getName().toUpperCase());
        System.out.println();
        System.out.println("INGREDIENTS : " +  recipe.recipe18.getIngredients());
        System.out.println();
        System.out.println("PROCESS OF RECIPE : " + recipe.recipe18.getProcess());
        System.out.println();
    }
    public void displayR19(){
        System.out.println("RECIPE NAME : " + recipe.recipe19.getName().toUpperCase());
        System.out.println();
        System.out.println("INGREDIENTS : " +  recipe.recipe19.getIngredients());
        System.out.println();
        System.out.println("PROCESS OF RECIPE : " + recipe.recipe19.getProcess());
        System.out.println();
    }
    public void displayR20(){
        System.out.println("RECIPE NAME : " + recipe.recipe20.getName().toUpperCase());
        System.out.println();
        System.out.println("INGREDIENTS : " +  recipe.recipe20.getIngredients());
        System.out.println();
        System.out.println("PROCESS OF RECIPE : " + recipe.recipe20.getProcess());
        System.out.println();
    }
    void exitButton(){
        System.exit(1);
    }
    void addButton(String name , String Ingredients ,String Process){
        System.out.println();
        System.out.println("User Confirmed Recipe");
        SystemRecipes newrec = new SystemRecipes();
        newrec.setName(name);
        newrec.setIngredients(Ingredients);
        newrec.setProcess(Process);
        recipe.names.add(newrec.getName());
        System.out.println("Recipe added to the RecipeKit App ✓");
        System.out.println();
        System.out.println("****************");

    }
    void deleteButton(SystemRecipes recipee){
        System.out.println();
        System.out.println("User Selected Delete The Recipe Button ");
        System.out.println();
        SystemRecipes.delete(recipee);
        System.out.println();
    }
    void tipButton(){
        System.out.println();
        System.out.println("User Selected Tips Button");
        System.out.println();
        sys s = new sys();
        RandomButton(s.getTips());
        System.out.println();
        System.out.println("**************************");

    }
    void funfactButton(){
        System.out.println();
        System.out.println("User Selected Fun Facts Button");
        System.out.println();
        sys s = new sys();
        RandomButton(s.getFunfacts());
        System.out.println();
        System.out.println("***************************");
    }
}

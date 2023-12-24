
import java.util.ArrayList;
import java.util.List;

public class Recipe {
    Categories categorie;
    ArrayList<SystemRecipes> recipes;
    SystemRecipes sr;
    public ArrayList<String> chicken;
    public ArrayList<String> fish;
    public ArrayList<String> meat;
    public ArrayList<String> soup;
    public ArrayList<String> desert;
    String Category;

    public ArrayList<String> names;
    public SystemRecipes recipe1 = new SystemRecipes();
    public SystemRecipes recipe2 = new SystemRecipes();
    public SystemRecipes recipe3 = new SystemRecipes();
    public SystemRecipes recipe4 = new SystemRecipes();
    public SystemRecipes recipe5 = new SystemRecipes();
    public SystemRecipes recipe6 = new SystemRecipes();
    public SystemRecipes recipe7 = new SystemRecipes();
    public SystemRecipes recipe8 = new SystemRecipes();
    public SystemRecipes recipe9 = new SystemRecipes();
    public SystemRecipes recipe10 = new SystemRecipes();
    public SystemRecipes recipe11 = new SystemRecipes();
    public SystemRecipes recipe12 = new SystemRecipes();
    public SystemRecipes recipe13 = new SystemRecipes();
    public SystemRecipes recipe14 = new SystemRecipes();
    public SystemRecipes recipe15 = new SystemRecipes();
    public SystemRecipes recipe16 = new SystemRecipes();
    public SystemRecipes recipe17 = new SystemRecipes();
    public SystemRecipes recipe18 = new SystemRecipes();
    public SystemRecipes recipe19 = new SystemRecipes();
    public SystemRecipes recipe20 = new SystemRecipes();

    public Recipe() {
        recipes = new ArrayList<>();
        names = new ArrayList<>();
        sr = new SystemRecipes();
        chicken = new ArrayList<>();
        chicken.add("Lemon Garlic Roast Chicken");
        chicken.add("Honey Mustard Baked Chicken");
        chicken.add("Chicken Alfredo Pasta");
        chicken.add("Chicken Stir-Fry with Vegetables");
        fish = new ArrayList<>();
        fish.add("Grilled Salmon With Lemon And Dill");
        fish.add("Baked Cod With Herb Butter");
        fish.add("Garlic Butter Shrimp Scampi");
        fish.add("Baked Teriyaki Glazed Mahi-Mahi");
        meat = new ArrayList<>();
        meat.add("Beef And Broccoli Stir-Fry");
        meat.add("Classic Beef Lasagna");
        meat.add("Slow Cooker Pulled Pork");
        meat.add("Classic Beef Stew");
        soup = new ArrayList<>();
        soup.add("Chicken And Vegetable Soup");
        soup.add("Tomato Basil Soup");
        soup.add("Butternut Squash Soup");
        soup.add("Lentil Soup");
        desert = new ArrayList<>();
        desert.add("Strawberry SortCake");
        desert.add("Chocolate Lava Cakes");
        desert.add("Classic Chocolate Chip Cookies");
        desert.add("Homemade Apple Crisp");
        createRecipe();


    }
    public void revealSubCategories(String category) {
        switch (category) {
            case "CHICKEN_RECIPES":
                iterateCategory(chicken);
                break;
            case "FISH_RECIPES":
                iterateCategory(fish);
                break;
            case "MEAT_RECIPES":
                iterateCategory(meat);
                break;
            case "SOUP_RECIPES":
                iterateCategory(soup);
                break;
            case "DESSERT_RECIPES":
                iterateCategory(desert);
                break;
            default:
                System.out.println("Invalid category");
        }
    }
    private void iterateCategory(List<String> recipeList) {
        for (String recipe : recipeList) {
            System.out.println(recipe);
        }
    }
    public String getCategory() {
        return Category;
    }
    public void iterateCategories(){
        Categories[] categories = Categories.values();
        for(Categories categories1 : categories){
            System.out.println(categories1);
        }

        System.out.println("*********************");
        System.out.println();
        categorie = Categories. DESSERT_RECIPES;
        System.out.println("User selected category");
        System.out.println();
    }
    String chooseCategory() {
        iterateCategories();
        System.out.println();
        System.out.println("Here the " + categorie.toString());
        revealSubCategories(categorie.toString());
        System.out.println();
        Category = categorie.toString();
        return categorie.toString();
    }
    String getChosenCategory(){
        categorie = Categories. DESSERT_RECIPES;
        Category = categorie.toString();
        return categorie.toString();
    }
    void selectRecipe(String choose){
        Button b = new Button();
        createNameList(recipes);
        System.out.println();
        if(choose.equals("random")){
            System.out.println("Do you want to choose yourself or a random recipe?");
            System.out.println("User selected Random Recipe Button");
            System.out.println();
            b.RandomRecipe(getCategory());
            System.out.println();
            System.out.println("Do you want to cook this recipe");
            System.out.println();
            b.button("YES");
            b.button("NO");
            // b.exitButton();

        }else{
            System.out.println("User selected Choose Yourself Button");
            b.chooseYourselfButton("Classic Chocolate Chip Cookies");
            System.out.println();
            // b.exitButton();

        }


    }
    public void createRecipe(){
        recipe1.setName("Lemon Garlic Roast Chicken");
        recipe1.setIngredients("1 whole chicken (about 4-5 pounds)\n" +
                "1 lemon, cut into wedges\n" +
                "1 head of garlic, cloves separated and peeled\n" +
                "2 sprigs of fresh rosemary\n" +
                "4 tablespoons olive oil\n" +
                "Salt and pepper to taste\n" +
                "1 teaspoon paprika\n" +
                "1 teaspoon dried thyme\n" +
                "1 teaspoon dried oregano");
        recipe1.setProcess("Preheat the Oven: Preheat your oven to 425°F (220°C).\n" +
                "\n" +
                "Prepare the Chicken: Remove any giblets from the chicken cavity and pat the chicken dry with paper towels. Season the chicken inside and out with salt, pepper, paprika, dried thyme, and dried oregano.\n" +
                "\n" +
                "Stuff the Chicken: Place lemon wedges, garlic cloves, and rosemary sprigs inside the chicken cavity.\n" +
                "\n" +
                "Tie the Legs: If your chicken has a flap of skin near the cavity, tuck the wingtips under it. Tie the legs together with kitchen twine to help the chicken cook evenly.\n" +
                "\n" +
                "Rub with Olive Oil: Rub the entire chicken with olive oil, ensuring it's well-coated.\n" +
                "\n" +
                "Roast the Chicken: Place the chicken on a rack in a roasting pan, breast side up. Roast in the preheated oven for about 1 hour and 15 minutes or until the internal temperature reaches 165°F (74°C).\n" +
                "\n" +
                "Baste the Chicken: Every 20-30 minutes, baste the chicken with pan juices to keep it moist.\n" +
                "\n" +
                "Rest the Chicken: Once the chicken is cooked, remove it from the oven and let it rest for about 10-15 minutes before carving.\n" +
                "\n" +
                "Carve and Serve: Carve the chicken into desired portions and serve with the roasted lemon, garlic, and pan juices.");

        recipe2.setName("Honey Mustard Baked Chicken");
        recipe2.setIngredients("4 boneless, skinless chicken breasts\n" +
                "Salt and pepper to taste\n" +
                "1/3 cup Dijon mustard\n" +
                "1/4 cup honey\n" +
                "2 tablespoons whole grain mustard\n" +
                "2 teaspoons minced garlic\n" +
                "1 teaspoon dried thyme\n" +
                "1 teaspoon paprika\n" +
                "1 tablespoon olive oil\n" +
                "Fresh parsley for garnish (optional)");
        recipe2.setProcess("Preheat the Oven: Preheat your oven to 375°F (190°C).\n" +
                "\n" +
                "Prepare the Chicken: Season the chicken breasts with salt and pepper and place them in a baking dish.\n" +
                "\n" +
                "Make the Honey Mustard Sauce: In a bowl, whisk together Dijon mustard, honey, whole grain mustard, minced garlic, dried thyme, and paprika until well combined.\n" +
                "\n" +
                "Coat the Chicken: Pour half of the honey mustard sauce over the chicken breasts, ensuring they are well-coated. Reserve the remaining sauce for later.\n" +
                "\n" +
                "Bake the Chicken: Bake in the preheated oven for about 25-30 minutes or until the chicken is cooked through, and the internal temperature reaches 165°F (74°C).\n" +
                "\n" +
                "Baste with Sauce: During the last 10 minutes of baking, baste the chicken with the remaining honey mustard sauce.\n" +
                "\n" +
                "Broil (Optional): If you want a golden brown finish, you can broil the chicken for an additional 2-3 minutes after baking.\n" +
                "\n" +
                "Garnish and Serve: Remove the chicken from the oven, garnish with fresh parsley if desired, and serve hot. You can drizzle any remaining sauce from the baking dish over the chicken before serving.");

        recipe3.setName("Grilled Salmon with Lemon and Dill");
        recipe3.setIngredients("4 salmon fillets\n" +
                "Salt and pepper to taste\n" +
                "2 tablespoons olive oil\n" +
                "2 tablespoons fresh lemon juice\n" +
                "1 teaspoon lemon zest\n" +
                "2 cloves garlic, minced\n" +
                "1 tablespoon fresh dill, chopped\n" +
                "Lemon wedges for serving");
        recipe3.setProcess("Preheat your grill to medium-high heat.\n" +
                "\n" +
                "Season the salmon fillets with salt and pepper.\n" +
                "\n" +
                "In a small bowl, whisk together olive oil, lemon juice, lemon zest, minced garlic, and chopped dill.\n" +
                "\n" +
                "Brush the salmon fillets with the lemon and dill mixture.\n" +
                "\n" +
                "Place the salmon on the grill and cook for about 4-5 minutes per side, or until the salmon is cooked through and flakes easily.\n" +
                "\n" +
                "Serve the grilled salmon with additional lemon wedges.");

        recipe4.setName("Baked Cod with Herb Butter");
        recipe4.setIngredients("4 cod fillets\n" +
                "Salt and pepper to taste\n" +
                "4 tablespoons unsalted butter, melted\n" +
                "2 tablespoons fresh parsley, chopped\n" +
                "1 tablespoon fresh chives, chopped\n" +
                "1 teaspoon fresh thyme leaves\n" +
                "1 lemon, sliced");
        recipe4.setProcess("Preheat your oven to 400°F (200°C).\n" +
                "\n" +
                "Season the cod fillets with salt and pepper and place them in a baking dish.\n" +
                "\n" +
                "In a small bowl, mix together melted butter, chopped parsley, chives, and thyme.\n" +
                "\n" +
                "Pour the herb butter mixture over the cod fillets.\n" +
                "\n" +
                "Place lemon slices on top of each fillet.\n" +
                "\n" +
                "Bake in the preheated oven for about 15-20 minutes or until the fish is opaque and flakes easily.\n" +
                "\n" +
                "Serve the baked cod with the herb butter and lemon slices");

        recipe5.setName("Beef and Broccoli Stir-Fry");
        recipe5.setIngredients("1 lb (450g) flank steak, thinly sliced\n" +
                "1/4 cup soy sauce\n" +
                "2 tablespoons oyster sauce\n" +
                "1 tablespoon hoisin sauce\n" +
                "1 tablespoon cornstarch\n" +
                "2 tablespoons vegetable oil\n" +
                "3 cups broccoli florets\n" +
                "2 cloves garlic, minced\n" +
                "1 teaspoon fresh ginger, grated\n" +
                "Cooked rice for serving\n" +
                "Sesame seeds for garnish (optional)");
        recipe5.setProcess("In a bowl, combine sliced beef with soy sauce, oyster sauce, hoisin sauce, and cornstarch. Let it marinate for at least 15 minutes.\n" +
                "\n" +
                "Heat vegetable oil in a wok or large skillet over high heat.\n" +
                "\n" +
                "Add marinated beef and stir-fry for 2-3 minutes or until browned. Remove beef from the pan and set aside.\n" +
                "\n" +
                "In the same pan, add a bit more oil if needed. Stir-fry broccoli until crisp-tender.\n" +
                "\n" +
                "Add minced garlic and grated ginger to the broccoli, stir for 1 minute.\n" +
                "\n" +
                "Return the cooked beef to the pan, toss everything together until heated through.\n" +
                "\n" +
                "Serve over cooked rice and garnish with sesame seeds if desired.\n");

        recipe6.setName("Classic Beef Lasagna");
        recipe6.setIngredients("1 lb (450g) ground beef\n" +
                "1 onion, finely chopped\n" +
                "3 cloves garlic, minced\n" +
                "1 can (28 oz) crushed tomatoes\n" +
                "2 cans (6 oz each) tomato paste\n" +
                "1/2 cup water\n" +
                "2 teaspoons dried basil\n" +
                "2 teaspoons dried oregano\n" +
                "Salt and pepper to taste\n" +
                "9 lasagna noodles, cooked according to package instructions\n" +
                "3 cups shredded mozzarella cheese\n" +
                "1 1/2 cups ricotta cheese\n" +
                "1/2 cup grated Parmesan cheese\n" +
                "Fresh parsley for garnish (optional)");
        recipe6.setProcess("In a large skillet, brown the ground beef over medium heat. Add chopped onions and garlic, sauté until softened.\n" +
                "\n" +
                "Stir in crushed tomatoes, tomato paste, water, basil, oregano, salt, and pepper. Simmer for about 15-20 minutes.\n" +
                "\n" +
                "Preheat the oven to 375°F (190°C).\n" +
                "\n" +
                "In a 9x13-inch baking dish, layer cooked lasagna noodles, meat sauce, mozzarella cheese, and ricotta cheese. Repeat the layers, finishing with a layer of meat sauce on top.\n" +
                "\n" +
                "Sprinkle grated Parmesan cheese over the top layer.\n" +
                "\n" +
                "Cover the dish with foil and bake for 25 minutes. Remove the foil and bake for an additional 10 minutes or until bubbly and golden.\n" +
                "\n" +
                "Let it rest for a few minutes before serving. Garnish with fresh parsley if desired.");

        recipe7.setName("Chicken and Vegetable Soup");
        recipe7.setIngredients("1 lb (450g) boneless, skinless chicken breasts, cooked and shredded\n" +
                "1 tablespoon olive oil\n" +
                "1 onion, diced\n" +
                "2 carrots, sliced\n" +
                "2 celery stalks, sliced\n" +
                "3 cloves garlic, minced\n" +
                "6 cups chicken broth\n" +
                "1 cup frozen peas\n" +
                "1 cup corn kernels\n" +
                "1 teaspoon dried thyme\n" +
                "Salt and pepper to taste\n" +
                "Fresh parsley for garnish");
        recipe7.setProcess("In a large pot, heat olive oil over medium heat. Add diced onions, sliced carrots, and sliced celery. Sauté until vegetables are softened.\n" +
                "\n" +
                "Add minced garlic and cook for an additional minute.\n" +
                "\n" +
                "Pour in chicken broth and bring the mixture to a boil.\n" +
                "\n" +
                "Reduce heat to simmer and add shredded chicken, frozen peas, corn, dried thyme, salt, and pepper. Simmer for 15-20 minutes.\n" +
                "\n" +
                "Adjust seasoning if needed and serve hot, garnished with fresh parsley.");

        recipe8.setName("Tomato Basil Soup");
        recipe8.setIngredients("2 tablespoons olive oil\n" +
                "1 onion, diced\n" +
                "2 cloves garlic, minced\n" +
                "2 cans (28 oz each) crushed tomatoes\n" +
                "4 cups vegetable broth\n" +
                "1/2 cup fresh basil leaves, chopped\n" +
                "1 teaspoon dried oregano\n" +
                "Salt and pepper to taste\n" +
                "1/2 cup heavy cream (optional)\n" +
                "Grated Parmesan cheese for garnish (optional)\n" +
                "Croutons for serving");
        recipe8.setProcess("In a large pot, heat olive oil over medium heat. Add diced onions and sauté until softened.\n" +
                "\n" +
                "Add minced garlic and cook for an additional minute.\n" +
                "\n" +
                "Pour in crushed tomatoes, vegetable broth, chopped basil, dried oregano, salt, and pepper. Bring to a boil, then reduce heat and simmer for 20-25 minutes.\n" +
                "\n" +
                "Use an immersion blender to blend the soup until smooth. Alternatively, transfer the soup to a blender in batches.\n" +
                "\n" +
                "If using, stir in the heavy cream and heat through.\n" +
                "\n" +
                "Serve hot, garnished with grated Parmesan cheese and croutons.");

        recipe9.setName("Strawberry Shortcake");
        recipe9.setIngredients("1 pound fresh strawberries, hulled and sliced\n" +
                "1/4 cup granulated sugar\n" +
                "2 cups all-purpose flour\n" +
                "1/4 cup granulated sugar\n" +
                "1 tablespoon baking powder\n" +
                "1/2 teaspoon salt\n" +
                "1/2 cup unsalted butter, cold and cut into small pieces\n" +
                "1 cup heavy cream\n" +
                "Whipped cream for serving");
        recipe9.setProcess("In a bowl, combine the sliced strawberries with 1/4 cup of sugar. Allow them to macerate for at least 30 minutes.\n" +
                "Preheat your oven to 425°F (220°C).\n" +
                "In a large bowl, whisk together the flour, sugar, baking powder, and salt.\n" +
                "Cut in the cold butter until the mixture resembles coarse crumbs.\n" +
                "Stir in the heavy cream until the dough comes together.\n" +
                "Turn the dough out onto a floured surface and pat it into a 1-inch thick round. Use a round cutter to cut out shortcakes.\n" +
                "Place the shortcakes on a baking sheet and bake for 12-15 minutes or until golden brown.\n" +
                "Once cooled, split the shortcakes, spoon strawberries over the bottom halves, top with whipped cream, and cover with the other halves.");

        recipe10.setName("Chocolate Lava Cakes");
        recipe10.setIngredients("1/2 cup unsalted butter\n" +
                "4 ounces semi-sweet chocolate\n" +
                "1 cup powdered sugar\n" +
                "2 large eggs\n" +
                "2 egg yolks\n" +
                "1 teaspoon vanilla extract\n" +
                "6 tablespoons all-purpose flour\n" +
                "Pinch of salt");
        recipe10.setProcess("Preheat your oven to 425°F (220°C). Grease and flour four ramekins.\n" +
                "In a heatproof bowl, melt the butter and chocolate together. Stir until smooth.\n" +
                "Stir in the powdered sugar until well combined.\n" +
                "Add the eggs and egg yolks one at a time, mixing well after each addition. Stir in the vanilla extract.\n" +
                "Gently fold in the flour and salt until just combined.\n" +
                "Divide the batter evenly among the prepared ramekins.\n" +
                "Bake for 12-14 minutes or until the edges are set but the center is still soft.\n" +
                "Allow the cakes to cool for a few minutes before inverting onto plates. Serve warm with a dusting of powdered sugar or a scoop of vanilla ice cream.");
        recipe11.setName("Chicken Alfredo Pasta");
        recipe11.setIngredients("2 boneless, skinless chicken breasts\n" +
                "Salt and pepper to taste\n" +
                "1 tablespoon olive oil\n" +
                "8 oz (225g) fettuccine pasta\n" +
                "2 tablespoons butter\n" +
                "2 cloves garlic, minced\n" +
                "1 cup heavy cream\n" +
                "1 cup grated Parmesan cheese\n" +
                "Fresh parsley, chopped (for garnish)");
        recipe11.setProcess("Season the chicken breasts with salt and pepper.\n" +
                "Heat olive oil in a skillet over medium-high heat. Cook the chicken breasts for about 6-7 minutes per side, or until cooked through. Remove from skillet and set aside.\n" +
                "Cook the fettuccine pasta according to package instructions. Drain and set aside.\n" +
                "In the same skillet, melt the butter over medium heat. Add minced garlic and sauté for about a minute.\n" +
                "Pour in the heavy cream and let it simmer for 2-3 minutes.\n" +
                "Stir in the grated Parmesan cheese until the sauce thickens.\n" +
                "Slice the cooked chicken breasts into strips and add them to the sauce.\n" +
                "Add the cooked fettuccine to the skillet, tossing until the pasta is coated with the sauce.\n" +
                "Serve the chicken Alfredo pasta hot, garnished with chopped fresh parsley.");
        recipe12.setName("Chicken Stir-Fry with Vegetables");
        recipe12.setIngredients("2 boneless, skinless chicken breasts, thinly sliced\n" +
                "2 tablespoons soy sauce\n" +
                "1 tablespoon sesame oil\n" +
                "2 cloves garlic, minced\n" +
                "1 tablespoon ginger, minced\n" +
                "2 cups broccoli florets\n" +
                "1 bell pepper, thinly sliced\n" +
                "1 carrot, julienned\n" +
                "1 cup snow peas\n" +
                "2 tablespoons vegetable oil (for stir-frying)\n" +
                "Cooked rice or noodles (optional, for serving)");
        recipe12.setProcess("In a bowl, marinate the sliced chicken breasts with soy sauce and sesame oil. Set aside for 10-15 minutes.\n" +
                "Heat vegetable oil in a wok or large skillet over high heat.\n" +
                "Add minced garlic and ginger, stir-fry for about 30 seconds.\n" +
                "Add the marinated chicken slices and stir-fry until they are cooked through. Remove from the wok and set aside.\n" +
                "In the same wok, add a bit more oil if needed and stir-fry the broccoli, bell pepper, carrot, and snow peas for 3-4 minutes or until they are tender yet crisp.\n" +
                "Return the cooked chicken to the wok and toss everything together for another minute.\n" +
                "Serve the chicken stir-fry with vegetables over cooked rice or noodles if desired.");
        recipe13.setName("Garlic Butter Shrimp Scampi");
        recipe13.setIngredients("1 pound large shrimp, peeled and deveined\n" +
                "4 tablespoons unsalted butter\n" +
                "4 cloves garlic, minced\n" +
                "1/4 cup white wine (optional)\n" +
                "Juice of 1 lemon\n" +
                "2 tablespoons fresh parsley, chopped\n" +
                "Salt and pepper to taste\n" +
                "Cooked pasta or crusty bread (for serving)");
        recipe13.setProcess("Heat a large skillet over medium heat and melt the butter.\n" +
                "Add minced garlic to the skillet and cook for about a minute until fragrant.\n" +
                "Increase heat to medium-high and add the shrimp to the skillet, cooking for 2-3 minutes per side until they turn pink and opaque.\n" +
                "If using, pour in the white wine and let it simmer for a minute.\n" +
                "Squeeze lemon juice over the shrimp, add chopped parsley, salt, and pepper. Stir to combine.\n" +
                "Serve the garlic butter shrimp scampi over cooked pasta or with crusty bread to soak up the delicious sauce.");
        recipe14.setName("Baked Teriyaki Glazed Mahi-Mahi");
        recipe14.setIngredients("4 mahi-mahi fillets\n" +
                "1/2 cup teriyaki sauce\n" +
                "2 tablespoons honey\n" +
                "1 tablespoon soy sauce\n" +
                "1 tablespoon rice vinegar\n" +
                "1 teaspoon sesame seeds (optional)\n" +
                "Sliced green onions (for garnish)");
        recipe14.setProcess("Preheat your oven to 375°F (190°C) and lightly grease a baking dish.\n" +
                "In a bowl, mix together the teriyaki sauce, honey, soy sauce, and rice vinegar to create the glaze.\n" +
                "Place the mahi-mahi fillets in the prepared baking dish.\n" +
                "Brush the fillets generously with the teriyaki glaze, coating them evenly.\n" +
                "Bake in the preheated oven for 15-20 minutes, or until the fish is cooked through and flakes easily with a fork.\n" +
                "Optionally, sprinkle sesame seeds over the fish during the last few minutes of baking.\n" +
                "Garnish with sliced green onions before serving.");
        recipe15.setName("Slow Cooker Pulled Pork");
        recipe15.setIngredients("3-4 pounds pork shoulder or butt\n" +
                "1 onion, sliced\n" +
                "4 cloves garlic, minced\n" +
                "1 cup chicken or beef broth\n" +
                "1/4 cup apple cider vinegar\n" +
                "1/4 cup brown sugar\n" +
                "1 tablespoon smoked paprika\n" +
                "1 teaspoon garlic powder\n" +
                "1 teaspoon onion powder\n" +
                "1 teaspoon ground cumin\n" +
                "Salt and pepper to taste\n" +
                "Barbecue sauce (optional, for serving)\n" +
                "Hamburger buns or rolls (for serving)");
        recipe15.setProcess("Place the sliced onions and minced garlic in the bottom of the slow cooker.\n" +
                "In a bowl, mix together the chicken or beef broth, apple cider vinegar, brown sugar, smoked paprika, garlic powder, onion powder, ground cumin, salt, and pepper.\n" +
                "Rub the pork shoulder with this spice mixture and place it in the slow cooker on top of the onions and garlic.\n" +
                "Cover and cook on low for 8-10 hours or on high for 4-6 hours until the pork is tender and easily shreds with a fork.\n" +
                "Once cooked, remove the pork from the slow cooker and shred it using two forks.\n" +
                "Optionally, mix the shredded pork with your favorite barbecue sauce.\n" +
                "Serve the pulled pork on hamburger buns or rolls, topped with extra barbecue sauce if desired.");
        recipe16.setName("Classic Beef Stew");
        recipe16.setIngredients("2 pounds stewing beef, cut into cubes\n" +
                "2 tablespoons olive oil\n" +
                "1 onion, chopped\n" +
                "3 cloves garlic, minced\n" +
                "4 carrots, peeled and sliced\n" +
                "4 celery stalks, sliced\n" +
                "3 potatoes, peeled and diced\n" +
                "4 cups beef broth\n" +
                "1 cup red wine (optional)\n" +
                "2 tablespoons tomato paste\n" +
                "1 teaspoon Worcestershire sauce\n" +
                "2 bay leaves\n" +
                "1 teaspoon dried thyme\n" +
                "Salt and pepper to taste\n" +
                "Chopped fresh parsley (for garnish)");
        recipe16.setProcess("Heat olive oil in a large pot or Dutch oven over medium-high heat.\n" +
                "Add the cubed beef to the pot and brown it on all sides. Remove the beef and set it aside.\n" +
                "In the same pot, add chopped onions and minced garlic. Sauté until onions are translucent.\n" +
                "Add carrots, celery, and potatoes to the pot, cooking for a few minutes until slightly softened.\n" +
                "Pour in the beef broth and red wine (if using), scraping the bottom of the pot to deglaze and incorporate the flavors.\n" +
                "Stir in the tomato paste, Worcestershire sauce, bay leaves, dried thyme, salt, and pepper.\n" +
                "Return the browned beef to the pot and bring the stew to a boil. Once boiling, reduce heat to low, cover, and simmer for 1.5 to 2 hours, or until the beef is tender.\n" +
                "Remove the bay leaves before serving.\n" +
                "Garnish with chopped fresh parsley and serve the beef stew hot.");
        recipe17.setName("Butternut Squash Soup");
        recipe17.setIngredients("1 medium butternut squash, peeled, seeded, and diced\n" +
                "1 onion, chopped\n" +
                "2 carrots, peeled and chopped\n" +
                "2 cloves garlic, minced\n" +
                "4 cups vegetable or chicken broth\n" +
                "1 teaspoon ground cumin\n" +
                "1/2 teaspoon ground cinnamon\n" +
                "1/4 teaspoon ground nutmeg\n" +
                "Salt and pepper to taste\n" +
                "2 tablespoons olive oil\n" +
                "1/4 cup heavy cream (optional)\n" +
                "Toasted pumpkin seeds (pepitas) and chopped fresh parsley (for garnish)");
        recipe17.setProcess("In a large pot, heat olive oil over medium heat.\n" +
                "Add chopped onions and minced garlic, cooking until onions are translucent.\n" +
                "Add diced butternut squash and carrots to the pot. Sauté for a few minutes.\n" +
                "Pour in the vegetable or chicken broth, cumin, cinnamon, nutmeg, salt, and pepper. Bring to a boil, then reduce heat to a simmer.\n" +
                "Let the soup simmer for 20-25 minutes or until the vegetables are tender.\n" +
                "Using an immersion blender or transferring in batches to a blender, puree the soup until smooth.\n" +
                "If using heavy cream, stir it into the soup until well combined.\n" +
                "Taste and adjust seasoning if needed.\n" +
                "Serve the butternut squash soup hot, garnished with toasted pumpkin seeds and chopped fresh parsley.");
        recipe18.setName("Lentil Soup");
        recipe18.setIngredients("1 cup dried lentils, rinsed and drained\n" +
                "2 tablespoons olive oil\n" +
                "1 onion, chopped\n" +
                "2 carrots, diced\n" +
                "2 celery stalks, diced\n" +
                "3 cloves garlic, minced\n" +
                "6 cups vegetable or chicken broth\n" +
                "1 can (14 oz) diced tomatoes\n" +
                "1 teaspoon ground cumin\n" +
                "1 teaspoon smoked paprika\n" +
                "Salt and pepper to taste\n" +
                "Fresh lemon juice (optional, for serving)\n" +
                "Fresh cilantro or parsley, chopped (for garnish)\n");
        recipe18.setProcess("In a large pot, heat olive oil over medium heat.\n" +
                "Add chopped onions, diced carrots, diced celery, and minced garlic. Sauté until vegetables are tender.\n" +
                "Add rinsed lentils, vegetable or chicken broth, diced tomatoes (with their juices), ground cumin, smoked paprika, salt, and pepper. Bring to a boil.\n" +
                "Reduce heat to a simmer and let the soup cook for about 25-30 minutes, or until the lentils are tender.\n" +
                "Taste and adjust seasoning if needed.\n" +
                "Serve the lentil soup hot, with a squeeze of fresh lemon juice if desired, and garnish with chopped fresh cilantro or parsley.");
        recipe19.setName("Classic Chocolate Chip Cookies");
        recipe19.setIngredients("1 cup unsalted butter, softened\n" +
                "1 cup granulated sugar\n" +
                "1 cup packed brown sugar\n" +
                "2 large eggs\n" +
                "1 teaspoon vanilla extract\n" +
                "3 cups all-purpose flour\n" +
                "1 teaspoon baking soda\n" +
                "1/2 teaspoon salt\n" +
                "2 cups semisweet chocolate chips");
        recipe19.setProcess("Preheat your oven to 350°F (175°C). Line baking sheets with parchment paper.\n" +
                "In a large bowl, cream together the softened butter, granulated sugar, and brown sugar until smooth.\n" +
                "Beat in the eggs one at a time, then stir in the vanilla extract.\n" +
                "In a separate bowl, whisk together the flour, baking soda, and salt. Gradually add this dry mixture to the wet ingredients and mix until just combined.\n" +
                "Fold in the chocolate chips using a spatula or wooden spoon.\n" +
                "Drop rounded tablespoons of dough onto the prepared baking sheets, leaving some space between each cookie.\n" +
                "Bake for 10-12 minutes in the preheated oven, or until the edges are lightly golden.\n" +
                "Allow the cookies to cool on the baking sheet for a few minutes before transferring them to a wire rack to cool completely.");
        recipe20.setName("Homemade Apple Crisp");
        recipe20.setIngredients("6 cups apples, peeled, cored, and sliced (such as Granny Smith or Honeycrisp)\n" +
                "1 tablespoon lemon juice\n" +
                "1/2 cup granulated sugar\n" +
                "1 teaspoon ground cinnamon\n" +
                "1/2 teaspoon ground nutmeg\n" +
                "1 cup old-fashioned rolled oats\n" +
                "1/2 cup all-purpose flour\n" +
                "1/2 cup packed brown sugar\n" +
                "1/2 cup unsalted butter, cold and cut into small pieces\n" +
                "Vanilla ice cream (optional, for serving)");
        recipe20.setProcess("Preheat your oven to 350°F (175°C). Grease a baking dish.\n" +
                "In a large bowl, combine the sliced apples, lemon juice, granulated sugar, ground cinnamon, and ground nutmeg. Toss until the apples are evenly coated, then transfer to the prepared baking dish.\n" +
                "In another bowl, mix together the rolled oats, flour, and brown sugar. Add the cold butter pieces and use your fingers or a pastry cutter to incorporate the butter until the mixture resembles coarse crumbs.\n" +
                "Spread the oat mixture evenly over the apples in the baking dish.\n" +
                "Bake in the preheated oven for 40-45 minutes, or until the topping is golden brown and the apples are tender.\n" +
                "Allow the apple crisp to cool slightly before serving.\n" +
                "Serve warm, optionally topped with a scoop of vanilla ice cream.");
        recipes.add(recipe1);
        recipes.add(recipe2);
        recipes.add(recipe3);
        recipes.add(recipe4);
        recipes.add(recipe5);
        recipes.add(recipe6);
        recipes.add(recipe7);
        recipes.add(recipe8);
        recipes.add(recipe9);
        recipes.add(recipe10);
        recipes.add(recipe11);
        recipes.add(recipe12);
        recipes.add(recipe13);
        recipes.add(recipe14);
        recipes.add(recipe15);
        recipes.add(recipe16);
        recipes.add(recipe17);
        recipes.add(recipe18);
        recipes.add(recipe19);
        recipes.add(recipe20);
    }
    public void createNameList(ArrayList<SystemRecipes> recipes){
        for(SystemRecipes recipe : recipes){
            names.add(recipe.getName());
        }
    }
}

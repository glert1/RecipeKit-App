public class SystemRecipes {
    String name;
    String ingredients;
    String process;
    public static void delete(SystemRecipes r){
            r.setName(null);
            r.setIngredients(null);
            r.setProcess(null);
            System.out.println("Recipe deleted successfully ✓");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getProcess() {
        return process;
    }

    public void setProcess(String process) {
        this.process = process;
    }
}

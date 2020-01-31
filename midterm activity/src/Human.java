package Human;
public class Human {
    private String skin_color = "Brown";
    private String eye_color = "Brown";
    private String gender = "Male";
    private int height = 170; 
    private int weight = 56;
    private int age = 20;
    private String race = "Asian";
    private String name = "Mario";
    
    public static void main(String[] args) {
        
        Human a = new Human ();
        Children b = new Children();
        
        System.out.println(a.skin_color);
        System.out.println(a.eye_color);
        System.out.println(a.gender);
        System.out.println(a.height);
        System.out.println(a.weight);
        System.out.println(a.age);
        System.out.println(a.race);
        System.out.println(a.name);
        System.out.println(b.intellegience_rating);
        System.out.println(b.mood_rating);
        System.out.println(b.genetic_disease[1]);
        System.out.println(b.wealth_rating);
    }
    
}

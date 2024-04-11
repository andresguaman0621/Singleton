
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Si observas el mismo valor, Singleton se ha reusado (CORRECTO)" + "\n" +
                "Si ves diferentes valores, entonces 2 Singleton fueron creados (INCORRECTO)" + "\n\n" +
                "RESULTADO:" + "\n");
        Singleton singleton = Singleton.getInstance("RIGHT");
        Singleton anotherSingleton = Singleton.getInstance("SAD");
        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);
    }
}

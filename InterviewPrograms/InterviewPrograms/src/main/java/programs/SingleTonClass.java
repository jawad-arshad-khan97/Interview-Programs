package programs;

public class SingleTonClass {
    static class Singleton {

        // Static variable single_instance of type Singleton
        private static Singleton single_instance = null;

        // Declaring a variable of type String
        public String s;
        public int a;


        // Constructor of this class
        // Here private constructor is used to
        // restricted to this class itself
        private Singleton()
        {
            s = "Hello I am a string part of Singleton class";
            a=a+1;
        }

        // Method
        // Static method to create instance of Singleton class
        public static Singleton Singleton()
        {
            // To ensure only one instance is created
            if (single_instance == null) {
                single_instance = new Singleton();
            }
            return single_instance;
        }
    }


    public static void main(String args[]){
        Singleton a1 = new Singleton();
        System.out.println(a1.a);
        System.out.println(a1.a);
        System.out.println(a1.a);
        Singleton a2 = new Singleton();
        System.out.println(a2.a);




    }
}

package sec11;

public class ExceptionHandingExample {
    static void main() {
        try{
            Class.forName("java.lang.String");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }

        System.out.println();


        try {
            Class.forName("java.lang.String2")
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}

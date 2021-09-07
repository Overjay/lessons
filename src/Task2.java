import java.io.PrintWriter;

public class Task2 {
    public static void main(String[] args) {
        int a=5,b=8;

        System.out.println("Сумма a и b = "+(a+b));
        System.out.println("Разность a и b = "+(a-b));
        System.out.println("Умножение a и b = "+a*b);
        System.out.println("Деление b на а = "+b/a);
        System.out.println("Остаток от деления b на а = "+b%a);
        if(a%2>0){
            System.out.println("a - нечетное число");
        }else{
            System.out.println("a - четное число");
        }
        if(b%2>0){
            System.out.println("b - нечетное число");
        }else{
            System.out.println("b - четное число");
        }


        PrintWriter printWriter = new PrintWriter(System.out, true);
        String aa = "\\u263x";
        printWriter.println("aa = " + aa);
    }
}

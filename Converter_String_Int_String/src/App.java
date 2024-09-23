public class App {
    public static void main(String[] args) throws Exception {
        int X = 34;
        String Numero = "" + X;
        int Num1 = Numero.charAt(0) - 48;
        int Num2 = Numero.charAt(1) - 48;
        System.out.println("Resultado_1:" + (Num1 + Num2));

        Num1 = Integer.parseInt("" + Numero.charAt(0));
        Num2 = Integer.parseInt("" + Numero.charAt(1));
        System.out.println("Resultado_2:" + (Num1 + Num2));
    }

}

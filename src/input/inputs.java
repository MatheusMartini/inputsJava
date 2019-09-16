package input;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class inputs {
    Scanner tc = new Scanner(System.in);

    //classes que retornam "String msg" passam mensagens por parametro
    public int showInt(String msg){
        System.out.println(msg);
        return tc.nextInt();
    }
    public char showChar(String msg){
        System.out.println(msg);
        return tc.next().charAt(0);
    }
    public float showFloat(String msg){
        System.out.println(msg);
        return tc.nextFloat();
    }
    public double showDouble(String msg){
        System.out.println(msg);
        return tc.nextDouble();
    }
    public String showString(String msg){
        System.out.println(msg);
        return tc.next();
    }

    //le inteiro
    public int lerInt(){
        System.out.println("Digite um inteiro ");
        return tc.nextInt();
    }

    //le um caracter
    public char lerChar(){
        System.out.println("Digite um char ");
        return tc.next().charAt(0);
    }

    //le um float
    public float lerFloat(){
        System.out.println("Digite um float ");
        return tc.nextFloat();
    }

    //le um double
    public double lerDouble(){
        System.out.println("Digite um double ");
        return tc.nextDouble();
    }

    //le uma string
    public String lerString(){
        System.out.println("Digite uma String ");
        return tc.next();
    }

    //classe para validar email
    public String lerEmail(){
        String email;
        boolean validar;

        System.out.println("Digite seu email");
        email = tc.next();
        validar = email.matches(".*@.*");

        if (validar == true){
            return email;
        }else
            return null;
    }

    //classe para validar telefone
    public String lerTel(){
        String tel;
        boolean validar;
        String val = "\\d\\d-\\d\\d\\d\\d\\d\\d\\d\\d\\d";

        System.out.println("Digite seu Telefone (xx-xxxxxxxx)");
        tel = tc.next();
        validar = tel.matches(val);

        if (validar == true){
            return tel;
        }else
            System.out.println("falta algum numero");
            return null;
    }

    //classe para ler data ou retornal null
    public String lerData(){
        String data;
        boolean validar;
        String date = "\\d\\d/\\d\\d/\\d\\d\\d\\d";

        System.out.println("Digite uma data (dd/mm/aaaa)");
        data = tc.next();
        validar = data.matches(date);
        if (validar == true){
            return data;
        }else
            System.out.println("data errada");
        return null;

    }

    //classe para trocar data
    public String trocarData() {
        Scanner tc = new Scanner(System.in);
        String data1;
        System.out.println("Digite uma data:dd/MM/yyyy");
        data1 = tc.next();

        LocalDate data = LocalDate.parse(data1, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        data1 = data.format(DateTimeFormatter.ofPattern("MM/dd/yyyy"));
        return data1;
    }

    //classe para validar numero
    public static int validaNumero() {
        boolean valida = true;
        int numero = 0;
        Scanner tc = new Scanner(System.in);
        do {
            System.out.println("Digite um valor numérico: ");
            try {
                numero = Integer.parseInt(tc.nextLine());
                return (numero);
            } catch (NumberFormatException e) {
                System.out.println("Por favor, digite apenas números!");
                valida = false;
            }
        } while (valida != true);
        return (numero);
    }

}

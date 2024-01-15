import java.util.*;

public class trycatch1 {
    public static void verificarIdade(short idade){
        if (idade >= 18){
            System.out.println("Acesso garantido.");
        } else {
            throw new ArithmeticException("Idade não permitida.");
        }
    }
    public static void main(String[] args){
        boolean deuRuim = false;
    try{
        Scanner scnInput = new Scanner(System.in);
        System.out.println("Digite sua idade.");
        short idadeDigitada = scnInput.nextShort();
        verificarIdade(idadeDigitada);
        scnInput.close();
    }catch (Exception e) {
        deuRuim = true;
        Scanner scnSair = new Scanner(System.in);
        System.err.println(e.getMessage() + " Aperte enter para continuar.");
        scnSair.nextLine();
        scnSair.close();
    } finally {
        if (deuRuim == true){
        System.out.println("Favor reiniciar o sistema.");
        } else{
            System.out.println("Zerou o jogo.");
        }
    }
    }

}
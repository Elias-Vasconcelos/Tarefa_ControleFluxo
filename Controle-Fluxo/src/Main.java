import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public int nota1 = 0;
    public int nota2 = 0;
    public int nota3 = 0;
    public int nota4 = 0;


    public int media = 0;

    public static void main(String[] args) {
        Main aluno = new Main();

        aluno.setNotas();
        aluno.calculaMedia();aluno.validaAprovacao();
    }

    public void setNotas() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a primeira nota do aluino ");
        this.nota1 = scan.nextInt();
        System.out.println("Digite a Segunda nota do aluino ");
        this.nota2 = scan.nextInt();
        System.out.println("Digite a Terceira nota do aluino ");
        this.nota3 = scan.nextInt();
        System.out.println("Digite a Quarta nota do aluino ");
        this.nota4 = scan.nextInt();
        System.out.println("-------------------------");
    }

    public void calculaMedia() {
        this.media = (this.nota1 + this.nota2 + this.nota3 + this.nota4) / 4;
        System.out.println("A media final do aluno foi: " + this.media );
        System.out.println("-------------------------");
    }

    public void validaAprovacao(){
        if( this.media >= 7 ){
            System.out.println( " Parabéns! voce foi aprovado" );
        }
        if( this.media < 7 && this.media >=5){
            System.out.println( "voce esta de recuperacao" );
        }
        if (this.media < 5){
            System.out.println( "voce esta Reprovado!" );
        }
        System.out.println("-------------------------");
    }
}
import java.util.Scanner;

public class Exercicioscomesemparametrosfuncoes {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Conversor de medidas de peso");
        System.out.println("1 Para converter de kilogramas para toneladas");
        System.out.println("2 Para converter de toneladas para kilogramas");

        int opcao = scanner.nextInt();

        if(opcao == 1) {
            System.out.println("Digite o peso em kilogramas: ");
             double kilogramas = scanner.nextDouble();
             double toneladas = converterKgparaT(kilogramas);
             System.out.println("O peso em toneladas é " + toneladas + " toneladas");
        }

        else if (opcao == 2) {
                System.out.println("Digite o peso em toneladas: ");
                 double toneladas = scanner.nextDouble();
                 double kilogramas = converterTparaKg(toneladas);
                 System.out.println("O peso em toneladas é " + kilogramas + " kilogramas");
            }

            else {
                System.out.println("Opção inválida!");
            }

            scanner.close();

        }

        
        
        public static double converterTparaKg(double toneladas) {
            return toneladas * 1000;
        }

        public static double converterKgparaT(double kilogramas) {
            return kilogramas / 1000;
        }



import java.util.Random;
import java.util.Scanner;


public class Main {

//PRECISA DE MUDANÇA, A QUANTIDADE TROCO RECURSIVA TA DANDO ERROR!!!
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int op = 1;
        while(op > 0 && op <= 11){

            System.out.println("--------------------------------");
            System.out.println("--------------------------------");
            System.out.println("1 - Fatorial");
            System.out.println("2 - Somatória");
            System.out.println("3 - Potencial");
            System.out.println("4 - Divisao");
            System.out.println("5 - Binario");
            System.out.println("6 - MenorDivisorComum");
            System.out.println("7 - Inversao");
            System.out.println("8 - Palindromo");
            System.out.println("9 - Sudoku Gerador");
            System.out.println("10 - Quantidade de Troco Iterativo");
            System.out.println("11 - Quantidade Troco Recursiva");
            System.out.println("--------------------------------");
            System.out.println("--------------------------------");
            System.out.println("Escolha o exercício a seguir: ");
            op = in.nextInt();
            if(op == 1){
                Fatorial();
            }if(op == 2){
                Somatoria();
            }if(op == 3){
                Potencia();
            }if(op == 4){
                Divisao();
            }if(op == 5){
                Binario();
            }if(op == 6){
                MenorDivisorComum();
            }if(op == 7){
                Inversao();
            }if(op == 8){
                Palindromo();
            }if(op == 9){
                SudokuGerador();
            }if(op == 10){
                QuantidadeTrocoIterativa();
            }if(op == 11){
                QuantidadeTrocoRecursiva();
            }
        }
    }

    public static void QuantidadeTrocoRecursiva() {
        System.out.println("\n \n \n Exercicio Troco: ");
        Double ValorRecebido = 0.0;
        Double ValorCompra = 0.0;
        Double ValorTroco = 0.0;
        Double Dinheiro[] = new Double[12];
        int DinheiroQuantidade[] = new int [12];
        for(int i = 0; i <= 11; i++){
            DinheiroQuantidade[i] = 0;
        }
        System.out.println("Informe o valor da compra:");
        ValorCompra = in.nextDouble();
        System.out.println("Informe o valor Fornecido pelo cliente:");
        ValorRecebido = in.nextDouble();

        ValorTroco = ValorRecebido - ValorCompra;

        if (ValorTroco == 0) {
            System.out.println("O valor está correto, não precisa de troco!!");
        } else if (ValorTroco >= 0.01) {
            System.out.println("Entrege ao cliente: " + RecursividadeTroco(ValorTroco,
                    DinheiroQuantidade, Dinheiro));
        }
    }

    private static String RecursividadeTroco(Double ValorTroco, int DinheiroQuantidade[],
                                             Double Dinheiro[]) {

        if(ValorTroco < 0.01){
            return "Notas de 2 Reais:" + DinheiroQuantidade[6]+ " \n " +
                    "Notas de 5 Reais:" + DinheiroQuantidade[7]+ " \n " +
                    "Notas de 10 Reais:" + DinheiroQuantidade[8]+ " \n " +
                    "Notas de 20 Reais:" + DinheiroQuantidade[9]+ " \n " +
                    "Notas de 50 Reais:" + DinheiroQuantidade[10]+ " \n " +
                    "Notas de 100 Reais:" + DinheiroQuantidade[11]+ " \n " +
                    "Moeda de 1 centavo:" + DinheiroQuantidade[0]+ " \n " +
                    "Moeda de 5 centavos:" + DinheiroQuantidade[1]+ " \n " +
                    "Moeda de 10 centavos:" + DinheiroQuantidade[2]+ " \n " +
                    "Moeda de 25 centavos:" + DinheiroQuantidade[3]+ " \n " +
                    "Moeda de 50 centavos:" + DinheiroQuantidade[4]+ " \n " +
                    "Moeda de 1 Real:" + DinheiroQuantidade[5];

       }else{
           if (ValorTroco >= 2) {
               if (ValorTroco >= 100.0) {
                   //Nota de 100 Reais
                   ValorTroco -= Dinheiro[11];
                   DinheiroQuantidade[11] = + 1;
               }
               if (ValorTroco >= 50.0 && ValorTroco < 100.0) {
                   //Nota de 50 Reais
                   ValorTroco -= Dinheiro[10];
                   DinheiroQuantidade[10]= + 1;

               }
               if (ValorTroco >= 20.0 && ValorTroco < 50.0) {
                   //Nota de 20 Reais
                   ValorTroco -= Dinheiro[9];
                   DinheiroQuantidade[9]= + 1;

               }
               if (ValorTroco >= 10.0 && ValorTroco < 20.0) {
                   //Nota de 10 Reais
                   ValorTroco -= Dinheiro[8];
                   DinheiroQuantidade[8]= + 1;

               }
               if (ValorTroco >= 5.0 && ValorTroco < 10.0) {
                   //Nota de 5 Reais
                   ValorTroco -= Dinheiro[8];
                   DinheiroQuantidade[7]= + 1;

               }
               if (ValorTroco >= 2 && ValorTroco < 5) {
                   //Nota de 2 Reais
                   ValorTroco -= Dinheiro[6];
                   DinheiroQuantidade[6]= + 1;
               }
               //Verifica quantas moedas usará
           } else if (ValorTroco < 2) {
               if (ValorTroco >= 1) {
                   //Moeda de 1 real
                   ValorTroco -= Dinheiro[5];
                   DinheiroQuantidade[5]= + 1;

               }
               if (ValorTroco >= 0.50 && ValorTroco < 1) {
                   //Moeda de 50 centavos
                   ValorTroco -= Dinheiro[4];
                   DinheiroQuantidade[4]= + 1;

               }
               if (ValorTroco >= 0.25 && ValorTroco < 0.50) {
                   //Moeda de 25 centavos
                   ValorTroco -= Dinheiro[3];
                   DinheiroQuantidade[3]= + 1;

               }
               if (ValorTroco >= 0.10 && ValorTroco < 0.25) {
                   //Moeda de 10 centavos
                   ValorTroco -= Dinheiro[2];
                   DinheiroQuantidade[2]= + 1;

               }
               if (ValorTroco >= 0.05 && ValorTroco < 0.10) {
                   //Moeda de 5 centavos
                   ValorTroco -= Dinheiro[1];
                   DinheiroQuantidade[1]= + 1;

               }
               if (ValorTroco >= 0.01 && ValorTroco < 0.05) {
                   //Moeda de 1 centavo
                   ValorTroco -= Dinheiro[0];
                   DinheiroQuantidade[0]= + 1;
               }
           }
            return RecursividadeTroco(ValorTroco, DinheiroQuantidade, Dinheiro);
       }
    }

    public static void QuantidadeTrocoIterativa() {
        System.out.println("\n \n \n Exercicio Troco: ");
        Double ValorRecebido;
        Double ValorCompra;
        Double ValorTroco;
        Double Dinheiro[] = new Double[12];
        int DinheiroQuantidade[] = new int [12];


        //DinheiroExistente
        Dinheiro[0] = 0.01;
        Dinheiro[1] = 0.05;
        Dinheiro[2] = 0.10;
        Dinheiro[3] = 0.25;
        Dinheiro[4] = 0.50;
        Dinheiro[5] = 1.0;
        Dinheiro[6] = 2.0;
        Dinheiro[7] = 5.0;
        Dinheiro[8] = 10.0;
        Dinheiro[9] = 20.0;
        Dinheiro[10] = 50.0;
        Dinheiro[11] = 100.0;


        System.out.println("Informe o valor da compra:");
        ValorCompra = in.nextDouble();
        System.out.println("Informe o valor Fornecido pelo cliente:");
        ValorRecebido = in.nextDouble();

        ValorTroco = ValorRecebido - ValorCompra;
        if (ValorTroco == 0) {
            System.out.println("O valor está correto, não precisa de troco!!");
        }else if (ValorTroco >= 0.01) {
            System.out.println("O valor a ser devolvido será de " + ValorTroco);

            //Verifica se ainda existe dinheiro para diminuir
            while (ValorTroco > 0.01) {
                //Verifica quantas notas usará

                if (ValorTroco >= 2) {
                    if (ValorTroco >= 100.0) {
                        //Nota de 100 Reais
                        ValorTroco -= Dinheiro[11];
                        DinheiroQuantidade[11] = + 1;
                    }
                    if (ValorTroco >= 50.0 && ValorTroco < 100.0) {
                        //Nota de 50 Reais
                        ValorTroco -= Dinheiro[10];
                        DinheiroQuantidade[10]= + 1;

                    }
                    if (ValorTroco >= 20.0 && ValorTroco < 50.0) {
                        //Nota de 20 Reais
                        ValorTroco -= Dinheiro[9];
                        DinheiroQuantidade[9]= + 1;

                    }
                    if (ValorTroco >= 10.0 && ValorTroco < 20.0) {
                        //Nota de 10 Reais
                        ValorTroco -= Dinheiro[8];
                        DinheiroQuantidade[8]= + 1;

                    }
                    if (ValorTroco >= 5.0 && ValorTroco < 10.0) {
                        //Nota de 5 Reais
                        ValorTroco -= Dinheiro[8];
                        DinheiroQuantidade[7]= + 1;

                    }
                    if (ValorTroco >= 2 && ValorTroco < 5) {
                        //Nota de 2 Reais
                        ValorTroco -= Dinheiro[6];
                        DinheiroQuantidade[6]= + 1;
                    }
                    //Verifica quantas moedas usará
                } else if (ValorTroco < 2) {
                    if (ValorTroco >= 1) {
                        //Moeda de 1 real
                        ValorTroco -= Dinheiro[5];
                        DinheiroQuantidade[5]= + 1;

                    }
                    if (ValorTroco >= 0.50 && ValorTroco < 1) {
                        //Moeda de 50 centavos
                        ValorTroco -= Dinheiro[4];
                        DinheiroQuantidade[4]= + 1;

                    }
                    if (ValorTroco >= 0.25 && ValorTroco < 0.50) {
                        //Moeda de 25 centavos
                        ValorTroco -= Dinheiro[3];
                        DinheiroQuantidade[3]= + 1;

                    }
                    if (ValorTroco >= 0.10 && ValorTroco < 0.25) {
                        //Moeda de 10 centavos
                        ValorTroco -= Dinheiro[2];
                        DinheiroQuantidade[2]= + 1;

                    }
                    if (ValorTroco >= 0.05 && ValorTroco < 0.10) {
                        //Moeda de 5 centavos
                        ValorTroco -= Dinheiro[1];
                        DinheiroQuantidade[1]= + 1;

                    }
                    if (ValorTroco >= 0.01 && ValorTroco < 0.05) {
                        //Moeda de 1 centavo
                        ValorTroco -= Dinheiro[0];
                        DinheiroQuantidade[0]= + 1;
                    }
                }
            }
        }
        if (ValorTroco < 0) {
            System.out.println("Está faltando " + (ValorTroco - ValorTroco - ValorTroco) + " para validar a compra");
        }
        System.out.println("Entregue ao Cliente:");
        if (DinheiroQuantidade[6] != 0) {
            System.out.println("Notas de 2 Reais: " + DinheiroQuantidade[6]);
        }
        if (DinheiroQuantidade[7] != 0) {
            System.out.println("Notas de 5 Reais: " + DinheiroQuantidade[7]);
        }
        if (DinheiroQuantidade[8] != 0) {
            System.out.println("Notas de 10 Reais: " + DinheiroQuantidade[8]);
        }
        if (DinheiroQuantidade[9] != 0) {
            System.out.println("Notas de 20 Reais: " + DinheiroQuantidade[9]);
        }
        if (DinheiroQuantidade[10] != 0) {
            System.out.println("Notas de 50 Reais: " + DinheiroQuantidade[10]);
        }
        if (DinheiroQuantidade[11] != 0) {
            System.out.println("Notas de 100 Reais: " + DinheiroQuantidade[11]);
        }
        System.out.println("--------------------------------------");
        if (DinheiroQuantidade[0] != 0) {
            System.out.println("Moedas de 1 Centavo: " + DinheiroQuantidade[0]);
        }
        if (DinheiroQuantidade[1] != 0) {
            System.out.println("Moedas de 5 Centavo: " + DinheiroQuantidade[1]);
        }
        if (DinheiroQuantidade[2] != 0) {
            System.out.println("Moedas de 10 Centavo: " + DinheiroQuantidade[2]);
        }
        if (DinheiroQuantidade[3] != 0) {
            System.out.println("Moedas de 25 Centavo: " + DinheiroQuantidade[3]);
        }
        if (DinheiroQuantidade[4] != 0) {
            System.out.println("Moedas de 50 Centavo: " + DinheiroQuantidade[4]);
        }
        if (DinheiroQuantidade[5] != 0) {
            System.out.println("Moedas de 1 Real: " + DinheiroQuantidade[5]);
        }
    }
    public static void Fatorial(){
        System.out.println("Valor para realizar o Fatorial:");
        int valor = in.nextInt();
        System.out.println("O fatorial de "+valor+" é "+FatorialRecursivo(valor));
    }
    private static int FatorialRecursivo(int num){
        if(num == 1){
            return 1;
        }else{
            return num * FatorialRecursivo(num - 1);
        }
    }
    public static void Somatoria(){
        System.out.println("Escolha o valor para realizar a somatória:");
        int valor = in.nextInt();
        System.out.println("O valor da somatória de "+valor+" é "+SomatoriaRecursiva(valor));
    }
    private static int SomatoriaRecursiva(int num){
        if(num == 1){
            return 1;
        }else{
            return num + SomatoriaRecursiva(num - 1);
        }
    }
    public static void Potencia() {
        System.out.println("Informe um número inteiro:");
        int valor = in.nextInt();
        System.out.println("Informe uma potencia para esse valor:");
        int potencia = in.nextInt();
        System.out.println(Math.pow(valor, potencia));
        System.out.println("O valor da potencia será de "+PotenciaRecursiva(valor, potencia));
    }
    private static int PotenciaRecursiva(int valor, int potencia){
        if(potencia == 0){
            return 1;
        }else{
            return valor * PotenciaRecursiva(valor, potencia - 1);
        }
    }
    public static void Divisao(){
        System.out.println("Escreva o dividendo");
        int dividendo = in.nextInt();
        System.out.println("Escreva o divisor");
        int divisor = in.nextInt();
        System.out.println("A divisão recursiva de "+dividendo+" com "+divisor+"" +
                " será no valor de :"+DivisaoRecursiva(dividendo, divisor));
    }
    private static int DivisaoRecursiva(int dividendo, int divisor){
        if(dividendo < divisor){
            return 0;
        }else{
            return dividendo - DivisaoRecursiva(dividendo - divisor,divisor);
        }
    }
    public static void Binario(){
        System.out.println("Informe o valor que será convertido para Binário:");
        int decimal = in.nextInt();
        String binario = "";
        System.out.println("O valor "+decimal+" em binário é: "+BinarioRecursivo(decimal, binario));
    }
    private static String BinarioRecursivo(int decimal, String binario){
        if(decimal <= 0){
            return binario;
        }else{
            if(decimal%2==0){
                return BinarioRecursivo(decimal = decimal / 2, "0" + binario);
            }else{
                return BinarioRecursivo(decimal/=2, "1" + binario);
            }
        }
    }
    public static void MenorDivisorComum(){
        System.out.println("Informe o primeiro valor para decompor:");
        int valor1 = in.nextInt();
        System.out.println("Informe o segundo valor para decompor:");
        int valor2 = in.nextInt();
        System.out.println("O MDC dos valores "+valor1+" e "+valor2+" é "+MdcRecursivo(valor1, valor2));
    }
    private static int MdcRecursivo(int valor1, int valor2){
        if(valor1 % valor2 == 0){
            return 0;
        }else{
            return valor1 / MdcRecursivo(valor1/=valor2, valor2);
        }
    }
    public static void Inversao(){
        System.out.println("Informe a palavra para inverter");
        String palavra = in.next();
        System.out.println(InversaoRecursiva(palavra));
    }
    private static String InversaoRecursiva(String palavra){
        if(palavra.isEmpty() || "".equals(palavra)){
            return "";
        }
        else{
            int ultimaPosicao = palavra.length() - 1;
            return palavra.charAt(ultimaPosicao) + InversaoRecursiva(palavra.substring(0, ultimaPosicao));
        }
    }
    public static void Palindromo(){
        String palavra;
        System.out.println("Informe a palavra para verificar se é palíndromo:");
        palavra = in.nextLine();
        String invertido = PolindromoRecursivo(palavra);
        System.out.println("A palavra "+palavra+" invertida é "+invertido);
        if(palavra.equals(invertido)){
            System.out.println("a palavra É UM Palíndromo");
        }else{
            System.out.println("A palavra NÃO é Palíndromo");
        }
    }
    private static String PolindromoRecursivo(String palavra){
        if(palavra.equals("")){
            return "";
        }else{
            return palavra.charAt(palavra.length() - 1) + PolindromoRecursivo(palavra.substring(0, palavra.length() - 1));
        }
    }
    public static void SudokuGerador(){
        final int Elementos = 3;//aqui vai o numero de elementos do seu sudoku(3 vai ser um sudoku 3x3
        final int[][] CampoMatriz = new int[Elementos*Elementos][Elementos*Elementos];//matriz onde será armazenado o sudoku
        Random numeroAleatorio = new Random();
        int ValorAleatorio = numeroAleatorio.nextInt(9);
        System.out.println("Numero aleatorio gerado foi "+ValorAleatorio);
        //int ValorAleatorio = rand()%10;//semente aleatória para não gerar o mesmo sudoku
        for(int Linha = 0; Linha < Elementos; Linha++, ValorAleatorio++) {
            for (int j = 0; j < Elementos; j++, ValorAleatorio += Elementos) {
                for (int Coluna = 0; Coluna < Elementos * Elementos; Coluna++, ValorAleatorio++) {
                    CampoMatriz[Elementos * Linha + j][Coluna] = (ValorAleatorio % (Elementos * Elementos)) + 1;
                }
            }
        }

        //╣  ║  ╗  ╝   ╚   ╔   ╩ ╦  ╠  ═   ╬
        System.out.println("╔═════╦═════╦═════╦╦═════╦═════╦═════╦╦═════╦═════╦═════╗");
        for(int i = 0; i < 9; i++){

                System.out.println("║  "+CampoMatriz[i][0]+"  ║  "+CampoMatriz[i][1]+"  ║  "+CampoMatriz[i][2]+"  ║║  "+CampoMatriz[i][3]+
                        "  ║  "+CampoMatriz[i][4]+"  ║  "+CampoMatriz[i][5]+"  ║║  "+CampoMatriz[i][6]+"  ║  "
                        +CampoMatriz[i][7]+"  ║  "+CampoMatriz[i][8]+"  ║");
            System.out.println("╠═════╬═════╬═════╬╬═════╬═════╬═════╬╬═════╬═════╬═════╣");
        }
    }
}

import java.util.Random;
import java.util.Scanner;


public class Main {


    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        SudokuGerador();        //FEITO
        QuantidadeTroco();      //FEITO
        Fatorial();             //FEITO
        Somatoria();            //FEITO
        Potencia();             //FEITO
        Divisao();              //FEITO
        Binario();              //FEITO
        MenorDivisorComum();    //FEITO
        Inversao();            //FEITO
        Palindromo();          //FEITO

    }
    public static void QuantidadeTroco() {
        System.out.println("\n \n \n Exercicio Troco: ");
        Double ValorRecebido;
        Double ValorCompra;
        Double ValorTroco;
        Double Moeda[] = new Double[6];
        int MoedaQuantidade[] = new int[6];
        int NotaQuantidade[] = new int[6];
        Double Nota[] = new Double[6];
        //Moedas Existentes
        Moeda[0] = 0.01;
        Moeda[1] = 0.05;
        Moeda[2] = 0.10;
        Moeda[3] = 0.25;
        Moeda[4] = 0.50;
        Moeda[5] = 1.0;

        //Notas existentes
        Nota[0] = 2.0;
        Nota[1] = 5.0;
        Nota[2] = 10.0;
        Nota[3] = 20.0;
        Nota[4] = 50.0;
        Nota[5] = 100.0;

        System.out.println("Informe o valor da compra:");
        ValorCompra = in.nextDouble();
        System.out.println("Informe o valor Fornecido pelo cliente:");
        ValorRecebido = in.nextDouble();

        ValorTroco = ValorRecebido - ValorCompra;
        if (ValorTroco >= 0.01) {
            System.out.println("O valor a ser devolvido será de " + ValorTroco);

            if (ValorTroco == 0) {
                System.out.println("O valor está correto, não precisa de troco!!");
            }
            //Verifica se ainda existe dinheiro para diminuir
            while (ValorTroco > 0.01) {
                //Verifica quantas notas usará

                if (ValorTroco >= 2) {
                    if (ValorTroco >= 100.0) {
                        //Nota de 100 Reais
                        ValorTroco -= Nota[5];
                        NotaQuantidade[5]++;
                    }
                    if (ValorTroco >= 50.0 && ValorTroco < 100.0) {
                        //Nota de 50 Reais
                        ValorTroco -= Nota[4];
                        NotaQuantidade[4]++;

                    }
                    if (ValorTroco >= 20.0 && ValorTroco < 50.0) {
                        //Nota de 20 Reais
                        ValorTroco -= Nota[3];
                        NotaQuantidade[3]++;

                    }
                    if (ValorTroco >= 10.0 && ValorTroco < 20.0) {
                        //Nota de 10 Reais
                        ValorTroco -= Nota[2];
                        NotaQuantidade[2]++;

                    }
                    if (ValorTroco >= 5.0 && ValorTroco < 10.0) {
                        //Nota de 5 Reais
                        ValorTroco -= Nota[1];
                        NotaQuantidade[1]++;

                    }
                    if (ValorTroco >= 2 && ValorTroco < 5) {
                        //Nota de 2 Reais
                        ValorTroco -= Nota[0];
                        NotaQuantidade[0]++;
                    }
                    //Verifica quantas moedas usará
                } else if (ValorTroco < 2) {
                    if (ValorTroco >= 1) {
                        //Moeda de 1 real
                        ValorTroco -= Moeda[5];
                        MoedaQuantidade[5]++;

                    }
                    if (ValorTroco >= 0.50 && ValorTroco < 1) {
                        //Moeda de 50 centavos
                        ValorTroco -= Moeda[4];
                        MoedaQuantidade[4]++;

                    }
                    if (ValorTroco >= 0.25 && ValorTroco < 0.50) {
                        //Moeda de 25 centavos
                        ValorTroco -= Moeda[3];
                        MoedaQuantidade[3]++;

                    }
                    if (ValorTroco >= 0.10 && ValorTroco < 0.25) {
                        //Moeda de 10 centavos
                        ValorTroco -= Moeda[2];
                        MoedaQuantidade[2]++;

                    }
                    if (ValorTroco >= 0.05 && ValorTroco < 0.10) {
                        //Moeda de 5 centavos
                        ValorTroco -= Moeda[1];
                        MoedaQuantidade[1]++;

                    }
                    if (ValorTroco >= 0.01 && ValorTroco < 0.05) {
                        //Moeda de 1 centavo
                        ValorTroco -= Moeda[0];
                        MoedaQuantidade[0]++;

                    }
                }
            }
        }
        if (ValorTroco < 0) {
            System.out.println("Está faltando " + (ValorTroco - ValorTroco - ValorTroco) + " para validar a compra");
        }
        System.out.println("Entregue ao Cliente:");
        if (NotaQuantidade[0] != 0) {
            System.out.println("Notas de 2 Reais: " + NotaQuantidade[0]);
        }
        if (NotaQuantidade[1] != 0) {
            System.out.println("Notas de 5 Reais: " + NotaQuantidade[1]);
        }
        if (NotaQuantidade[2] != 0) {
            System.out.println("Notas de 10 Reais: " + NotaQuantidade[2]);
        }
        if (NotaQuantidade[3] != 0) {
            System.out.println("Notas de 20 Reais: " + NotaQuantidade[3]);
        }
        if (NotaQuantidade[4] != 0) {
            System.out.println("Notas de 50 Reais: " + NotaQuantidade[4]);
        }
        if (NotaQuantidade[5] != 0) {
            System.out.println("Notas de 100 Reais: " + NotaQuantidade[5]);
        }
        System.out.println("--------------------------------------");
        if (MoedaQuantidade[0] != 0) {
            System.out.println("Moedas de 1 Centavo: " + MoedaQuantidade[0]);
        }
        if (MoedaQuantidade[1] != 0) {
            System.out.println("Moedas de 5 Centavo: " + MoedaQuantidade[1]);
        }
        if (MoedaQuantidade[2] != 0) {
            System.out.println("Moedas de 10 Centavo: " + MoedaQuantidade[2]);
        }
        if (MoedaQuantidade[3] != 0) {
            System.out.println("Moedas de 25 Centavo: " + MoedaQuantidade[3]);
        }
        if (MoedaQuantidade[4] != 0) {
            System.out.println("Moedas de 50 Centavo: " + MoedaQuantidade[4]);
        }
        if (MoedaQuantidade[5] != 0) {
            System.out.println("Moedas de 1 Real: " + MoedaQuantidade[5]);
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
        final int n = 3;//aqui vai o numero de elementos do seu sudoku(3 vai ser um sudoku 3x3
        final int[][] field = new int[n*n][n*n];//matriz onde será armazenado o sudoku
        Random numeroAleatorio = new Random();
        int x = numeroAleatorio.nextInt(9);
        System.out.println("Numero aleatorio gerado foi "+x);
        //int x = rand()%10;//semente aleatória para não gerar o mesmo sudoku
        for(int i = 0; i < n; i++, x++) {
            for (int j = 0; j < n; j++, x += n) {
                for (int k = 0; k < n * n; k++, x++) {
                    field[n * i + j][k] = (x % (n * n)) + 1;
                }
            }
        }
        for(int i = 0; i < 9; i++){
            System.out.println("======================================");
                System.out.println("||"+field[i][0]+"||"+field[i][1]+"||"+field[i][2]+"||||"+field[i][3]+
                        "||"+field[i][4]+"||"+field[i][5]+"|||||"+field[i][6]+"||"
                        +field[i][7]+"||"+field[i][8]+"||");
        }
    }
}
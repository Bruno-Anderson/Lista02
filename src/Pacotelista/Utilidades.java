package Pacotelista;
import java.util.Arrays;
import java.util.Scanner;

public class Utilidades {

    // questao1
    public static float somatoriominus2(float vetor[]) {
        float soma = 0;
        for (int i = 2; i < vetor.length; i++) {
            soma += vetor[i];
        }
        return soma;
    }

    // questao2
    public static void numerospares(int numeroinicial, int numerofinal) {
        for (int i = numeroinicial; i <= numerofinal; i++) {
            if (i % 2 == 0)
                System.out.print(" " + i);
        }
    }

    // questao03
    public static double mediavetores(double vetor1[], double vetor2[]) {
        double somadosvetores = 0;
        for (int i = 0; i < vetor1.length; i++) {
            somadosvetores += vetor1[i] + vetor2[i];
        }
        double mediadosvetores = somadosvetores / (2 * vetor1.length);
        System.out.print(" media dos vetores " + mediadosvetores);
        return mediadosvetores;
    }

    // questao04
    public static double mediaponderada(double vetornotas[], double vetorpesos[]) {
        double somadosvetores = 0;
        double somadospesos = 0;
        for (int i = 0; i < vetornotas.length; i++) {
            somadosvetores += vetornotas[i] * vetorpesos[i];
            somadospesos += vetorpesos[i];
        }
        double mediaponderadadosvetores = somadosvetores / somadospesos;
        System.out.print(" media dos vetores " + mediaponderadadosvetores);
        return mediaponderadadosvetores;
    }

    // questao05
    public static void contagemdevetores(int vetorcont1[], int vetorcont2[], int elementodecontagem) {
        int contar = 0;
        for (int i = 0; i < vetorcont1.length; i++) {
            if (vetorcont1[i] == elementodecontagem) {
                contar++;
            }
            if (vetorcont2[i] == elementodecontagem) {
                contar++;
            }
        }
        System.out.print("  " + "(" + elementodecontagem + " -> " + contar +")" );
    }

    // Questao06
    public static void copiadovetor(int[] vetororiginal) {
        int[] vetorcopia = Arrays.copyOf(vetororiginal, vetororiginal.length);

        for (int meuvalor : vetorcopia) {
            System.out.print(" " + "  " + meuvalor);
        }
    }

    // questao07
    public static int[] ordenacaoCrescente(int[] vetor) {
        int n = vetor.length;
        boolean trocou;

        do {
            trocou = false;
            for (int i = 0; i < n - 1; i++) {
                if (vetor[i] > vetor[i + 1]) {
                    int temp = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = temp;
                    trocou = true;
                }
            }
        } while (trocou);

        return vetor;
    }

    // questao08
    public static boolean verificacaoOrdenacaoCrescente(int[] vetor) {
        for (int i = 0; i < vetor.length - 1; i++) {
            if (vetor[i] > vetor[i + 1]) {
                return false;
            }
        }
        return true;
    }

    // questao09
    public static int encontrarmeuKesimoMaior(int[] vetor, int k) {
        if (k < 1 || k > vetor.length) {
            throw new IllegalArgumentException("Valor de k fora do intervalo válido");
        }

        for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = 0; j < vetor.length - i - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
            
            if (i == k - 1) {
                return vetor[vetor.length - k];
            }
        }

        
        return vetor[vetor.length - k];
    }

    // Questao10
    public static int encontrarKesimoMenor(int[] vetor, int k) {
        if (k < 1 || k > vetor.length) {
            throw new IllegalArgumentException("Valor de k fora do intervalo válido");
        }

        for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = 0; j < vetor.length - i - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
            
            if (i == k - 1) {
                return vetor[i];
            }
        }

        
        return vetor[k - 1];
    }

    public static class VerificacaoIgualdadeVetores {

        public static boolean saoIguais(int[] vetor1, int[] vetor2) {
            if (vetor1.length != vetor2.length) {
                return false;
            }

            for (int i = 0; i < vetor1.length; i++) {
                if (vetor1[i] != vetor2[i]) {
                    return false;
                }
            }

            return true;
        }
//questao11
        public static void verificarIgualdade(int[] vetor1, int[] vetor2) {
            boolean saoIguais = saoIguais(vetor1, vetor2);

            if (saoIguais) {
                System.out.println("Os vetores sao iguais.");
            } else {
                System.out.println("Os vetores sao diferentes.");
            }
        }
    }
   
   
    //questao12
    
    public static double calcularPotencia(double base, int expoente) {
        if (expoente == 0) {
            return 1.0;
        } else if (expoente % 2 == 0) {
            double temp = calcularPotencia(base, expoente / 2);
            return temp * temp;
        } else {
            double temp = calcularPotencia(base, (expoente - 1) / 2);
            return base * temp * temp;
        }
    }

   //questao13
    
    public static boolean ehPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        
        if (numero <= 3) {
            return true;
        }

        if (numero % 2 == 0 || numero % 3 == 0) {
            return false;
        }

        int divisor = 5;
        while (divisor * divisor <= numero) {
            if (numero % divisor == 0 || numero % (divisor + 2) == 0) {
                return false;
            }
            divisor += 6;
        }

        return true;
    }

    
    //questao14
    
    public static int[] buscarOcorrenciasComuns(int[] vetorsinho1, int[] vetorsinho2) {
        int[] resultado = new int[Math.min(vetorsinho1.length, vetorsinho2.length)]; 
        int contador = 0; 
        
        for (int elemento1 : vetorsinho1) {
            for (int elemento2 : vetorsinho2) {
                if (elemento1 == elemento2) {
                    resultado[contador] = elemento1;
                    contador++;
                    break; 
                }
            }
        }

        
        int[] resultadoFinal = new int[contador];
        for (int i = 0; i < contador; i++) {
            resultadoFinal[i] = resultado[i];
        }

        return resultadoFinal;
    }
    
    
    //questao15
    
    public static int[] removerElemento(int[] vetor, int elemento) {
        int[] novoVetor = new int[vetor.length];
        int novoTamanho = 0; // Variável para controlar o tamanho do novo vetor

        // Percorre o vetor original
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] != elemento) {
                novoVetor[novoTamanho] = vetor[i];
                novoTamanho++;
            }
        }

        // Cria um novo vetor com o tamanho correto
        int[] vetorResultado = new int[novoTamanho];
        for (int i = 0; i < novoTamanho; i++) {
            vetorResultado[i] = novoVetor[i];
        }

        return vetorResultado;
    }
    
    //questao16
    
    public static boolean verificarSeEhPalindromo(String input) {
        int inicio = 0;
        int fim = input.length() - 1;

        while (inicio < fim) {
            if (input.toCharArray()[inicio] != input.toCharArray()[fim]) {
                return false;
            }
            inicio++;
            fim--;
        }

        return true;
    }
    
    //questao17
    
    public static boolean verificarSeEhPrimo(int num) {
        if (num <= 1) {
            return false;
        }

        if (num == 2 || num == 3) {
            return true;
        }

        if (num % 2 == 0) {
            return false;
        }

        int divisor = 3;
        while (divisor * divisor <= num) {
            if (num % divisor == 0) {
                return false;
            }
            divisor += 2; 
        }

        return true;
    }

    
    //questao18
    
    public static String inverterString(String str) {
        int tamanho = str.length();
        char[] invertido = new char[tamanho];

        for (int i = 0; i < tamanho; i++) {
            invertido[i] = str.charAt(tamanho - 1 - i);
        }

        return new String(invertido);
    }

    //questao19
    public static class CalculadoraJurosCompostos {

        public double calcularMontanteComJurosCompostos(double principal, double taxaDeJurosAnual, int numeroDeAnos) {
            double montanteFinal = principal;

            for (int i = 0; i < numeroDeAnos; i++) {
                montanteFinal += montanteFinal * taxaDeJurosAnual;
            }

            return montanteFinal;
        }
    }

     
    //questao20
    
    public static class VerificacaoNumeroPerfeito {

        public static boolean verificarNumeroPerfeito(int numero) {
            if (numero <= 0) {
                return false; 
            }

            int somaDosDivisores = 1;

            for (int i = 2; i * i <= numero; i++) {
                if (numero % i == 0) {
                    somaDosDivisores += i;

                    if (i != numero / i) {
                        somaDosDivisores += numero / i;
                    }
                }
            }

            return somaDosDivisores == numero;
        }
    }
    
    
    //questao21
    
    

    public static int[] criarVetor(int tamanho) {
        int[] vetor = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = i + 1; 
        }
        return vetor;
    }

   
    public static void exibirVetor(int[] vetor) {
        System.out.print("Tamanho " + vetor.length + ": [");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i]);
            if (i < vetor.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static class ReducaoDeVetor {

        
        public static int[] criarVetor(int tamanho) {
            int[] vetor = new int[tamanho];
            for (int i = 0; i < tamanho; i++) {
                vetor[i] = i + 1;
            }
            return vetor;
        }

    
        public static int[] reduzirVetor(int[] vetor) {
            int novoTamanho = vetor.length - 1;
            int[] novoVetor = new int[novoTamanho];

            for (int i = 0; i < novoTamanho; i++) {
                novoVetor[i] = vetor[i] + vetor[i + 1]; // Soma pares de elementos adjacentes
            }

            return novoVetor;
        }

       
        public static void exibirVetor(int[] vetor) {
            System.out.print("Tamanho " + vetor.length + ": [");
            for (int i = 0; i < vetor.length; i++) {
                System.out.print(vetor[i]);
                if (i < vetor.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
    }
    
    //questao22
    
    public static void imprimirFormaA(int tamanho) {
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void imprimirFormaB(int tamanho) {
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                System.out.print((i + j) % 2 == 0 ? "@" : "*");
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void imprimirFormaC(int tamanho) {
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                if (i == j || j == tamanho - 1 - i) {
                    System.out.print("* ");
                } else {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
    }

    public static void imprimirFormaD(int tamanho) {
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                if (i == 0 || i == tamanho - 1 || j == 0 || j == tamanho - 1) {
                    System.out.print("# ");
                } else if ((i + j) % 2 == 0) {
                    System.out.print("! ");
                } else {
                    System.out.print("= ");
                }
            }
            System.out.println();
        }
    }

    public static void imprimirFormaE(int tamanho) {
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                if (i == j || j == tamanho - 1 - i) {
                    System.out.print("0 ");
                } else if (j > i && j < tamanho - 1 - i) {
                    System.out.print("* ");
                } else if (j < i && j > tamanho - 1 - i) {
                    System.out.print("% ");
                } else {
                    System.out.print("1 ");
                }
            }
            System.out.println();
        }
    }


    
        public static void main(String[] args) {
        int numeroinicial = 10;
        int numerofinal = 35;
        numerospares(numeroinicial, numerofinal);

        double[] vetor1 = { 3, 4, 2, 6, 7, 8 };
        double[] vetor2 = { 5, 6, 7, 7, 9, 10 };
        mediavetores(vetor1, vetor2);

        double[] vetornotas = { 8.0, 8.0, 9.0 };
        double[] vetorpesos = { 8.0, 9.0, 1.0 };
        mediaponderada(vetornotas, vetorpesos);

        int[] vetorcont1 = {2,5,2,4,5,6};
        int[] vetorcont2 = {4,3,6,3,5,3};
        int elementodecontagem = 5;
        contagemdevetores(vetorcont1,vetorcont2,elementodecontagem);

        int [] vetororiginal = {4,5,8,9};
        copiadovetor(vetororiginal);

        int[] vetorordem = { 3, 2, 9, 5, 1 };
        int[] vetorOrde = ordenacaoCrescente(vetorordem);
        System.out.println("  O vetor ordenado em ordem crescente: " + Arrays.toString(vetorOrde));

        boolean ordenado = verificacaoOrdenacaoCrescente(vetorordem);
        System.out.println("O vetor esta ordenado em ordem crescente? " + ordenado);

        int[] vetor9 = { 3, 2, 9, 6, 8 };
        int k = 3; // Encontrar o 3º maior valor
        int kzao = encontrarmeuKesimoMaior(vetor9, k);
        System.out.println("O " + k + " maior valor eh: " + kzao);

        int[] vetor10 = { 3, 2, 9, 6, 8 };
        int k10 = 3; // Encontrar o 3º menor valor
        int kMenor = encontrarKesimoMenor(vetor10, k10);
        System.out.println("O " + k10 + " menor valor eh: " + kMenor);

        int[] vetorA = {1, 2, 5, 3};
        int[] vetorB = {1, 7, 3, 6};
        int[] vetorC = {1, 2, 4, 8};

        System.out.println("Comparando Vetor A e Vetor B:");
        VerificacaoIgualdadeVetores.verificarIgualdade(vetorA, vetorB);

        System.out.println("Comparando Vetor A e Vetor C:");
        VerificacaoIgualdadeVetores.verificarIgualdade(vetorA, vetorC);
    
        double base = 5.0;
        int expoente = 2;

        double resultado = calcularPotencia(base, expoente);

        System.out.println(base + " elevado a " + expoente + " eh igual a " + resultado);
        
       

        int numero = 11;

        if (ehPrimo(numero)) {
            System.out.println(numero + " eh primo.");
        } else {
            System.out.println(numero + " não eh primo.");
        }
        
    
        int[] vetorsinho1 = {1, 2, 7, 0, 9};
        int[] vetorsinho2 = {2, 4, 2, 7, 9};

        int[] ocorrenciaComum = buscarOcorrenciasComuns(vetorsinho1, vetorsinho2);

        System.out.print("Ocorrencias comuns em vetores: ");
        for (int meuselemntos : ocorrenciaComum) {
            System.out.print(meuselemntos + " ");
        }
        
    
        int[] vetorOriginal = {1, 2, 3, 2, 4};
        int elementoRemovido = 2;

        int[] novoVetor = removerElemento(vetorOriginal, elementoRemovido);

        System.out.print("Novo vetor apos a ocorrer a remocao do elemento " + elementoRemovido + ": ");
        for (int valor : novoVetor) {
            System.out.print(valor + " ");
     
        
            String palavra1 = "ana";
            String palavra2 = "java";
            
            boolean ehPalindromo1 = verificarSeEhPalindromo(palavra1);
            boolean ehPalindromo2 = verificarSeEhPalindromo(palavra2);

            System.out.println("E um palindromo? (Palavra1): " + ehPalindromo1);
            System.out.println("E um palindromo? (Palavra2): " + ehPalindromo2);
        
            int numero1 = 7;
            int numero2 = 12;

            boolean ehPrimo1 = verificarSeEhPrimo(numero1);
            boolean ehPrimo2 = verificarSeEhPrimo(numero2);

            System.out.println(numero1 + " e um numero primo? " + ehPrimo1);
            System.out.println(numero2 + " e um numero primo? " + ehPrimo2);
           
            String textoOriginal = "olamundo";
            String textoInvertido = inverterString(textoOriginal);

            System.out.println(" Original: " + textoOriginal);
            System.out.println(" Invertido: " + textoInvertido);
            
            
            CalculadoraJurosCompostos calculadora = new CalculadoraJurosCompostos();
            
            double principal = 1000.0;
            double taxaDeJurosAnual = 0.05;
            int numeroDeAnos = 3;

            double montanteFinal = calculadora.calcularMontanteComJurosCompostos(principal, taxaDeJurosAnual, numeroDeAnos);

            System.out.println("Montante final apos " + numeroDeAnos + " anos: " + montanteFinal);
        
            int numeroVerificar = 23;
            boolean ehNumeroPerfeito = VerificacaoNumeroPerfeito.verificarNumeroPerfeito(numeroVerificar);

            if (ehNumeroPerfeito) {
                System.out.println(numeroVerificar + " eh um numero perfeito.");
            } else {
                System.out.println(numeroVerificar + " nao eh um numero perfeito.");
            }
          
            int tamanhoInicial = 27; 
            int[] vetor = criarVetor(tamanhoInicial);

            System.out.println("Tamanho do incio: " + tamanhoInicial);
            exibirVetor(vetor); 
            
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite o número de linhas e colunas: ");
            
            scanner.close();
            int tamanho = 5; // Define o tamanho das formas

            System.out.println("\nImprimindo Forma A:");
            imprimirFormaA(tamanho);

            System.out.println("\nImprimindo Forma B:");
            imprimirFormaB(tamanho);

            System.out.println("\nImprimindo Forma C:");
            imprimirFormaC(tamanho);

            System.out.println("\nImprimindo Forma D:");
            imprimirFormaD(tamanho);

            System.out.println("\nImprimindo Forma E:");
            imprimirFormaE(tamanho);
        }
        }            
    }
          
    




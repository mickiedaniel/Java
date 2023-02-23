import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    Scanner entrada = new Scanner(System.in);

    System.out.println("Insira o número de elementos do vetor!");
    int n = entrada.nextInt();

    System.out.println("O número de elementos do vetor é: " + n);

    System.out.println("------------X------------");

    int vetor[] = new int[n];
    
    for (int x = 0; x < n; x++){
      System.out.println("Insira o elemento " + x + " do vetor.");

      int e = entrada.nextInt();

      vetor[x] = e;      
    }
      
      boolean troca = true;
      
      int aux; 
      
      while (troca) {
        troca = false;
        
        for(int x = 0; x < vetor.length - 1; x++){
          
          if(vetor[x] > vetor[x + 1]) {
            
            aux = vetor[x];
            
            vetor[x] = vetor[x + 1];
            
            vetor[x + 1] = aux;
            
            troca = true;
          }
        }
        int sub = 0;        
      }

    System.out.println("O vetor está em ordem crescente!");

    int ultimo = vetor[vetor.length - 1];

    int primeiro = vetor[0];
      
    if(primeiro < 0){
      primeiro = primeiro * -1;

                  int sub = ultimo - primeiro;
      
      System.out.println("O valor da subtração do maior elemento com o menos é de " + sub);

    }else {
          int sub = ultimo - primeiro;
      
      System.out.println("O valor da subtração do maior elemento com o menor é de " + sub);

    }
           } }
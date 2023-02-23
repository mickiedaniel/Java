class Main {
  public static void main(String[] args) {

    int vetor[] = new int[1001]; //cria vetor c 1001 para alocar do 0 ao 1000
    int vet[] = new int[1000]; //cria vetor novo para alocar os multiplos de 3 a 5
    int a = 0; 
    int contador = 0;
          int soma = 0;

    
    for (int n = 0; n < 1001; n++){
      vetor[n] = n;
    } //for para preencher os indices do vetor
    
    for(int n = 0; n < 1001; n++){
      if (vetor[n]%3 == 0 || vetor[n]%5 == 0){
        vet[a] = n;
        a++;
        contador++;
        System.out.println(n);
      } //for para preencher os indices do vetor com os multiplos de 3 ou 5
    }    
  
     for(int n = 0; n < 467; n++){
       soma = vet[n] + soma;
}
        System.out.println(soma);
    /// valor correto 233.168

}
}
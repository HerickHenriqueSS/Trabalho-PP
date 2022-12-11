package TrabalhoSemSingleton;

public class Principal {
    public static void main(String[] args) {
        Carros carros = new Carros();
        System.out.println(carros.criarCarroFiat());
        System.out.println(carros.criarCarroFord());
        System.out.println(carros.criarCarroVolks());
      
        System.out.println(carros.gerarRelatorio());
        
        carros  = new Carros();
        System.out.println(carros.gerarRelatorio());   
    }
}

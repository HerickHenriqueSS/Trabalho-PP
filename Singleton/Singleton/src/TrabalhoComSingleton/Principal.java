package TrabalhoComSingleton;

public class Principal {
    public static void main(String[] args) {
        
        Carros carros = null;
        
        carros = Carros.getInstancia();
        
        System.out.println(carros.criarCarroFiat());
        System.out.println(carros.criarCarroFord());
        System.out.println(carros.criarCarroVolks());
        System.out.println(carros.gerarRelatorio());
    }
}

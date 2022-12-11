package TrabalhoComSingleton;

public class Carros {
   
    private int totalCarrosFiat;
    private int totalCarrosFord;
    private int totalCarrosVolks;
    
    public String criarCarroVolks(){
        return new String("Carros Volks " + totalCarrosVolks + " criado."); 
    }
    
    public String criarCarroFord(){
        return new String("Carros Ford " + totalCarrosFord + " criado."); 
    }
    
    public String criarCarroFiat(){
        return new String("Carros Fiat " + totalCarrosFiat + " criado."); 
    }
    
    public String gerarRelatorio() {
        return new String("Total de carros Fiat vendidos: " + totalCarrosFiat
                + "\nTotal de carros Ford vendidos: " + totalCarrosFord
                + "\nTotal de carros Volks vendidos: " + totalCarrosVolks);
    }
    
    private Carros(){
        
    }
    
    private static Carros instancia = null;
 
    public static Carros getInstancia() {
        if (instancia == null){
            instancia = new Carros();
        }
        return instancia;
    }
}

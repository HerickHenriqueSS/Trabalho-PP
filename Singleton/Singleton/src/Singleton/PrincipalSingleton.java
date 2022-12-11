package Singleton;

public class PrincipalSingleton {
    public static void main(String[] args) {
        
        Singleton singleton = null;
    
        for(int i = 0; i < 1000000; i ++){
            singleton = Singleton.getInstancia();
        }
    }
}

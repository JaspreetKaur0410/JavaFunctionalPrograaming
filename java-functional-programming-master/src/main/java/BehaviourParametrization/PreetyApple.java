package BehaviourParametrization;

import java.util.List;

public class PreetyApple {
    public void preetyApple(List<Aple> inventory, AppleFormatterIterface formatter){
        for(Aple a:inventory){
            String output = formatter.accept(a);
            System.out.println("APPLE FORMATTER "+"\n"+output);
        }
    }
}

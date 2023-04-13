package BehaviourParametrization;

public class AppleSimpleFormatter implements AppleFormatterIterface{
    @Override
    public String accept(Aple a) {
        return "An apple of " + a.getWeight() + "g";
    }
}

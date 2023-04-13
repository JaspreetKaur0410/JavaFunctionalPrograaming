package BehaviourParametrization;

public class AppleFancyFormatter implements AppleFormatterIterface{

    @Override
    public String accept(Aple a) {
        String characterstic = a.getWeight()>100 ? "heavy":"light";
        return "A " + characterstic +
                " " + a.getColor() +" apple";
    }
}

package generics.parameterizedClass;

/**
 * @author leonid.barsucovschi
 */
public class ParameterizedClass2 {

    public static void main(String[] args) {
        Pair<String,Integer> pair1 = new Pair<>("Privet",45);
        System.out.println("Znachenie pari : value 1 = " + pair1.getFirstValue() + ":" + " value 2 = " + pair1.getSecondValue());

        Pair<Integer,Double> pair2 = new Pair<>(85,45.89);
        System.out.println("Znachenie pari : value 1 = " + pair2.getFirstValue() + ":" + " value 2 = " + pair2.getSecondValue());

        OtherPair<String> otherPair = new OtherPair<>("OK","Privet");
        System.out.println(otherPair);
    }
}

class Pair <V1, V2> {
    private V1 value1;

    private V2 value2;

    public Pair(V1 value1,
                V2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V1 getFirstValue(){
        return value1;
    }

    public V2 getSecondValue(){
        return value2;
    }
}


class OtherPair <V> {
    private V value1;

    private V value2;

    public OtherPair(V value1,
                V value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public  V abc(V value){
        return value;
    }

    public V getFirstValue(){
        return value1;
    }

    public V getSecondValue(){
        return value2;
    }
}

package generics.parameterizedClass;

/**
 * @author leonid.barsucovschi
 */
public class ParameterizedClass {

    public static void main(String[] args) {

        Info<String> info1 = new Info<>("Privet");
        System.out.println(info1);

        String str = info1.getValue();
        System.out.println(str);

        Info<Integer> info2 = new Info<>(34);
        System.out.println(info2);

        Integer num = info2.getValue();
        System.out.println(num);

    }
}

/*Создадим Parameterized Class Info в котором будет содержаться какое-то значения, но пока не известно какого типа.
Тоесть тип этого значения могут быть разными  */

class Info <T> {    // <T> or <V> or <K> or <E> - Type placeholder Заполнитель типа
    private T value; // тип T в дальнейшем может быть заменен на множество типов.

    public Info (T value){
        this.value = value;
    }

    public String toString(){
        return "{[" + value + "]}";
    }

    public T getValue(){
        return value;

    }


}



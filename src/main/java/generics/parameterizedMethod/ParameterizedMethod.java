package generics.parameterizedMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leonid.barsucovschi
 */


public class ParameterizedMethod {
    public static void main(String[] args) {

        /* Parameterized Method or Generics Method - Это методы у которых в параметре листе есть Generics.
        * Generics method - очень полезны для написания методов
        * которые нужны и будут использоваться очень широким диапазон типов данных,
        * но при этом функциональность этого метода должна для всех типов одинакова  */

        List<Integer> integerList = new ArrayList<>();

        integerList.add(10);
        integerList.add(456);
        integerList.add(23);

        List<String> stringList = new ArrayList<>();

        stringList.add("Hello");
        stringList.add("Google");
        stringList.add("ISD");

        int num = GenMethod.getSecondElement(integerList);
        String str = GenMethod.getSecondElement(stringList);
        System.out.println(num);
        System.out.println(str);


    }
}

class GenMethod {
    public static <T> T getSecondElement(List<T> list){
        return list.get(1);
    }

}



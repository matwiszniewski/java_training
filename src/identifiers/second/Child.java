package identifiers.second;

import identifiers.first.Parent;

public class Child extends Parent {

    // klasa potomna w innej paczce nie ma dostepu do pol/metod private oraz default czyli bez identyfikatora
    public void testIdentifiers () {
        System.out.println(first);

        System.out.println(third);

        firstMethod();

        thirdMethod();


    }

}

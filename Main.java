
/*! fichero de Fizzbuzz.
 *  Programa que contiene algunas pruebas con las reglas del juego fizzbuzz.
 */

public class Main {
    // ------------------------------------------------------------------------
    /*! Regla 1 de Fizzbuzz.
     *
     *  La funcion fizzbuzz de un numero imprime el numero en si a stdout.
     */ // --------------------------------------------------------------------
    static void rule_1() {
        // deberia imprimir: 1, 2, 97 (en lineas separadas)
        fizzbuzz(1);
        fizzbuzz(2);
        fizzbuzz(97);
    }

    // ------------------------------------------------------------------------
    /*! Regla 2 de Fizzbuzz.
     *
     *  La funcion fizzbuzz de un numero divisible por 3 debe imprimir
     *  la cadena "Fizz" (en lugar del numero).
     */ // --------------------------------------------------------------------
    static void rule_2() {
        // deberia imprimir: 4, Fizz, Fizz (en lineas separadas)
        fizzbuzz(4);
        fizzbuzz(6);
        fizzbuzz(33);
    }

    // ------------------------------------------------------------------------
    /*! Regla 3 de Fizzbuzz.
     *
     *  La funcion fizzbuzz de un numero divisible por 5 debe imprimir
     *  la cadena "Buzz" (en lugar del numero).
     */ // --------------------------------------------------------------------
    static void rule_3() {
        // deberia imprimir: Buzz, 17, Buzz (en lineas separadas)
        fizzbuzz(5);
        fizzbuzz(17);
        fizzbuzz(85);
    }

    // ------------------------------------------------------------------------
    /*! Regla 4 de Fizzbuzz.
     *
     *  La funcion fizzbuzz de un numero que es divisible tanto por 3 como por 5
     *  debe imprimir la cadena "FizzBuzz" (en lugar del numero).
     */ // --------------------------------------------------------------------
    static void rule_4() {
        // deberia imprimir: 8, FizzBuzz, FizzBuzz (en lineas separadas)
        fizzbuzz(8);
        fizzbuzz(15);
        fizzbuzz(45);
    }

    public static void main(String[] args) {
        // ejecutar las reglas
        rule_1();
        rule_2();
        rule_3();
        rule_4();
    }

    static void fizzbuzz(int n) {
    }
}

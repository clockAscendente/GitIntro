/*! fichero de Fizzbuzz.
 *  Programa que contiene algunas pruebas con las reglas del juego fizzbuzz.
 */

#include "fizzbuzz.hpp"

// ------------------------------------------------------------------------
/*! Regla 1 de Fizzbuzz.
 *
 *  La función fizzbuzz de un número imprime el número en sí a stdout.
 */ // --------------------------------------------------------------------
void rule_1() {
  // debería imprimir: 1, 2, 97 (en líneas separadas)
  fizzbuzz(1);
  fizzbuzz(2);
  fizzbuzz(97);
}

// ------------------------------------------------------------------------
/*! Regla 2 de Fizzbuzz.
 *
 *  La función fizzbuzz de un número divisible por 3 debe imprimir
 *  la cadena "Fizz" (en lugar del número).
 */ // --------------------------------------------------------------------
void rule_2() {
  // debería imprimir: 4, Fizz, Fizz (en líneas separadas)
  fizzbuzz(4);
  fizzbuzz(6);
  fizzbuzz(33);
}

// ------------------------------------------------------------------------
/*! Regla 3 de Fizzbuzz.
 *
 *  La función fizzbuzz de un número divisible por 5 debe imprimir
 *  la cadena "Buzz" (en lugar del número).
 */ // --------------------------------------------------------------------
void rule_3() {
  // debería imprimir: Buzz, 17, Buzz (en líneas separadas)
  fizzbuzz(5);
  fizzbuzz(17);
  fizzbuzz(85);
}

// ------------------------------------------------------------------------
/*! Regla 4 de Fizzbuzz.
 *
 *  La función fizzbuzz de un número que es divisible tanto por 3 como por 5
 *  debe imprimir la cadena "FizzBuzz" (en lugar del número).
 */ // --------------------------------------------------------------------
void rule_4() {
  // debería imprimir: 8, FizzBuzz, FizzBuzz (en líneas separadas)
  fizzbuzz(8);
  fizzbuzz(15);
  fizzbuzz(45);
}

int main() {
  // ejecutar las reglas
  rule_1();
  rule_2();
  rule_3();
  rule_4();
}

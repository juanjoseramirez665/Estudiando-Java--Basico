package estudiando;

//public class Clasedejava {
//    public static void main(String[] args) {
//        int numPackedApples = 1_000_000;
//
//        System.out.println(numPackedApples);
//    }
//}


// public class Clasedejava {
//
//        public static void main(String[] args) {
//
//            int num1 = 1;
//            int num2 = 2;
//
//
//            System.out.println(num1 + num2);
//
//        }
// }


//public class Clasedejava {
//    public static void main(String[] args) {
//
//        int num = 42;
//        String persona = "Juan";
//
//        System.out.println(num);
//        System.out.println(persona);
//
//    }
//}


//DATOS🔥
//public class Clasedejava {
////    public static void main(String[] args) {
////byte edad = 20;
////short cantidad = 1000;
////int numero = 50000;
////long poblacion = 8000000000L;
////
////float precio = 19.99F;
////double temperatura = 36.5;
////
////char inicial = 'A';
////boolean activo = true;
////
////String nombre = "Juan";
////Integer numeroGrande = 1200;
////Double decimalGrande = 45.67;
////Boolean esValido = false;






//public class Clasedejava {
//    public static void main(String[] args) {
//           int telefono = 232412458;
//           char letra = 'X';
//           float peso =  65.2f;   //se pone una f al final para que el codigo sepa que es float
//           double grande = 76.34534534539499398655567;
//
//
//        System.out.println("La letra es:" + letra);
//        System.out.println("El numero de telefono es: " + telefono);
//        System.out.println("El peso es: " + peso);
//        System.out.println("El numero grande es: " + grande);
//
//    }
//}


//Operadores Aritmeticos🔥
//public class Clasedejava {
//    public static void main(String[] args) {
//        int num1 = 7;
//        int num2 = 5;
//
//        System.out.println("el resultado es:" + (num1 + num2));
//        System.out.println("el resultado es:" + (num1 - num2));
//        System.out.println("es resultado es:" + (num1 * num2));
//        System.out.println("el resultado es:" + (num1 / num2));
//        System.out.println("el resultado es:" + (num1 % num2));
//    }
//}



////Operadores de Asignacion🔥
//public class Clasedejava {
//    public static void main(String[] args) {
//
//
//        int a = 5;
//        int b = 6;
//
//        a = b;
//
//
//        System.out.println("a = " + a);
//    }
//}
//
//         */
//
//Segundo Ejemplo
//
//Variables de tipo entero👌
//public class Clasedejava {
//        public static void main(String[] args) {
//        int a = 5, b = 10 , c = 3, d = 8;
//
//        a = a + 4;
//        b = b - 5;
//        c = c * 3;
//        d = d / 4;
//
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);
//        System.out.println("c = " + c);
//        System.out.println("d = " + d);
//    }
//}
//
//        //Operaciones de asignacion compuestas🔥
//        // Forma simplificada👌
//public class Clasedejava {
//    public static void main(String[] args) {
//        int a = 5, b = 10 , c = 3, d = 8;
//
//        a += 4;
//        b -= 5;
//        c *= 3;
//        d /= 4;
//
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//        System.out.println(d);
//    }
//}

////Operadores Relacionales🔥
//public class Clasedejava {
//    public static void main(String[] args) {
//
//        int a = 10;
//        int b = 20;
//
//        System.out.println(a < b);
//        System.out.println(a > b);
//        System.out.println(a == b);
//        System.out.println(a <= b);
//        System.out.println(a >= b);
//        System.out.println(a != b); //  ! = a es diferente de b
//
//    }
//}


//Operadores Logicos-Condicional🔥

//public class Clasedejava {
//    public static void main(String[] args) {
//
//        boolean valor1 = true;
//        boolean valor2 = true;
//        boolean valor3 = true;
//        boolean valor4 = false;
//
//        //Operador logico: && //Se tienen que cumplir las 2 condiciones
//        System.out.println(valor1 && valor2); //true
//        System.out.println(valor3 && valor4); //false
//
//        //Operador logico: || //Se tiene que cumplir 1 condicione
//        System.out.println(valor1 || valor2); //true
//        System.out.println(valor3 || valor4); //true
//
//        //Operador logico: ! //Este operador solo invierte el booleano
//        System.out.println(!valor1); //false
//        System.out.println(!valor4); //true
//
//
//    }
//}

//Condicionales if y else🔥

    //if = Evalua la condicion👌
    //else = Especifica que hacer si no se cumple la condicion👌

    //👉IF (si...)
    //
    //Es como hacer una pregunta
    //Si la respuesta es verdadero, entonces haces algo
    //
    //👉 ELSE (si no...)
    //
    //Si la respuesta es falso, haces otra cosa👌
    //Es opcional: puedes usarlo o no👌
//public class Clasedejava {
//    public static void main(String[] args) {
//
//        String nombre = "Juan ";
//        int edad = 20;
//
//        if (edad >= 18) {
//                System.out.println(nombre + " es mayor de edad");
//        }else{
//                System.out.println(nombre + " es menor de edad");
//        }
//    }
//}

//Con los condicionales se pueden plantear distintas soluciones a problemas🔥
//public class Clasedejava {
//    public static void main(String[] args) {
//
//        int nivel = 11;
//        int monedas = 600;
//
//        if (nivel >= 10 && monedas > 500) {
//            System.out.println("Puedes entrar a la sala especial");
//        } else {
//            System.out.println("No puedes entrar, sigue mejorando");
//        }
//
//    }
//}



    // else if  = else-if sirve para que un programa tome decisiones dependiendo de una condición🔥
//public class Clasedejava {
//    public static void main(String[] args) {
//
//        int numero = -5;
//
//        if (numero > 0 ) {
//            System.out.println("El numero es positivo");
//        }else if (numero < 0){
//            System.out.println("El numero es negativo");
//        }
//    }
//}

//Horas del dia // Hora militar👌
//public class Clasedejava {
//    public static void main(String[] args) {
//
//        int hora = 5;
//
//        if(hora >= 1 && hora <= 12){
//            System.out.println("Buenos dias");
//        }else if (hora >= 12 && hora < 18){
//            System.out.println("Buenas tardes");
//        }else if (hora >= 18 && hora < 24){
//            System.out.println("Buenas noches");
//        }else{
//            System.out.println("hora no existe");
//        }
//    }
//}
//Numeros positivos y negativos con condicionales 👌
//public class Clasedejava {
//    public static void main(String[] args) {
//
//        int numero = 6;
//
//        if (numero > 0) {
//            System.out.println("es numero es positivo");
//        }else if (numero < 0) {
//            System.out.println("el numero es negativo");
//        }else  {
//            System.out.println("el numero es 0");
//        }
//    }
//}

//Sentendia Switch 🔥
//El switch es como un menú automático:
//
//        👉 Si la variable vale X, ejecuta la acción X.
//        👉 Si no coincide ninguna opción, ejecuta default
//
//El break sirve para detener algo que se está ejecutando.
//El break detiene la ejecución de un switch o un ciclo (for, while, do-while)

//public class Clasedejava {
//    public static void main(String[] args) {
//             char vocal = 'U';
//
//             switch(vocal){
//                 case 'A':
//                     System.out.println("Vocal A");
//                     break;
//                     case 'E':
//                         System.out.println("Vocal E");
//                         break;
//                         case 'I':
//                             System.out.println("Vocal I");
//                             break;
//                             case 'O':
//                                 System.out.println("Vocal O");
//                                 break;
//                                 case 'U':
//                                     System.out.println("Vocal U");
//                                     break;
//                                     default:
//                                         System.out.println("no reconoce la vocal");

//                                         break;
//             }
//    }
//}

// En un switch un else se llama default👌
    //CODIGO SWITCH RESUMIDO👌
//public class Clasedejava {
//    public static void main(String[] args) {
//
//        int mes = 9;
//        String nombre_mes = "";
//
//        switch (mes) {
//            case 1 -> nombre_mes = "Enero";
//            case 2 -> nombre_mes = "Febrero";
//            case 3 -> nombre_mes = "Marzo";
//            case 4 -> nombre_mes = "Abril";
//            case 5 -> nombre_mes = "Mayo";
//            default -> nombre_mes = "Mes invalido";
//        };
//
//        System.out.println("Mes: " + nombre_mes);
//    }
//}


//CICLO FOR 🔥
//El ciclo for sirve para repetir un bloque de código un número de veces definido👌
//El for es un ciclo que repite código un número exacto de veces, usando un contador que va cambiando automáticamente
//public class Clasedejava {
//    public static void main(String[] args) {
//
//        for (int i = 1; i <= 10; i++) {
//            System.out.println("imprimir numeros: " + i);
//        }
//    }
//}


//Tabla del 2 con el ciclo for👌
//public class Clasedejava {
//    public static void main(String[] args) {
//
//        for (int i = 1; i <= 9; i++) {
//            System.out.println("Numero: " + i * 2);
//        }
//    }
//}

//CICLO WHILE Y DO WHILE🔥
    //WHILE → “Mientras esto pase, sigue👌 - Revisa si la condicion se cumple - el proceso se repite hasta que la condicion sea falsa
    //DO WHILE → “Hazlo una vez y luego repite👌 - El ciclo se detiene cuando la condicion se vuelve falsa
//public class Clasedejava {
//    public static void main(String[] args) {
//
//        int  x = 0;
//        int n = 4;
//
//        while(x<=n){
//            System.out.println("El valor de x es: "+x);x++;    //x++ significa aumentar x en 1
//
//        }
//
//    }
//}

//Do While👌
//public class Clasedejava {
//    public static void main(String[] args) {
//
//        int i = 0;
//        int n = 2;
//
//        do {
//            System.out.println("El numero es:" +i);i++;    //i++ valor a incrementar
//        }while(i<=n);
//    }
//}

//WHILE👌
//public class Clasedejava {
//    public static void main(String[] args) {
//
//        int x = 1;
//
//        while(x <= 5){
//            System.out.println("El valor de x es: "+x);
//            x++;
//        }
//    }
//}
//DO WHILE👌
//public class Clasedejava {
//    public static void main(String[] args) {
//
//        int i = -13;
//
//        do {
//            System.out.println("El numero es: " +i);i++;
//        }while( i > 0 );

import java.util.ArrayList;
import java.util.List;

////El ciclo de detiene ya que i no es mayor que 0
//
//    }
//}


//Arreglos - arrays🔥
    // Un arreglo puede almacenar multiples variables👌
//Un arreglo es una estructura de datos que permite guardar varios valores del mismo tipo dentro de una sola variable.👌
//Piensa en un arreglo como una fila de casilleros, donde cada casillero guarda un valor y tiene un número (posición) para identificarlo👌
//public class Clasedejava {
//    public static void main(String[] args) {
//
//        int notas[] = new int [5];    //Arreglo-Arrays
//
//        notas[0] = 4;
//        notas[1] = 5;
//        notas[2] = 6;
//        notas[3] = 7;
//        notas[4] = 8;
//
//        System.out.println("La nota es :" + notas[0]);
//
//    }
//}


//Arreglos con ciclo for👌👌
//public class Clasedejava {
//    public static void main(String[] args) {
//
//        int notas[] = {5,6,7,8,9};
//
//        for (int i = 0; i < notas.length; i++) {      //length sirve para saber cuántos elementos tiene un arreglo
//
//            System.out.println("Notas: " + notas[i]);
//
//        }
//    }
//}

//Arreglos Multidimensionales 👌
//Matriz👌
//public class Clasedejava {
//    public static void main(String[] args) {
//
//        int [][] numeros = new int[3][3];{
//            int i, j;                                    //Filas = i -  Columnas = j
//
//
//            for( i = 0; i < numeros.length; i++ ) {
//                System.out.println();
//
//                for ( j = 0; j < numeros.length; j++ ) {
//
//                    System.out.print( numeros[j][i] + " ");
//                }
//            }
//
//        }
//
//    }
//}

//Matriz👌
//¿Para qué sirve una matriz?👌
//
//Para representar tablas👌
//
//Mapas o grids (como en videojuegos)👌
//
//Calificaciones, horarios, temperaturas, etc👌
//
//Almacenar datos organizados👌
//public class Clasedejava {
//    public static void main(String[] args) {
//
//        int[][] matriz = new int[2][2];     //fila = i  -  columna = j
//        matriz[0][0] = 45;
//        matriz[0][1] = 4;
//        matriz[1][0] = 78;
//        matriz[1][1] = 65;
//
//        for (int i = 0; i < matriz.length; i++) {
//            for (int j = 0; j < matriz[i].length; j++) {
//                System.out.print(matriz[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//}
//Arreglos dinamicos👌
    //Son aquellos arreglos que ofrecen flexibilidad mientras el programa se esta ejecutando👌
    //Permiten:
    // .add- Agregar elementos👌
    // .remove - Eliminar un elemento👌
    // .size - cambiar el tamaño de la matriz👌
//public class Clasedejava {
//    public static void main(String[] args) {
//
//        List<String> animales = new ArrayList<>();
//
//        animales.add("Conejo");
//        animales.add("Gato");
//        animales.add("Perro");
//        animales.add("Loro");
//
//        System.out.println("Primer Array" + animales);
//
//        animales.add(3,"Elefante");  // Si pongo un numero en el index cambio la posicion del animal👌
//
//        System.out.println("Segundo Array" + animales);
//
//    }
//}

public class Clasedejava {
    public static void main(String[] args) {

        List<String> lenguajesProgramacion = new ArrayList<>();

        lenguajesProgramacion.add("Python");
        lenguajesProgramacion.add("Java");
        lenguajesProgramacion.add("C#");
        lenguajesProgramacion.add("C++");

        System.out.println("Arreglo 1" + lenguajesProgramacion);

        lenguajesProgramacion.remove("Python");

        System.out.println("Lista sin el indice 0: " + lenguajesProgramacion);
    }
}















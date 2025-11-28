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


//public class Clasedejava {
//    public static void main(String[] args) {
//
//
//
//    }
//}










 import java.util.Scanner;

 public class Main {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         System.out.print("por favor ingrese la cantidad de los estudiantes: ");
         int cant_estudiantes = scanner.nextInt();
         int[] edades = new int[cant_estudiantes];
         String[] grados = new String[cant_estudiantes];

         // ingreso la cantidad de estudiantes estudiantes
         for (int i = 0; i < cant_estudiantes; i++) {
             System.out.print("ingrese la edad del estudiante " + (i + 1) + ": ");
             edades[i] = scanner.nextInt();
             System.out.print("ingrese el grado del estudiante " + (i + 1) + ": ");
             grados[i] = scanner.next();
             System.out.println("*********************************************");
         }
         // mezclita de arreglos
         int[] edadesYGrados = new int[cant_estudiantes * 2];
         for (int i = 0, j = 0; i < edadesYGrados.length; i += 2, j++) {
             edadesYGrados[i] = edades[j];
             edadesYGrados[i + 1] = Integer.parseInt(grados[j]);
         }
         // buenos pues aqui se calcula el promedio y total de mayores y menores... al igual que la cantikdad de numeros
         int promedioMayores = 0;
         int promedioMenores = 0;
         int cant_cinco = 0;
         int totalMayores = 0;
         int totalMenores = 0;

         // aqui se muestra eltotal de mayores y menores... tambien se muestra la cantidad de cincos

         for (int edad : edades) {
             if (edad > 5) {
                 totalMayores += edad;
             } else if (edad < 5) {
                 totalMenores += edad;
             } else {
                 cant_cinco++;
             }
         }
         if (cant_estudiantes - cant_cinco > 0) {
             promedioMayores = totalMayores / (cant_estudiantes - cant_cinco);
         }
         if (cant_estudiantes - cant_cinco > 0) {
             promedioMenores = totalMenores / (cant_estudiantes - cant_cinco);
         }

         System.out.println("El promedio de edades mayores a 5 años es: " + promedioMayores);
         System.out.println("El promedio de edades menores a 5 años es: " + promedioMenores);
         System.out.println("La cantidad de estudiantes con 5 años es de: " + cant_cinco);

         // aka se mezclan las edades y grados en forma de una fila verticvl o cuadro
         System.out.println("Edades y Grados:");
         for (int i = 0; i < edadesYGrados.length; i += 2) {
             System.out.println("Edad: " + edadesYGrados[i] + ", Grado: " + edadesYGrados[i + 1]);
         }


     }
 }

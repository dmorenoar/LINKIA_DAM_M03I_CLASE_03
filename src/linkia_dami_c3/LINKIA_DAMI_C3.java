/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkia_dami_c3;

/**
 *
 * @author dmorenoar
 */
public class LINKIA_DAMI_C3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int num = 0;
        
        /*Bloque if-else*/
        if(num < 10){
            System.out.println("El numero es más pequeño");
        }else{
            System.out.println("El numero es más grande");
        }
        
        /*Bloque if-else if-else*/
        /*AND-> Los dos deben ser verdaderos - true y true
          OR-> Uno debe ser verdadero - true y false, ya es OK
        */
        if(num < 10 && num > 8){
            System.out.println("El numero es menor que 10 y mayor que 8");
            num += 2;
        }else if(num < 3){
            System.out.println("El numero es menor que 3");
            num += 1;
        }else if(num == 0){
            System.out.println("El numero es igual a 0");
            num = 0;
        }else if(num != 0){
            System.out.println("Sigo poniendo codigo");
        }else{
            System.out.println("El numero no es nada de lo anterior, es mayor a 10");
        }
 
        
        String semana = "Martes";
        
        char a = 'A'; // a == 'A'
        
        if(semana.equals("Lunes")){
            System.out.println("Es Lunes");
            
        }else if(semana.equals("Martes")){
            System.out.println("Es martes");
            
        }else if(semana.equals("Miercoles")){
            System.out.println("Es miercoles");
            
        }else if(semana.equals("Jueves")){
            System.out.println("Es jueves");
        }else{
            System.out.println("No tengo mas dias");
        }
        
        /*Flujo de control switch que nos sirve para evaluar diferentes estados de una variable*/
        switch(semana){
            case "Lunes":
                System.out.println("Has escogido Lunes");
            break; //Corta la ejecución
            case "Martes":
                System.out.println("Has escogido Martes");
                //Sigue con la ejecución porque no hay break;
            case "Miercoles":
                System.out.println("Has escogido Miércoles");
            break;
            case "Jueves":
                System.out.println("Es jueves");
            break;
            default:
                //Si todo lo anterior no se cumple, entonces haces esto
                System.out.println("No conozco mas dias");
        }
        
        
        /*Bucle for*/
        //Bucle con incremento del contador
        for(int cont=0;cont<=11;cont=cont+2){
            System.out.println("El valor del contador es en incremento es:" + cont);
        } //<---
        System.out.println("Y salgo del bucle");
        
        //Bucle con decremento del contador
        for(int cont=11;cont>=0;cont--){
            System.out.println("El valor del contador decremento es:" + cont);
        }
        
        /*
        for(int i=0;i<=10;i++){
            
        }*/
        
        /*Bucle WHILE (Pre-condicion)*/
        int numAle = 18;
        
        while(numAle <= 21){
            System.out.println("entro al bar con edad:" + numAle);
            numAle++;
        }
        
        /*Bucle DO-WHILE(Post-condicion)*/
        int numEdad = 18;
        
        do{
            System.out.println("Entro al teatro con edad:" + numEdad);
            numEdad++;
            // break; Un break aquí cortaría la ejecución del bucle do-while
        }while(numEdad <= 21);
        
        //CREAR UN MENU
        int op = 0;
        do{
            System.out.println("1-Leer datos");
            System.out.println("2-Borrar datos");
            System.out.println("3-Salir");
            //Leer opcion del usuario
            
            /*ESTO ES UN BUCLE INFINITOOOOOOO FALTA PEDIR AL USUARIO UNA OPCION*/
            
            switch(op){ //Leemos la opción según lo que quiera hacer
                case 1:
                    System.out.println("Empezamos a leer datos");
                break;
                case 2:
                    System.out.println("Empezamos a borrar datos");
                break;
                case 3:
                    System.out.println("Hasta pronto");
                break;
            }

        }while(op != 3);
        
        
    
    }//<--Cierra el programa(main)
    
}

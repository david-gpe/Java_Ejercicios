
package com.mycompany.poo_ejercicio1_loteria;
public class POO_Ejercicio1_Loteria {

    public static void main(String[] args) {
        int generados= 0, n;
        int[] numbers = new int[6];
        do{
            //Generando numeros
            n=(int) (Math.random()*49+1);
            if(!repetido(n,numbers,generados)){
                //Comparando si no estan repetidos
                numbers[generados]=n;
                generados++;
            }
        }while(generados<6);
        odernar(numbers);
        mostrar(numbers);
    }

    private static boolean repetido(int n, int[] numbers, int generados) {
        boolean res= false;
        for(int i=0;i<generados;i++){
            if(n==numbers[i]){
                res=true;
                break;
            }
        }
        return res;
    }

    private static void odernar(int[] numbers) {
        int aux;
        for(int i=0; i<numbers.length;i++){
            for(int k=i+1; k<numbers.length;k++){
                if(numbers[k]<numbers[i]){
                    aux=numbers[i];
                    numbers[i]=numbers[k];
                    numbers[k]=aux;
                }
            }
        }
    }

    private static void mostrar(int[] numbers) {
        for(int num:numbers){
            System.out.print(num + ", ");
        }
    }

    
}

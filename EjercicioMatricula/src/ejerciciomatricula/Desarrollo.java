/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciomatricula;
import java.util.Scanner;
import Porcentajes.Procej_Desc;
/**
 *
 * @author Usuario
 */
public class Desarrollo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        //Declaracion de variables
        int city;
        int age;
        int state;
        int cargas;
        double desc_city = 0;
        double desc_edad = 0;
        double desc_ecv = 0;
        double desc_cargas = 0;
        double final_cost = 0;
        double add_final;
        //Desarrollo de preguntas
        System.out.printf("Usted es de: \n "
                + " 1._Loja\n  2._Zamora\n  3._Otras Provincias\n ");
        city = entrada.nextInt();
        System.out.printf("Que edad tiene? \n ");
        age = entrada.nextInt();
        System.out.printf("Estado civil:\n 1._Soltero\n 2._Casado\n");
        state = entrada.nextInt();
        System.out.printf("Tiene cargas familiares:\n 1._Si:\n 2._No \n");
        cargas = entrada.nextInt();
        //Condicionales para el descuento
        if (city == 1 || city == 2){
        desc_city =  Procej_Desc.matric - Procej_Desc.desc_prov;
        }
        if (age >= 17 && age < 20){
        desc_edad = desc_city - Procej_Desc.desc_age;   
        }
        if (state == 2 ){
        desc_ecv = desc_edad - Procej_Desc.desc_state;
        }
        if (cargas == 1){
        desc_cargas = desc_ecv - Procej_Desc.desc_cargas;    
        }
        add_final = desc_cargas * 0.02;
        final_cost = desc_cargas + add_final;
        System.out.printf("El valor total a pagar de su matricula "
                + "es de un total de: $ %.2f", final_cost);
    }
}

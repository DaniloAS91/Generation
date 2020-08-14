package ex2_calculoImc;

import java.util.Scanner;

public class CalculoImc {
	public static void main(String[] args) {

        /*
         * 2- O IMC � �ndice de Massa Corporal � um crit�rio da Organiza��o Mundial de
         * Sa�de para dar uma indica��o sobre a condi��o de peso de uma pessoa adulta. A
         * f�rmula � IMC = peso / ( altura )2 Elabore um programa que leia o peso e a
         * altura de um adulto e mostre sua condi��o de acordo com a tabela abaixo. IMC
         * em adultos Condi��o Abaixo de 18,5 Abaixo do peso Entre 18,5 e 25 Peso normal
         * Entre 25 e 30 Acima do peso Acima de 30 obeso
         */

        Scanner sc = new Scanner(System.in);

        float IMC, peso, alt;

        System.out.println("Entre com o seu peso: ");
        peso = sc.nextFloat();
        System.out.println("Entre com sua altura: ");
        alt = sc.nextFloat();

        IMC = (peso)/(alt * alt);

        if (IMC <= 18.5){
            System.out.println("Voc� est� abaixo do peso normal!");
        }
        
        else if(IMC>=18.5 && IMC<=25.0) {
            System.out.println("Seu peso est� normal! ");
        }
        
        else if(IMC>=25.0 && IMC <=30.0) {
            System.out.println("Voc� est� acima do peso!");
        }
        
        else{
            System.out.println("Voc� est� obeso(a)! ");
        }
        sc.close();
	}
}

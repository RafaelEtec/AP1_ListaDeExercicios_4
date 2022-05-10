package Parte_1;
import java.util.Scanner;
/** 
   por Rafael Ferreira Goulart
**/
public class Exercicios1a7 {
    
    public static Scanner ent = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println(
                  "Qual atividade você deseja avaliar?\n"
                + "Insira o número da atividade de 1 a 6");
        int escolha = 0;
        try {
            escolha = ent.nextInt();
            while (escolha < 1 || escolha > 6) {
                System.out.println("É possível escolher apenas entre 1 e 6");
                escolha = ent.nextInt();
            }
        } catch (Exception ex){
            System.out.println("Letras não são permitidas!");
        }
        switch (escolha) {
            case 1:
                System.out.println(
                        "Implementar uma função que recebendo um array de números inteiros, escreva seus elementos no terminal.\n" +
                        "Ex: [8,2,10,5] => 8\n" +
                        "                  2\n" +
                        "                  10\n" +
                        "                  5\n");
                Exercicio1();
                break;
            case 2:
                System.out.println(
                        "Implementar uma função que recebendo um número limite, retorne um array contendo uma sequência de 0 até o número anterior ao limite.\n" +
                        "Ex: 5 => [0,1,2,3,4]\n");
                Exercicio2();
                break;
            case 3:
                System.out.println(
                        "Implementar uma função que recebendo um número limite, retorne um array contendo uma sequência do número anterior ao limite até 0.\n" +
                        "Ex: 5 => [4,3,2,1,0]\n");
                Exercicio3();
                break;
            case 4:
                System.out.println(
                        "Implementar uma função que recebendo um número limite, retorne um array contendo uma sequência de 1 até o número limite.\n" +
                        "Ex: 5 => [1,2,3,4,5]\n");
                Exercicio4();
                break;
            case 5:
                System.out.println(
                        "Implementar uma função que recebendo um número limite, retorne um array contendo uma sequência do número limite até 1.\n" +
                        "Ex: 5 => [5,4,3,2,1]\n");
                Exercicio5();
                break;
            case 6:
                System.out.println(
                        "Implementar uma função que recebendo um número de início e fim, retorne um array contendo uma sequência do número de início até o número final.\n" +
                        "Ex: (3, 8) => [3,4,5,6,7,8]\n" +
                        "   ou \n" +
                        "Ex: (3, 8) => [8,7,6,5,4,3]\n");
                Exercicio6();
                break;
        }
    }
    
    public static void Exercicio1() {  
        int tamanhoArray = entTamanhoArray();
        
        int[] intArray = new int[tamanhoArray];
        intArray = intArray(tamanhoArray); 
        System.out.println();
        
        for (int pos = 0; pos < tamanhoArray; pos++) {
            System.out.println(intArray[pos]+"\t");
        }
    }
    
    public static void Exercicio2() {
        
        int nLimite = nLimite();
        
        int[] nums = nums(nLimite);
        
        for (int pos = 0; pos < nLimite; pos++) {
            System.out.print(nums[pos]+" ");
        }
    }
    
    public static int[] nums(int nLimite) {
        int[] nums = new int[nLimite];
        for (int pos = 0; pos < nLimite; pos++) {
            nums[pos] = pos;
        }
        return nums;
    }
    
    public static void Exercicio3() {

        int nLimite = nLimite();
        
        int[] nums = numsDecrescente(nLimite);
        
        for (int pos = 0; pos < nLimite; pos++) {
            System.out.print(nums[pos]+" ");
        }
    }
    
    public static int[] numsDecrescente(int nLimite) {
        int[] nums = new int[nLimite];
        int nAnt = nLimite - 1;
        for (int pos = 0; pos < nLimite; pos++) {
            nums[pos] = nAnt;
            nAnt--;
        }
        return nums;
    }
    
    public static void Exercicio4() {
        
        int nLimite = nLimite();
        
        int[] nums = nums1aN(nLimite);
        
        for (int pos = 0; pos < nLimite; pos++) {
            System.out.print(nums[pos]+" ");
        }
    }
    
    public static int[] nums1aN(int nLimite) {
        int[] nums = new int[nLimite];
        for (int pos = 0; pos < nLimite; pos++) {
            nums[pos] = pos + 1;
        }
        return nums;
    }
    
    public static void Exercicio5() {
        
        int nLimite = nLimite();
        
        int[] nums = numsDecrescenteNa1(nLimite);
        
        for (int pos = 0; pos < nLimite; pos++) {
            System.out.print(nums[pos]+" ");
        }
    }
    
    public static int[] numsDecrescenteNa1(int nLimite) {
        int[] nums = new int[nLimite];
        int nAnt = nLimite;
        for (int pos = 0; pos < nLimite; pos++) {
            nums[pos] = nAnt;
            nAnt--;
        }
        return nums;
    }
    
    public static void Exercicio6() {
        
        int nInicio = nInicio();
        int nLimite = nLimite();
        int tamanhoArray;
        if (nInicio >= nLimite) {
            tamanhoArray = (nInicio - nLimite) + 1;
        } else {
            tamanhoArray = (nLimite - nInicio) + 1;
        }
        
        int[] nums = numsIaF(nLimite, nInicio, tamanhoArray);
        
        for (int pos = 0; pos < tamanhoArray; pos++) {
            System.out.print(nums[pos]+" ");
        }
    }
    
    public static int[] numsIaF(int nLimite, int nInicio, int tamanhoArray) {
        int[] nums = new int[tamanhoArray];
        if (nInicio >= nLimite) {
            for (int pos = 0; pos < tamanhoArray; pos++) {
                nums[pos] = nInicio;
                nInicio--;
            }
        } else {
            for (int pos = 0; pos < tamanhoArray; pos++) {
                nums[pos] = nInicio;
                nInicio++;
            }
        }
        
        return nums;
    }
    
    public static int[] intArray(int tamanhoArray) {
        
        int[] intArray = new int[tamanhoArray];
        
        for (int pos = 0; pos < tamanhoArray; pos++) {
            System.out.println("pos: "+pos+" - Insira o número da posição: ");
            int num = ent.nextInt();
            intArray[pos] = num;
        }
        
        return intArray;
    }
    
    public static int entTamanhoArray() {
        System.out.println("Insira a quantidade de números a serem guardados: ");
        int tamanhoArray = ent.nextInt();
        
        return tamanhoArray;
    }
    
    public static int nLimite() {
        System.out.println("Informe o valor Limite: ");
        int nLimite = ent.nextInt();
        
        return nLimite;
    }
    
    public static int nInicio() {
        System.out.println("Informe o valor Inicial: ");
        int nInicio = ent.nextInt();
        
        return nInicio;
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package random;

/**
 *
 * @author ondre
 */
public class Random {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  int min =1;
  int max =29;
  int[] a = new int[26];
  a[0] = (int)(Math.random()*(max-min+1)+min);
  for(int i=0;i<26;i++){          
     for(int j=0;j<i;j++){
         if(a[i]==a[j]){
             a[i] = (int)(Math.random()*(max-min+1)+min);
             j=0;        
         }
     }
     if(i>1){
     System.out.println(a[i]);
     }
  }
  
  
    }
    
}

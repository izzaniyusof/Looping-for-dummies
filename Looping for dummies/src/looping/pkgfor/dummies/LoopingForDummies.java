/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package looping.pkgfor.dummies;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class LoopingForDummies {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int num;
        int start=1;
        int end=10;
        int ans=0;
        System.out.println("Which times table do you want?");
        num = s.nextInt();
        for(start=1;start<=end;start++){
            System.out.println(start + " times " + num + " = " + (ans+num));
            ans= start*num;
        }
          }
             
        }
    
    

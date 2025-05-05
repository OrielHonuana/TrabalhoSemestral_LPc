/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools Templates
 * and open the template in the editor.
 */
package controlo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author oriel
 */
public class Validacoes {

    
    static String digitos="0123456789";
    static String simbolos="+ ­ * = <> < > <= >= \n" +
                "( ) [ ] := . , ; : ..  ";
   static String preservada="div or and not if then else of Record \n" +
                "while do begin end read write var array function |\n" +
                "procedure program true false char integer boolean Uses";
  static List<String>reservada =Arrays.asList("div","or", "and", "not","if", "then", "else", "of","Record","while","do"," begin", "end", "read", "write", "var", "array", "function", "procedure", "program", "true", "false", "char", "integer", "boolean","Uses","+","­","*","=","<",">","(",")","[","]",":",".",",",";",":");
    
   static String letras="a b c d e f g h i j k l m n o \n" +
"p q r s t u v w x y z A B C \n" +
"D E F G H I J K L M N O P \n" +
"Q R S T W V W X Y Z ";
  private  static boolean simbolo(String str) {
      boolean flag=false;
      for(int i=0;i<reservada.size()-1;i++){
          if(reservada.get(i).equalsIgnoreCase(str)){
           flag=true;
          break;
          }
      }
     return flag;
    }
  public static boolean digito(String str){
      boolean flag=true;
      for(int i=0;i<str.length();i++){
          if(!(digitos.contains(str.valueOf(str.charAt(i))))){
              flag=false;
              break;
          }
      }
           
      return flag;
  }
  
 
 /**
  * Metodo que verifica se uma String(identificador) e ou nao um identificador
  * se for retorna true
  * caso contrario retorna false
  * @param identificador
  * @return boolean
  */
 static boolean identificador(String identificador){
     boolean flag=true;
     if((letras.contains(identificador.substring(0, 1)))){// so entra no ciclo se o primeiro caracter for uma letra
         for(int i=1;i<=identificador.length()-1;i++){
            if( (letras.contains(identificador.charAt(i)+""))){
                flag=true;
            
         }
     }
     }else
         flag=false;
     return flag;
 }
 public static String validar(String str1){
     String str="";
     if(str1.endsWith(" "))
         str=str1.substring(0, str1.length()-1);
     else
         str=str1;
    if(simbolo(str))
         return "Simbolo especial";
    else
       if(digito(str))
        return "Digito";
       else
        if(identificador(str))
          return "Identificador";
        else
            return "Indefinido";
 }
}

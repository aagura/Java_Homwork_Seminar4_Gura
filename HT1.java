
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;


public class HT1 {
    // Даны два Deque, представляющие два целых числа. 
//     Цифры хранятся в обратном порядке и каждый из их узлов содержит одну цифру.
// 1) Умножьте два числа и верните произведение в виде связанного списка.
// 2) Сложите два числа и верните сумму в виде связанного списка. Одно или два числа могут быть отрицательными.

// Даны два Deque, цифры в обратном порядке.
// [3,2,1] - пример Deque
// [5,4,3]- пример второго Deque
// 1) 123 * 345 = 42 435
// Ответ всегда - связный список, в обычном порядке
// [4,2,4,3,5] - пример ответа
   
    public static  Deque<String> fillDequeue(String text) {
            Deque<String> dqu = new LinkedList<>();
            String [] array = text.split ("");
                for (String num : array) {
                dqu.addFirst(num);
                 }
            return dqu;
        }
    
    public static  Integer getnumber (Deque <String> dqu) {
            String text = "";
             while (!dqu.isEmpty()) {
                text= text + dqu.removeLast();
                 }
            return Integer.parseInt (text);
        }
    public static  LinkedList<String> fill_ll(Integer num) {
            LinkedList<String> ll = new LinkedList<>();
            String text = num.toString() ;
            String [] array = text.split ("");
                for (String i : array) {
                ll.add(i);
                 }
            return ll;
        }
    public static void main(String[] args) {    
    Scanner sc = new Scanner(System.in);
    System.out.println("Введите первое число:");
    String text1 = sc.nextLine();
    System.out.println("Введите второе число:");
    String text2 = sc.nextLine();
    
    Deque<String> num1Deque = new ArrayDeque<>();
    Deque<String> num2Deque = new ArrayDeque<>();
    num1Deque = fillDequeue (text1);
    num2Deque = fillDequeue (text2);
    System.out.println(num1Deque);
    System.out.println(num2Deque);
    Integer number1 = getnumber(num1Deque);
    Integer number2 = getnumber(num2Deque);
        
     int answer1 = number1*number2;
     int answer2 = number1 + number2;
    System.out.println("Произведение чисел в виде связанного списка:");
    System.out.println(fill_ll (answer1));
    System.out.println("Cумма чисел в виде связанного списка:");
    System.out.println(fill_ll (answer2));

  }
  
 
  }

    



package Perfect_Numbers;

/*CSC164-6C1 Computer Science II
Exam 1
Due Date: 2021/02/16
Author: Noel Martial Nguemechieu
 Description: This program find  all the perfect numbers between two integers provided by the user.

*
*
*
* */


import java.util.Scanner;



//Main class
public class Find_PerfectNumber {





    //Creating Global variables to store 2 user's inputs and sum
 private  static  int   input1=2,input2=1;
 
    private static int Sum=0;
    private static int counter=0;



    //Main method
public  static  void main(String[] args) {



    //Local variables




    //Display infos to get user inputs
    System.out.println("Enter a positive number (enter -1 to quit):");
    //Read user inputs and store using scanner object


    try (Scanner scanner = new Scanner(System.in)) {
        input1=scanner.nextInt();
        System.out.println("Enter a second number (enter -1 to quit):");// Display second message to get input[1]
        input2=scanner.nextInt();

        if(input1==-1||input2==-1) {



            System.out.println("Thank you for using perfect number finder!");System.out.close();//   Close program
        }

    }catch (Exception e){
            System.out.println("Invalid character!");
            System.out.close();

        }





    //Checking input for program exit




//Display Perfect numbers

    System.out.println( "Below are the perfect numbers between "+input1+" and "+ input2);



    for(int i=0;i<100;i++) {

        isPerfect( input1, input2);

        if(isPerfect( input1, input2)==true){


            counter++;
            System.out.println(Sum);//display sum
        }
    }

    System.out.println( "There are "+counter +" perfect numbers");

    }


// perfect method to check perfect numbers


    private static boolean Swapping(){


        //Swapping values to get range
        if(input1>input2){
           return  true;
        } return false;//not perfect
    }

    protected static boolean isPerfect(int input1, int input2) {
        int range = 12;

        if(Swapping()==true) {
            range = input1 - input2;
        }else if(Swapping()==false){
            range =input1-input2;
        }

        for ( int i = 1; i <= range; i++) {
            Sum=Sum+i;//sum numbers

            if (range%i==0 ) {


                    return true;
                }
            }
        return false;
    }

}//class end;


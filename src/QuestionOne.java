
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author NANDOM GUSEN
 */
public class QuestionOne {

    public static void main(String[] args) {
            System.out.println("The answer is " +getNumberOfPermutations(6));
    }

    // my function declaration
    public static int getNumberOfPermutations(int n) {  // int n is the input argument

        int permutation = (int) Math.pow(2, n);   

        return permutation;

    }

}

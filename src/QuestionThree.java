/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NANDOM GUSEN
 */
public class QuestionThree {

    public static void main(String[] args) {

        System.out.println("The answer is " + getNumberOfPermutations(5));

    }

    public static int getNumberOfPermutations(int n) {  // int n is the input argument

        int permutation = (int) Math.pow(2, n);  // Number of Permutation

        // If we must not have the same 3 balls together, it means that we will get first get the identical balls and subtract them from the total permutation
        // To get the Identical balls, we will run permutation % input value and subtract it from the permutation
        int identicalBalls = permutation % n;

        int answer = permutation - identicalBalls;

        return answer;

    }
}

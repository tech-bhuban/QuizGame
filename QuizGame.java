

import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int score = 0;
        
        System.out.println("QUIZ GAME");
        
        // Question 1
        System.out.println("\n1. What is 5 + 3?");
        System.out.println("a) 6");
        System.out.println("b) 8");
        System.out.println("c) 10");
        System.out.print("Answer: ");
        String ans1 = input.nextLine();
        if(ans1.equals("b")) {
            score++;
            System.out.println("Correct!");
        } else {
            System.out.println("Wrong! Answer is b) 8");
        }
        
        // Question 2
        System.out.println("\n2. What color is the sky on a clear day?");
        System.out.println("a) Green");
        System.out.println("b) Red");
        System.out.println("c) Blue");
        System.out.print("Answer: ");
        String ans2 = input.nextLine();
        if(ans2.equals("c")) {
            score++;
            System.out.println("Correct!");
        } else {
            System.out.println("Wrong! Answer is c) Blue");
        }
        
        // Question 3
        System.out.println("\n3. Which animal says 'meow'?");
        System.out.println("a) Dog");
        System.out.println("b) Cat");
        System.out.println("c) Cow");
        System.out.print("Answer: ");
        String ans3 = input.nextLine();
        if(ans3.equals("b")) {
            score++;
            System.out.println("Correct!");
        } else {
            System.out.println("Wrong! Answer is b) Cat");
        }
        
        System.out.println("\nYour score: " + score + "/3");
        
        if(score == 3) {
            System.out.println("Perfect! You're a genius! 🏆");
        } else if(score == 2) {
            System.out.println("Good job! 👍");
        } else {
            System.out.println("Keep learning! 📚");
        }
        
        input.close();
    }
}

// # Simple Quiz Game

// ## What it does
// A fun quiz with 3 questions to test your knowledge.

// ## How it works
// 1. Shows each question with options
// 2. You type your answer (a, b, or c)
// 3. Tells if you're right or wrong
// 4. Shows your score at the end

// ## Sample Questions
// - Math: 5 + 3 = ?
// - Science: Sky color?
// - Animals: What says meow?

// ## Scoring
// - 3/3: Perfect! 🏆
// - 2/3: Good job! 👍
// - 1/3 or less: Keep learning! 📚

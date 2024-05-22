package com.poly.polyapcsafinalproject23_24;

import com.poly.polyapcsafinalproject23_24.GameActivity;

import java.util.Scanner;

public class GameSalinasEmmanuel extends GameActivity {

    //instance variables
    //   variables you plan to use throughout the adventure
    private Scanner scan;
    private int numLives;

    public void run()
    {
        //initialize number of lives
        numLives = 5;
        //create a scanner object for user input
        scan = new Scanner(System.in);


        //display project title and description
        Util.clearConsole();
        System.out.println("An Abnormal Monday - High School Edition");
        System.out.println("\nYou wake up in your bed at 8:00am. You have free will.");

        Util.pauseConsole();
        start();
    }

    private void start()
    {
        Util.clearConsole();
        System.out.println("\nWhat will you do?");
        System.out.println("1.Go to school\n2.Stay home\n3.Ditch school");
        int choice = Util.enterInt(1,3);

        if(choice == 1)
        {
            goToSchool();
        }
        else if (choice == 2)
        {
            stayHome();
        }
        else if (choice == 3)
        {
            ditchSchool();
        } //Go to school path
    }

    private void goToSchool()
    {
        Util.clearConsole();
        System.out.println("Which choice will you make at school?");
        System.out.println("1.Go to class\n2.Ditch your 1st period");
        int choice = Util.enterInt(1,2);

        if (choice == 1)
        {
            goToClass();
        }
        else if (choice == 2)
        {
            ditchClass();
        }
    }

    private void goToClass()
    {
        Util.clearConsole();
        System.out.println("You have a sub 1st period. You start to get bored because its math class. What will you do next?");
        System.out.println("1.Take your phone out\n2.Focus");
        int choice = Util.enterInt(1,2);

        if (choice == 1)
        {
            Util.clearConsole();
            System.out.println("The sub sees you on your phone. He takes it away and you get expelled from school. You lose.");
            Util.pauseConsole();
            Util.clearConsole();
            defeat();
        }
        else if (choice == 2)
        {
            Util.clearConsole();
            System.out.println("You got really bored and end up falling asleep. You wake up and its pitch black. Then someone takes off a blindfold that you had on. Your in the back of a truck, you see a sign up ahead that says North Korea. You lose");
            Util.pauseConsole();
            Util.clearConsole();
            defeat();
        }
    }


    private void ditchClass()
    {
        Util.clearConsole();
        System.out.println("You decided to ditch class. You have to be careful to not get caught. What your next move?");
        System.out.println("1.Walk around the hallways\n2.Hide in the bathroom");
        int choice = Util.enterInt(1,2);

        if(choice == 1)
        {
            Util.clearConsole();
            System.out.println("Your walking around the hallways roaming free. You get caught by a staff and he realizes you're ditching. You get sent to the Gulag. You lose");
            Util.pauseConsole();
            Util.clearConsole();
            defeat();
        }
        else if (choice == 2)
        {
            Util.clearConsole();
            System.out.println("You hide in the bathroom until next period starts. You go to your next classes and finish school and go home. You win");
            Util.pauseConsole();
            Util.clearConsole();
            defeat();
        }
    }


    private void stayHome()
    {
        Util.clearConsole();
        System.out.println("You stayed home, whats the next move.");
        System.out.println("1.Stay in bed\n2.Grind and do homework");
        int choice = Util.enterInt(1,2);

        if (choice == 1)
        {
            stayInBed();
        }
        else if (choice == 2)
        {
            doHomework();
        }
    }


    private void stayInBed()
    {
        Util.clearConsole();
        System.out.println("You stay in bed and your mom walks in. She asks why you didnt go to school. What do you tell her?");
        System.out.println("1.Pretend your ill");
        System.out.println("2.Misbehave");
        int choice = Util.enterInt(1,2);

        if (choice == 1)
        {
            fakeIllness();
        }
        else if (choice == 2)
        {
            misBehave();
        }
    }
    private void fakeIllness()
    {
        Util.clearConsole();
        System.out.println("You lie and tell her your sick. She checked your temperature and she realizes your lying. How do you decide to resolve this problem?");
        System.out.println("1.Just play it safe and go to school\n2.Pretend your dying");
        int choice = Util.enterInt(1,2);

        if (choice == 1)
        {
            Util.clearConsole();
            System.out.println("You end up going to school so you dont get in trouble. you win");
            Util.pauseConsole();
            start();
        }
        else if (choice == 2)
        {
            Util.clearConsole();
            System.out.println("You hyperventilate to pass out on purpose. Your plan backfired, you die from a lack of oxygen. You lose");
            Util.pauseConsole();
            defeat();
        }
    }


    private void misBehave()
    {
        Util.clearConsole();
        System.out.println("You tell her you didn't feel like it. She grabs the belt and beats you. You lose");
        Util.pauseConsole();
        defeat();
    }


    private void doHomework()
    {
        Util.clearConsole();
        System.out.println("You decide to do homework and your mom walks in and asks why you didn't go to school. How do you respond to her?");
        System.out.println("1.Be rude to her\n2.Tell her a valid reason");
        int choice = Util.enterInt(1,2);

        if (choice == 1)
        {
            Util.clearConsole();
            System.out.println("You rudely tell her your gonna stay home and do homework because you feel like it. She gets mad. You lose");
            Util.pauseConsole();
            defeat();
        }
        else if (choice == 2)
        {
            Util.clearConsole();
            System.out.println("You tell her that your gonna catch up on missing assignments. She let's it slide. You win");
            Util.pauseConsole();
            start();
        }
    }



    private void ditchSchool()
    {
        Util.clearConsole();
        System.out.println("You decided to ditch school, How will you spend your time?");
        System.out.println("1.Meet up with a friend\n2.Walk around the city");
        int choice = Util.enterInt(1,2);

        if (choice == 1)
        {
            meetUpWithFriend();
        }
        else if (choice == 2)
        {
            walkTheCity();
        }
    }

    private void meetUpWithFriend()
    {
        Util.clearConsole();
        System.out.println("You and your friend meet up and go to a mall. While shopping your friend gets into a problem with someone in the store over shoes. What is the smart play?");
        System.out.println("1.Just stand there and watch\n2.Walk out of the store");
        int choice = Util.enterInt(1,2);

        if(choice == 1)
        {
            standLikeNpc();
        }
        else if (choice == 2)
        {
            Util.clearConsole();
            System.out.println("You and your friend walk out in shame. Your friend didn't get the shoes he wanted. You lose");
            Util.pauseConsole();
            defeat();
        }
    }

    private void standLikeNpc()
    {
        Util.clearConsole();
        System.out.println("You wait there and watch what is going down, it starts to get more tense and looks like the guy is about to swing. How do you resolve the issue?");
        System.out.println("1.Just stand there again\n2.Punch the guy");
        int choice = Util.enterInt(1,2);

        if (choice == 1)
        {
            Util.clearConsole();
            System.out.println("You decide to stand there and do nothing. Your friend and the guy fight and the staff break it up. They call your parents to tell them what happened. You get them in trouble. You lose");
            Util.pauseConsole();
            defeat();
        }
        else if (choice == 2)
        {
            Util.clearConsole();
            System.out.println("You punch the guy. he punches you back, you get knocked out. You lose.");
            Util.pauseConsole();
            defeat();
        }

    }


    private void walkTheCity()
    {
        Util.clearConsole();
        System.out.println("You go on a walk around the city. A man approaches you and asks for a dollar. What will you do next?");
        System.out.println("1.Lie and say you dont have money\n2.Give him the dollar");
        int choice = Util.enterInt(1,2);

        if  (choice == 1)
        {
            Util.clearConsole();
            System.out.println("Your lie didn't work, he sees your wallet poking out of your pocket. He slaps you and you die. You lose");
            Util.pauseConsole();
            defeat();
        }
        else if (choice == 2)
        {
            Util.clearConsole();
            System.out.println("You give him a dollar. He is grateful, You win");
            Util.pauseConsole();
            start();
        }
    }




    private void defeat()
    {
        //run method when defeated
        Util.clearConsole();


        //lose a life
        numLives--;

        //clear console, display text, etc
        System.out.println("game over, try again.");
        Util.pauseConsole();

        //determine if player gets to play again
        if (numLives > 0)
        {
            //if you still have lives, return to start()
            start();
        }
        else
        {
            System.out.println("GAME OVER");
        }
    }
}
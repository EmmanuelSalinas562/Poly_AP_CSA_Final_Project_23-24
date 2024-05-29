package com.poly.polyapcsafinalproject23_24;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.poly.polyapcsafinalproject23_24.GameActivity;


public class GameSalinasEmmanuel extends GameActivity {

    //instance variables
    //   variables you plan to use throughout the adventure
    private TextView tvTitle, tvSubtitle, tvStoryText;
    private ImageView ivStory;
    private Button btn1, btn2, btn3;
    private boolean isWon;
    private int numLives;
    @Override
    protected void run() {
        setContentView(R.layout.activity_game_3_button);

        tvTitle = findViewById(R.id.tv_title_txt);
        tvSubtitle = findViewById(R.id.tv_subtitle);
        tvStoryText = findViewById(R.id.tv_story);
        ivStory = findViewById(R.id.iv_story);
        btn1 = findViewById(R.id.btn_1);
        btn2 = findViewById(R.id.btn_2);
        btn3 = findViewById(R.id.btn_3);

        //initialize number of lives
        numLives = 5;
        //create a scanner object for user input
        //display project title and description
        tvTitle.setText("An Abnormal Monday - High School Edition");
        tvSubtitle.setText("You wake up in your bed at 8:00am. You have free will.");

        start();
    }

    private void setAllBtnsVisible()
    {
        btn1.setVisibility(View.VISIBLE);
        btn2.setVisibility(View.VISIBLE);
        btn3.setVisibility(View.VISIBLE);
    }

    )

    private void start()
    {
        isWon = false;

        tvStoryText.setText("What will you do?");

        setAllBtnsVisible();
        btn1.setText("Go to school");
        btn2.setText("Stay home");
        btn3.setText("Dtich school");

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToSchool();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stayHome();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ditchSchool();
            }
        });


    }

    private void goToSchool()
    {
        tvStoryText.setText("Which choice will you make at school?");

        setAllBtnsVisible();
        btn1.setText("Go to class");
        btn2.setText("Ditch your 1st period");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToClass();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ditchClass();
            }
        });
    }

    private void goToClass()
    {
        tvStoryText.setText("You have a sub 1st period. You start to get bored because its math class. What will you do next?");
        setAllBtnsVisible();
        btn1.setText("Take your phone out");
        btn2.setText("Focus");
        btn3.setVisibility(View.INVISIBLE);

        if (choice == 1)
        {
            System.out.println("The sub sees you on your phone. He takes it away and you get expelled from school. You lose.");
            defeat();
        }
        else if (choice == 2)
        {
            System.out.println("You got really bored and end up falling asleep. You wake up and its pitch black. Then someone takes off a blindfold that you had on. Your in the back of a truck, you see a sign up ahead that says North Korea. You lose");
            defeat();
        }
    }


    private void ditchClass()
    {
        System.out.println("You decided to ditch class. You have to be careful to not get caught. What your next move?");
        System.out.println("1.Walk around the hallways\n2.Hide in the bathroom");

        if(choice == 1)
        {
            System.out.println("Your walking around the hallways roaming free. You get caught by a staff and he realizes you're ditching. You get sent to the Gulag. You lose");
            defeat();
        }
        else if (choice == 2)
        {
            System.out.println("You hide in the bathroom until next period starts. You go to your next classes and finish school and go home. You win");
            defeat();
        }
    }


    private void stayHome()
    {
        System.out.println("You stayed home, whats the next move.");
        System.out.println("1.Stay in bed\n2.Grind and do homework");

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
        System.out.println("You stay in bed and your mom walks in. She asks why you didnt go to school. What do you tell her?");
        System.out.println("1.Pretend your ill");
        System.out.println("2.Misbehave");

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
        System.out.println("You lie and tell her your sick. She checked your temperature and she realizes your lying. How do you decide to resolve this problem?");
        System.out.println("1.Just play it safe and go to school\n2.Pretend your dying");

        if (choice == 1)
        {
            System.out.println("You end up going to school so you dont get in trouble. you win");
            start();
        }
        else if (choice == 2)
        {
            System.out.println("You hyperventilate to pass out on purpose. Your plan backfired, you die from a lack of oxygen. You lose");
            defeat();
        }
    }


    private void misBehave()
    {
        System.out.println("You tell her you didn't feel like it. She grabs the belt and beats you. You lose");
        defeat();
    }


    private void doHomework()
    {
        System.out.println("You decide to do homework and your mom walks in and asks why you didn't go to school. How do you respond to her?");
        System.out.println("1.Be rude to her\n2.Tell her a valid reason");

        if (choice == 1)
        {
            System.out.println("You rudely tell her your gonna stay home and do homework because you feel like it. She gets mad. You lose");
            defeat();
        }
        else if (choice == 2)
        {
            System.out.println("You tell her that your gonna catch up on missing assignments. She let's it slide. You win");
            start();
        }
    }



    private void ditchSchool()
    {
        System.out.println("You decided to ditch school, How will you spend your time?");
        System.out.println("1.Meet up with a friend\n2.Walk around the city");

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
        System.out.println("You and your friend meet up and go to a mall. While shopping your friend gets into a problem with someone in the store over shoes. What is the smart play?");
        System.out.println("1.Just stand there and watch\n2.Walk out of the store");

        if(choice == 1)
        {
            standLikeNpc();
        }
        else if (choice == 2)
        {
            System.out.println("You and your friend walk out in shame. Your friend didn't get the shoes he wanted. You lose");
            defeat();
        }
    }

    private void standLikeNpc()
    {
        System.out.println("You wait there and watch what is going down, it starts to get more tense and looks like the guy is about to swing. How do you resolve the issue?");
        System.out.println("1.Just stand there again\n2.Punch the guy");

        if (choice == 1)
        {
            System.out.println("You decide to stand there and do nothing. Your friend and the guy fight and the staff break it up. They call your parents to tell them what happened. You get them in trouble. You lose");
            defeat();
        }
        else if (choice == 2)
        {
            System.out.println("You punch the guy. he punches you back, you get knocked out. You lose.");
            defeat();
        }

    }


    private void walkTheCity()
    {
        System.out.println("You go on a walk around the city. A man approaches you and asks for a dollar. What will you do next?");
        System.out.println("1.Lie and say you dont have money\n2.Give him the dollar");

        if  (choice == 1)
        {
            System.out.println("Your lie didn't work, he sees your wallet poking out of your pocket. He slaps you and you die. You lose");
            defeat();
        }
        else if (choice == 2)
        {
            System.out.println("You give him a dollar. He is grateful, You win");
            start();
        }
    }




    private void defeat()
    {
        //run method when defeated


        //lose a life
        numLives--;

        //clear console, display text, etc
        System.out.println("game over, try again.");

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
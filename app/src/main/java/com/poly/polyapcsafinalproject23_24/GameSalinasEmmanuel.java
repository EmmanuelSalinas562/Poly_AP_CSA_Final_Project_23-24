package com.poly.polyapcsafinalproject23_24;

import android.content.Intent;
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



    private void start()
    {
        ivStory.setImageResource(R.drawable.im_salinasemmanuel_waknigup);
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
        ivStory.setImageResource(R.drawable.im_salinasemmanuel_gotoclass);
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

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                takePhoneOut();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Focus();
            }
        });


    }

    private void takePhoneOut()
    {
        isWon = true;
        tvStoryText.setText("The sub sees you on your phone. He takes it away and you get expelled from school. You lose.");

        setAllBtnsVisible();
        btn1.setText("next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                defeat();
            }
        });

    }

    private void Focus()
    {

        tvStoryText.setText("You got really bored and end up falling asleep. You wake up and its pitch black. Then someone takes off a blindfold that you had on. Your in the back of a truck, you see a sign up ahead that says North Korea. You lose");

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                defeat();
            }
        });
    }




    private void ditchClass()
    {
        tvStoryText.setText("You decided to ditch class. You have to be careful to not get caught. What your next move?");
        setAllBtnsVisible();
        btn1.setText("walk around the hallways");
        btn2.setText("Hide in the bathroom");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                walkAround();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HideInBathroom();
            }
        });
    }

    private void walkAround()
    {

        isWon = false;
        tvStoryText.setText("Your walking around the hallways roaming free. You get caught by a staff and he realizes you're ditching. You get sent to the Gulag. You lose");
        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                defeat();
            }
        });
    }

    private void HideInBathroom()
    {
        isWon = true;
        tvStoryText.setText("You hide in the bathroom until next period starts. You go to your next classes and finish school and go home. You win");

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                defeat();
            }
        });

    }






    private void stayHome()
    {
        tvStoryText.setText("You stayed home, whats the next move.");

        setAllBtnsVisible();
        btn1.setText("stay in bed");
        btn2.setText("Grind and do homework");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stayInBed();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doHomework();
            }
        });
    }




    private void stayInBed()
    {

        tvStoryText.setText("You stay in bed and your mom walks in. She asks why you didnt go to school. What do you tell her?");
        setAllBtnsVisible();
        btn1.setText("pretend your ill");
        btn2.setText("misbehave");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fakeIllness();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                misBehave();
            }
        });
    }

    private void fakeIllness()
    {
        tvStoryText.setText("You lie and tell her your sick. She checked your temperature and she realizes your lying. How do you decide to resolve this problem?");
        setAllBtnsVisible();
        btn1.setText("Just play it safe and go to school");
        btn2.setText("pretend your dying");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playItSafe();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pretendYourDying();
            }
        });
    }

    private void playItSafe()
    {
        isWon = true;
        tvStoryText.setText("You end up going to school so you dont get in trouble. you win");
        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                defeat();
            }
        });
    }

    private void pretendYourDying()
    {
        isWon = false;
        tvStoryText.setText("You hyperventilate to pass out on purpose. Your plan backfired, you die from a lack of oxygen. You lose");
        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                defeat();
            }
        });


    }


    private void misBehave()
    {
        isWon = false;
        tvStoryText.setText("You tell her you didn't feel like it. She grabs the belt and beats you. You lose");

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                defeat();
            }
        });

    }
    private void doHomework()
    {
        tvStoryText.setText("You decide to do homework and your mom walks in and asks why you didn't go to school. How do you respond to her?");
        setAllBtnsVisible();
        btn1.setText("be rude to her");
        btn2.setText("tell her a valid reason");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                beRude();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sayAValidReason();
            }
        });
    }

    private void beRude()
    {
        isWon = false;
        tvStoryText.setText("You rudely tell her your gonna stay home and do homework because you feel like it. She gets mad. You lose");

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                defeat();
            }
        });
    }

    private void sayAValidReason()
    {
        isWon = true;
        tvStoryText.setText("You tell her that your gonna catch up on missing assignments. She let's it slide. You win");

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                defeat();
            }
        });
    }

    private void ditchSchool()
    {
        tvStoryText.setText("You decided to ditch school, How will you spend your time?");

        setAllBtnsVisible();
        btn1.setText("meet up with a friend");
        btn2.setText("walk around the city");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                meetUpWithFriend();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                walkTheCity();
            }
        });
    }
    private void meetUpWithFriend()
    {
        tvStoryText.setText("You and your friend meet up and go to a mall. While shopping your friend gets into a problem with someone in the store over shoes. What is the smart play?");


        setAllBtnsVisible();
        btn1.setText("just stand there and watch");
        btn2.setText("walk out of the store");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                standLikeNpc();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                walkOutStore();
            }
        });
    }

    private void walkOutStore()
    {
        isWon = false;
        tvStoryText.setText("You and your friend walk out in shame. Your friend didn't get the shoes he wanted. You lose");

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                defeat();
            }
        });

    }

    private void standLikeNpc()
    {
        tvStoryText.setText("You wait there and watch what is going down, it starts to get more tense and looks like the guy is about to swing. How do you resolve the issue?");

        setAllBtnsVisible();
        btn1.setText("just stand there again");
        btn2.setText("punch the guy");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                standThereAgain();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                punchTheGuy();
            }
        });
    }

    private void standThereAgain()
    {
        isWon = false;
        tvStoryText.setText("You decide to stand there and do nothing. Your friend and the guy fight and the staff break it up. They call your parents to tell them what happened. You get them in trouble. You lose");

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                defeat();
            }
        });

    }

    private void punchTheGuy()
    {
        isWon = false;
        tvStoryText.setText("You punch the guy. he punches you back, you get knocked out. You lose.");

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
    }


    private void walkTheCity()
    {
        tvStoryText.setText("You go on a walk around the city. A man approaches you and asks for a dollar. What will you do next?");

        setAllBtnsVisible();
        btn1.setText("lie and say you dont have money");
        btn2.setText("give him the dollar");
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lieToHim();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                giveHimDollar();
            }
        });



    }

    private void lieToHim()
    {
        isWon = false;
        tvStoryText.setText("Your lie didn't work, he sees your wallet poking out of your pocket. He slaps you and you die. You lose");

        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                defeat();
            }
        });
    }

    private void giveHimDollar()
    {
        tvStoryText.setText("You give him a dollar. He is grateful, You win");
        setAllBtnsVisible();
        btn1.setText("Next");
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                defeat();
            }
        });
    }




    private void defeat()
    {
        //run method when defeated


        //lose a life
        numLives--;

        //clear console, display text, etc
        tvStoryText.setText("game over, try again.");

        //determine if player gets to play again
        if (numLives > 0)
        {
            //if you still have lives, return to start()
            start();
        }
        else
        {
            tvStoryText.setText("GAME OVER");
            btn1.setText("Back to menu");

            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(GameSalinasEmmanuel.this, MainActivity.class));
                }
            });

        }
    }
}
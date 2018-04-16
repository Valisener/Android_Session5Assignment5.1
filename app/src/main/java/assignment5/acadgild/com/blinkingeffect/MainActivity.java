package assignment5.acadgild.com.blinkingeffect;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements Animation.AnimationListener{
//      Define the button for start animation
        private Button btnStartAnimation;
//      Define the text View that holds the text to show up on screen that blinks
        private TextView txtView;
//      Define  the animation variable that holds the animation blinking_effect
        private Animation blinkEffectAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Set layout
        setContentView(R.layout.activity_main);

        //Initialization of  button by linking it with the button on the activity
        btnStartAnimation = (Button) findViewById(R.id.button);
        //Initialization of  view by linking it with the textview on the activity
        txtView = (TextView) findViewById(R.id.textView);

//        Set the animation effect to the variable
        final Animation blinkEffectAnimation = AnimationUtils.loadAnimation(this, R.anim.blinking_effect);


        //Set the onlick listener for the button animation and add the override for onclick so it
        // uses my own code
        btnStartAnimation.setOnClickListener(new View.OnClickListener() {
//          override the method
            @Override
            public void onClick(View view) {
                // Set the text view to visible so it can be seen
                txtView.setVisibility(view.VISIBLE);
                //Start the animation on the view it will have a blinking effect of fading in
                // and out indefintely
                txtView.startAnimation(blinkEffectAnimation);
            }
        });


    }

//  override the method on animation start
//  I do not really need to use this since i set up everything needed in one animation effect
//  but i still need it to be overrided so here it is
    @Override
    public void onAnimationStart(Animation animation) {

    }
//  override the method on animation end
//  I do not really need to use this since i set up everything needed in one animation effect
//  but i still need it to be overrided so here it is
    @Override
    public void onAnimationEnd(Animation animation) {

    }
//  override the method on animation repeat
//  I do not really need to use this since i set up everything needed in one animation effect
//  but i still need it to be overrided so here it is
    @Override
    public void onAnimationRepeat(Animation animation) {

    }
}

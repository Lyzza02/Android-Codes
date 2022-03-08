package com.example.androidapptwo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RatingBar;
import android.widget.RatingBar.OnRatingBarChangeListener;
import android.widget.Toast;
import android.widget.ToggleButton;

class MainActivity : AppCompatActivity() {
    var text: CharSequence? = null
    var duration = Toast.LENGTH_SHORT

    var check_box = "No Selection"
    var radio_button = "No Selection"
    var toggle_button = "Off"
    var rating_bar = "0.0"
    var edit_text = ""
    var fruit = false
    var meat = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_text = findViewById<Button>(R.id.btn_txt)
        btn_text.setOnClickListener {
            text = "You Clicked Text Button"
            val toast = Toast.makeText(applicationContext, text, duration)
            toast.show()
        }

        val ratingBar = findViewById<View>(R.id.rbar_star) as RatingBar
        ratingBar.onRatingBarChangeListener =
            OnRatingBarChangeListener { ratingBar, rating, fromUser ->
                rating_bar = rating.toString()
            }
    }

    fun doButtonTextImage(v: View) {
        text = "You Clicked Image Text Button"
        val toast = Toast.makeText(applicationContext, text, duration)
        toast.show()
    }

    fun doImageButton(v: View) {
        text = "You Clicked Image Button"
        val toast = Toast.makeText(applicationContext, text, duration)
        toast.show()
    }

    fun doCheckBox(v: View) {
        val checked = (v as CheckBox).isChecked
        when (v.getId()) {
            R.id.cbx_fruit -> fruit = if (checked) true else false
            R.id.cbx_meat -> meat = if (checked) true else false
        }
        check_box = if (fruit && meat) {
            "Fruit and Meat"
        } else if (fruit) {
            "Fruit"
        } else if (meat) {
            "Meat"
        } else {
            "No Selection"
        }
    }

    fun doRadioButton(v: View) {
        val checked = (v as RadioButton).isChecked
        when (v.getId()) {
            R.id.rbtn_one -> if (checked) radio_button = "One"
            R.id.rbtn_two -> if (checked) radio_button = "Two"
            R.id.rbtn_three -> if (checked) radio_button = "Three"
            else ->  if (!checked) radio_button = "No Selection"
        }
    }

    fun doToggleButton(v: View) {
        val on = (v as ToggleButton).isChecked
        toggle_button = if (on) {
            "On"
        } else {
            "Off"
        }
    }

    fun doButton(v: View?) {
        val etxt_msg = findViewById<View>(R.id.etxt_msg) as EditText
        edit_text = etxt_msg.text.toString()

        text = "\rCheck Box: $check_box\n"
        text = """
               ${text.toString()}Radio Button: $radio_button

               """.trimIndent()
        text = """
               ${text.toString()}Toggle Button: $toggle_button

               """.trimIndent()
        text = """
               ${text.toString()}Rating Bar: $rating_bar

               """.trimIndent()

        text = text.toString() + "Edit Text: " + edit_text
        text = text.toString() + edit_text
        val toast = Toast.makeText(applicationContext, text, duration)
        toast.show()
    }
}
package com.example.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       setListeners()

    }

     private fun setListeners(){


        val clickableViews: List<View> =
            listOf(box_one_text, box_two_text, box_three_text,
                box_four_text, box_five_text, rootConstraintLayout,
                red_button, green_button, yellow_button
            )

        for (item in clickableViews){
            item.setOnClickListener(){makeColored(it)}


            val redbutton = findViewById<TextView>(R.id.red_button)
            val greenButton = findViewById<TextView>(R.id.green_button)
            val yellowButton = findViewById<TextView>(R.id.yellow_button)
        }
    }



    private fun makeColored(view: View) {
        when (view.id) { //switch(id)

            // Boxes using Color class colors for the background
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            //R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)
            R.id.box_two_text -> view.setBackgroundResource(R.drawable.image_two)
            R.id.box_three_text -> view.setBackgroundColor(Color.BLUE)
            R.id.box_four_text -> view.setBackgroundColor(Color.MAGENTA)
            R.id.box_five_text -> view.setBackgroundColor(Color.BLUE)

            R.id.red_button -> box_three_text.setBackgroundResource(R.color.my_red)
            R.id.yellow_button -> box_four_text.setBackgroundResource(R.color.my_yellow)
            R.id.green_button -> box_five_text.setBackgroundResource(R.color.my_green)

            else -> view.setBackgroundColor(Color.LTGRAY)

        }
    }
}

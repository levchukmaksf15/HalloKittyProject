package com.non_zero.hallokitty

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var mHelloTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageButton.setOnClickListener{
            if (editText.text.isEmpty()){
                textView.text = "Hello Kitty"
            } else {
                textView.text = "Hello, " + editText.text
            }
        }
    }
}

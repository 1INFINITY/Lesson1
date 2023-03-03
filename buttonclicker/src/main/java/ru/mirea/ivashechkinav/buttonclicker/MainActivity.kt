package ru.mirea.ivashechkinav.buttonclicker

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var textViewStudent: TextView
    lateinit var bthWhoAmI: Button
    lateinit var btnItIsNotMe: Button
    lateinit var checkBox: CheckBox

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textViewStudent = findViewById(R.id.tvOut)
        bthWhoAmI = findViewById(R.id.btnWhoAmI)
        btnItIsNotMe = findViewById(R.id.btnItIsNotMe)
        checkBox = findViewById(R.id.checkBox)

        bthWhoAmI.setOnClickListener {
            checkBox.isChecked = true
            textViewStudent.text = "Мой номер по списку 7"
        }
    }
    fun onMyButtonCLick(view: View){
        checkBox.isChecked = false
        textViewStudent.text = "Это не я сделал"
    }
}
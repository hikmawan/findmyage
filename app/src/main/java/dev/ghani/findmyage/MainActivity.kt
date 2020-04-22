package dev.ghani.findmyage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Exception
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnFind.setOnClickListener{
           getAge()
        }
    }

    fun getAge(){
        try {
            val userDOB = Integer.parseInt(etDOB.text.toString())
            val currentYear = Calendar.getInstance().get(Calendar.YEAR)
            val userAge = currentYear  - userDOB

            tvAge.text = "Your Age is $userAge Years"
        } catch (ex:Exception){
            Log.d("Error", "bukan angka " + ex.message)
        }

    }
}

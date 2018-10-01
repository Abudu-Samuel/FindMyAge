package leumas.startup.com

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    private val currentYear = Calendar.getInstance().get(Calendar.YEAR)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    private fun calculateAge(dateOfBirth: Int): Int {
        return currentYear - dateOfBirth
    }

     fun clickButton(view: View) {
        val userInput: Int = dob.text.toString().toInt()

        calculateAge(userInput)
        displayAge.text = "Your age is ${calculateAge(userInput)} years"
    }

}
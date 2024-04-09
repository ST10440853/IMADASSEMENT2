package com.example.imadassement

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    private var edtAge:EditText? = null
    private var tvDisplay: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtAge = findViewById(R.id.edtAge)
        tvDisplay = findViewById(R.id.tvDisplayMessage)

        val btnGenerate = findViewById<Button>(R.id.btnGenerate)

        btnGenerate.setOnClickListener {
            generate()
        }

        val btnClear = findViewById<Button>(R.id.btnClear)

        btnClear.setOnClickListener {
            clear()
        }

    }
    private fun generate(){

        var intAge : Int = 0
        var strOutput = ""


        val strEnteredValue = edtAge?.text.toString().trim()

        if (strEnteredValue.isEmpty()){
            edtAge?.error = "Please enter a number "
            return
        }
        try {
            intAge = strEnteredValue.toInt()
            if (intAge < 20 || intAge > 100 ){
                // tvDisplay?.text = " Error - Invalid Age "
                edtAge?.error = "Invalid Age Entered "
            }else{
                when (intAge) {

                    76 -> strOutput = "Albert Einstein: Physicist known for the theory of relativity. Passed away at the age of 76 in 1955."
                    36 -> strOutput = "Marilyn Monroe: Iconic actress and model. Passed away at the age of 36 in 1962."
                    46 -> strOutput = "John F. Kennedy: 35th President of the United States. Assassinated at the age of 46 in 1963."
                    39 -> strOutput = "Martin Luther King Jr.: Civil rights leader and Nobel Peace Prize laureate. Assassinated at the age of 39 in 1968."
                    42 -> strOutput = "Elvis Presley: King of Rock and Roll. Passed away at the age of 42 in 1977."
                    91 -> strOutput = "Pablo Picasso: Influential painter and sculptor. Passed away at the age of 91 in 1973."
                    66 -> strOutput = "Indira Gandhi: Prime Minister of India. Assassinated at the age of 66 in 1984."
                    90 -> strOutput = "Winston Churchill: British Prime Minister. Passed away at the age of 90 in 1965."
                    82 -> strOutput = "Mao Zedong: Chinese Communist revolutionary. Passed away at the age of 82 in 1976."
                    65 -> strOutput = "Walt Disney: Founder of The Walt Disney Company. Passed away at the age of 65 in 1966."
                    88 -> strOutput = "Charlie Chaplin: Iconic actor and filmmaker. Passed away at the age of 88 in 1977."
                    81 -> strOutput = "Richard Nixon: 37th President of the United States. Passed away at the age of 81 in 1994."
                    93 -> strOutput = "Ronald Reagan: 40th President of the United States. Passed away at the age of 93 in 2004."
                    87 -> strOutput = "Margaret Thatcher: Prime Minister of the United Kingdom. Passed away at the age of 87 in 2013."
                    77 -> strOutput = "Lucille Ball: Actress and comedian. Passed away at the age of 77 in 1989."
                    63 -> strOutput = "Audrey Hepburn: Iconic actress and humanitarian. Passed away at the age of 63 in 1993."
                    24 -> strOutput = "James Dean: Actor known for Rebel Without a Cause. Passed away at the age of 24 in 1955."
                    22 -> strOutput = "Buddy Holly: Rock and roll pioneer. Passed away at the age of 22 in 1959."
                    29 -> strOutput = "Hank Williams: Influential country music singer-songwriter. Passed away at the age of 29 in 1953."
                    50 -> strOutput = "Michael Jackson: patented a pair of shoes that had a mechanism for allowing the wearer to lean forward beyond their center of gravity without falling.passed away at the age of 50 in 2009."
                    42 -> strOutput = "Elvis Presley: Elvis Presley had an identical twin brother named Jesse Garon Presley, who was stillborn. Elvis Presley had an identical twin brother named Jesse Garon Presley, who was stillborn.passed away at the age of 42 in 1977."
                    42 -> strOutput =  "John Lennon:  wrote and illustrated a series of nonsensical stories and poems. Passed away at the age of 40 in 1980"
                    36 -> strOutput = "Princess Diana: Remembered for her humanitarian work and global impact. Passed away at the age of 36 in 1997"
                    63 -> strOutput = "Audrey Hepburn: Acclaimed actress and humanitarian. Passed away at the age of 63 in 1993"
                    57 -> strOutput = "Prince: Renowned musician and performer. Passed away at the age of 57 in 2016"
                    27 -> strOutput = "Jimi Hendrix: Legendary guitarist and rock icon. Passed away at the age of 27 in 1970"
                    46 -> strOutput = "John F. Kennedy: 35th President of the United States. Passed away at the age of 46 in 1963"
                    56 -> strOutput = "Steve Jobs: Co-founder of Apple Inc. Passed away at the age of 56 in 2011"
                    32 -> strOutput = "Bruce Lee: Martial arts icon and actor. Passed away at the age of 32 in 1973"
                    87 -> strOutput = "Mother Teresa: Renowned for her charitable work with the poor in India. Passed away at the age of 87 in 1997"
                    41 -> strOutput = "Kobe Bryant: NBA basketball legend. Passed away at the age of 41 in 2020"
                    100 -> strOutput = "Bob Hope: Legendary comedian and actor. Passed away at the age of 100 in 2003"
                    95 -> strOutput = "Nelson Mandela: Anti-apartheid revolutionary and former President of South Africa. Passed away at the age of 95 in 2013"
                    79 -> strOutput = "Elizabeth Taylor: Iconic actress and humanitarian. Passed away at the age of 79 in 2011"
                    33 -> strOutput = "John Belushi: Notable comedian and actor. Passed away at the age of 33 in 1982"
                    27 -> strOutput = "Jim Morrison: Lead vocalist of The Doors. Passed away at the age of 27 in 1971"



                    else -> {
                        strOutput = "Nothing in the data set "
                    }
                }
            }
            tvDisplay?.text = strOutput

        }catch (e:NumberFormatException){
            edtAge?.error = "Enter a valid number"

        }
        /*
         if (intAge < 20 || intAge > 100 ){
            // tvDisplay?.text = " Error - Invalid Age "
                 edtAge?.error = "Invalid Age Entered "
         }else{
             when (intAge) {
                 21 -> strOutput = "s21"
                 23 -> strOutput = "s23"
                 else -> {
                     strOutput = "Nothing in the data set "
                 }
             }
         }

         tvDisplay?.text = strOutput
       */

    }
    private fun clear(){

        edtAge?.text = null
        tvDisplay?.text = ""

    }
}
package com.mobileappdevelopment.basiccalculator

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import net.objecthunter.exp4j.ExpressionBuilder //importing the dependencies for exp4j


class MainActivity : AppCompatActivity() {

    lateinit var txtViewShowDigits: TextView
    lateinit var txtViewShowOutput: TextView

    lateinit var btnClear: Button
    lateinit var btnUndo: Button
    lateinit var btnPercentage: Button
    lateinit var btnDivision: Button

    lateinit var btnSeven: Button
    lateinit var btnEight: Button
    lateinit var btnNine: Button
    lateinit var btnMultiply: Button

    lateinit var btnFour: Button
    lateinit var btnFive: Button
    lateinit var btnSix: Button
    lateinit var btnMinus: Button

    lateinit var btnOne: Button
    lateinit var btnTwo: Button
    lateinit var btnThree: Button
    lateinit var btnPlus: Button

    lateinit var btnZero: Button
    lateinit var btnDoubleZero: Button
    lateinit var btnDot: Button
    lateinit var btnEqual: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        txtViewShowDigits = findViewById<TextView>(R.id.txtViewShowDigits)
        txtViewShowOutput = findViewById<TextView>(R.id.txtViewShowOutput)

        btnClear = findViewById<Button>(R.id.btnClear)
        btnUndo = findViewById<Button>(R.id.btnUndo)
        btnPercentage = findViewById<Button>(R.id.btnPercentage)
        btnDivision = findViewById<Button>(R.id.btnDivide)

        btnSeven = findViewById<Button>(R.id.btnSeven)
        btnEight = findViewById<Button>(R.id.btnEight)
        btnNine = findViewById<Button>(R.id.btnNine)
        btnMultiply = findViewById<Button>(R.id.btnMultiply)

        btnFour = findViewById<Button>(R.id.btnFour)
        btnFive = findViewById<Button>(R.id.btnFive)
        btnSix = findViewById<Button>(R.id.btnSix)
        btnMinus = findViewById<Button>(R.id.btnMinus)

        btnOne = findViewById<Button>(R.id.btnOne)
        btnTwo = findViewById<Button>(R.id.btntwo)
        btnThree = findViewById<Button>(R.id.btnThree)
        btnPlus = findViewById<Button>(R.id.btnPlus)

        btnZero = findViewById<Button>(R.id.btnZero)
        btnDoubleZero = findViewById<Button>(R.id.btnDoubleZero)
        btnDot = findViewById<Button>(R.id.btnDot)
        btnEqual = findViewById<Button>(R.id.btnEqual)


        btnClear.setOnClickListener {
            txtViewShowOutput.text=""
            txtViewShowDigits.text=""
        }

        btnUndo.setOnClickListener {
            txtViewShowOutput.text=""
            //var txt = txtViewShowDigits.text.last().toString()
            //txtViewShowDigits.text = txt

            var newTxt=txtViewShowDigits.text.dropLast(1)

            txtViewShowDigits.text=newTxt
        }

        btnPercentage.setOnClickListener {
            txtViewShowOutput.text=""
            var lastChar = txtViewShowDigits.text.last()
            if((lastChar=='1' || lastChar=='2' || lastChar=='3' || lastChar=='4' || lastChar=='5' ||
                        lastChar=='6' || lastChar=='7' || lastChar=='8' || lastChar=='9' || lastChar=='0' ||
                        lastChar=='.')){

                var txt = txtViewShowDigits.text.toString()
                txt+="%"
                txtViewShowDigits.text=txt
            }


        }
        btnDivision.setOnClickListener {
            txtViewShowOutput.text=""
            var lastChar = txtViewShowDigits.text.last()


            if((lastChar=='1' || lastChar=='2' || lastChar=='3' || lastChar=='4' || lastChar=='5' ||
                lastChar=='6' || lastChar=='7' || lastChar=='8' || lastChar=='9' || lastChar=='0' ||
                lastChar=='.')){

                var txt = txtViewShowDigits.text.toString()
                txt+="/"
                txtViewShowDigits.text=txt
            }



        }


        btnSeven.setOnClickListener {
            txtViewShowOutput.text=""
            var txt = txtViewShowDigits.text.toString()
            txt+= '7'
            txtViewShowDigits.text=txt

        }
        btnEight.setOnClickListener {
            txtViewShowOutput.text=""
            var txt = txtViewShowDigits.text.toString()
            txt+= '8'
            txtViewShowDigits.text=txt
        }
        btnNine.setOnClickListener {
            txtViewShowOutput.text=""
            var txt = txtViewShowDigits.text.toString()
            txt+= '9'
            txtViewShowDigits.text=txt
        }
        btnMultiply.setOnClickListener {
            txtViewShowOutput.text=""
            var lastChar = txtViewShowDigits.text.last()


            if((lastChar=='1' || lastChar=='2' || lastChar=='3' || lastChar=='4' || lastChar=='5' ||
                        lastChar=='6' || lastChar=='7' || lastChar=='8' || lastChar=='9' || lastChar=='0' ||
                        lastChar=='.')){

                var txt = txtViewShowDigits.text.toString()
                txt+="X"
                txtViewShowDigits.text=txt
            }


        }



        btnFour.setOnClickListener {
            txtViewShowOutput.text=""
            var txt = txtViewShowDigits.text.toString()
            txt+= '4'
            txtViewShowDigits.text=txt
        }
        btnFive.setOnClickListener {
            txtViewShowOutput.text=""
            var txt = txtViewShowDigits.text.toString()
            txt+= '5'
            txtViewShowDigits.text=txt
        }
        btnSix.setOnClickListener {
            txtViewShowOutput.text=""
            var txt = txtViewShowDigits.text.toString()
            txt+= '6'
            txtViewShowDigits.text=txt
        }
        btnMinus.setOnClickListener {
            txtViewShowOutput.text=""
            var lastChar = txtViewShowDigits.text.last()


            if((lastChar=='1' || lastChar=='2' || lastChar=='3' || lastChar=='4' || lastChar=='5' ||
                        lastChar=='6' || lastChar=='7' || lastChar=='8' || lastChar=='9' || lastChar=='0' ||
                        lastChar=='.')){

                var txt = txtViewShowDigits.text.toString()
                txt+="-"
                txtViewShowDigits.text=txt
            }


        }




        btnOne.setOnClickListener {
            txtViewShowOutput.text=""
            var txt = txtViewShowDigits.text.toString()
            txt+= '1'
            txtViewShowDigits.text=txt
        }
        btnTwo.setOnClickListener {
            txtViewShowOutput.text=""
            var txt = txtViewShowDigits.text.toString()
            txt+= '2'
            txtViewShowDigits.text=txt
        }
        btnThree.setOnClickListener {
            txtViewShowOutput.text=""
            var txt = txtViewShowDigits.text.toString()
            txt+= '3'
            txtViewShowDigits.text=txt
        }
        btnPlus.setOnClickListener {
            txtViewShowOutput.text=""
            var lastChar = txtViewShowDigits.text.last()


            if((lastChar=='1' || lastChar=='2' || lastChar=='3' || lastChar=='4' || lastChar=='5' ||
                        lastChar=='6' || lastChar=='7' || lastChar=='8' || lastChar=='9' || lastChar=='0' ||
                        lastChar=='.')){

                var txt = txtViewShowDigits.text.toString()
                txt+="+"
                txtViewShowDigits.text=txt
            }

        }



        btnZero.setOnClickListener {
            txtViewShowOutput.text=""
            var txt = txtViewShowDigits.text.toString()
            txt+= '0'
            txtViewShowDigits.text=txt
        }
        btnDoubleZero.setOnClickListener {
            txtViewShowOutput.text=""
            var txt = txtViewShowDigits.text.toString()
            txt+= "00"
            txtViewShowDigits.text=txt
        }
        btnDot.setOnClickListener {
            txtViewShowOutput.text=""
            val txt = txtViewShowDigits.text.toString()
            // Prevent multiple dots in current number segment
            val lastOperatorIndex = txt.lastIndexOfAny(charArrayOf('+', '-', 'X', '/', '%'))
            val lastNumberSegment = if (lastOperatorIndex == -1) txt else txt.substring(lastOperatorIndex + 1)

            if (!lastNumberSegment.contains('.')) {
                txtViewShowDigits.text = txt + "."
            }
        }
        btnEqual.setOnClickListener {
            val expression = txtViewShowDigits.text.toString()
            if (expression.isEmpty()) {
                txtViewShowOutput.text = ""
                return@setOnClickListener
            }

            try {
                // Replace 'X' with '*' and '%' with '/100' for percentage calculation
                val formattedExpression = expression.replace('X', '*').replace("%", "/100")

                val result = ExpressionBuilder(formattedExpression).build().evaluate()
                val longResult = result.toLong()

                txtViewShowOutput.text = if (result == longResult.toDouble()) {
                    longResult.toString()
                } else {
                    result.toString()
                }
            } catch (e: Exception) {
                txtViewShowOutput.text = "Error"
            }
        }


    }
}
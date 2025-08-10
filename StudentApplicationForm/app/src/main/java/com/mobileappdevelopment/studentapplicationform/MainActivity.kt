package com.mobileappdevelopment.studentapplicationform

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var stdName: EditText
    lateinit var stdId: EditText
    lateinit var age: EditText
    lateinit var email: EditText
    lateinit var cseRB: RadioButton
    lateinit var eeeRB:RadioButton
    lateinit var coeRb: RadioButton
    lateinit var cppCB: CheckBox
    lateinit var csCB: CheckBox
    lateinit var kotlinCB: CheckBox
    lateinit var phpCB: CheckBox
    lateinit var javaCB: CheckBox
    lateinit var dartCB: CheckBox
    lateinit var btn: Button
    lateinit var txtViewOutput:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        stdName=findViewById<EditText>(R.id.stdNametxt)
        stdId=findViewById<EditText>(R.id.stdIdtxt)
        age=findViewById<EditText>(R.id.ageNmbr)
        email=findViewById<EditText>(R.id.emailTxt)

        cseRB=findViewById<RadioButton>(R.id.btnRadioCSE)
        eeeRB=findViewById<RadioButton>(R.id.btnRadioEEE)
        coeRb=findViewById<RadioButton>(R.id.btnRadioCOE)

        cppCB=findViewById<CheckBox>(R.id.chkBxCPP)
        csCB=findViewById<CheckBox>(R.id.chkBxCSh)
        kotlinCB=findViewById<CheckBox>(R.id.chkBxKotlin)
        phpCB=findViewById<CheckBox>(R.id.chkBxPhp)
        javaCB=findViewById<CheckBox>(R.id.chkBxJava)
        dartCB=findViewById<CheckBox>(R.id.chkBxDart)

        btn=findViewById<Button>(R.id.btnSubmit)
        txtViewOutput=findViewById<TextView>(R.id.txtViewOutput)


        btn.setOnClickListener {
            var value = "Output: \n"
            value+= stdName.text.toString()
            value+="  "+stdId.text.toString()
            value+="  "+age.text.toString()
            value+="  "+email.text.toString()
            if(cseRB.isChecked)
            {
                value+=", "+cseRB.text
            }

            if(eeeRB.isChecked)
            {
                value+=", "+eeeRB.text
            }

            if(coeRb.isChecked)
            {
                value+=", "+coeRb.text
            }

            if(csCB.isChecked)
            {
                value+=", "+csCB.text
            }

            if(cppCB.isChecked)
            {
                value+=", "+cppCB.text
            }
            if(javaCB.isChecked)
            {
                value+=", "+javaCB.text
            }
            if(phpCB.isChecked)
            {
                value+=", "+phpCB.text
            }
            if(dartCB.isChecked)
            {
                value+=", "+dartCB.text
            }
            if(kotlinCB.isChecked)
            {
                value+=", "+kotlinCB.text
            }
            txtViewOutput.visibility= View.VISIBLE
            txtViewOutput.setText(value)
        }


    }
}
package com.lauron.sperryscalculator

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import kotlin.properties.Delegates


class CalculatorActivity : AppCompatActivity(), View.OnClickListener {
    private var perc by Delegates.notNull<Double>()
    private var num1 by Delegates.notNull<Double>()
    private var number1 by Delegates.notNull<Double>()
    private var number2 by Delegates.notNull<Double>()
    private var output by Delegates.notNull<Double>()
    private lateinit var out:String
    private lateinit var temp:String
    private lateinit var operation:String
    private lateinit var num2:String
    private lateinit var n1:String
    private lateinit var n2:String
    private lateinit var t:EditText
    private val btn: Array<Button?> = arrayOfNulls(18)
    private var btnUnfocus: Button? = null
    private val btnId = intArrayOf(R.id.one, R.id.two, R.id.three, R.id.four, R.id.five
        , R.id.six, R.id.seven, R.id.eight, R.id.nine, R.id.zero, R.id.ac, R.id.times
        , R.id.div, R.id.minus, R.id.plus, R.id.equals, R.id.point, R.id.percent)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        t=findViewById(R.id.res)

        for (i in btn.indices) {
            btn[i] = findViewById<View>(btnId[i]) as Button
            btn[i]!!.setOnClickListener(this)
        }
        btnUnfocus = btn[0]
    }

    override fun onClick(v: View) {
        //setForcus(btn_unfocus, (Button) findViewById(v.getId()));
        //Or use switch
        when (v.id) {
            R.id.one -> {
                temp = t.text.toString()
                if (temp == "0") {
                    t.clearComposingText()
                    t.setText("1")
                }
                else {
                    t.append("1")
                }
            }
            R.id.two -> {
                temp = t.text.toString()
                if (temp == "0") {
                    t.clearComposingText()
                    t.setText("2")
                }
                else {
                    t.append("2")
                }
            }
            R.id.three -> {
                temp = t.text.toString()
                if (temp == "0") {
                    t.clearComposingText()
                    t.setText("3")
                }
                else {
                    t.append("3")
                }
            }
            R.id.four -> {
                temp = t.text.toString()
                if (temp == "0") {
                    t.clearComposingText()
                    t.setText("4")
                }
                else {
                    t.append("4")
                }
            }
            R.id.five -> {
                temp = t.text.toString()
                if (temp == "0") {
                    t.clearComposingText()
                    t.setText("5")
                }
                else {
                    t.append("5")
                }
            }
            R.id.six -> {
                temp = t.text.toString()
                if (temp == "0") {
                    t.clearComposingText()
                    t.setText("6")
                }
                else {
                    t.append("6")
                }
            }
            R.id.seven -> {
                temp = t.text.toString()
                if (temp == "0") {
                    t.clearComposingText()
                    t.setText("7")
                }
                else {
                    t.append("7")
                }
            }
            R.id.eight -> {
                temp = t.text.toString()
                if (temp == "0") {
                    t.clearComposingText()
                    t.setText("8")
                }
                else {
                    t.append("8")
                }
            }
            R.id.nine -> {
                temp = t.text.toString()
                if (temp == "0") {
                    t.clearComposingText()
                    t.setText("9")
                }
                else {
                    t.append("9")
                }
            }
            R.id.zero -> {
                temp = t.text.toString()
                if (temp == "0") {
                    t.clearComposingText()
                    t.setText("0")
                }
                else {
                    t.append("0")
                }
            }
            R.id.point -> {
                temp = t.text.toString()
                if (temp == "0") {
                    t.clearComposingText()
                    t.setText(".")
                }
                else {
                    t.append(".")
                }
            }
            R.id.ac -> {
                t.setText("0")
            }
            R.id.percent -> {
                num1 = t.text.toString().toDouble()
                perc=num1/100
                t.setText(perc.toString())
            }
            R.id.times -> {
                num1 = t.text.toString().toDouble()
                t.setText("")
                operation = "*"
            }
            R.id.div -> {
                num1 = t.text.toString().toDouble()
                t.setText("")
                operation = "/"
            }
            R.id.plus -> {
                num1 = t.text.toString().toDouble()
                t.setText("")
                operation = "+"
            }
            R.id.minus -> {
                num1 = t.text.toString().toDouble()
                t.setText("")
                operation = "-"
            }
            R.id.equals -> {
                if (operation == "+") {
                    num2 = t.text.toString()
                    n1 = num1.toString()
                    n2 = num2
                    number1 = n1.toDouble()
                    number2 = n2.toDouble()
                    output = number1 + number2
                }
                if (operation == "-") {
                    num2 = t.text.toString()
                    n1 = num1.toString()
                    n2 = num2
                    number1 = n1.toDouble()
                    number2 = n2.toDouble()
                    output = number1 - number2
                }
                if (operation == "*") {
                    num2 = t.text.toString()
                    n1 = num1.toString()
                    n2 = num2
                    number1 = n1.toDouble()
                    number2 = n2.toDouble()
                    output = number1 * number2
                }
                if (operation == "/") {
                    num2 = t.text.toString()
                    n1 = num1.toString()
                    n2 = num2
                    number1 = n1.toDouble()
                    number2 = n2.toDouble()
                    output = number1 / number2
                }
                t.setText("")
                out = output.toString()
                t.append(out)
                operation = ""
            }
        }
    }


}
package com.example.myapplication


import android.os.Bundle
import android.telephony.SmsManager
import android.view.View
import android.view.inputmethod.EditorInfo
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import java.util.*
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_smsmanager.*


class Smsmanager : AppCompatActivity() {
    lateinit var name :EditText
    lateinit var num1 :EditText
    lateinit var num2 :EditText
    lateinit var address :EditText
    lateinit var btn : Button
    lateinit var rname:EditText
    lateinit var rnumber :EditText
    lateinit var lrnum : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_smsmanager)
        name = findViewById<EditText>(R.id.name)
        num1 = findViewById<EditText>(R.id.num1)
        num2 = findViewById<EditText>(R.id.num2)
        address = findViewById<EditText>(R.id.address)
        btn = findViewById<Button>(R.id.btn)
        rname = findViewById<EditText>(R.id.rname)
        rnumber = findViewById<EditText>(R.id.rnumber)
        lrnum = findViewById<EditText>(R.id.lr)
        btn.setOnClickListener(View.OnClickListener {
            if (address.text.toString() == "Bikaner" || address.text.toString() == "bikaner"){
                val message : String = " SHREE SHYAM TRAVELS AND TRANSPORTS \nWe believe in fast and secure delivery of your material\nSender Name   -  ${name.text.toString()}\nSender Number  - ${num1.text.toString()}\nReciever Name - ${rname.text.toString()}\n Reciever Number - ${rnumber.text.toString()}\nLR Number  - ${lr.text.toString()}\nContact number - 01512525125\nCollecting address - \n1. Kirti Stambh near bidasar house,Bikaner 2.Tirthamb chauraya,Bikaner \n Regards"
                Toast.makeText(this,"$message",Toast.LENGTH_SHORT).show()
                val sms: SmsManager = SmsManager.getDefault()
                val msg = sms.divideMessage(message)
                sms.sendMultipartTextMessage("${num1.text.toString()}",null,msg,null,null)
                sms.sendMultipartTextMessage("${rnumber.text.toString()}",null,msg,null,null)


            }else if(address.text.toString() == "Sriganganagar" || address.text.toString() == "sriganganagar"){
                val message : String = " SHREE SHYAM TRAVELS AND TRANSPORTS \nWe believe in fast and secure delivery of your material\nSender Name   -  ${name.text.toString()}\nSender Number  - ${num1.text.toString()}\nReciever Name - ${rname.text.toString()}\n Reciever Number - ${rnumber.text.toString()}\nLR Number  - ${lr.text.toString()}\nContact number - 9461167914\nCollecting address - \nShree Shyam travels,khoda chownk,Sriganganagar \n Regards"
                Toast.makeText(this,"$message",Toast.LENGTH_SHORT).show()
                val sms: SmsManager = SmsManager.getDefault()
                val msg = sms.divideMessage(message)
                sms.sendMultipartTextMessage("${num1.text.toString()}",null,msg,null,null)
                sms.sendMultipartTextMessage("${rnumber.text.toString()}",null,msg,null,null)

            }
            else {
                val message: String =
                    " SHREE SHYAM TRAVELS AND TRANSPORTS\nWe believe in fast and secure delivery of your material \nSender Name   -  ${name.text.toString()}\nSender Number  - ${num1.text.toString()}\nReciever Name - ${rname.text.toString()}\n Reciever Number - ${rnumber.text.toString()}\nLR Number  - ${lr.text.toString()}\nContact number - ${num2.text.toString()}\nCollecting address - ${address.text.toString()} \n Regards "
                Toast.makeText(this,"$message",Toast.LENGTH_SHORT).show()
                val sms: SmsManager = SmsManager.getDefault()
                val msg = sms.divideMessage(message)
                sms.sendMultipartTextMessage("${num1.text.toString()}",null,msg,null,null)
                sms.sendMultipartTextMessage("${rnumber.text.toString()}",null,msg,null,null)
            }




        })

    }
}

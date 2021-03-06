package com.example.myapplication

import android.content.Intent
import android.content.pm.PackageManager
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    val PERMISSION_SEND_SMS = 123;
    lateinit var btn1 : Button
    lateinit var btn2 : Button
 
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn1 = findViewById<Button>(R.id.btn1)
        btn2 = findViewById<Button>(R.id.btn2)

        requestSmsPermission()





        btn1.setOnClickListener(View.OnClickListener {
            var i = Intent(this, Smsmanager::class.java)
            startActivity(i)
        })
        btn2.setOnClickListener(View.OnClickListener {

            var x = Intent(Intent.ACTION_DIAL)
            startActivity(x)


        })

        btn4.setOnClickListener(View.OnClickListener {
            val items =
                ArrayList<HashMap<String, Any>>()
            var pm: PackageManager
            val p = packageManager
            val packs = p.getInstalledPackages(0)
            for (pi in packs) {
                if (pi.packageName.toString().toLowerCase().contains("calcul")) {
                    val map =
                        HashMap<String, Any>()
                    map["appName"] = pi.applicationInfo.loadLabel(p)
                    map["packageName"] = pi.packageName
                    items.add(map)
                }
            }
            if (items.size >= 1) {
                val packageName = items[0]["packageName"] as String?
                val i = p.getLaunchIntentForPackage(packageName!!)
                i?.let { startActivity(it) }
            } else {
                // Application not found
            }

        })
        pp.setOnClickListener(View.OnClickListener {

            var context =this
            try{
                var x = this.packageManager.getLaunchIntentForPackage("com.phonepe.app")
                this.startActivity(x)
            }
            catch (e : PackageManager.NameNotFoundException){
                //Automatically Autogenerated catch block'
                Toast.makeText(this,"APPLOCATION NOT FOUND",Toast.LENGTH_SHORT).show()

            }

        })
        pt.setOnClickListener(View.OnClickListener {
            var context =this
            try{
                var x = this.packageManager.getLaunchIntentForPackage("net.one97.paytm")
                this.startActivity(x)
            }
            catch (e : PackageManager.NameNotFoundException){
                //Automatically Autogenerated catch block'
                Toast.makeText(this,"APPLOCATION NOT FOUND",Toast.LENGTH_SHORT).show()

            }

        })


        btn3.setOnClickListener(View.OnClickListener {
            var context =this
            try{
                var x = this.packageManager.getLaunchIntentForPackage("psl.seatseller.android")
                this.startActivity(x)
            }
            catch (e : PackageManager.NameNotFoundException){
                //Automatically Autogenerated catch block'
                Toast.makeText(this,"APPLOCATION NOT FOUND",Toast.LENGTH_SHORT).show()

            }

        })

    }
    private fun requestSmsPermission() {

        // check permission is given
        if (ContextCompat.checkSelfPermission(
                this,
                android.Manifest.permission.READ_CONTACTS
            ) != PackageManager.PERMISSION_GRANTED
        ) {
            // request permission (see result in onRequestPermissionsResult() method)
            ActivityCompat.requestPermissions(
                this, arrayOf(android.Manifest.permission.SEND_SMS),
                PERMISSION_SEND_SMS
            )
        } else {
            // permission already granted run sms send
            Toast.makeText(this,"already given permission",Toast.LENGTH_SHORT).show()
        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {


                if (grantResults.size > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    // perm
                    //ission was granted
                    Toast.makeText(this,"already given permission",Toast.LENGTH_SHORT).show()


                } else {
                    // permission denied
                    Toast.makeText(this,"not given",Toast.LENGTH_SHORT).show()

                }
                return
            }
        }










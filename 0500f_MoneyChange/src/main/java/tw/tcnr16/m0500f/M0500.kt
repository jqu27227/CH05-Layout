//package tw.tcnr16.m0500f
package tw.tcnr16.m0500f

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.text.DecimalFormat

class M0500d : AppCompatActivity() {


    private var e001: EditText? = null

    /*    private var e001: EditText? = null
            private var b001: Button? = null
            private var t001: TextView? = null
            private var t003: TextView? = null*/
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.m0500d)
        setupViewcomponent()
        //        設定layoout配置
    }

    private fun setupViewcomponent() {
        e001 = findViewById<View>(R.id.m0500_e001) as EditText


//    private fun setupViewcomponent() {
//        e001 = findViewById<View>(R.id.m0500_e001) as EditText
//        b001 = findViewById<View>(R.id.m0500_b001) as Button
//        t001 = findViewById<View>(R.id.m0500_t001) as TextView
//        t003 = findViewById<View>(R.id.m0500_t003) as TextView
//        b001!!.setOnClickListener(b001ON) //宣告按鈕監聽的程式
//    }

//    private val b001ON = View.OnClickListener {
//        val pondsformat = DecimalFormat("0.0000")
//        val outcomp = pondsformat.format(e001!!.text.toString().toFloat() * 28.6)
//        t003!!.text = outcomp
//    }
    }
}

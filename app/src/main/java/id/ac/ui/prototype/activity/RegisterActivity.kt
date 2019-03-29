package id.ac.ui.prototype.activity

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import id.ac.ui.prototype.R
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        tar.setOnClickListener {
            startActivity(Intent(this@RegisterActivity, MainActivity::class.java))
        }
    }

}
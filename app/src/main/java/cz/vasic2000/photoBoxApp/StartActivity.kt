package cz.vasic2000.photoBoxApp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class StartActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)

        buttonEnter()
        buttonExit()
    }

    private fun buttonExit() {
        val butExit: Button = findViewById(R.id.Return)
        butExit.setOnClickListener {
            finish()
        }
    }

    private fun buttonEnter() {
        val butEnter: Button = findViewById(R.id.Enter)
        butEnter.setOnClickListener {
            val intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}

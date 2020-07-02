package com.example.coordinatortest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), Contract.View {

    private lateinit var coordinator: Contract.Coordinator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        instantiateCoordinator()
        instantiateButtonListener()
    }

    private fun instantiateCoordinator() = apply {
        coordinator = Coordinator(this).also {
            it.bind()
        }
    }

    private fun instantiateButtonListener() = show_toast_button.setOnClickListener {
        coordinator.requestMessage()
    }

    override fun onDestroy() {
        super.onDestroy()
        coordinator.unbind()
    }

    override fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }
}
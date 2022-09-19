package com.momentum.learndaggerhilt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import dagger.hilt.EntryPoint
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject
import javax.inject.Named

private const val TAG = "TagMainActivity"

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    @Named("FN")
    lateinit var name1: String

    @Inject
    @Named("SN")
    lateinit var name2: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView_id.text = "$name1 $name2"

//        Toast.makeText(this, "My Name is $name1", Toast.LENGTH_LONG).show()
    }
}
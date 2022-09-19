package com.momentum.learndaggerhilt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject
import javax.inject.Named

private const val TAG = "TagMainActivity"

@AndroidEntryPoint
class MainActivity: AppCompatActivity() {

    private val mainViewModel: MainViewModel by viewModels()

    @Inject
    @Named("FN")
    lateinit var name1: String

    @Inject
    @Named("SN")
    lateinit var name2: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainViewModel
        textView_id.text = "$name1 $name2"
    }
}
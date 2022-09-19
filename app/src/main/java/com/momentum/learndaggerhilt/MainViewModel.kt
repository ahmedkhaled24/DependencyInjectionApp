package com.momentum.learndaggerhilt

import android.util.Log
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

private const val TAG = "TagMainViewModel"

@HiltViewModel
class MainViewModel @Inject constructor(testName: String): ViewModel() {

    init {
        Log.d(TAG, "TEST: $testName")
    }

}
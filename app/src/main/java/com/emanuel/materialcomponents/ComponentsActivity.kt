package com.emanuel.materialcomponents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.emanuel.materialcomponents.databinding.ActivityComponentsBinding

class ComponentsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityComponentsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityComponentsBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}
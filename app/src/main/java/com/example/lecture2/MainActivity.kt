package com.example.lecture2

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

import android.content.Intent

import com.example.lecture2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: NewsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Создаём тестовые данные
        val newsItems = listOf(
            NewsItem("Первая новость", "Это описание первой новости."),
            NewsItem("Вторая новость", "Это описание второй новости."),
            NewsItem("Третья новость", "Это описание третьей новости.")
        )

        // Создаём адаптер
        adapter = NewsAdapter(newsItems)

        // Подключаем RecyclerView
        binding.recyclerView.adapter = adapter
        binding.recyclerView.layoutManager = androidx.recyclerview.widget.LinearLayoutManager(this)
    }
}

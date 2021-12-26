package com.example.koreanactor

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mysubmissionapp.Actors
import com.example.mysubmissionapp.ActorsData

class MainActivity : AppCompatActivity() {
    private lateinit var rvActors: RecyclerView
    private var list: ArrayList<Actors> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvActors = findViewById(R.id.rv_actors)
        rvActors.setHasFixedSize(true)

        list.addAll(ActorsData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvActors.layoutManager = LinearLayoutManager(this)
        val listActorAdapter = ListActorAdapter(list)
        rvActors.adapter = listActorAdapter

        listActorAdapter.setOnItemClickCallback(object : ListActorAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Actors) {
                showSelectedActor(data)
            }
        })
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.about_profile -> {
                startActivity(Intent(this@MainActivity, AboutActivity::class.java))
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun showSelectedActor(actors: Actors) {
        Toast.makeText(this, "You choose " + actors.name, Toast.LENGTH_SHORT).show()
        val moveIntentData = Intent(this@MainActivity, DetailActivity::class.java)
        moveIntentData.putExtra(DetailActivity.EXTRA_DATA, actors)
        startActivity(moveIntentData)
    }
}

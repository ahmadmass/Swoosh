package com.example.android.swoosh.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.android.swoosh.Model.Player
import com.example.android.swoosh.R
import com.example.android.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)
        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)

        searchLeaguesText.text = "Looking for a ${player.league} ${player.skill} league near you..."
    }
}

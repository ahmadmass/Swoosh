package com.example.android.swoosh.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.android.swoosh.R
import com.example.android.swoosh.Utilities.EXTRA_LEAGUE
import com.example.android.swoosh.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)
        val league = intent.getStringExtra(EXTRA_LEAGUE)
        val skill = intent.getStringExtra(EXTRA_SKILL)

        searchLeaguesText.text = "Looking for a $league $skill league near you..."
    }
}

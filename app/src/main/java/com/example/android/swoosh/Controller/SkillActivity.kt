package com.example.android.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.android.swoosh.Model.Player
import com.example.android.swoosh.R
import com.example.android.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {
    lateinit var player: Player

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        outState?.putParcelable(EXTRA_PLAYER, player)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        player = intent.getParcelableExtra(EXTRA_PLAYER)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        if (savedInstanceState != null) {
            player = savedInstanceState.getParcelable(EXTRA_PLAYER)
        }
    }

    fun onBeginnerClicked(view: View) {
        ballerSkillBtn.isChecked = false
        player.skill = "beginner"
    }
    fun onBallerClicked(view: View) {
        beginnerSkillBtn.isChecked = false
        player.skill = "baller"
    }

    fun onFinishSkillClicked(view: View) {
        if (player.skill != "") {
            val finishActivity = Intent(this, FinishActivity:: class.java)
            finishActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(finishActivity)
        }
        else {
            Toast.makeText(this, "Please enter a skill", Toast.LENGTH_SHORT).show()
        }
    }

}

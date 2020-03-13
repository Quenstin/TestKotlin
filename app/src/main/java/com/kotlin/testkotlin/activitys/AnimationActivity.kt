package com.kotlin.testkotlin.activitys

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.dynamicanimation.animation.SpringAnimation
import androidx.dynamicanimation.animation.SpringForce
import com.kotlin.testkotlin.R
import kotlinx.android.synthetic.main.animation_activity.*


/**
 * Created by zhgq on 2020/1/16
 * Describe：
 */
class AnimationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.animation_activity)

        val spring = SpringForce(0f)
            .setDampingRatio(0.05f)
            .setStiffness(SpringForce.STIFFNESS_VERY_LOW)

        val anim =
            SpringAnimation(animation_iv, SpringAnimation.TRANSLATION_Y).setSpring(spring)

        animation_bt.setOnClickListener {
            anim.cancel()
            anim.setStartValue(-100f)
            anim.start()
            anim.skipToEnd()

        }
    }
}
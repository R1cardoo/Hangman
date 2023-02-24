package com.example.hangman

import android.content.res.Configuration
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.core.view.isVisible
import kotlin.random.Random

val wordList = arrayOf("cake", "apple", "orange", "banana", "mango")
val hintList = arrayOf("a kind of food with cream", "it is mostly red and green",
    "a kind of food with skin", "a kind of food with skin", "a kind of food with skin")

class MainActivity : AppCompatActivity() {
    lateinit var imageView: ImageView
    lateinit var wordText: TextView
    lateinit var btn_a : Button
    lateinit var btn_b : Button
    lateinit var btn_c : Button
    lateinit var btn_d : Button
    lateinit var btn_e : Button
    lateinit var btn_f : Button
    lateinit var btn_g : Button
    lateinit var btn_h : Button
    lateinit var btn_i : Button
    lateinit var btn_j : Button
    lateinit var btn_k : Button
    lateinit var btn_l : Button
    lateinit var btn_m : Button
    lateinit var btn_n : Button
    lateinit var btn_o : Button
    lateinit var btn_p : Button
    lateinit var btn_q : Button
    lateinit var btn_r : Button
    lateinit var btn_s : Button
    lateinit var btn_t : Button
    lateinit var btn_u : Button
    lateinit var btn_v : Button
    lateinit var btn_w : Button
    lateinit var btn_x : Button
    lateinit var btn_y : Button
    lateinit var btn_z : Button
    lateinit var btn_restart : Button
    lateinit var btn_hint : Button

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val orientation = resources.configuration.orientation
        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            setContentView(R.layout.activity_main_land)
            imageView = findViewById(R.id.image)
            wordText = findViewById(R.id.word)
            btn_a = findViewById(R.id.btn_a)
            btn_a.setOnClickListener {
                btn_a.isVisible = false
                checkChar('a')
            }
            btn_b = findViewById(R.id.btn_b)
            btn_b.setOnClickListener {
                btn_b.isVisible = false
                checkChar('b')
            }
            btn_c = findViewById(R.id.btn_c)
            btn_c.setOnClickListener {
                btn_c.isVisible = false
                checkChar('c')
            }
            btn_d = findViewById(R.id.btn_d)
            btn_d.setOnClickListener {
                btn_d.isVisible = false
                checkChar('d')
            }
            btn_e = findViewById(R.id.btn_e)
            btn_e.setOnClickListener {
                btn_e.isVisible = false
                checkChar('e')
            }
            btn_f = findViewById(R.id.btn_f)
            btn_f.setOnClickListener {
                btn_f.isVisible = false
                checkChar('f')
            }
            btn_g = findViewById(R.id.btn_g)
            btn_g.setOnClickListener {
                btn_g.isVisible = false
                checkChar('g')
            }
            btn_h = findViewById(R.id.btn_h)
            btn_h.setOnClickListener {
                btn_h.isVisible = false
                checkChar('h')
            }
            btn_i = findViewById(R.id.btn_i)
            btn_i.setOnClickListener {
                btn_i.isVisible = false
                checkChar('i')
            }
            btn_j = findViewById(R.id.btn_j)
            btn_j.setOnClickListener {
                btn_j.isVisible = false
                checkChar('j')
            }
            btn_k = findViewById(R.id.btn_k)
            btn_k.setOnClickListener {
                btn_k.isVisible = false
                checkChar('k')
            }
            btn_l = findViewById(R.id.btn_l)
            btn_l.setOnClickListener {
                btn_l.isVisible = false
                checkChar('l')
            }
            btn_m = findViewById(R.id.btn_m)
            btn_m.setOnClickListener {
                btn_m.isVisible = false
                checkChar('m')
            }
            btn_n = findViewById(R.id.btn_n)
            btn_n.setOnClickListener {
                btn_n.isVisible = false
                checkChar('n')
            }
            btn_o = findViewById(R.id.btn_o)
            btn_o.setOnClickListener {
                btn_o.isVisible = false
                checkChar('o')
            }
            btn_p = findViewById(R.id.btn_p)
            btn_p.setOnClickListener {
                btn_p.isVisible = false
                checkChar('p')
            }
            btn_q = findViewById(R.id.btn_q)
            btn_q.setOnClickListener {
                btn_q.isVisible = false
                checkChar('q')
            }
            btn_r = findViewById(R.id.btn_r)
            btn_r.setOnClickListener {
                btn_r.isVisible = false
                checkChar('r')
            }
            btn_s = findViewById(R.id.btn_s)
            btn_s.setOnClickListener {
                btn_s.isVisible = false
                checkChar('s')
            }
            btn_t = findViewById(R.id.btn_t)
            btn_t.setOnClickListener {
                btn_t.isVisible = false
                checkChar('t')
            }
            btn_u = findViewById(R.id.btn_u)
            btn_u.setOnClickListener {
                btn_u.isVisible = false
                checkChar('u')
            }
            btn_v = findViewById(R.id.btn_v)
            btn_v.setOnClickListener {
                btn_v.isVisible = false
                checkChar('v')
            }
            btn_w = findViewById(R.id.btn_w)
            btn_w.setOnClickListener {
                btn_w.isVisible = false
                checkChar('w')
            }
            btn_x = findViewById(R.id.btn_x)
            btn_x.setOnClickListener {
                btn_x.isVisible = false
                checkChar('x')
            }
            btn_y = findViewById(R.id.btn_y)
            btn_y.setOnClickListener {
                btn_y.isVisible = false
                checkChar('y')
            }
            btn_z = findViewById(R.id.btn_z)
            btn_z.setOnClickListener {
                btn_z.isVisible = false
                checkChar('z')
            }
            btn_restart = findViewById(R.id.restart)
            btn_restart.setOnClickListener{
                resetStateHelper()
                setButtonClickable()
                wordText.text = String(stateHelper.strShowed)
                displayImage()
            }
            btn_hint = findViewById(R.id.hint)
            btn_hint.setOnClickListener {
                handleHint()
            }
        } else {
            setContentView(R.layout.activity_main)
            imageView = findViewById<ImageView>(R.id.image)
            wordText = findViewById(R.id.word)
            btn_a = findViewById(R.id.btn_a)
            btn_a.setOnClickListener {
                btn_a.isVisible = false
                checkChar('a')
            }
            btn_b = findViewById(R.id.btn_b)
            btn_b.setOnClickListener {
                btn_b.isVisible = false
                checkChar('b')
            }
            btn_c = findViewById(R.id.btn_c)
            btn_c.setOnClickListener {
                btn_c.isVisible = false
                checkChar('c')
            }
            btn_d = findViewById(R.id.btn_d)
            btn_d.setOnClickListener {
                btn_d.isVisible = false
                checkChar('d')
            }
            btn_e = findViewById(R.id.btn_e)
            btn_e.setOnClickListener {
                btn_e.isVisible = false
                checkChar('e')
            }
            btn_f = findViewById(R.id.btn_f)
            btn_f.setOnClickListener {
                btn_f.isVisible = false
                checkChar('f')
            }
            btn_g = findViewById(R.id.btn_g)
            btn_g.setOnClickListener {
                btn_g.isVisible = false
                checkChar('g')
            }
            btn_h = findViewById(R.id.btn_h)
            btn_h.setOnClickListener {
                btn_h.isVisible = false
                checkChar('h')
            }
            btn_i = findViewById(R.id.btn_i)
            btn_i.setOnClickListener {
                btn_i.isVisible = false
                checkChar('i')
            }
            btn_j = findViewById(R.id.btn_j)
            btn_j.setOnClickListener {
                btn_j.isVisible = false
                checkChar('j')
            }
            btn_k = findViewById(R.id.btn_k)
            btn_k.setOnClickListener {
                btn_k.isVisible = false
                checkChar('k')
            }
            btn_l = findViewById(R.id.btn_l)
            btn_l.setOnClickListener {
                btn_l.isVisible = false
                checkChar('l')
            }
            btn_m = findViewById(R.id.btn_m)
            btn_m.setOnClickListener {
                btn_m.isVisible = false
                checkChar('m')
            }
            btn_n = findViewById(R.id.btn_n)
            btn_n.setOnClickListener {
                btn_n.isVisible = false
                checkChar('n')
            }
            btn_o = findViewById(R.id.btn_o)
            btn_o.setOnClickListener {
                btn_o.isVisible = false
                checkChar('o')
            }
            btn_p = findViewById(R.id.btn_p)
            btn_p.setOnClickListener {
                btn_p.isVisible = false
                checkChar('p')
            }
            btn_q = findViewById(R.id.btn_q)
            btn_q.setOnClickListener {
                btn_q.isVisible = false
                checkChar('q')
            }
            btn_r = findViewById(R.id.btn_r)
            btn_r.setOnClickListener {
                btn_r.isVisible = false
                checkChar('r')
            }
            btn_s = findViewById(R.id.btn_s)
            btn_s.setOnClickListener {
                btn_s.isVisible = false
                checkChar('s')
            }
            btn_t = findViewById(R.id.btn_t)
            btn_t.setOnClickListener {
                btn_t.isVisible = false
                checkChar('t')
            }
            btn_u = findViewById(R.id.btn_u)
            btn_u.setOnClickListener {
                btn_u.isVisible = false
                checkChar('u')
            }
            btn_v = findViewById(R.id.btn_v)
            btn_v.setOnClickListener {
                btn_v.isVisible = false
                checkChar('v')
            }
            btn_w = findViewById(R.id.btn_w)
            btn_w.setOnClickListener {
                btn_w.isVisible = false
                checkChar('w')
            }
            btn_x = findViewById(R.id.btn_x)
            btn_x.setOnClickListener {
                btn_x.isVisible = false
                checkChar('x')
            }
            btn_y = findViewById(R.id.btn_y)
            btn_y.setOnClickListener {
                btn_y.isVisible = false
                checkChar('y')
            }
            btn_z = findViewById(R.id.btn_z)
            btn_z.setOnClickListener {
                btn_z.isVisible = false
                checkChar('z')
            }
            btn_restart = findViewById(R.id.restart)
            btn_restart.setOnClickListener{
                resetStateHelper()
                setButtonClickable()
                wordText.text = String(stateHelper.strShowed)
                displayImage()
            }
            btn_hint = findViewById(R.id.hint)
            btn_hint.setOnClickListener {
                handleHint()
            }
        }

        if (!stateHelper.inGame) { // not in a game
            resetStateHelper()
        } else {
            // in a game

        }
        setButtonClickable()
        wordText.text = String(stateHelper.strShowed)
        displayImage()
    }

    private fun handleHint() {
        if (stateHelper.timesGuessedWrong == 5 && stateHelper.hintState != 0) {
            Toast.makeText(this, "Hint not available", Toast.LENGTH_LONG).show()
        } else {
            if (stateHelper.hintState == 0) {
                Toast.makeText(this, "Hint: " + hintList[stateHelper.wordIndex], Toast.LENGTH_LONG).show()
            } else if (stateHelper.hintState == 1) {
                val temp = stateHelper.timesGuessedWrong
                var countRemaining = 0
                val remainingList = ArrayList<Int>()
                for (i in 0 until stateHelper.letterStates.size) {
                    if (!stateHelper.letterStates[i] && Char(i + 97) !in stateHelper.strSelected) {
                        remainingList.add(i)
                        countRemaining++
                    }
                }
                for (i in 0 until countRemaining/2) {
                    getBtn(Char(remainingList[i] + 97)).isVisible = false
                    checkChar(Char(remainingList[i] + 97))
                    stateHelper.timesGuessedWrong = temp
                }
                stateHelper.timesGuessedWrong = temp + 1
            } else if (stateHelper.hintState == 2) {
                val temp = stateHelper.timesGuessedWrong
                btn_a.isVisible = false
                checkChar('a')
                btn_e.isVisible = false
                checkChar('e')
                btn_i.isVisible = false
                checkChar('i')
                btn_o.isVisible = false
                checkChar('o')
                btn_u.isVisible = false
                checkChar('u')
                stateHelper.timesGuessedWrong = temp + 1
                displayImage()
            } else {
                Toast.makeText(this, "Hint not available", Toast.LENGTH_LONG).show()
                return
            }
            stateHelper.hintState++
        }
    }

    private fun getBtn(ch: Char) : Button{
        when (ch) {
            'a' -> return btn_a
            'b' -> return btn_b
            'c' -> return btn_c
            'd' -> return btn_d
            'e' -> return btn_e
            'f' -> return btn_f
            'g' -> return btn_g
            'h' -> return btn_h
            'i' -> return btn_i
            'j' -> return btn_j
            'k' -> return btn_k
            'l' -> return btn_l
            'm' -> return btn_m
            'n' -> return btn_n
            'o' -> return btn_o
            'p' -> return btn_p
            'q' -> return btn_q
            'r' -> return btn_r
            's' -> return btn_s
            't' -> return btn_t
            'u' -> return btn_u
            'v' -> return btn_v
            'w' -> return btn_w
            'x' -> return btn_x
            'y' -> return btn_y
            'z' -> return btn_z
        }
        return btn_a
    }

    private fun resetStateHelper() {
        stateHelper.timesGuessedWrong = 0
        stateHelper.hintState = 0
        stateHelper.inGame = true
        stateHelper.letterStates = BooleanArray(26){false}
        stateHelper.wordIndex = Random.nextInt(0, 4)
        stateHelper.strSelected = wordList[stateHelper.wordIndex].toCharArray()
        stateHelper.strShowed = stateHelper.strSelected.clone()
        for (i in 0 until stateHelper.strShowed.size) stateHelper.strShowed[i] = '_'
    }

    private fun setButtonClickable() {
        for (i in 0 until stateHelper.letterStates.size) {
            if (stateHelper.letterStates[i]) {
                when (i) {
                    0 -> {
                        btn_a.isVisible= false;
                    }
                    1 -> {
                        btn_b.isVisible = false;
                    }
                    2 -> {
                        btn_c.isVisible = false;
                    }
                    3 -> {
                        btn_d.isVisible = false;
                    }
                    4 -> {
                        btn_e.isVisible = false;
                    }
                    5 -> {
                        btn_f.isVisible = false;
                    }
                    6 -> {
                        btn_g.isVisible = false;
                    }
                    7 -> {
                        btn_h.isVisible = false;
                    }
                    8 -> {
                        btn_i.isVisible = false;
                    }
                    9 -> {
                        btn_j.isVisible = false;
                    }
                    10 -> {
                        btn_k.isVisible = false;
                    }
                    11 -> {
                        btn_l.isVisible = false;
                    }
                    12 -> {
                        btn_m.isVisible = false;
                    }
                    13 -> {
                        btn_n.isVisible = false;
                    }
                    14 -> {
                        btn_o.isVisible = false;
                    }
                    15 -> {
                        btn_p.isVisible = false;
                    }
                    16 -> {
                        btn_q.isVisible = false;
                    }
                    17 -> {
                        btn_r.isVisible = false;
                    }
                    18 -> {
                        btn_s.isVisible = false;
                    }
                    19 -> {
                        btn_t.isVisible = false;
                    }
                    20 -> {
                        btn_u.isVisible = false;
                    }
                    21 -> {
                        btn_v.isVisible = false;
                    }
                    22 -> {
                        btn_w.isVisible = false;
                    }
                    23 -> {
                        btn_x.isVisible = false;
                    }
                    24 -> {
                        btn_y.isVisible = false;
                    }
                    25 -> {
                        btn_z.isVisible = false;
                    }
                }
            } else {
                when (i) {
                    0 -> {
                        btn_a.isVisible = true;
                    }
                    1 -> {
                        btn_b.isVisible = true;
                    }
                    2 -> {
                        btn_c.isVisible = true;
                    }
                    3 -> {
                        btn_d.isVisible = true;
                    }
                    4 -> {
                        btn_e.isVisible = true;
                    }
                    5 -> {
                        btn_f.isVisible = true;
                    }
                    6 -> {
                        btn_g.isVisible = true;
                    }
                    7 -> {
                        btn_h.isVisible = true;
                    }
                    8 -> {
                        btn_i.isVisible = true;
                    }
                    9 -> {
                        btn_j.isVisible = true;
                    }
                    10 -> {
                        btn_k.isVisible = true;
                    }
                    11 -> {
                        btn_l.isVisible = true;
                    }
                    12 -> {
                        btn_m.isVisible = true;
                    }
                    13 -> {
                        btn_n.isVisible = true;
                    }
                    14 -> {
                        btn_o.isVisible = true;
                    }
                    15 -> {
                        btn_p.isVisible = true;
                    }
                    16 -> {
                        btn_q.isVisible = true;
                    }
                    17 -> {
                        btn_r.isVisible = true;
                    }
                    18 -> {
                        btn_s.isVisible = true;
                    }
                    19 -> {
                        btn_t.isVisible = true;
                    }
                    20 -> {
                        btn_u.isVisible = true;
                    }
                    21 -> {
                        btn_v.isVisible = true;
                    }
                    22 -> {
                        btn_w.isVisible = true;
                    }
                    23 -> {
                        btn_x.isVisible = true;
                    }
                    24 -> {
                        btn_y.isVisible = true;
                    }
                    25 -> {
                        btn_z.isVisible = true;
                    }
                }
            }
        }
    }

    private fun checkChar(ch: Char) {
        stateHelper.letterStates[ch.toInt() - 97] = true
        var isSuccess = false;
        for (i in 0 until stateHelper.strSelected.size) {
            if (ch == stateHelper.strSelected[i]) {
                stateHelper.strShowed[i] = ch
                isSuccess = true;
            }
        }

        if (!isSuccess) { // picked the wrong one
            stateHelper.timesGuessedWrong++
            displayImage()

            if (stateHelper.timesGuessedWrong == 7) {
                Toast.makeText(this, "You lose the game", Toast.LENGTH_LONG).show()
            }
        } else {
            wordText.text = String(stateHelper.strShowed)
            Toast.makeText(this, "Congratulations", Toast.LENGTH_SHORT).show()
        }
        if (stateHelper.strShowed.contentEquals(stateHelper.strSelected)) {
            Toast.makeText(this, "You win the game", Toast.LENGTH_LONG).show()
        }
    }

    fun displayImage() {
        when(stateHelper.timesGuessedWrong) {
            0 -> {
                imageView.setImageResource(R.drawable.hangman0)
            }
            1 -> {
                imageView.setImageResource(R.drawable.hangman1)
            }
            2 -> {
                imageView.setImageResource(R.drawable.hangman2)
            }
            3 -> {
                imageView.setImageResource(R.drawable.hangman3)
            }
            4 -> {
                imageView.setImageResource(R.drawable.hangman4)
            }
            5 -> {
                imageView.setImageResource(R.drawable.hangman5)
            }
            6 -> {
                imageView.setImageResource(R.drawable.hangman6)
            }
        }
    }


}


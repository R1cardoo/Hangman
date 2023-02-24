package com.example.hangman

object stateHelper {
    var letterStates = BooleanArray(26){false} // is the letter clicked
    var hintState = 0 // 0 never used, 1 used once, 2 used twice, 3 used three times ...
    var inGame = false
    var wordIndex = 0
    lateinit var strSelected: CharArray
    lateinit var strShowed: CharArray
    var timesGuessedWrong = 0
}
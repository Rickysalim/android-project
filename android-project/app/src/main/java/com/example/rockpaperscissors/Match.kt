package com.example.rockpaperscissors

fun matchRps() {
    println("====================================")
    println("ROCK PAPER SCISSORS TERMINAL VERSION")
    println("====================================")
    println("PLAYER 1: ")
    var player1: String = readLine()!!
    println("PLAYER 2: ")
    var player2: String = readLine()!!
    if (player1 == player2) {
        print("Result:\n"+"DRAW");
    }
    if (player1 == "paper" && player2 == "rock") {
        print("Result:\n"+"PLAYER 1 WIN");
    } else if(player1 == "rock" && player2 == "paper") {
        print("Result:\n"+"PLAYER 2 WIN");
    } else if(player1 == "rock" && player2 == "scissors"){
        print("Result:\n"+"PLAYER 1 WIN");
    } else if(player1 == "scissors" && player2 == "rock") {
        print("Result:\n"+"PLAYER 2 WIN");
    } else if (player1 == "scissors" && player2 == "paper") {
        print("Result:\n"+"PLAYER 1 WIN");
    } else if (player1 == "paper" && player2 == "scissors") {
        print("Result:\n"+"PLAYER 2 WIN");
    } else {
        print("Result:\n"+"NULL");
    }
}

fun main() {
    matchRps()
}

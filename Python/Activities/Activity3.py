player1data = input("Enter your choice of Rock/Paper/Scissor: ").upper()
player2data = input("Enter your choice of Rock/Paper/Scissor: ").upper()
# Rock & scissor = Rock, Rock & paper=paper, scissor & paper=scissor, same combination tie,play again

if player1data == "ROCK":
    if player2data == "PAPER":
        print("Paper - Player 2 wins")
    else:
        print("ROCK - Player 1 wins")
if player1data == "PAPER":
    if player2data == "SCISSOR":
        print("Scissor - Player 2 wins")
    else:
        print("Paper - Player 1 wins")
if player1data == "SCISSOR":
    if player2data == "ROCK":
        print("Rock - Player 2 wins")
    else:
        print("Scissor - Player 1 wins")
elif player1data == player2data:
    print("Its a tie, do you want to play again?")
elif player1data and player2data not in ["ROCK","PAPER","SCISSOR"]:
    print("You have entered an invalid input, try again")



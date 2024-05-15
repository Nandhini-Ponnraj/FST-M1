a=input("Player1: Enter Rock/Paper/Scissor: ").lower()
b=input("Player2: Enter Rock/Paper/Scissor: ").lower()
options=["rock","paper","scissor"]
while a and b in options:
        if a == b:
            print("It's a tie, play again")
            break
        elif a == "rock":
            if b == "paper":
                print("Paper- Player 2 wins")
                break
            else:
                print("Rock - Player 1 wins")
                break
        elif a == "paper":
            if b == "scissor":
                print("Scissor- Player 2 wins")
                break
            else:
                print("Paper - Player1 wins")
                break;
        elif a == "scissor":
            if b == "rock":
                print("Rock - Player 2 wins")
                break
            else:
                print("Scissor - Player 1 wins")
                break
if a and b not in options:
    print("You have entered an invalid value")
c = input("Do you want to play again? Enter Y to continue, N to quit ").lower()

if c == 'y':
    pass
elif c == 'n':
    raise SystemExit #exit(0)
else:
    print("Invalid value")


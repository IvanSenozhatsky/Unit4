import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        boolean gameOver = true;
        int n = 3;
        char ans = '1';
        int choose=0;
        int m = 0;
        int k = 0;
        String name1 = "Player1";
        String name2 = "Player2";
        char[][] a = new char[][]{{'1', '2', '3'}, {'4', '5', '6'}, {'7', '8', '9'}};
        Scanner sc = new Scanner(System.in);
        while (gameOver) {
            System.out.println("Tic Tac Toe");
            System.out.println("Press 1 to start the game");
            System.out.println("Press 2 to exit");
            boolean x = true;
            int z = 0;
            while (x) {
                z = sc.nextInt();
                if (z == 1) {
                    x = false;
                } else if (z == 2) {
                    gameOver = false;
                    break;
                }
            }
            if (z == 2) {
                break;
            }
            System.out.println("Enter nickname for player 1");
            name1 = sc.next();
            System.out.println("Enter nickname for player 2");
            name2 = sc.next();
            for (int i = 0; i < n; i++) {
                System.out.print("|");
                for (int j = 0; j < n; j++) {
                    System.out.print(a[i][j] + "|");
                }
                System.out.println();
            }
            int i = 0;
            for (i = 1; i < 10; i++) {
                if (i % 2 != 0) {
                    ans = 'X';
                } else {
                    ans = 'O';
                }
                boolean correct = true;
                while (correct){
                    if(sc.hasNextInt()){
                        choose= sc.nextInt();
                        if(0<choose & choose<10){
                            correct=false;
                        }
                        else
                        {
                            System.out.println("You have not entered a number between 1 and 9. Try again.");
                        }

                    }
                    else{
                        System.out.println("You have entered an invalid input. Try again.");
                        sc.next();
                    }

                }
                switch (choose) {
                    case 1:
                        if (a[0][0] != 'O' & a[0][0] != 'X') {
                            a[0][0] = ans;
                            break;
                        } else {
                            i--;
                            System.out.println("this cell is already occupied");
                            break;
                        }
                    case 2:
                        if (a[0][1] != 'O' & a[0][1] != 'X') {
                            a[0][1] = ans;
                            break;
                        } else {
                            i--;
                            System.out.println("this cell is already occupied");
                            break;
                        }
                    case 3:
                        if (a[0][2] != 'O' & a[0][2] != 'X') {
                            a[0][2] = ans;
                            break;
                        } else {
                            i--;
                            System.out.println("this cell is already occupied");
                            break;
                        }
                    case 4:
                        if (a[1][0] != 'O' & a[1][0] != 'X') {
                            a[1][0] = ans;
                            break;
                        } else {
                            i--;
                            System.out.println("this cell is already occupied");
                            break;
                        }

                    case 5:
                        if (a[1][1] != 'O' & a[1][1] != 'X') {
                            a[1][1] = ans;
                            break;
                        } else {
                            i--;
                            System.out.println("this cell is already occupied");
                            break;
                        }
                    case 6:
                        if (a[1][2] != 'O' & a[1][2] != 'X') {
                            a[1][2] = ans;
                            break;
                        } else {
                            i--;
                            System.out.println("this cell is already occupied");
                            break;
                        }
                    case 7:
                        if (a[2][0] != 'O' & a[2][0] != 'X') {
                            a[2][0] = ans;
                            break;
                        } else {
                            i--;
                            System.out.println("this cell is already occupied");
                            break;
                        }
                    case 8:
                        if (a[2][1] != 'O' & a[2][1] != 'X') {
                            a[2][1] = ans;
                            break;
                        } else {
                            i--;
                            System.out.println("this cell is already occupied");
                            break;
                        }
                    case 9:
                        if (a[2][2] != 'O' & a[2][2] != 'X') {
                            a[2][2] = ans;
                            break;
                        } else {
                            i--;
                            System.out.println("this cell is already occupied");
                            break;
                        }
                    default:
                        break;
                }
                for (int q = 0; q < n; q++) {
                    System.out.print("|");
                    for (int j = 0; j < n; j++) {
                        System.out.print(a[q][j] + "|");
                    }
                    System.out.println();
                }
                if (a[m][k] == ans & a[m][k + 1] == ans & a[m][k + 2] == ans) {
                    gameOver = false;
                    break;
                } else if (a[m + 1][k] == ans & a[m + 1][k + 1] == ans & a[m + 1][k + 2] == ans) {
                    gameOver = false;
                    break;
                } else if (a[m + 2][k] == ans & a[m + 2][k + 1] == ans & a[m + 2][k + 2] == ans) {
                    gameOver = false;
                    break;
                } else if (a[m][k] == ans & a[m + 1][k] == ans & a[m + 2][k] == ans) {
                    gameOver = false;
                    break;
                } else if (a[m][k + 1] == ans & a[m + 1][k + 1] == ans & a[m + 2][k + 1] == ans) {
                    gameOver = false;
                    break;
                } else if (a[m][k + 2] == ans & a[m + 1][k + 2] == ans & a[m + 2][k + 2] == ans) {
                    gameOver = false;
                    break;
                } else if (a[m][k] == ans & a[m + 1][k + 1] == ans & a[m + 2][k + 2] == ans) {
                    gameOver = false;
                    break;
                } else if (a[m][k + 2] == ans & a[m + 1][k + 1] == ans & a[m + 2][k] == ans) {
                    gameOver = false;
                    break;
                }
            }
            if (gameOver != false & i == 10) {
                ans = '1';
                System.out.println("a draw!!!");
                System.out.println("Would you to try again ?");
                System.out.println("press '1' to continue");
                System.out.println("press '2' to exit");
                int repeat = sc.nextInt();
                boolean ch = true;
                while (ch) {
                    if (repeat == 1) {
                        a[0][0] = '1';
                        a[0][1] = '2';
                        a[0][2] = '3';
                        a[1][0] = '4';
                        a[1][1] = '5';
                        a[1][2] = '6';
                        a[2][0] = '7';
                        a[2][1] = '8';
                        a[2][2] = '9';
                        i = 0;
                        ch = false;
                    } else if (repeat == 2) {
                        ch = false;
                        gameOver = false;
                    }
                }
            }
        }
        if (ans == 'X') {
            System.out.println("The winner is " + name1 + "!!!");
        } else if (ans == 'O') {
            System.out.println("The winner is " + name2 + "!!!");
        }
    }
}

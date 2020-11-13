package ThirdLesson;

import java.util.Random;
import java.util.Scanner;

public class Game {
    static final int SIZE = 5;
    static final int CHIP = 3; /* количество фишек*/
    static final char DOT_EMPTY = '•';
    static final char DOT_HUMAN = 'x';
    static final char DOT_AI = '0';
    static final char HEADER_FIRST_EMPTY = '☺';
    static final String EMPTY = " ";

    static char[][] map = new char[SIZE][SIZE];
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        turnGame();


    }

    private static void turnGame() {
        initMap();
        printMap();
        playGame();
    }


    private static void initMap() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    private static void printMap() {
        printMapHeader();
        printMapRow();
    }

    private static void printMapHeader() {
        System.out.print(HEADER_FIRST_EMPTY + EMPTY);
        for (int i = 0; i < SIZE; i++) {
            printMapNumber(i);
        }
        System.out.println();

    }

    private static void printMapNumber(int i) {
        System.out.print(i + 1 + EMPTY);
    }

    private static void printMapRow() {
        for (int i = 0; i < SIZE; i++) {
            printMapNumber(i);
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + EMPTY);

            }
            System.out.println();

        }

    }

    private static void playGame() {

        while (true) {
            humanTurn();
            printMap();
            checkEnd(DOT_HUMAN);

            aiTurn();
            printMap();
            checkEnd(DOT_AI);

        }

    }

    private static void humanTurn() {
        int rowNumber;
        int colNumber;
        System.out.println("your turn, human");
        do {
            System.out.println("Input row and column number");
            rowNumber = scanner.nextInt();
            colNumber = scanner.nextInt();
        } while (!isCellValid(rowNumber, colNumber));

        map[rowNumber - 1][colNumber - 1] = DOT_HUMAN;

    }

    private static boolean isCellValid(int rowNumber, int colNumber, boolean isAi) {
        if (!isAi && (rowNumber < 1) || (rowNumber > SIZE) || (colNumber < 1) ||
                (colNumber > SIZE)) {
            System.out.println("Hei check yourself !");
            return false;
        }

        if (map[rowNumber - 1][colNumber - 1] != DOT_EMPTY) {
            if (isAi) {

                System.out.println("the cell is busy");
            }
            return false;
        }
        return true;
    }

    private static boolean isCellValid(int rowNumber, int colNumber) {
        return isCellValid(rowNumber, colNumber, false);
    }

    private static void checkEnd(char symbol) {
        boolean isEnd = false;
        String winMessage = null;

        if (checkWin(DOT_HUMAN)) {
            if (symbol == DOT_HUMAN) {
                winMessage = "You won !";
            }
            isEnd = true;
            System.out.println(winMessage);
        }
        if (checkWin(DOT_AI)) {
            if (symbol == DOT_AI) {
                winMessage = "You lost !";
            }
            isEnd = true;
            System.out.println(winMessage);
        }

        if (!isEnd && isMapFull()) {
            System.out.println("It is draw !");
            isEnd = true;
        }

        if (isEnd) {
            System.exit(0);
        }


    }

    private static boolean checkWin(char symbol) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE - CHIP + 1; j++) {
                if (map[i][j] == symbol && map[i][j + 1] == symbol && map[i][j + 2] == symbol) return true;
            } /*При увеличении числа фишек на 1 придется дописывать еще 1 условие  map[i][j + 3] для каждого if и т.д*/
        }
        for (int i = 0; i < SIZE - CHIP + 1; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == symbol && map[i + 1][j] == symbol && map[i + 2][j] == symbol) return true;
            }
        }
        for (int i = 0; i < SIZE - CHIP + 1; i++) {
            for (int j = 0; j < SIZE - CHIP + 1; j++) {
                if (map[i][j] == symbol && map[i + 1][j + 1] == symbol && map[i + 2][j + 2] == symbol) return true;
                if (map[i][j + 2] == symbol && map[i + 1][j + 1] == symbol && map[i + 2][j] == symbol) return true;
            }
        }
        return false;

    }

    private static boolean isMapFull() {
        for (char[] chars : map) {
            for (char aChar : chars) {
                if (aChar == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    private static void aiTurn() {
        int rowNumber;
        int colNumber;
        System.out.println("your turn, comp");
        do {
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE - CHIP + 1; j++) {
                    if (map[i][j] == DOT_HUMAN && map[i][j + 1] == DOT_HUMAN)
                    {/*пытался таким образом заставить реагировать компьютер на то что если 2 крестика подряд в строке, то ставить после 0,
                    Что-то не очень получается. Компьютер все равно выбирает рандом хотя я ставлю крестики на 1,1 и 1,2*/
                        rowNumber = i;
                        colNumber = j + 2;
                        break;
                    }
                    else if (map[i][j] == DOT_HUMAN && map[i][j + 2] == DOT_HUMAN)
                    {
                        rowNumber = i;
                        colNumber = j + 1;
                        break;
                    }
                }
            }
            rowNumber = random.nextInt(SIZE) + 1;
            colNumber = random.nextInt(SIZE) + 1;
        }
                    while (!isCellValid(rowNumber, colNumber, true)) ;

                    map[rowNumber - 1][colNumber - 1] = DOT_AI;

                } /*private static boolean checkWin(char symbol) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE - CHIP + 1; j++) {
                if (map[i][j] == symbol && map[i][j + 1] == symbol && map[i][j + 2] == symbol) return true;
                }
}
        for (int i = 0; i < SIZE - CHIP + 1; i++) {
        for (int j = 0; j < SIZE; j++) {
        if (map[i][j] == symbol && map[i + 1][j] == symbol && map[i + 2][j] == symbol) return true;
        }
        }
        for (int i = 0; i < SIZE - CHIP + 1; i++) {
        for (int j = 0; j < SIZE - CHIP + 1; j++) {
        if (map[i][j] == symbol && map[i + 1][j +1] == symbol && map[i + 2][j + 2] == symbol) return true;
        if (map[i][j + 2] == symbol && map[i + 1][j +1] == symbol && map[i + 2][j] == symbol) return true;
        }
        }
        return false;
    */
            }




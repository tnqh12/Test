package javaomoc;

import java.util.Scanner;

public class Gomoku {
    private static final int SIZE = 15;
    private static final char EMPTY = '.';
    private static final char[] PLAYERS = {'X', 'O'};
    private char[][] board = new char[SIZE][SIZE];
    private int currentPlayer = 0; // 0: 첫 번째 플레이어, 1: 두 번째 플레이어

    public Gomoku() {
        for(int i = 0; i < SIZE; i++) {
            for(int j = 0; j < SIZE; j++) {
                board[i][j] = EMPTY;
            }
        }
    }

    public void playGame() {
        Scanner scanner = new Scanner(System.in);
        boolean gameOver = false;
        
        while(!gameOver) {
            printBoard();
            System.out.println(PLAYERS[currentPlayer] + " 차례입니다. 좌표를 입력하세요. 예: 3 5");
            int row = scanner.nextInt() - 1;
            int col = scanner.nextInt() - 1;
            
            if(row >= 0 && row < SIZE && col >= 0 && col < SIZE && board[row][col] == EMPTY) {
                board[row][col] = PLAYERS[currentPlayer];
                gameOver = checkWin(row, col);
                currentPlayer = (currentPlayer + 1) % 2;
            } else {
                System.out.println("잘못된 위치입니다. 다시 입력해주세요.");
            }
        }
        scanner.close();
        printBoard();
        System.out.println("게임 종료! " + PLAYERS[(currentPlayer + 1) % 2] + " 승리!");
    }

    private boolean checkWin(int row, int col) {
        // 이 부분에는 승리 조건을 검사하는 로직이 들어가야 합니다.
        // 가장 간단한 형태로, 현재 돌이 놓인 위치를 중심으로 가로, 세로, 대각선 방향에 같은 돌이 5개 연속되어 있는지 확인하는 방법이 있습니다.
        // 여기서는 상세한 구현을 생략합니다.
        return false;
    }

    private void printBoard() {
        for(int i = 0; i < SIZE; i++) {
            for(int j = 0; j < SIZE; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Gomoku game = new Gomoku();
        game.playGame();
    }
}

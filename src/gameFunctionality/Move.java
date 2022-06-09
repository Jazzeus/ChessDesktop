package gameFunctionality;

public class Move {
    private int moveForward;
    private int moveRight;


    public Move(int moveForward, int moveRight) {
        this.moveForward = moveForward;
        this.moveRight = moveRight;
    }

    public int getMoveForward() {
        return moveForward;
    }

    public int getMoveRight() {
        return moveRight;
    }
}

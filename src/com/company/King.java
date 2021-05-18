package com.company;

public class King extends Piece {

    boolean hasEverMoved;
    boolean isCastled;
    boolean isChecked;
    boolean isMatted;

    public King(boolean isWhite, int xPosition, int yPosition) {
        super(isWhite, xPosition, yPosition);
        hasEverMoved = false;
        isCastled = false;
        isChecked = false;
        isMatted = false;
        super.setName("K");
    }

    @Override
    public boolean isMovePossible(int startingXPosition, int startingYPosition, int endingXPosition, int endingYPosition, Board board) {
        return false;
    }

    public boolean isHasEverMoved() {
        return hasEverMoved;
    }

    public void setHasEverMoved(boolean hasEverMoved) {
        this.hasEverMoved = hasEverMoved;
    }

    public boolean isCastled() {
        return isCastled;
    }

    public void setCastled(boolean castled) {
        isCastled = castled;
    }

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
    }

    public boolean isMatted() {
        return isMatted;
    }

    public void setMatted(boolean matted) {
        isMatted = matted;
    }
}

package com.company;

public abstract class Piece {
    private boolean isWhite;
    private boolean isKilled;
    private boolean hasEverMoved;
    private String name;
    private String color;
    private int xPosition;
    private int yPosition;

    public Piece (boolean isWhite, int xPosition, int yPosition){

        this.isWhite = isWhite;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.isKilled = false;
    }

    public abstract boolean isMovePossible(int startingXPosition, int startingYPosition, int endingXPosition, int endingYPosition, Board board);

    public boolean isWhite() {
        return isWhite;
    }

    public void setWhite(boolean white) {
        isWhite = white;
    }

    public boolean isKilled() {
        return isKilled;
    }

    public void setKilled(boolean killed) {
        isKilled = killed;
    }

    public boolean isHasEverMoved() {
        return hasEverMoved;
    }

    public void setHasEverMoved(boolean hasEverMoved) {
        this.hasEverMoved = hasEverMoved;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getxPosition() {
        return xPosition;
    }

    public void setxPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    public int getyPosition() {
        return yPosition;
    }

    public void setyPosition(int yPosition) {
        this.yPosition = yPosition;
    }




}

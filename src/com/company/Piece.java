package com.company;

public class Piece {
    private boolean isWhite;
    private boolean isKilled;
    private String name;
    private String color;
    private int xPosition;
    private int yPostion;

    public Piece (boolean isWhite, int xPosition, int yPostion){

        this.isWhite = isWhite;
        this.xPosition = xPosition;
        this.yPostion = yPostion;
        this.isKilled = false;
    }

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

    public int getyPostion() {
        return yPostion;
    }

    public void setyPostion(int yPostion) {
        this.yPostion = yPostion;
    }
}

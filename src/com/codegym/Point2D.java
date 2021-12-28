package com.codegym;

public class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;
    private float[] xy = new float[2];


    public Point2D() {
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        xy[0] = this.x;
        xy[1] = this.y;
    }

    public float[] getXY() {
        return xy;
    }

    @Override
    public String toString() {
        return
                "x=" + getX() +
                        ", y=" + getY()
                ;
    }
}

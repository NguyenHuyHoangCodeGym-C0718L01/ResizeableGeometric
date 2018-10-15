package com.company;

public class ResizeableCircle extends Circle implements IResizeable{

    ResizeableCircle(){}

    ResizeableCircle(double radius){super(radius);}


    @Override
    public double resize(double percent) {
        if(percent <= 100 && percent >= 1) {
            this.setRadius(getRadius() + (getRadius() * (percent/100)));
        }
        return this.getRadius();
    }
}

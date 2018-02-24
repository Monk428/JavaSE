package com.sessionComplex.proxy;
//避免controls的所有方法被暴露出来
public class SpaceShipDelegate {
    private String name;
    private SpaceShipControls controls = new SpaceShipControls();
    public SpaceShipDelegate(String name) {
        this.name = name;
    }

    public void forward(int velocity) {
        controls.forward(velocity);
    }

    public static void main(String[] args) {
        SpaceShipDelegate protector = new SpaceShipDelegate("NSEA");
        protector.forward(100);
    }
}

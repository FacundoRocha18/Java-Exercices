package com.openbootcamp;

public class SmartPhone extends SmartDevice {

    protected Double screenSize;
    protected Integer screenResolutionWidth;
    protected Integer screenResolutionHeight;
    protected String processor;
    protected String chargingPort;
    protected Integer cameraResolution;

    public SmartPhone(String brand, String model, String year, Double price, Double screenSize, Integer screenResolutionWidth, Integer screenResolutionHeight, String processor, String chargingPort, Integer cameraResolution) {
        super(brand, model, year, price);
        this.screenSize = screenSize;
        this.screenResolutionWidth = screenResolutionWidth;
        this.screenResolutionHeight = screenResolutionHeight;
        this.processor = processor;
        this.chargingPort = chargingPort;
        this.cameraResolution = cameraResolution;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "screenSize=" + screenSize +
                ", screenResolutionWidth=" + screenResolutionWidth +
                ", screenResolutionHeight=" + screenResolutionHeight +
                ", processor='" + processor + '\'' +
                ", chargingPort='" + chargingPort + '\'' +
                ", cameraResolution=" + cameraResolution +
                '}';
    }
}

package ru.geekbrains.lesson3;

public class WipingStation implements Wiping{
    @Override
    public void wipMirrors() {
        System.out.println("Зеркала помыты");
    }

    @Override
    public void wipWindshield() {
        System.out.println("Стекло помыто");
    }

    @Override
    public void wipHeadlights() {
        System.out.println("фары помыты");
    }
}

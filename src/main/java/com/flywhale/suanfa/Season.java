package com.flywhale.suanfa;

public enum Season {

    SPRING("Spring", "spring returns and everything comes back to life"),
    SUMMER("Summmer", "the summer heat is sweetest with you"),
    AUTUMN("Autumn", "autumn winds and floodwaters rise"),
    WINTER("Winter", "the north wind is howling and the snow is drifting");
    private String name;
    private String feature;

    Season(String name, String feature) {
        this.name = name;
        this.feature = feature;
    }

    public String getName() {
        return name;
    }

    public String getFeature() {
        return feature;
    }

    @Override
    public String toString() {
        return name + ": " + feature + ".";
    }

}

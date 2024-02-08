package oop.inheritance.child;

import oop.inheritance.Animal;

public class Reptile extends Animal {
    String skinType = "Dry Skin";
    String backBone = "Backbone";
    String shellType = "Soft-shelled eggs";

    public Reptile(String skinType, String backBone, String shellType) {
        this.skinType = skinType;
        this.backBone = backBone;
        this.shellType = shellType;
    }

    public Reptile() {
    }

    @Override
    public String toString() {
        return "Reptile{" +
                "skinType='" + skinType + '\'' +
                ", backBone='" + backBone + '\'' +
                ", shellType='" + shellType + '\'' +
                '}';
    }
}

package oop.inheritance.subchild;

import oop.inheritance.child.Birds;

public class Eagle extends Birds {

    Eagle(){
        this.canFly = true;
        this.hasFeathers = true;
    }

    @Override
    public void move() {
        if (this.hasFeathers && this.canFly){
            System.out.println("Fly pretty birdie");
        }else {
            System.out.println("Walk like chicken");
        }
    }
}

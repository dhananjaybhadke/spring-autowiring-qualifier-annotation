package com.springcore;

public class Heart {

    private String nameofAnimal;
    private int noOfHearts;

    public String getNameofAnimal() {
        return nameofAnimal;
    }

    public void setNameofAnimal(String nameofAnimal) {
        this.nameofAnimal = nameofAnimal;
    }

    public int getNoOfHearts() {
        return noOfHearts;
    }

    public void setNoOfHearts(int noOfHearts) {
        this.noOfHearts = noOfHearts;
    }

    public void pump(){
        System.out.println("Heart is pumping.......");
        System.out.println("You are alive...");
    }
}

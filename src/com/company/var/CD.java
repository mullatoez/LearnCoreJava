package com.company.var;

public class CD {
    int r;

    public CD(int r) {
        this.r = r;
    }

    public CD() {

    }
}

class DVD extends CD {

    public DVD(int r) {
        super(r);
    }

    public DVD() {
        super();
    }
}

class Main {
    public static void main(String[] args) {
        DVD dvd = new DVD();
        dvd.r = 100;
        System.out.println(dvd.r);
    }
}

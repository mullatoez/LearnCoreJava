package com.company.interfaces;

abstract class Planet {

    protected void revolve(){

    }

    abstract void rotate();

    void coming(){

    }
}

class Earth extends Planet {

    @Override
    void coming() {
        super.coming();
    }

    @Override
    protected void revolve() {

    }

    @Override
    void rotate() {

    }
}

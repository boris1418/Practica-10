package com.company;

public class ConcreteFactory implements ComplexAbstractFactory {
    @Override
    public Complex createComplex() {
        return new Complex(0, 0);
    }

    @Override
    public Complex CreateComplex(int real, int imagine) {
        return new Complex(real, imagine);
    }
}

package gof.abstractfactory;

import gof.factory.Computer;

/*
* Abstract factory interface: Allow us to create different type of factory, like server factory, pc factory
* */
public interface ComputerAbstractFactory {
    Computer createComputer();
}

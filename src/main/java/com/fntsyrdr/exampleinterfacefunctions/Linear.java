package com.fntsyrdr.exampleinterfacefunctions;

public class Linear implements IFunctions{

    @Override
    public int Calculate(int time) {
        return 100-time;
    }

}

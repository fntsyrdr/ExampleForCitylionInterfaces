package com.fntsyrdr.exampleinterfacefunctions;

public class ClassThatUsesFunctions {

    int UseFunction(int time, IFunctions function){
        return function.Calculate(time);
    }
}

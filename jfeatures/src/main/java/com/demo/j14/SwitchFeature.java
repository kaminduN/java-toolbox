package com.demo.j14;

public class SwitchFeature {
    
    public boolean newSwitchExpression(int time) {
        
        boolean isValid = switch (time) {
            case 2, 14, 20 -> true;
            default -> false;
        };

        return isValid;

    }


    public boolean orgSwitchStatement(int time) {
        
        boolean isValid;

        switch (time) {

            case  2:
            case 14:
            case 20:
                isValid= true;
                break;
            default:
                isValid= false;
                break;
        };

        return isValid;


    }


    // Strings in switch statement: works from JDK 7 + release
    public boolean orgSwitchStatement1(String num) {
        
        boolean isValid;

        switch (num) {

            case  "2":
                isValid= true;
                break;
            default:
                isValid= false;
                break;
        };
        
        return isValid;


    }

}

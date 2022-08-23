package com.demo.j14;

/**
 * Preview feature from Java SE 12 re-previewed for J13 and released in J14
 */
public class SwitchFeature {

    
    // short hand form of writing the expression
    public boolean newSwitchExpression(int time) {
        
        boolean isValid = switch (time) {
            case 2, 14, 20 -> true;
            default -> false;
        };

        return isValid;

    }

    
    public boolean newSwitchExpressionwithyield(int time) {
        
        boolean isValid = switch (time) {
            case 2, 14, 20:
                // using yield instead inplace of break to return values
                yield true;
            default:
                yield false;
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

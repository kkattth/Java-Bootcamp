package sef.module7.activity;

// Needs to be completed
// 1 - Extend this class from Exception class
public class CustomExceptionActivity extends Exception{

    // 2 - Override getMessage() and provide the following message:

    @Override
    public String getMessage() {
        return " You are not allowed to use this program";
    }

    // "You are not allowed to use this program"

}


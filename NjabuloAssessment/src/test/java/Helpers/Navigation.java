package Helpers;

import utility.browserDriver;

public class Navigation extends browserDriver {
    public static  void NavigateTo(String url) {
        driver.get(url);
    }
}

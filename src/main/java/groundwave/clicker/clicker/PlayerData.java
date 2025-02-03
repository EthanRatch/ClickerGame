package groundwave.clicker.clicker;

public class PlayerData {

    //PlayerData Class Variables
    static int cookiesPerClick = 1;
    static int totalPlayerCookies = 0;


    static void setCookiesPerClick(int newCookiesPerClick) {
        cookiesPerClick = newCookiesPerClick;
    }

    static int checkPlayerCookies(){
        return totalPlayerCookies;
    }

    static void subtractPlayerCookies(int upgradeValue){
        totalPlayerCookies -= upgradeValue;
    }

}


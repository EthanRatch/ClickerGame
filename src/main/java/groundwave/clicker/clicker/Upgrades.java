package groundwave.clicker.clicker;

public class Upgrades {

    //variables
    static int totalPlayerCookies = PlayerData.checkPlayerCookies();

    //unlocked upgrades
    static boolean upgrade1Unlocked = false;


    static void upgrade1() {

        final int upgrade1Value = 50;
        final int upgrade1CookiesPerClick = 2;

        // add button condition to if statement, and check previous upgrade unlocked
        if (!upgrade1Unlocked && totalPlayerCookies >= upgrade1Value){

            //Removes value of upgrade from player's total
            PlayerData.subtractPlayerCookies(upgrade1Value);

            //Updates cookies per click
            PlayerData.setCookiesPerClick(upgrade1CookiesPerClick);

            // Interact with UI layer to change machine sprite

            upgrade1Unlocked = true;
        }

    }
}

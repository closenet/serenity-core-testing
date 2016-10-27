package serenity.test.suite.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;


public class SkyLeaguePage extends PageObject{

    public void ClickLeagueLink  ()
    {
        //$("*").find(By.xpath())
        $("#hero").find(By.className("hero-title")).click();
       // $("*").find(By.linkText("Visit SkyNews.com")).click();
      //  $("*").find(By.className(".hero-title")).click();
        //$("*").find(By.ByjQuerySelector.linkText("Discover more")).click();
    }
}

package com.testing.frameworkautojava;

public abstract class BasePage {

   public ReusableFunctions webdriver;

   protected BasePage(ReusableFunctions driver)
   {
       this.webdriver=driver;
   }
}

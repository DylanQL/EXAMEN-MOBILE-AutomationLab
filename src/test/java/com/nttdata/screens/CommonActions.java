package com.nttdata.screens;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.core.pages.PageObject;

public class CommonActions extends PageObject {

    // Método reutilizable para hacer scroll y clic en cualquier elemento por su 'content-desc'
    public void scrollAndClickByDescription(String description) {
        String scrollDinamico = String.format(
                "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().description(\"%s\"))", description);

        find(AppiumBy.androidUIAutomator(scrollDinamico)).waitUntilClickable().click();
    }
}

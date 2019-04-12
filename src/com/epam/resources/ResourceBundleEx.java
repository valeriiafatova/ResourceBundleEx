package com.epam.resources;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleEx {
    public static void main(String[] args) {
        System.out.println("Current Locale: " + Locale.getDefault());
        ResourceBundle rb = getText();
        System.out.println("Say how are you in Default: " + rb.getString("how_are_you"));

        Locale.setDefault(new Locale("de"));

        System.out.println("Current Locale: " + Locale.getDefault());
        rb = getText();
        System.out.println("Say how are you in Deutsch: " + rb.getString("how_are_you"));

        Locale.setDefault(new Locale("en"));

        System.out.println("Current Locale: " + Locale.getDefault());
        rb = getText();
        System.out.println("Say how are you in en: " + rb.getString("how_are_you"));

        Locale.setDefault(new Locale("en", "USA"));

        System.out.println("Current Locale: " + Locale.getDefault());
        rb = getText();
        rb = ResourceBundle.getBundle("text", new Locale("en"));
        System.out.println("Say how are you in en USA: " + rb.getString("how_are_you"));
    }

    private static ResourceBundle getText() {
        return ResourceBundle.getBundle("try3");
    }
}

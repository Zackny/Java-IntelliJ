package com.syntsx.class24;

public class BrowserTester {

    public static void main(String[] args) {

      /*  GoogleChrome chrom=new GoogleChrome();
        chrom.openBrowser();
        chrom.loadPage("www.google.com");
        chrom.testThePage();
        chrom.closeBrowser();

        FireFox fireFox=new FireFox();
        fireFox.openBrowser();
        fireFox.loadPage("www.firefox.com");
        fireFox.testThePage();
        fireFox.closeBrowser();

        Safari safari=new Safary();
        safari.openBrowser();
        safari.loadPage("www.safari.com");
        safari.testThePage();
        safari.closeBrowser();
        */
        Browser[] browser={new GoogleChrome(),new FireFox(),new Safari()};

        for(Browser br:browser){

            br.openBrowser();
            br.loadPage("www.gooogl.com");
            br.testThePage();
            br.closeBrowser();

        }
    }


}

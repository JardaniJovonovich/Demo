package com.maven;



public class Amazonlogin extends BaseClass {
	
	
public static void main(String[] args) throws Exception {
    launchBrowser("https://www.amazon.in/");
	Login l = new Login();
clickstuff(l.hellosignin);
clickstuff(l.clik);
clickstuff(l.createAcc);
entertext(l.name, "Itachi Uchiha");
entertext(l.phNum, "9989878787");
entertext(l.eMail, "itachi@gmail.com");
entertext(l.passWord, "itachi@2R");
clickstuff(l.signUp);
cntrlA(l.name);
rightclik(l.name);
Thread.sleep(3000);
roBot(l.name);
rightclik(l.passWord);
roBott(l.passWord);
clickstuff(l.signUp);
entertext(l.name, "Madara uchiha");
signInn(l.signIn);
mailorph(l.emailorph);
tXt(l.getTxt);
Title();
uRl();
}
}

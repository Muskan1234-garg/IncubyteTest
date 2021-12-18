SignInPageTest_and_ComposeMailTest.mp4-->Contains screen recording(successfully run) of 2 testcases.

Created a maven project.

packages:-

src/main/java
com.qa.trial.base->
TestBase.java->contains basic, like with browser to launch & on which url to launch

com.qa.trial.config->
config.properties-->contains global variables

com.qa.trial.pages->
SignInPage.java-->contains all webelement & actions related to signin page
ComposeMail.java-->contains whom to send and subject of mail

src/test/java
com.qa.trial.testcases->
contains 2 testcase
1.SignInPageTest.java-->Verify logo after sign in to check successfully signed in
2.ComposeMailTest.java--->verify mail has been sent by verifing the text msg i.e.'Message sent'



#selenium_assignement

<hr>

##Requirements :-

- JDK needs to be installed in your local machine and path needs to be set in your local machine.

- Refer to this link on how to set path for the JDK : https://www.javatpoint.com/how-to-set-path-in-java

- Install and IDE, I recommend using Eclipse.

- Also make sure to install maven for java as it will be an essential part of the project.

<hr>

##TestNG installion in eclipse :-
 - Install plugin
 - Add dependecies

<hr>

##Steps to intall the project :-

- Unzip or extract the .zip File.

- Copy and paste whole project file with name "selenium_assignement" in your eclipse-workspace folder or any any folder you want to.

- Make sure to install the webdrivers of the same version for chrome, firefox and edge you are currently working with.

- Make sure to download to the web drivers inside the [selenium_assignement//Resources] folder as it will be a part of the project.

- Now go to the config.properties file inside the project [selenium_assignement//Resources//config.propeties]

- Now change the path of the "driver path", "ffdriverpath" and "edgedriverpath" with the actual path of the drivers you have downloaded inside the file [selenium_assignement//Resources].


<hr>

##Running the test cases :-
- The tests is runnable from command line.

- - Go to [selenium_assignement//Resources//config.propeties] and change the "browser" to "chrome,firefox or edge" to run with that particular browser.

- Now go to the TestNG.xml file and open it, I have provided the path for each test case in comments.

- To run a test case copy the name path of the test case inside the "name" attribute of the "class" tag.

- For exmaple <class name="TestCases.LoginTest"/>.

- Enter the path of the test case you wish to run that I have already provided inside the comments.

- Now right-click inside the testNG.xml file and go to the "Run As" option and select TestNg Suite.

- P.S:- Also change the path of the driver path inside the "value" attribute of the "parameter" tag with the chrome driver path you have installed, if you wish to call the path with the parameter.


<hr>

##ScreenShots :-

- ScreenShots of the failed test cases will be available inside the folder [selenium_assignement//ScreenShots]

<hr>

##Reports :-

- Reports of the test cases will be updated after every execution of that particular test case.

- Reports of the test cases will be available inside the folder [selenium_assignement//test-output//Extent_demo.html]

- Double-click the Extent_demo.html file to open the report in your default browser.


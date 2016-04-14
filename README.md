# RasDroid-Project
Control a Led wired to a Raspberry Pi with an Android app
***********************************************************
*************************Raspberry Pi-Side*************************

The server application is written in java with the Pi4j library 

Note that you need Java and the Pi4j library(http://pi4j.com/) correctly installed on you Raspberry Pi 

Here is the wiring diagram. It is like the one used in the Pi4j project GPIO example(http://pi4j.com/example/control.html)

![alt tag](https://cloud.githubusercontent.com/assets/18163788/14544288/91381332-0298-11e6-8611-05ed6270ff41.JPG "wiring diagram")

To execute the java application(RasdServer.jar) on your Raspberry Pi, simply get to the directory where you put it and execute the following command "sudo java -jar RasdServer.jar"

*************************Android-Sid*************************

Here is how the application should look like on a Tablet

Enter the raspberry pi IP and a message. The message should be "on" (feel free to hack the code to change it or delete it :p) or the led won't turn on.

Every push on the "on/off" button toggles the Led state.

![alt tag](https://cloud.githubusercontent.com/assets/18163788/14545133/08dd99d0-029d-11e6-8f0e-287487c05b15.JPG)

Enjoy! :D

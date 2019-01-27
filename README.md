# Green Parkistan / Greenify
#### 1. Members
* Thomas Burger
* Thomas Czilinger
* Dario Mandic
* Agon Mehmeti
* Martin Reinhart
* Amir Sacic

#### 2. Description
Green Parkisten is a Fullscreen Google Maps application which displays all public green spaces in Vienna. Those are displayed
as overlaying polygons on the map, including a pin for the current location of the user.
![alt text](https://i.ibb.co/YBxVmmR/g1.png "Logo Title Text 1")

It is possible to filter for a specific infrastructure such as:
- Toilets
- Cafes
- Dog-Parks
- Playgrounds

![alt text](https://i.ibb.co/Jm8LH4w/image.png)

#### 3. Architecture

Its a simplte 3-tier architecture consisting of a database (which is a JSON file :)), a java backend which serves as a
REST-Service and a Angular 6 Frontend which displays the data accordingly.
![alt-text](https://i.ibb.co/BrztJc0/image.png).

#### 4. Environment
The IDE for the Java REST service was IntelliJ IDEA Ultimate, because it supports enterprise applications. The respective
application server was a Glassfish 5.0 or 4.1.12 to host the Java application.
The IDE for the Angular frontend was Visual Studio Code which was then built and deplyoed to the glassfish server to be
accessible. 

#### 5. How to Run
First of all, this is not going to be a very simple task... Therefore - Brace Yourselves!
##### 5.1 Java Backend
First of all you have to clone the git repository:
```
git clone https://git.fh-campuswien.ac.at/c1810838007/greenify.git
```
As soon as this is done you will need to locate the java folder 
```
greenify
│   dist
│   e2e    
│   java
│   node_modules
│   src
│   .editorconfig
...
```
**Keep in mind that all of the other folders are for the Angular Application!**
You will need to open this project in IntelliJ or import it somehow into Eclipse. You will most likely have to set the 
project SDK, which is **1.8**. 
As soon as you have been able to compile please change following variable in your code according to the path where you have 
saved the DB :). [Database](https://data.wien.gv.at/daten/geo?service=WFS&request=GetFeature&version=1.1.0&typeName=ogdwien:OEFFGRUENFLOGD&srsName=EPSG:4326&outputFormat=json). 
```java
String _openDataLocalPath="C:\\Program Files\\JetBrains\\IntelliJ IDEA 2018.3.3\\glassfish4\\OEFFGRUENFLOGD.json"; 
```
This line can be found in 
``` 
BigDataCall class in line 16
```

As soon as you have changed the path, you should be able to build and deploy the java application. It should be accessible
via [http://localhost:8080/](http://localhost:8080/). This indicates that the backend is fully operational.

##### 5.2 Angular Frontend
There is not much to do here, the already compiled solution has been pushed in the Git Repository and can be found in the
dist folder:
```
greenify
│   dist
│   e2e    
│   java
│   node_modules
│   src
│   .editorconfig
...
```
You just need to copy the greenify folder and paste it into your glassfish root directory. WHich is in my case:
```
C:\Program Files\JetBrains\IntelliJ IDEA 2018.3.3\glassfish4\glassfish\domains\domain1\docroot\greenify
```

If you have done this, greenify will be available via [http://localhost:8080/greenify](http://localhost:8080/greenify).
**Keep in mind that the compiled angular sources have set /greenify/ as the base-href, meaning if you deploy the dist files
to a different folder than greenify, the application will not work.**

# THANKS, it was a very pleasant Hackathon!
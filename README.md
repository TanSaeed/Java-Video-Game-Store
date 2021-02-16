# Java-Video-Game-Store
 This is Java video game store that uses inheritance and composition. Several abstract classes are used as this store follows the Abstract Factory and Singleton design patterns. This program also highlights the use of Polymorphism, Generics, and Enums. The store itself emulates stock of a video store, you will take in video game stock at the start of the day and will get randomly generated customers throughout the day. Once the day is over you will be told your sales, stock amount, and if you turned a profit. The game can be exited at the end of the day.  
 
 ## Installation
 
 To install and play the game import "Final" folder into the Java environment of your choice. I used eclipse to import the "Final" folder. After that is done make sure to run the main file "FinalRun.java" in the console store folder. 
 
 ## Technologies
 
 - Eclipse: Java
 - Design Patterns: Abstract Factory, Singleton.
 - Programming Paradigm: Object-Oriented Programing, Inheritance, Composition, Abstraction, Polymorphism, Generics.
 
## Documantion
 
#### Design Patterns: 
The first design pattern was Singleton, this was used because we are only supposed to manage one store, so we don’t want to create multiple stores. The ConsoleStore class is only allowed to instantiate one store. The other pattern was Abstract Factory, this was used because there are multiple types of companies that have different home consoles, this would allow us to grab the right home console depending on the company outlet. 
#### Polymorphism: 
Abstract ConsoleFactory reference is used to instantiate a concrete subclass of Sony, Nintendo, and Microsoft.
#### Generics: 
The Account class uses generics for its money type ie <T extends Number> making it so only the Number class and its subclasses can be used for T. Although in our case we only use it for Dollars (ie double sense it has decimals) another store might have Yen or Rupees as its currency (an int would make more sense in that case because no decimals).
#### Enums: 
Used for staff listing in the Job class. This was used to find the name of the staff and his or her job. Albeit in retrospect, this
does not make much sense for enums class, because enums typically or designed never to change. 
 
##### Full documentation of implementation can be seen in "Tan Saeed Final Documentation.docx".

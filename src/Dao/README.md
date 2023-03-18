# Dao Overview Doc # 

## References ##
Refer to the database design doc for more background on the queries being run.

## Dependencies ##
**IDbClient** - to connect to the database and run queries. 

## Purpose ##
The IDao serves as an abstraction layer to ensure that the database logic is seperate from the main business logic.
This will allow the main driving code to only concern itself with business logic and avoids repetitive code.

## Design Decisions ##
### IDao Interface ###
If you are not familiar with interfaces, an interface is a "contract" between itself and any class that implements it. It basically helps define all the interactions our classes will have. Also, it helps take full advantage of polymorphyism.
I have it here to define the interactions the front end will have with the database. 
Note: I understand the "I" is not java practice, but it helps me pretend I am actually programming in C#. It's comforting to pretend I'm not developing in Java instead. 

### Inventory DAO ###
The biggest design decision to note is the inventory DAO. 
Although it is still a DAO and is there to help facilitate CRUD functionality, it does not require all of the methods that the other DAO's require. 
Yes, I know I could have made the DAO less broad and have it included. It would be cleaner and make more sense and I wouldn't have to explain everything.
**HOWEVER** I would not have my intellisense to autofill the other functions most of the DAO's share, and we have to build this in 3 days anyways so who cares if it's a little sloppy.
Thus, for that reason, it does not implement the IDAO interface.  

### Delete Cutlery ###
Deleting cutlery is the only function that isn't included in (nearly) every single DAO class. Why? Well, it does not make sense to delete an ordered menu item once the order has been submitted, the customer has already payed! 
At that point you might as well refund, delete the order, and go at it again.
Thus, it only makes sense to be able to remove the cutlery dependency from a MenuItem. 

So, the deleteCutlery function takes in a menu item id and the cutlery id and removes the dependency from the database.

### Optional Data Type ###
The DAO is a common object oriented patern, so the only big design decion made here is the use of Optional containers. 
The Optional container allow us to represent a state that may or may not return a value.

## IDao Documentation ##
### Overview ### 
This interface defines a Data Access Object (DAO) that can be used to interact with a database. 
It provides methods to add, update, delete, get, and retrieve data from a database. 
The generic type T specifies the type of object that this DAO can interact with.

### Methods ###
#### ConvertResultSet ####
```java
T ConvertResultSet(ResultSet rs);
```
This method takes a ResultSet object as input and returns an object of type T. It is used to convert the result of a database query into an object of type T.
#### get ####
```java
Optional<T> get(String id);
```
This method takes an id as input and returns an Optional object containing an object of type T if found. It is used to retrieve an object with the specified id from the database.

#### getAll ####
```java
List<T> getAll();
```
This method returns a List containing all the objects of type T in the database. It is used to retrieve all objects of type T from the database.

#### getHistory ####
```java
ResultSet getHistory(String id);
```
This method takes an id as input and returns a ResultSet object containing the sales history for the object with the specified id. It is used to retrieve the historical sales data for an object.

#### getId ####
```java
Optional<String> getId(String name);
```
This method takes a name as input and returns an Optional object containing the id of the object with the specified name if found. It is used to retrieve the id of an object from the database given its name.

#### add ####
```java
void add(T entity);
```
This method takes an object of type T as input and adds it to the database. It is used to insert a new object into the database.

#### update ####
```java
void update(T entity);
```
This method takes an object of type T as input and updates its corresponding record in the database. It is used to update an existing object in the database.

#### delete #### 
```java
void delete(T entity);
```
This method takes an object of type T as input and deletes its corresponding record from the database. It is used to delete an object from the database.

## Inventory Documentation ##
### Overview ### 
The Inventory class offers an easy way to look into and manipulate inventory from the manager portal.

### Methods ###

#### get ####
Gets all inventory from database
```java
public ResultSet get()
```

#### Add ####
Adds inventory to the database
```java
public void add(Object entity) 
```

#### Update ####
Updates inventory in database 
```java
public void update(Object entity) 
```

#### Delete ####
Deletes inventory from database
```java
public void delete(Object entity) 
```

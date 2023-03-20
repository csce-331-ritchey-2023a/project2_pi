# IDbClient Design Doc # 

## Library Dependencies ##
postgresql-42.5.1

## Purpose ##
The IDbClient Interface is meant to facilitate the connection and interaction with the Postrgres database. This allows the business logic layer to not have to concern itself with the logic of the database layer and thus following layered architecture.

## Reading  ##
For security, database credentials are stored locally in a configuration file.
This configuration is read by the dbConfigReader, which stores the values as class members. 
The DbClient uses this configuration reader to load the database url and credentials necessary to connect.
This configuration reading is all done in the constructor.

## Connecting ##
The dBClient connects to the database using the postgresql driver and will print error strings if the client could not connect or postgresql driver could not be found.

**You can verify if it connected properly by checking the .isValid() function for the Connection class**

## Disconnecting ##
It is recommended that you disconnect the client before deleting the object. This can be done by utalizing a finalize()  function to ensure the client is disconnected before the parent class is destructed.
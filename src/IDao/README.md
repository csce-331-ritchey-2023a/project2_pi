# IDao Design Doc # 

## Purpose ##
The IDao serves as an abstraction layer to ensure that the database logic is seperate from the main business logic.
This will allow the main driving code to only concern itself with business logic and avoids repetitive code.

## Design Decisions ##
The DAO is a common object oriented patern, so the only big design decion made here is the use of Optional containers. The Optional container allow us to represent a state that may or may not return a value.
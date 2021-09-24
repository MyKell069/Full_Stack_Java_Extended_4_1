# WIP

What is Normalization?
Normalization is a database design technique that reduces data redundancy and eliminates undesirable characteristics like Insertion, Update and Deletion Anomalies. Normalization rules divides larger tables into smaller tables and links them using relationships. The purpose of Normalisation in SQL is to eliminate redundant (repetitive) data and ensure data is stored logically.

The inventor of the relational model Edgar Codd proposed the theory of normalization of data with the introduction of the First Normal Form, and he continued to extend theory with Second and Third Normal Form. Later he joined Raymond F. Boyce to develop the theory of Boyce-Codd Normal Form.

The established normal forms:

 - 1NF (First Normal Form)
 - 2NF (Second Normal Form)
 - 3NF (Third Normal Form)
 - BCNF (Boyce-Codd Normal Form)
 - 4NF (Fourth Normal Form)
 - 5NF (Fifth Normal Form)
 - 6NF (Sixth Normal Form)

We will not be going beyond 3NF in this training. 
  
The Theory of Data Normalization in MySQL server is still being developed further. For example, there are discussions even on 6th Normal Form. However, in most practical applications, normalization achieves its best in 3rd Normal Form. The evolution of Normalization in SQL theories is illustrated below-

Database Normal Forms
Database Normal Forms
Database Normalization With Examples
Database Normalization Example can be easily understood with the help of a case study. Assume, a video library maintains a database of movies rented out. Without any normalization in database, all information is stored in one table as shown below. Let’s understand Normalization database with normalization example with solution:

Database Normalization With Example
Here you see Movies Rented column has multiple values. Now let’s move into 1st Normal Forms:

1NF (First Normal Form) Rules
Each table cell should contain a single value.
Each record needs to be unique.
The above table in 1NF-

1NF Example
Example of 1NF in DBMS
Example of 1NF in DBMS

Before we proceed let’s understand a few things —

What is a KEY in SQL?
A KEY in SQL is a value used to identify records in a table uniquely. An SQL KEY is a single column or combination of multiple columns used to uniquely identify rows or tuples in the table. SQL Key is used to identify duplicate information, and it also helps establish a relationship between multiple tables in the database.

Note: Columns in a table that are NOT used to identify a record uniquely are called non-key columns.

What is a Primary Key?
Primary Key in DBMS
Primary Key in DBMS

A primary is a single column value used to identify a database record uniquely.

It has following attributes

A primary key cannot be NULL
A primary key value must be unique
The primary key values should rarely be changed
The primary key must be given a value when a new record is inserted.
What is Composite Key?
A composite key is a primary key composed of multiple columns used to identify a record uniquely

In our database, we have two people with the same name Robert Phil, but they live in different places.

Composite key in Database
Composite key in Database

Hence, we require both Full Name and Address to identify a record uniquely. That is a composite key.

Let’s move into second normal form 2NF

2NF (Second Normal Form) Rules
Rule 1- Be in 1NF
Rule 2- Single Column Primary Key that does not functionally dependant on any subset of candidate key relation
It is clear that we can’t move forward to make our simple database in 2nd Normalization form unless we partition the table above.

2NF Example
2NF Example in DBMS
We have divided our 1NF table into two tables viz. Table 1 and Table2. Table 1 contains member information. Table 2 contains information on movies rented.

We have introduced a new column called Membership_id which is the primary key for table 1. Records can be uniquely identified in Table 1 using membership id

Database – Foreign Key
In Table 2, Membership_ID is the Foreign Key

Foreign Key Example
Foreign Key in DBMS
Foreign Key in DBMS

Foreign Key references the primary key of another Table! It helps connect your Tables

A foreign key can have a different name from its primary key
It ensures rows in one table have corresponding rows in another
Unlike the Primary key, they do not have to be unique. Most often they aren’t
Foreign keys can be null even though primary keys can not
Foreign Key in Database
Why do you need a foreign key?
Suppose, a novice inserts a record in Table B such as

Why Foreign Key is important in Database
You will only be able to insert values into your foreign key that exist in the unique key in the parent table. This helps in referential integrity.

The above problem can be overcome by declaring membership id from Table2 as foreign key of membership id from Table1

Now, if somebody tries to insert a value in the membership id field that does not exist in the parent table, an error will be shown!

What are transitive functional dependencies?
A transitive functional dependency is when changing a non-key column, might cause any of the other non-key columns to change

Consider the table 1. Changing the non-key column Full Name may change Salutation.

Transitive functional dependencies in Database
Let’s move into 3NF

3NF (Third Normal Form) Rules
Rule 1- Be in 2NF
Rule 2- Has no transitive functional dependencies
To move our 2NF table into 3NF, we again need to again divide our table.

3NF Example
Below is a 3NF example in SQL database:

3NF Example
3NF Example
Example of 3NF in Database
We have again divided our tables and created a new table which stores Salutations.

There are no transitive functional dependencies, and hence our table is in 3NF

In Table 3 Salutation ID is primary key, and in Table 1 Salutation ID is foreign to primary key in Table 3

Now our little example is at a level that cannot further be decomposed to attain higher normal form types of normalization in DBMS. In fact, it is already in higher normalization forms. Separate efforts for moving into next levels of normalizing data are normally needed in complex databases. However, we will be discussing next levels of normalisation in DBMS in brief in the following.

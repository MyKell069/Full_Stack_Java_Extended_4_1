# SQL Sub-Languages
Traditionally when we write in SQL we write the SQL keywords in CAPS. This way it's clear which words are part of SQL. With modern applications coloring and formatting code it's not as important anymore, so you may see this convention dropped. SQL is **not case sensitive**.

### DDL
**Data Definition Language (DDL)** statements are those for creating and modifying database objects. We use DDL to define the database **schema**. Schema just means the structure of the database, including tables, indexes, constraints, and more. 
  
Some examples of DDL keywords include: 
 - `CREATE` is used to create the database or its objects (like table, index, function, views, store procedure and triggers).
 - `DROP` is used to delete objects from the database.
 - `ALTER` is used to alter the structure of the database. (Commonly used to alter objects created with `CREATE`)
 - `TRUNCATE` is used to remove all records from a table. Space allocated to store those records is de-allocated.
 - `RENAME` is used to rename an object existing in the database.


### DQL
**Data Query Language (DQL)** statements are used to retrieve data from the database. The primary DQL keyword is `SELECT`. `SELECT` statements are used to query the database and commonly also utilize clauses that filter, manipulate, or aggregate data, like `WHERE`, `HAVING`, and `JOIN`.

### DML
**Data Manipulation Language(DML)** statements are used to add, remove, and alter data in the database. Particularly, these statements work on data stored in tables. Some examples of DML keywords include:
 - `INSERT`
 - `UPDATE`
 - `DELETE`

Note that `DELETE` and `DROP` are different keywords with different meanings. One is used to drop objects like tables. The other is used to remove data from tables. These statements commonly include clauses that filter data, such as `WHERE`.

## SQL Examples
Below will be some examples that show the use of the basic SQL we've covered thus far:

#### Create a table
```sql
CREATE TABLE users (
  user_id INT NOT NULL,
  first_name VARCHAR(40),
  last_name VARCHAR(40),
  username VARCHAR(40),
  email VARCHAR(200),
  CONSTRAINT users_pk PRIMARY KEY (user_id)
);
```

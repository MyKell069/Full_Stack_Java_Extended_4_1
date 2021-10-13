# Transactions

Any amount of DML statements before a COMMIT statement is considered a **transaction**. After the COMMIT is done, the transaction should follow certain properties. Transactions are considered to be logical units of work - for example, transferring money from Person A's bank account to Person B's account. You should think about how to logically group your DML operations into transactions when writing code.

The properties of transactions should be as follows:

* ATOMIC - "All or nothing", if any statement on the transaction fails, the whole transaction fails.
* CONSISTENT - If the database was in a consistent state before the transaction, it should be after it.
* ISOLATED - One transaction shouldn't affect other transactions. It can be applied in different levels.
* DURABLE - Persisted data should be saved permanently, even in the case of power loss or catastrophic software or hardware failure.
  * Some RDBMS's have different approaches, even to recover from catastrophes (Oracle has special logs [Bitacora]).

You can remember the properties of a transaction using the ACID acronym.

### Isolation Levels

[Isolation](https://en.wikipedia.org/wiki/Isolation_(database_systems)) levels are applied in RDBMS to provide consistency and avoid certain read phenomena. The following isolation levels are presented from most to least isolated:

* Serializable
  * Allowed in Oracle
  * Read/Write locks
  * Applies range locks even in the WHERE clauses of a select statement
  * Phantom reads can't happen because of this
  * Table that is being read can't be modified until the reading is done (no INSERTS, no UPDATES, no DELETES)
* Repeatable Reads
  * Not used often
  * Read/Write locks
  * Doesn't provide range locks, that means phantom reads can happen
  * Doesn't lock the whole SELECT statement, nor INSERTS, nor UPDATES, nor DELETS
* Read Committed
  * Oracle default
  * Write only locks
  * Only data that is committed will be seen by other transactions
  * Dirty reads can't happen, but Phantom reads can
  * This is why it is recommended to not perform very long transactions
* Read Uncommitted
  * A disaster
  * Dirty reads are normal, any transaction can see any uncommitted data
  * Very inconsistent

### Read Phenomena

* Dirty Read: reading data that is uncommitted
* Non-repeatable read: when a row is read twice in a transaction and the values are different
* Phantom Read: reading data that is being added or modified by a running transaction


## TCL
Transaction Control Language statements are utilized to manage transactions within a relational database.

* COMMIT, any DML operations that were executed before the statements will be persisted permanently.
* ROLLBACK, any DML operations between two COMMIT statements will be completely erased (something like Ctrl + Z that will stop only when it reaches last time you opened the specific file). Committed transactions cannot be rollbacked.
* SAVEPOINT, utilized to ROLLBACK to a specific point in time.

The general flow of using TCL could be as follows:

```sql
SAVEPOINT A
[Many DML Operations]
# if something goes wrong
ROLLBACK TO A
# if nothing went wrong
COMMIT
```

# Control Flow in Java

## If-Then
The most basic control flow statement is the if-then statement. This statement evaluates if some predicate is true or false, and if the predicate evaluates to true the code in the block is executed, otherwise it is skipped.
```
if(x = 5 /*predicate statement*/ ) {
    //do something
}
```

## If-Then-Else
An else clause can be added to the basic if-then to get an if-then-else statement. This statement evaluates if a predicate is true or false just like above. If true, the first block is executed, if false the else block is executed.
```
if(x = 5) {
    //do something
} else {
    //do something else
}
```
These stataments can be further expanded by chaining else-if statements. We simply add another if-then after the else and we can chain alternatives as long as we want.
```
if(x = 5) {
    //do something
} else if(x = 6) {
    //do something else
} else if(x >= 7) {
    //do a different thing
} else {
    //finally, if all else fails do this
}
```
Eventually we can optionally end the if-then-else-if chain with a single else that only executes if none of the other predicates were true. In the above example only one of the blocks of code will ever be executed.

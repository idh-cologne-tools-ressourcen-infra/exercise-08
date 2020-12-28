# Exercise 8

This exercise is about data structures for natural language processing in Java.
The exercise is due January 13th.

## Step 1

Please clone this repository onto your local computer. On the command line, you would enter: `git clone https://github.com/idh-cologne-tools-ressourcen-infra/exercise-08`, and create a new branch using your UzK username as a name.

## Step 2

Open the directory in Eclipse (or your favorite development tool for Java), and inspect available classes. The main method in the class `Document` creates a document representation of an example sentence with tokens.

## Step 3

Change the `Token` class such that it also able to store information from a 
dependency parse. Add code to the main method so that each token *also* gets dependency information. Verify that the methods `getGovernor()` and `getRelation()` in `Token` also return the correct result.

## Step 4
Add a class `NamedEntity` that stored named entity information in this sentence. Next to the tokens that make up the named entity, we also want to store it's type (e.g., person) and, if the named entity has been recognized automatically, the confidence that the named entity recognizer reports.

## Step 5 (optional)

Add a class `Tree`, following the examples in the slides. Test your code by producing a simple syntactic tree in code. Implement a function called `toString()`. The function returns a string that contains a human-readable tree representation. The tree structure can be produced by indentation:

```
- is
  - dog 
    - the
  - fed
    - by
      - Parker
        - Mr. 
        - who
          - wears
            - hat
              - a
              - yellow
```

or parentheses:
 

```
( is ( dog ( the ) ) ( fed ( by ( Parker ( Mr. ) ( who ( wears ( hat ( a ) ( yellow ) ) ) ) ) ) ) ) 
```

Hints: Since trees are recursive structures, your function needs to be recursive as well.

## Step 6

Commit your program to the repository and push it to the repository.
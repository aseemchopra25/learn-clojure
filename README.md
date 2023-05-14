# Introduction
Clojure is a modern, functional programming language designed for general-purpose programming. It is a dialect of Lisp and was created by Rich Hickey in 2007. Clojure runs on the Java Virtual Machine (JVM), which allows it to interact seamlessly with Java code and libraries.

Clojure is a highly expressive language that emphasizes immutability, functional programming, and concurrency. It has a concise syntax, powerful macros, and a range of built-in data structures and functions for manipulating them. Clojure also provides a software transactional memory system that simplifies concurrent programming.

Clojure is used in a wide variety of applications, from web development to scientific computing to data analysis. It is known for its ability to handle complex data structures and its focus on developer productivity. Clojure's emphasis on immutability and functional programming also makes it an excellent choice for building highly concurrent and distributed systems.

# Setup

- Install Java Development Kit: https://www.oracle.com/java/technologies/javase-downloads.html

- Install Lein

```
curl -O https://raw.githubusercontent.com/technomancy/leiningen/stable/bin/lein
chmod +x lein
sudo mv lein /usr/local/bin/
```

- Install Babashka

`brew install borkdude/brew/babashka`


# Create new project

- `lein new helloworld`
- 

# Scripting with Babashka

`bb hello.clj`

## Notes
- (...) is called a form or expression 
- Giving names to values is called binding
- ' will prevent a form from being evaluated
- Resolution of symbols would be in the scope of the symbol
- let can be nested, each let will create a scope and symbol resolution is done inside the let where the symbol is resolved
- This is called lexical scope
- let vs def; symbols can also be accessed within the let where it's declared, while symbols declared with def can be accessed from anywhere
- avoid use of def as much as possible as def introduces state and abusing state makes code difficult to maintain
- Functions are first class objects in Clojure, you can do all the basic operations with the object such as passing it to a function, return from a function and bind to a variable etc.
- fn is used to create a function object
- #() is the shortcut for fn
- namespaces organize different clojure objects into logical groups, these logical groups are called library and be used from other namespaces
- create-ns is used for creating a namespace; though ns macro is more handy
- in-ns is used to move to a specific namespace
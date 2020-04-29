The interpreter pattern is used to define a representation for its grammar along with an interpreter that uses the representation to interpret sentences in the language, given a language. 
It is used to map a domain to a language, the language to a grammar, and the grammar to a hierarchical object-oriented design. 

Nearly every use of the composite pattern will also contain the interpreter pattern.
The interpreter pattern should be reserved for those cases in which you want to think of this class hierarchy as defining a language. 
The abstract syntax tree of the Interpreter pattern is a Composite pattern.
The pattern doesn't address parsing. When the grammar is very complex, other techniques like using a parser are more appropriate. 
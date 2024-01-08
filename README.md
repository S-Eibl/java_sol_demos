## Java Solving Demos
### Motivation and context
When correcting submissions for a problem statement given tests and solutions, the problem is finding a mapping, 
where the produced modification of the assignment uses as few parts of the solution as possible. 
The Java solver, therefore, tries to compare syntax trees of solution and assignment and generate this modification. 
This project contains some demos used for implementing a small MVP.

### Structure
All projects share the same structure with the assignment, solution, test, and produced result files and potential classes provided with the task.
- *result*: This folder contains the file produced by the solver.
- *src*: The solver takes this directory as input.
  - *assignment*: Contains the assignment file
  - *solution*: Contains the solution file
  - *test*: Contains the test file
  - *utils*: Optional directory containing files provided with the task

### Demo projects
- **Project 0 (Simple functions)**: Some simple functions provide small mistakes where the solver should replace operators, literals, or return values.
- **Project 1 (Variable Mapping)**: This project tests the ability to deal with different variable names in solution and assignment. 
When a part of the solution's syntax tree is injected into the assignment, the variable names should be mapped to their corresponding equivalent in the assignment.
- **Project 2 (Simple array operations)**: This project demonstrates the ability to change conditions in loops using two simple summing-up methods for int arrays.
- **Project 3 (Int List)**: This project implements an IntList with the methods add(int value), size(), and get(int index) based on a provided IntListElem. 
It shows the ability to inject or wrap an assignment tree element with elements from the solution tree.

## Abilities and Limits of the MVP
The MVP is designed to demonstrate the essential ability to find syntax tree mappings, solve simple problems, and apply corrections. 
Therefore, it only covers some Java language constructs, has a limited number of applicable mappings, and needs to be trimmed to be efficient.

### Supported Java language elements
It supports the language elements used in these demo projects (e.g., if, for-loop, variable declaration, assignment, return statement, class declaration, method declaration, etc.). 
Still, it does not support other constructs (e.g., while-loop, throw statements, switch-case). 
Also only some base operators (e.g. +, -, +=, -=, *, /, etc) are actually implemented. 
These constructs were sufficient to test a basic ability to generate mappings but, of course, have to be extended to support all Java language elements.

### Applicable mappings
The solver searches recursively through the syntax trees from the higher to the lower levels for elements, which can be replaced, injected, or wrapped. 
The current state allows injection and wrapping only on blocks of statements. 
For a broader range of applications and a more precise mapping on more complex examples, these generations would have to be extended by adding new applicable mapping generations.

### General limits
The solver might have a great potential to help in correction and provide dedicated feedback but is limited regarding more algorithmic tasks. 
The more possibilities to find a correct solution exist, the harder it becomes to find an appropriate mapping as the difference between the syntax trees grows. 
It could still help delimit problem sources, but the preciseness will decrease with the growth of the difference.

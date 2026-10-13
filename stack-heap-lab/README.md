# Java Stack \& Heap Memory Demos

# Two small Java programs that show how Java uses Stack and Heap memory.

# 

# Files

# File	Description

# StackHeapDemo.java	Student class: instance variable age (heap) vs local variable marks (stack)

# EmployeeMemoryDemo.java	Employee class with a local inner class Report inside display()

# Requirements

# JDK 8 or higher

# Check your version:

# 

# java -version

# javac -version

# How to Compile and Run

# Program 1: Student

# javac StackHeapDemo.java

# java StackHeapDemo

# Sample output (hash code changes on every run):

# 

# Student Object Created

# Object Identity Hash Code: 1163157884

# Instance Variable (age): 20

# Local Variable (marks): 85

# Program 2: Employee

# javac EmployeeMemoryDemo.java

# java EmployeeMemoryDemo

# Sample input / output:

# 

# Enter salary: 30000

# Enter bonus: 5000

# 

# Employee Object Created

# Employee Identity Hash Code: 1163157884

# 

# Inside display() Method:

# Salary (Instance Variable): 30000

# Bonus (Local Variable): 5000

# 

# Report Object Created

# Report Identity Hash Code: 1956725890

# Report: Employee salary is 30000

# 

# Memory Concept:

# Employee object -> Heap

# Report object -> Heap

# salary -> Instance field

# bonus -> Local variable in display()

# show() -> Executes in its own method frame

# Concepts Covered

# Stack Memory

# One stack per thread.

# Stores method call frames, local variables and object references.

# Memory is freed automatically when the method returns.

# Heap Memory

# Shared by all threads.

# Stores objects created with new and their instance variables.

# Unused objects are cleaned up by the Garbage Collector.

# Where Things Live

# Item	Memory Area

# Reference variables (student, emp, report)	Stack

# Local variables (marks, bonus)	Stack

# Objects (Student, Employee, Report)	Heap

# Instance variables (age, salary)	Heap (inside the object)

# Each method call (display(), show())	Own stack frame

# Local Inner Class

# Declared inside a method (here: Report inside display()), usable only there.

# Its objects still live in the heap.

# It can access the outer object's fields (salary) through an implicit reference to Employee.this.

# It can use local variables only if they are final or effectively final.

# System.identityHashCode()

# Returns a hash code based on the object's identity (not its content). The value stays the same for the same object during a run, but differs between runs.

# 

# Memory Diagram (Student example)

# &#x20;       STACK                              HEAP

# &#x20;┌──────────────────────┐          ┌──────────────────────┐

# &#x20;│ display() frame      │          │   Student object     │

# &#x20;│   marks = 85         │          │   ┌──────────────┐   │

# &#x20;├──────────────────────┤          │   │  age = 20    │   │

# &#x20;│ main() frame         │          │   └──────────────┘   │

# &#x20;│   student ───────────┼────────► │                      │

# &#x20;└──────────────────────┘          └──────────────────────┘


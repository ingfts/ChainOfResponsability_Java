# Printing Handler Chain of Responsibility🖨️

## Overview 📝
This project implements the Chain of Responsibility design pattern to handle printing requests with different types of printers. The Chain of Responsibility pattern allows us to pass a request along a chain of handlers until one of them handles it.

## Components 🛠️
- **Printer1**: Represents a printer capable of handling "hp" print requests.
- **Printer2**: Represents a printer capable of handling "epson" print requests.
- **PrintingHandler Interface**: Defines the methods required for handling print requests and establishing the chain of responsibility.

## Usage 🚀
1. Create instances of Printer1 and Printer2.
2. Set up the chain of responsibility by linking the printers using the `nextPrinter` method.
3. Submit print requests to the first printer in the chain using the `handleRequest` method.

## Purpose 🎯
- Encapsulate the handling of print requests.
- Allow multiple printers to handle different types of print requests.
- Enable dynamic addition or removal of printers without affecting client code.
- Promote loose coupling between client code and printer implementations.



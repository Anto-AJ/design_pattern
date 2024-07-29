EXERCISE:1

A) STRUCTURAL DESIGN PATTERN

1) Restaurant Menu System
Description

The Restaurant Menu System provides a structured way to manage and display a restaurant's menu items. The system can handle composite menu structures, including individual menu items and submenus, allowing for hierarchical menu representations. It demonstrates the Composite design pattern to effectively manage complex menus.

Key Features

Composite Pattern: Manages and displays menus and submenus hierarchically.
Easy Menu Management: Allows adding, removing, and displaying menu items and submenus.
Structured Output: Presents menu items in a nested format for clear visualization.

2) Media Adapter System
   Description

The Media Adapter System simulates a media player application that can play various types of media files. It demonstrates the Adapter design pattern by enabling the media player to play different audio formats that it would otherwise be unable to handle directly. The system uses the Adapter pattern to convert the interface of a class into another interface that the client expects, allowing for compatibility between otherwise incompatible interfaces.

Key Features

Adapter Pattern: Converts the interface of a class into another interface that a client expects, allowing for compatibility between different media formats.
Flexible Media Player: Can play multiple audio formats such as MP3, MP4, and VLC.
Extendable Architecture: Easily add support for new media formats by creating additional adapters.

B) BEAHAVIOURAL PATTERN

1) Traffic Light State Pattern
Description

The Traffic Light State Pattern simulates a traffic light system that transitions between different states: green, yellow, and red. It demonstrates the State design pattern by allowing an object (the traffic light) to change its behavior when its internal state changes. The system uses the State pattern to encapsulate the state-specific behavior and manage state transitions.

Key Features

State Pattern: Allows the traffic light to alter its behavior when its internal state changes, encapsulating state-specific behavior.
Automatic State Transition: The traffic light automatically transitions between states (green, yellow, red) after a specified duration.
Visual Representation: The current state of the traffic light is displayed with corresponding colors (green, yellow, red) in the console.

2)Remote Control System - Command Pattern
Description

The Remote Control System project is designed to simulate a universal remote control that can operate various devices like lights, fans, and stereos. This project demonstrates the Command design pattern, which is used to encapsulate a request as an object, thereby allowing for parameterization of clients with queues, requests, and operations.

Key Features

Command Pattern: Encapsulates all information needed to perform an action or trigger an event.
Decoupled Design: The remote control is decoupled from the actual device operations, providing flexibility and scalability.
Undo Functionality: Allows operations to be undone by keeping track of the previous commands.

3) CREATIONAL PATTERN
   
A) Document Factory - Factory Design Pattern
Description

The Document Factory project demonstrates the Factory Method pattern, which provides an interface for creating objects in a superclass but allows subclasses to alter the type of objects that will be created. This pattern is used to create instances of various document types (e.g., Word, PDF, and Excel) without specifying the exact class of the object that will be created.

Key Features

Factory Method Pattern: Defines an interface for creating an object, but lets subclasses alter the type of objects that will be created.
Extensibility: Easily extend the system to support new document types.
Decoupling: The client code is decoupled from the concrete classes it instantiates.

B)Shopping Cart - Singleton Design Pattern
Description

The Shopping Cart project demonstrates the Singleton pattern, which ensures a class has only one instance and provides a global point of access to it. This pattern is useful in cases where exactly one object is needed to coordinate actions across the system.

Key Features

Singleton Pattern: Ensures that only one instance of the Shopping Cart class exists.
Global Access: Provides a global point of access to the single instance.
Thread Safety: Ensures that the singleton instance is created in a thread-safe manner.

EXERCISE:2

1)Smart Home System
Description

The Smart Home System simulates a centralized control hub that allows users to manage various smart devices such as lights, thermostats, and door locks. Users can turn devices on or off, set schedules for automatic operations, and automate tasks based on specific triggers (e.g., turning off lights when the thermostat reaches a certain temperature). The system leverages key design patterns to ensure robust, scalable, and maintainable code.

Key Features

Observer Pattern: Notifies all devices of changes in the system.
Factory Method Pattern: Creates instances of different smart devices.
Proxy Pattern: Controls access to devices.
Strong OOP Principles: Ensures encapsulation, modularity, and use of inheritance and polymorphism.

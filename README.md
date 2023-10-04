# Beer Observer 🍺👀

### Description
A simple project demonstrating the use of the Observer design pattern, applied to the scenario of monitoring beer level in a mug! Crafted as a hands-on example of implementing design patterns, with an eye towards applications that require monitoring and responding to object state changes.

### Technologies & Tools
- **Language:** Java
- **Tools:** Git, GitHub
- **Testing:** JUnit, Mockito

### Features
- Monitoring the beer level in the mug.
- Notifying the observer (i.e., You!) when the beer is about to finish.

### Observer Pattern
Enables objects to observe other objects and be notified of their state changes. Ideal for implementing subscription mechanisms!

### Why Check This Project Out?
- Example usage of the Observer pattern.
- Unit testing utilizing Mockito.
- A great knowledge resource for Junior Java Developers.

### How to Run the Project

#### Prerequisites
Ensure you have Java and Git installed on your machine.
- Java: JDK 8 or above
- Git: Latest version

#### 🚀 Running on Unix-based Systems (macOS and Linux)
```bash
# Clone the repository
git clone https://github.com/andy111223/BeerObserver.git

# Navigate to the project directory
cd BeerObserver

# Compile the project
javac -d out src/*.java

# Run the project
java -cp out Pub

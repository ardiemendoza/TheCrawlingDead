# The Crawling Dead

## 1. Project Title
**The Crawling Dead – A Text-Based Survival Adventure Game**  
**- Inspired by TellTales Games' The Walking Dead**

---

## 2. Description / Overview
*The Crawling Dead* is a simple text-based adventure game written in Java.  
The player makes choices that determine their fate in a zombie-infested world.  
The game demonstrates object-oriented design by organizing scenes, utilities, and game flow into separate classes. It aims to show how Java classes can interact to build a structured and expandable game.

---

## 3. OOP Concepts Applied
### **3.1 Abstract Classes**
- The game uses an abstract class Episode as a blueprint for all main episodes.
- Each episode class (Episode1, Episode2, etc.) extends Episode and implements the start() method, which begins the story for that episode.
- This ensures all episodes follow a consistent structure and makes it easy to add new episodes in the future.
### **3.2 Encapsulation**
- Each scene is stored in its own class inside the `Scenes` package.
- Helper methods and game utilities are found in the `utils` package.
- Variables and methods are grouped logically, reducing complexity.

### **3.3 Inheritance**
- Scenes may share a common class to ensure a unified structure for displaying text and handling choices.
- Shared behaviors such as `delayt` and `postDelay` across scenes are inherited instead of rewritten.

## 4. Program Structure

### **Main Components**
- **Main.java** – The entry point of the game; initializes and starts the story.
- **Scenes/** – Contains all story scene classes (e.g., `Episode1.java`, `Episode2.java`, `GameOver.java`, `QTE.java`).
- **utils/** – General helper classes such as game options, playerName variable, and text options for the typewriter effect.


## 5. How to Run the Program

### **Step 1 – Compile**
Make sure you are inside the project folder. Double-click the `run.bat` file.


## 6. Sample Output

The Crawling Dead
A Console-Based Game by NotGPT
This game adapts to the choices you make,
The story is tailored by how you play.


--MAIN MENU--  
1: START  
2: CHOOSE EPISODE  
3: CREDITS  
4: EXIT    
Input: 1

---Episode 1---  
"A Lucky Encounter"  
  
You: Huh... Where am I?

## 7. Author and Acknoledgement
- **Youtube - @BroCode** https://youtu.be/xk4_1vDrzzo?si=4VRtJ-ja3d3gT6Cc
- **OpenAI's ChatGPT**
- **W3Schools**
- **TellTale Games' The Walking Dead**
- **Skybound Games**

## 8. Group Members
- **Ardie Mendoza**
- **Tristan Dayle Mendoza**
- **Kenn Adrian Sarmiento**


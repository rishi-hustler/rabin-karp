# 📘Rabin–Karp Algorithm (Menu Driven, Java)

## 📌 Overview

The **Rabin–Karp Algorithm** is a **string matching algorithm** that uses **hashing** to efficiently search for a pattern in a given text.

Instead of comparing characters one by one, it compares **hash values** of the pattern and text windows, making it faster on average.

This project provides a **menu-driven Java program** for pattern matching using Rabin–Karp.

---

## 🚀 Algorithm Used

**Rabin–Karp (Hashing-based String Matching)**

### Key Idea:

1. Compute hash of the pattern
2. Compute hash of the first window of text
3. Slide the window and update hash using a rolling hash
4. If hash matches, verify characters to avoid false positives

---

## 🧮 Time and Space Complexity

* **Average Case Time Complexity:** `O(N + M)`
* **Worst Case Time Complexity:** `O(N × M)`
* **Space Complexity:** `O(1)`

Where:

* `N` = length of text
* `M` = length of pattern

---

## 🛠️ Requirements

* Java 8 or later
* Any Java IDE or terminal

---

## 📂 Project Structure

```
RabinKarpMenuDriven.java
README.md
```

---

## ▶️ How to Run

1. Compile the program:

   ```bash
   javac RabinKarpMenuDriven.java
   ```
2. Run the program:

   ```bash
   java RabinKarpMenuDriven
   ```

---

## 📋 Menu Options

```
1. Search Pattern in Text
2. Exit
```

---

## ⌨️ Sample Input

```
Text:    GEEKS FOR GEEKS
Pattern: GEEK
```

---

## ✅ Sample Output

```
Pattern found at index: 0
Pattern found at index: 10
```

---

## 🧠 Key Concepts

* Hashing
* Rolling Hash Technique
* String Matching Algorithms
* Collision Handling

---

## 🔧 Customization Ideas

* Allow changing prime number `q`
* Compare Rabin–Karp with KMP
* Case-insensitive matching
* Search multiple patterns

---

## 📚 Applications

* Plagiarism detection
* Text search engines
* DNA sequence matching
* Network intrusion detection

---

## 📝 License

Free to use for academic, learning, and interview preparation.




# File Menu Program (Java)

<img width="432" height="448" alt="Screenshot 2025-08-09 123133" src="https://github.com/user-attachments/assets/3dad6a56-76af-4bff-91b1-921bfd650ddf" />
<img width="432" height="215" alt="Screenshot 2025-08-09 123151" src="https://github.com/user-attachments/assets/0b84013e-3be0-4934-a0a1-d364f1d2e951" />

## 📌 Overview
This Java program demonstrates how to **write** and **read** text files using `FileWriter`, `FileReader`, and `BufferedReader`, controlled through a **switch statement** in a menu-driven format.

It allows the user to:
1. Write notes to a file.
2. Read notes from the file using `FileReader` (character-by-character).
3. Read notes from the file using `BufferedReader` (line-by-line).
4. Exit the application.

The program is interactive and continues running until the user chooses the **Exit** option.

---

## 🎯 Features

### 1. Write Notes
- Allows the user to type multiple lines of text.
- Typing `end` stops the note-taking process.
- Appends new notes to the existing file without deleting previous data.
- Uses **FileWriter** in **append mode** (`new FileWriter(fileName, true)`).
- Writes text along with newline characters so formatting is preserved.

### 2. Read Notes (FileReader)
- Reads the file character-by-character.
- Best for small files where performance is not a big concern.
- Uses `FileReader.read()` method, which returns each character’s **Unicode value** that is cast to a `char` for display.

### 3. Read Notes (BufferedReader)
- Reads the file line-by-line.
- More efficient for larger files compared to `FileReader`.
- Uses `BufferedReader.readLine()` method to read full lines as `String`.
- Ideal for handling text data with line breaks.

### 4. Exit
- Terminates the program cleanly.

---

## 🛠 Logic Flow

1. **Start the Program**
   - Initialize a `Scanner` for user input.
   - Use a loop to continuously show the menu until the user selects **Exit**.

2. **Menu Display**
   - Show numbered options for writing, reading, and exiting.
   - Accept the user’s choice as an integer.

3. **Switch Statement**
   - **Case 1:** Writing notes
     - Prompt the user for text lines until they type `end`.
     - Open `FileWriter` in append mode.
     - Write each line followed by a newline character.
   - **Case 2:** Reading notes with `FileReader`
     - Open the file with `FileReader`.
     - Read and display each character until the end of the file.
   - **Case 3:** Reading notes with `BufferedReader`
     - Open the file with `BufferedReader` wrapped around a `FileReader`.
     - Read and display each line until the end of the file.
   - **Case 4:** Exit program.
   - **Default:** Show an error message for invalid choices.

4. **Repeat Until Exit**
   - Loop back to the menu after completing an operation.

---

## 📂 File Handling Details

- **FileWriter**
  - Writes **characters** (text) to files.
  - Can operate in overwrite or append mode.
  - Requires closing (`close()`) to ensure data is saved.

- **FileReader**
  - Reads **characters** from a file.
  - Suitable for small or medium text files.

- **BufferedReader**
  - Reads lines efficiently from a file.
  - Ideal for processing text files line-by-line.

---

## ✅ Advantages of This Approach

- **Menu-driven**: User-friendly, with clear options.
- **Multiple reading modes**: Demonstrates both char-by-char and line-by-line reading.
- **Append mode writing**: Prevents overwriting of existing notes.
- **Clean resource management**: Uses **try-with-resources** to automatically close streams.

---

## 📌 Example Usage Flow

```
--- File Menu ---
1. Write Notes
2. Read Notes (FileReader)
3. Read Notes (BufferedReader)
4. Exit
Enter choice: 1
Enter your notes (type 'end' to finish):
Hello World
This is a note.
end
✅ Notes saved.

--- File Menu ---
1. Write Notes
2. Read Notes (FileReader)
3. Read Notes (BufferedReader)
4. Exit
Enter choice: 3

--- Reading using BufferedReader ---
Hello World
This is a note.
```

---

## 🔍 Learning Points

- How to use **FileWriter** in append mode.
- Difference between **FileReader** and **BufferedReader**.
- Implementing a **switch statement** for menu-based programs.
- Using **try-with-resources** for safe file handling.

---

## 📎 Notes
- The file will be created automatically if it does not exist.
- Works best for plain text files; for binary files (like images), use `FileOutputStream` instead.
- If you run the program multiple times and choose **Write Notes**, new content will be added to the existing file instead of replacing it.

---

## 🚀 Conclusion
This program is a simple but powerful example of file handling in Java. It combines the basic functionality of `FileWriter`, `FileReader`, and `BufferedReader` with the flexibility of a menu-driven application using a `switch` statement.

It’s perfect for beginners to understand how Java I/O works and how to manage text files interactively.

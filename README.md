# Chrome AI Summarizer 🚀

An **AI-powered Chrome extension** that instantly summarizes webpage content, helping users read faster and understand key points without scrolling through long pages.

---

## ✨ Features

* 🔍 Extracts main content from any webpage
* 🤖 Uses AI to generate concise summaries
* ⚡ One-click summarization
* 🧠 Improves productivity and reading efficiency
* 🧩 Lightweight and easy to use

---

## 🛠 Tech Stack

* **Frontend (Extension):** HTML, CSS, JavaScript
* **Backend:** Spring Boot (REST API)
* **Browser API:** Chrome Extensions API
* **AI API:** Gemini / OpenAI

---

## 📦 Installation (Local Setup)

### Backend (Spring Boot)

1. Clone the repository

   ```bash
   git clone https://github.com/your-username/chrome-ai-summarizer.git
   ```

2. Open the **Spring Boot backend** in your IDE (IntelliJ / Eclipse)

3. Add your AI API key in `application.properties`

   ```properties
   ai.api.key=YOUR_API_KEY
   ```

4. Run the Spring Boot application

   ```bash
   mvn spring-boot:run
   ```

5. Backend will start at:

   ```
   http://localhost:8080
   ```

---

### Chrome Extension

1. Open **Google Chrome** and go to:

   ```
   chrome://extensions/
   ```

2. Enable **Developer mode** (top-right corner)

3. Click **Load unpacked**

4. Select the extension folder

5. The extension will appear in the Chrome toolbar 🎉

---

## 🧪 How to Use

1. Start the **Spring Boot backend server**
2. Open any webpage in Chrome
3. Click the **Chrome AI Summarizer** extension icon
4. Click **Summarize**
5. The extension sends webpage text to the Spring Boot API
6. View the AI-generated summary instantly

---

## 📁 Project Structure

```
chrome-ai-summarizer/
│
├── backend/                 # Spring Boot application
│   ├── controller/
│   ├── service/
│   ├── config/
│   └── application.properties
│
├── extension/               # Chrome extension
│   ├── manifest.json
│   ├── popup.html
│   ├── popup.js
│   ├── content.js
│   └── styles.css
│
└── README.md
```



---

## 🔐 API Configuration

- Add your AI API key in the configuration file or environment variable
- Make sure not to expose your API key publicly

---

## 🚧 Future Enhancements

- 🌐 Multi-language support
- 📝 Bullet-point summaries
- 💾 Save summaries
- 🎨 Improved UI/UX

---

## 🤝 Contributing

Contributions are welcome!

1. Fork the repository
2. Create a new branch
3. Commit your changes
4. Open a Pull Request

---

## 📄 License

This project is licensed under the **MIT License**.

---

## 👨‍💻 Author

**Kathiravan**  
Full Stack Developer | Java | React | SQL  

---

⭐ If you like this project, don’t forget to star the repository!

```

# 💻 System Monitor Dashboard

[![Live Demo](https://img.shields.io/badge/Live-Demo-green?style=for-the-badge)](https://system-monitor-3tc3.onrender.com/)

🔗 **Live App:** https://system-monitor-3tc3.onrender.com/  
🔗 **GitHub Repo:** https://github.com/18Pawan/system-monitor-dashboard

A real-time system monitoring dashboard built using **Spring Boot** and **Chart.js** that visualizes CPU and memory usage dynamically with live updates.
---

## 🚀 Features

- 📊 Live CPU usage monitoring
- 🧠 Real-time memory usage tracking
- 📈 Dynamic charts using Chart.js
- ⚠️ CPU alert system (high usage warning)
- 🔄 Auto-refresh every second
- 🌐 REST APIs for system metrics
- ☁️ Deployed on cloud (Render)

---

## 🛠 Tech Stack

- Java
- Spring Boot
- OSHI (System metrics library)
- Chart.js
- HTML, CSS, JavaScript

---

## 📡 API Endpoints

- `/cpu` → Returns current CPU usage
- `/memory` → Returns current memory usage
- `/history` → (if enabled) Returns usage history

---

## 📸 Screenshot

![System Monitor Screenshot](screenshot.png)

---

## ▶️ How to Run

```bash
git clone https://github.com/18Pawan/system-monitor-dashboard.git
cd system-monitor-dashboard
mvn clean package
java -jar target/system-monitor-1.0-SNAPSHOT.jar


## 🌍 Deployment

The application is deployed on Render and accessible here:

👉 https://system-monitor-3tc3.onrender.com/
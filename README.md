# 🥦 Mandi-Mitra: A Hybrid AI-Driven Inventory & Dynamic Pricing System

**"Mitigating Food Spoilage and Optimizing Micro-Vendor Profits through Predictive Analytics"**

---

## 📌 Executive Summary

**Mandi-Mitra** (Market-Friend) is a sophisticated decision-support platform designed for the unorganized retail sector (local street vendors). By integrating **Java-based inventory management** with **Python-powered Machine Learning**, the system provides real-time pricing recommendations based on perishability scores, live market trends, and local environmental factors.

---

## ❓ The Problem Landscape

Small-scale vendors in India face two primary economic leaks:

1. **Perishability Risk:** Highly perishable goods (e.g., tomatoes, leafy greens) often spoil before sale due to a lack of data-driven pricing.
2. **Static Pricing Models:** Vendors maintain fixed prices despite fluctuating weather (extreme heat) or low footfall, leading to inventory waste and capital erosion.

---

## 💡 The Solution

Mandi-Mitra introduces **Dynamic Pricing** to the grassroots level.

* The system monitors local environmental conditions via IoT/Weather APIs.
* If temperatures exceed a safety threshold for specific commodities, the ML engine suggests a "Flash Sale" or "Clearance Price" to ensure inventory liquidation before spoilage occurs.

---

## 🏗️ Technical Architecture & Workflow

The project leverages a **Modular Hybrid Architecture** to demonstrate cross-language integration:

### 🔹 Module A: Inventory Control (Java + SQLite)

* A lightweight Java desktop utility where vendors log daily procurement (Item, Quantity, Cost Basis).
* Utilizes **SQLite** as a serverless, relational database to maintain a low hardware footprint.

### 🔹 Module B: Data Orchestration (Python + APIs)

* A Python-based backend that synchronizes data from two live streams:
* **OGD India API:** Fetches the latest government-regulated Mandi rates.
* **OpenWeatherMap API:** Tracks real-time Temperature and Humidity metrics.



### 🔹 Module C: Intelligence Layer (Machine Learning)

* Implementation of a **Random Forest Regressor** to determine the optimal selling price.
* **Feature Engineering:** Correlates market rates with a custom "Perishability Index" and real-time decay factors.

### 🔹 Module D: Analytical Dashboard (Streamlit)

* A minimalist, high-performance web UI that allows vendors to visualize stock health and receive pricing alerts.

---

## 🛠️ Technical Stack

* **Programming:** Java 17+, Python 3.9+
* **Data Science:** Scikit-learn, Pandas, NumPy
* **Database:** SQLite (Relational Storage)
* **Frontend:** Streamlit
* **APIs:** OpenWeatherMap, Agmarknet/OGD India
* **MLOps:** GitHub Actions (CI/CD), Render/Railway (Deployment)

---

## 🌟 Key Engineering Features

* **Environmental Intelligence:** Automated price recalibration based on real-time heatwave or humidity alerts.
* **Cross-Language Integration:** Seamless data exchange between Java (Stable Backend) and Python (Predictive Engine) via a shared SQLite bridge.
* **Automated Data Pipelines:** Real-time market rate fetching eliminates manual entry errors.
* **Production-Ready Workflow:** Complete MLOps integration with automated testing and cloud deployment.

---

## 📈 Social & Economic Impact

Mandi-Mitra aims to reduce daily inventory spoilage for local vendors by an estimated **15-20%**. By democratizing AI, the project empowers micro-entrepreneurs to make data-backed decisions, ensuring financial sustainability.

---

## ⚙️ Installation & Deployment

1. **Initialize Database:** Run `DatabaseSetup.java` within the `inventory_app` directory to generate the SQLite schema.
2. **Environment Setup:** Execute `pip install -r requirements.txt` to install Python dependencies.
3. **Execution:** Launch the dashboard using `streamlit run app.py`.

---

### 👨‍💻 Developed By: TANISH

**Final Year BCA Project** | Focus: AI/ML, Cloud Infrastructure, and Sustainable Engineering.

---

# SwyftDesktop

SwyftDesktop is a distributed mobile-to-desktop system designed to turn a phone into a control layer for a lightweight custom desktop environment.

The system is built around a mobile-first architecture where the phone acts as a controller, app launcher, and input device, while a desktop environment renders a custom UI shell and executes applications.

---

!!!DISCLAMER: ALL DOCUMENTS INSIDE OF THIS PROJECT HAVE BEEN WRITTEN WITH CHATGPT BECAUSE I'M NOT TYPING ALLAT ON MY OWN. IF YOU HAVE AN ISSUE WITH THIS DON'T WORRY, WHEN VERSION 1 RELEASES I WILL BE UPDATING ALL OF THE README AND MOST OF THE OTHER DOCUMENTS! :END DISCLAIMER!!! 

## 🧠 Core Concept

The system is split into three main layers:

### 📱 Mobile Layer (Android)
- App launcher and control hub
- Widget system (in development)
- Input controller (trackpad / keyboard mode planned)
- Action-based architecture for system commands

### 💻 Desktop Layer (Future)
- Lightweight custom desktop environment
- Window/panel-based UI system
- Custom taskbar and widget support
- Designed for low-spec hardware support

### 🌐 Bridge Layer
- Real-time communication between devices
- Event-based command system
- Input streaming (mouse, keyboard, gestures)
- Session-based device pairing

---

## 📱 Current Mobile Features

- Grid-based app launcher (in progress)
- Dynamic app discovery (PackageManager-based)
- App launching system via package name
- Basic UI experimentation (LinearLayout prototype stage)

---

## 🚧 In Development

### Mobile System
- App drawer redesign (grid system)
- Widget framework
- Action dispatcher system (UI decoupling)
- Theme abstraction layer
- Trackpad / keyboard input mode

### Desktop System (planned)
- Custom desktop shell UI
- Taskbar system
- Window/session manager
- Input receiver service (WebSocket/TCP)

---

## 🎨 Theme System (Planned)

A unified theme system will support multiple platform renderers:

- Android → Material You styling
- Desktop → Fluent UI-inspired styling
- Shared theme model across all devices

---

## ⚙️ Architecture Principles

- UI is separated from logic using an action-based system
- Mobile and desktop are equal parts of the system
- Communication is event-driven and real-time
- Platform-specific rendering is isolated at system edges
- System prioritises low overhead and wide device compatibility

---

## 🔮 Future Vision

- Phone becomes universal controller for desktop environments
- Desktop shell replaces traditional OS UI layer (optional mode)
- Cross-device app launching and session control
- Lightweight computing environment for low-spec devices
- Unified UI system across mobile and desktop

---

## ⚠️ Status

This project is in early development. Architecture is actively evolving and may change significantly as systems are refined.

---

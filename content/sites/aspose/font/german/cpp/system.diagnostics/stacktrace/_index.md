---
title: "System::Diagnostics::StackTrace Klasse"
linktitle: "StackTrace"
second_title: "Aspose.Font für C++"
description: "System::Diagnostics::StackTrace Klasse. Sammlung von Stack-Frames. Objekte dieser Klasse sollten nur mit der System::MakeObject()-Funktion alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs im Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 600
url: /de/cpp/system.diagnostics/stacktrace/
---
## StackTrace class


Sammlung von Stack-Frames. Objekte dieser Klasse sollten nur mit der [System::MakeObject()](../../system/makeobject/) Funktion alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs im Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class StackTrace : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [get_FrameCount](./get_framecount/)() const | Gibt die Anzahl der Frames im Stack-Trace zurück. |
| virtual [GetFrame](./getframe/)(uint32_t) | Gibt den Stack-Frame zurück. |
| [operator=](./operator=/)(const StackTrace\&) const | Keine Zuweisung. |
| [StackTrace](./stacktrace/)() | Erstellt einen Stack-Trace, der den aktuellen Stack-Zustand beschreibt. |
| [StackTrace](./stacktrace/)(bool) | Erstellt einen Stack-Trace, der den aktuellen Stack-Zustand beschreibt. |
| [StackTrace](./stacktrace/)(const StackTrace\&) | Kein Kopieren. |
| virtual [~StackTrace](./~stacktrace/)() | Destruktor. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Diagnostics](../)
* Library [Aspose.Font for C++](../../)

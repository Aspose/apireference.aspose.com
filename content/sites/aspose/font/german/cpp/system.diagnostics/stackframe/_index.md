---
title: "System::Diagnostics::StackFrame Klasse"
linktitle: "StackFrame"
second_title: "Aspose.Font für C++"
description: "System::Diagnostics::StackFrame Klasse. Ruft Informationen zu einem einzelnen Stack-Frame ab. Nur MSVS. Objekte dieser Klasse sollten ausschließlich mit der Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 500
url: /de/cpp/system.diagnostics/stackframe/
---
## StackFrame class


Ruft Informationen zu einem einzelnen Stack-Frame ab. Nur MSVS. Objekte dieser Klasse sollten ausschließlich mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class StackFrame : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| virtual [GetFileColumnNumber](./getfilecolumnnumber/)() | Ruft die Spaltennummer ab. |
| virtual [GetFileLineNumber](./getfilelinenumber/)() | Ruft die Zeilennummer ab. |
| virtual [GetFileName](./getfilename/)() | Ruft den Dateinamen ab. |
| [GetMethod](./getmethod/)() | Ruft Methodeninformationen ab. |
| [operator=](./operator=/)(const StackFrame\&) const | Keine Änderungen. |
| [StackFrame](./stackframe/)(int) | Erstellt einen Stack-Frame am aktuellen Stack-Offset. |
| [StackFrame](./stackframe/)(const StackFrame\&) | Kein Kopieren. |
| virtual [~StackFrame](./~stackframe/)() | Destruktor. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Diagnostics](../)
* Library [Aspose.Font for C++](../../)

---
title: "System::Diagnostics::StackFrame Klasse"
linktitle: "StackFrame"
second_title: "Aspose.Page für C++"
description: "System::Diagnostics::StackFrame Klasse. Liefert Informationen über einen einzelnen Stack-Frame. Nur MSVS. Objekte dieser Klasse sollten ausschließlich mit der Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 500
url: /de/cpp/system.diagnostics/stackframe/
---
## StackFrame class


Liefert Informationen über einen einzelnen Stack-Frame. Nur MSVS. Objekte dieser Klasse sollten ausschließlich mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class StackFrame : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| virtual [GetFileColumnNumber](./getfilecolumnnumber/)() | Liefert die Spaltennummer. |
| virtual [GetFileLineNumber](./getfilelinenumber/)() | Liefert die Zeilennummer. |
| virtual [GetFileName](./getfilename/)() | Liefert den Dateinamen. |
| [GetMethod](./getmethod/)() | Liefert Methodeninformationen. |
| [operator=](./operator=/)(const StackFrame\&) const | Keine Änderungen. |
| [StackFrame](./stackframe/)(int) | Erstellt einen Stack-Frame am aktuellen Stack-Offset. |
| [StackFrame](./stackframe/)(const StackFrame\&) | Kein Kopieren. |
| virtual [~StackFrame](./~stackframe/)() | Destruktor. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Diagnostics](../)
* Library [Aspose.Page for C++](../../)

---
title: "System::IO::StringReader class"
linktitle: "StringReader"
second_title: "Aspose.Font für C++"
description: "System::IO::StringReader class. Stellt einen Reader dar, der Zeichen aus einem String liest. Objekte dieser Klasse sollten ausschließlich über die Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 2400
url: /de/cpp/system.io/stringreader/
---
## StringReader class


Stellt einen Leser dar, der Zeichen aus einem String liest. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class StringReader : public System::IO::TextReader
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Close](./close/)() override | Schließt den Stream. |
| [Dispose](./dispose/)() override | Tut nichts. |
| [Dispose](./dispose/)(bool) override | Tut nichts. |
| [Peek](./peek/)() override | Liest ein einzelnes Zeichen aus dem Stream, ohne die Position des Streams zu ändern. |
| [Read](./read/)() override | Liest ein einzelnes Zeichen aus dem Stream. |
| [Read](./read/)(ArrayPtr\<char_t\>, int, int) override | Liest die angegebene Anzahl von Zeichen aus dem Stream in das angegebene Zeichenarray, beginnend an der angegebenen Position. |
| [ReadLine](./readline/)() override | Liest Zeichen aus dem Stream bis zum Ende der aktuellen Zeile. |
| [ReadToEnd](./readtoend/)() override | Liest Zeichen aus dem Stream bis zum Ende des Streams. |
| [StringReader](./stringreader/)(const String\&) | Konstruiert eine neue Instanz der Klasse [StringReader](./), die Zeichen aus dem angegebenen String liest. |
## Siehe auch

* Class [TextReader](../textreader/)
* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)

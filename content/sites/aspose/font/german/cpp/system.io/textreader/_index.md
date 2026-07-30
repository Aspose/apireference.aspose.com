---
title: "System::IO::TextReader Klasse"
linktitle: "TextReader"
second_title: "Aspose.Font für C++"
description: "System::IO::TextReader Klasse. Eine Basisklasse für Klassen, die Leser darstellen, die Zeichenfolgen aus verschiedenen Quellen lesen. Objekte dieser Klasse sollten nur mit der Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 2600
url: /de/cpp/system.io/textreader/
---
## TextReader class


Eine Basisklasse für Klassen, die Leser darstellen, die Zeichenfolgen aus verschiedenen Quellen lesen. Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/)‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class TextReader : public System::IDisposable
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| virtual [Close](./close/)() | Schließt den Stream und gibt erworbene Ressourcen frei. |
| [Dispose](./dispose/)() override | Gibt alle vom aktuellen Objekt verwendeten Ressourcen frei und schließt den zugrunde liegenden Stream. |
| virtual [Peek](./peek/)() | Liest ein einzelnes Zeichen aus dem Stream, ohne den Lesekursor des Streams zu verändern. |
| virtual [Read](./read/)() | Liest ein einzelnes Zeichen aus dem Stream. |
| virtual [Read](./read/)(ArrayPtr\<char_t\>, int, int) | Liest die angegebene Anzahl von Zeichen aus dem Stream und schreibt sie in das angegebene Zeichenarray, beginnend an der angegebenen Position. |
| virtual [ReadBlock](./readblock/)(ArrayPtr\<char_t\>, int, int) | Liest die angegebene maximale Anzahl von Zeichen aus dem aktuellen TextReader und schreibt die Daten in einen Puffer, beginnend am angegebenen Index. |
| virtual [ReadLine](./readline/)() | Liest Zeichen aus dem Stream bis zum Ende der aktuellen Zeile. |
| virtual [ReadToEnd](./readtoend/)() | Liest Zeichen aus dem Stream bis zum Ende des Streams. |
## Siehe auch

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)

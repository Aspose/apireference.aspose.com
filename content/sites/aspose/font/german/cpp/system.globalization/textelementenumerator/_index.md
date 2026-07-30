---
title: "System::Globalization::TextElementEnumerator-Klasse"
linktitle: "TextElementEnumerator"
second_title: "Aspose.Font für C++"
description: "System::Globalization::TextElementEnumerator Klasse. Enumerator zum Durchlaufen von String-Elementen (Zeichen). Objekte dieser Klasse sollten nur mit der Funktion System::MakeObject() alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben in C++."
type: docs
weight: 2700
url: /de/cpp/system.globalization/textelementenumerator/
---
## TextElementEnumerator class


Enumerator zum Durchlaufen von String-Elementen (Zeichen). Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class TextElementEnumerator : public virtual System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [get_Current](./get_current/)() const | Gibt das aktuelle Textelement zurück. |
| [get_ElementIndex](./get_elementindex/)() const | Gibt den Index des aktuellen Textelements zurück. |
| [GetTextElement](./gettextelement/)() const | Gibt das aktuelle Element zurück. |
| [MoveNext](./movenext/)() | Wechselt zum nächsten Element. |
| [operator=](./operator=/)(const TextElementEnumerator\&) |  |
| [Reset](./reset/)() | Setzt den Enumerator auf die Anfangsposition zurück. |
| [TextElementEnumerator](./textelementenumerator/)(const TextElementEnumerator\&) |  |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Globalization](../)
* Library [Aspose.Font for C++](../../)

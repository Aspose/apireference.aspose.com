---
title: "System::Text::RegularExpressions::Capture class"
linktitle: "Capture"
second_title: "Aspose.Page für C++"
description: "System::Text::RegularExpressions::Capture class. Ergebnis einer einzelnen Subausdrucksübereinstimmung. Objekte dieser Klasse sollten nur mit der Funktion System::MakeObject() alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 100
url: /de/cpp/system.text.regularexpressions/capture/
---
## Capture class


Ergebnis einer einzelnen Subausdrucksübereinstimmung. Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/)-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class Capture : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Capture](./capture/)(const UStringPtr\&, int, int) | Konstruktor. |
| [get_Index](./get_index/)() const | Ermittelt den Index des erfassten Teilstrings. |
| [get_Length](./get_length/)() const | Ermittelt die Länge des erfassten Teilstrings. |
| [get_Value](./get_value/)() const | Ermittelt den erfassten Teilstring. |
| [ToString](./tostring/)() const override | Ermittelt den erfassten Teilstring. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Text::RegularExpressions](../)
* Library [Aspose.Page for C++](../../)

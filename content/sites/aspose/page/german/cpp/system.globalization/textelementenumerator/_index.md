---
title: "System::Globalization::TextElementEnumerator Klasse"
linktitle: "TextElementEnumerator"
second_title: "Aspose.Page für C++"
description: "System::Globalization::TextElementEnumerator Klasse. Aufzählung zum Durchlaufen von String-Elementen (Zeichen). Objekte dieser Klasse sollten ausschließlich mit der Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 2700
url: /de/cpp/system.globalization/textelementenumerator/
---
## TextElementEnumerator class


Aufzählung zum Durchlaufen von String-Elementen (Zeichen). Objekte dieser Klasse sollten ausschließlich mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class TextElementEnumerator : public virtual System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [get_Current](./get_current/)() const | Ruft das aktuelle Textelement ab. |
| [get_ElementIndex](./get_elementindex/)() const | Ruft den Index des aktuellen Textelements ab. |
| [GetTextElement](./gettextelement/)() const | Ruft das aktuelle Element ab. |
| [MoveNext](./movenext/)() | Wechselt zum nächsten Element. |
| [operator=](./operator=/)(const TextElementEnumerator\&) |  |
| [Reset](./reset/)() | Setzt den Aufzähler auf die Anfangsposition. |
| [TextElementEnumerator](./textelementenumerator/)(const TextElementEnumerator\&) |  |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)

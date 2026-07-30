---
title: "System::IEquatable Klasse"
linktitle: "IEquatable"
second_title: "Aspose.Font für C++"
description: "System::IEquatable Klasse. Definiert eine Methode, die die Gleichheit von zwei Objekten bestimmt. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 3700
url: /de/cpp/system/iequatable/
---
## IEquatable class


Definiert eine Methode, die die Gleichheit von zwei Objekten bestimmt. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
template<typename T>class IEquatable : public virtual System::Object
```


| Parameter | Beschreibung |
| --- | --- |
| T | Der Typ der verglichenen Objekte |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| virtual [Equals](./equals/)(T) | Bestimmt, ob das aktuelle und das angegebene Objekt gleich sind. |

## Siehe auch

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)

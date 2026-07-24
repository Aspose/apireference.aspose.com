---
title: "System::IComparable class"
linktitle: "IComparable"
second_title: "Aspose.Page für C++"
description: "System::IComparable class. Definiert eine Methode, die zwei Objekte vergleicht. Objekte dieser Klasse sollten nur mit der Funktion System::MakeObject() alloziert werden. Erstelle niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickele diese Klasse stets in einen System::SmartPtr‑Zeiger ein und verwende diesen Zeiger, um sie als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 3300
url: /de/cpp/system/icomparable/
---
## IComparable class


Definiert eine Methode, die zwei Objekte vergleicht. Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../makeobject/) alloziert werden. Erstelle niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickele diese Klasse stets in einen [System::SmartPtr](../smartptr/)‑Zeiger ein und verwende diesen Zeiger, um sie als Argument an Funktionen zu übergeben.

```cpp
template<typename T>class IComparable : public virtual System::Object
```


| Parameter | Beschreibung |
| --- | --- |
| T | Der Typ der Objekte, mit denen das aktuelle Objekt verglichen wird |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| virtual [CompareTo](./compareto/)(T) | Vergleicht das aktuelle Objekt mit dem angegebenen Objekt. |

## Siehe auch

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)

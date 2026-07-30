---
title: "System::Collections::Generic::IEqualityComparer Klasse"
linktitle: "IEqualityComparer"
second_title: "Aspose.Font für C++"
description: "System::Collections::Generic::IEqualityComparer Klasse. Schnittstelle, die Mittel zum Vergleich zweier Objekte auf Gleichheit bereitstellt. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 2400
url: /de/cpp/system.collections.generic/iequalitycomparer/
---
## IEqualityComparer class


Schnittstelle, die Mittel zum Vergleich zweier Objekte auf Gleichheit bereitstellt. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../../system/smartptr/)‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
template<typename T>class IEqualityComparer : public virtual System::Object
```


| Parameter | Beschreibung |
| --- | --- |
| T | Typ, der verglichen wird. |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| virtual [Equals](./equals/)(T, T) const | RTTI-Informationen. |
| virtual [GetHashCode](./gethashcode/)(T) const | Gibt den Hashcode für ein Objekt zurück. |

## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)

---
title: "System::Collections::Generic::IList Klasse"
linktitle: "IList"
second_title: "Aspose.Font für C++"
description: "System::Collections::Generic::IList Klasse. Schnittstelle eines indizierten Containers von Elementen. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 2600
url: /de/cpp/system.collections.generic/ilist/
---
## IList class


Schnittstelle eines indizierten Containers von Elementen. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in den [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
template<typename T>class IList : public System::Collections::Generic::ICollection<T>
```


| Parameter | Beschreibung |
| --- | --- |
| T | Elementtyp. |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [get_IsFixedSize](./get_isfixedsize/)() | Überprüft, ob die Sammlung eine feste Größe hat. |
| virtual [idx_get](./idx_get/)(int) const | Liefert das Element am angegebenen Index. |
| virtual [idx_set](./idx_set/)(int, T) | Setzt das Element am angegebenen Index. |
| virtual [IndexOf](./indexof/)(const T\&) const | Gibt den Index des ersten Auftretens des Elements im Container zurück. |
| virtual [Insert](./insert/)(int, const T\&) | Fügt das Element an der angegebenen Position ein und verschiebt andere Elemente. |
| virtual [RemoveAt](./removeat/)(int) | Entfernt das Element am angegebenen Index. |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [BaseType](./basetype/) | RTTI-Informationen. |
| [ThisType](./thistype/) | Dieser Typ. |
| [ValueType](./valuetype/) | Werttyp. |

## Siehe auch

* Class [ICollection](../icollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)

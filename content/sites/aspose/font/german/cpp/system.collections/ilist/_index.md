---
title: "System::Collections::IList Klasse"
linktitle: "IList"
second_title: "Aspose.Font für C++"
description: "System::Collections::IList Klasse. IList stellt eine nicht generische Sammlung von Objekten dar, die in C++ einzeln über einen Index zugänglich sind."
type: docs
weight: 1000
url: /de/cpp/system.collections/ilist/
---
## IList class


[IList](./) Represents a non-generic collection of objects that can be individually accessed by index.

```cpp
class IList : public virtual System::Collections::ICollection
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| virtual [Add](./add/)(SharedPtr\<System::Object\>) | Fügt ein Element am Ende der Liste hinzu. |
| virtual [Clear](./clear/)() | Entfernt alle Elemente aus der Liste. |
| virtual [Contains](./contains/)(SharedPtr\<System::Object\>) const | Prüft, ob das Element in der Liste ist. |
| virtual [get_IsFixedSize](./get_isfixedsize/)() const | Gibt einen Wert zurück, der angibt, ob die Liste eine feste Größe hat. |
| virtual [idx_get](./idx_get/)(int, int) const | RTTI-Informationen. |
| virtual [IndexOf](./indexof/)(SharedPtr\<System::Object\>) const | Gibt den ersten Index des angegebenen Elements zurück. |
| virtual [Insert](./insert/)(int, SharedPtr\<System::Object\>) | Fügt das Element an der angegebenen Position in die Liste ein. |
| virtual [Remove](./remove/)(SharedPtr\<System::Object\>) | Entfernt die erste Instanz des angegebenen Elements aus der Liste. |
| virtual [RemoveAt](./removeat/)(int) | Entfernt das Element an der angegebenen Position aus der Liste. |
## Siehe auch

* Class [ICollection](../icollection/)
* Namespace [System::Collections](../)
* Library [Aspose.Font for C++](../../)

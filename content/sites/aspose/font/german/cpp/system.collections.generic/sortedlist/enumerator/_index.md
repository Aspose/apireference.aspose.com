---
title: "System::Collections::Generic::SortedList::Enumerator Klasse"
linktitle: "Enumerator"
second_title: "Aspose.Font für C++"
description: "System::Collections::Generic::SortedList::Enumerator Klasse. Enumerator-Klasse zum Durchlaufen der Liste. Objekte dieser Klasse sollten nur mit der Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 2600
url: /de/cpp/system.collections.generic/sortedlist/enumerator/
---
## Enumerator class


[Enumerator](./) class to iterate through list. Objects of this class should only be allocated using [System::MakeObject()](../../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Enumerator : public System::Collections::Generic::SimpleEnumerator<map_t, KVPair>
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Enumerator](./enumerator/)(const Ptr\&) | Erstellt einen Enumerator, der durch ein bestimmtes Wörterbuch iteriert. |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [EnumeratorType](./enumeratortype/) | [Enumerator](./) Typalias. |
## Siehe auch

* Class [SimpleEnumerator](../../simpleenumerator/)
* Class [SortedList](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)

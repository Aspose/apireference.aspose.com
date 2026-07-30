---
title: "System::Collections::Generic::Dictionary::Enumerator Klasse"
linktitle: "Enumerator"
second_title: "Aspose.Font für C++"
description: "System::Collections::Generic::Dictionary::Enumerator Klasse. Enumerator, der das Durchlaufen des Wörterbuchs ermöglicht. Objekte dieser Klasse sollten nur mit der Funktion System::MakeObject() alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 1000
url: /de/cpp/system.collections.generic/dictionary/enumerator/
---
## Enumerator class


[Enumerator](./) that allows iterating through the dictionary. Objects of this class should only be allocated using [System::MakeObject()](../../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Enumerator : public System::Collections::Generic::SimpleEnumerator<map_t, KVPair>
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [CloneIterator](./cloneiterator/)() const override | RTTI-Informationen. |
| [Enumerator](./enumerator/)(Ptr) | Erstellt Aufzählung. |
## Siehe auch

* Class [SimpleEnumerator](../../simpleenumerator/)
* Class [Dictionary](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)

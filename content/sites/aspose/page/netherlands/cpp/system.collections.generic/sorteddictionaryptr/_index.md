---
title: "System::Collections::Generic::SortedDictionaryPtr class"
linktitle: "SortedDictionaryPtr"
second_title: "Aspose.Page voor C++"
description: "System::Collections::Generic::SortedDictionaryPtr class. Gesorteerde dictionary-pointer met toegangsmethoden. Dit type is een pointer om de verwijdering van andere objecten te beheren. Het moet op de stack worden gealloceerd en aan functies worden doorgegeven, hetzij per waarde, hetzij per const-referentie in C++."
type: docs
weight: 4100
url: /nl/cpp/system.collections.generic/sorteddictionaryptr/
---
## SortedDictionaryPtr class


Sorted dictionary pointer met toegangsoperatoren. Dit type is een pointer om de verwijdering van andere objecten te beheren. Het moet op de stack worden toegewezen en aan functies worden doorgegeven, zowel per waarde als per const‑referentie.

```cpp
template<typename T,typename V>class SortedDictionaryPtr : public System::SmartPtr<SortedDictionary<T, V>>
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [operator[]](./operator[]/)(const T\&) const | Accessor-functie. |
| [SortedDictionaryPtr](./sorteddictionaryptr/)() | Construeert null-pointer. |
| [SortedDictionaryPtr](./sorteddictionaryptr/)(const SharedPtr\<SortedDictionary\<T, V\>\>\&) | Construeert een pointer naar de opgegeven gesorteerde dictionary. |
## Zie ook

* Class [SmartPtr](../../system/smartptr/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)

---
title: "System::Collections::Generic::ListPtr klasse"
linktitle: "ListPtr"
second_title: "Aspose.Page voor C++"
description: "System::Collections::Generic::ListPtr klasse. Lijst‑pointer met toegang‑operatoren. Dit type is een pointer om de verwijdering van een ander object''s te beheren. Het moet op de stack worden toegewezen en aan functies worden doorgegeven, hetzij per waarde, hetzij per const‑referentie in C++."
type: docs
weight: 3500
url: /nl/cpp/system.collections.generic/listptr/
---
## ListPtr class


[List](../list/) pointer with access operators. This type is a pointer to manage other object's deletion. It should be allocated on stack and passed to functions either by value or by const reference.

```cpp
template<typename T>class ListPtr : public System::SmartPtr<List<T>>
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [ListPtr](./listptr/)(std::nullptr_t) | Initialiseert null‑pointer. |
| [ListPtr](./listptr/)(const SharedPtr\<List\<T\>\>\&) | Initialiseert een pointer naar de opgegeven lijst. |
| [operator==](./operator==/)(std::nullptr_t) const | Controleert of de [List](../list/) pointer null is. |
| [operator[]](./operator[]/)(int) | Accessor. |
| [operator[]](./operator[]/)(int) const | Accessor. |
## Zie ook

* Class [SmartPtr](../../system/smartptr/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)

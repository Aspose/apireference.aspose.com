---
title: "System::Collections::Generic::DictionaryPtr klasse"
linktitle: "DictionaryPtr"
second_title: "Aspose.Page voor C++"
description: "System::Collections::Generic::DictionaryPtr klasse. Dictionary‑pointerklasse met operator‑overloads. Dit type is een pointer om de verwijdering van andere objecten te beheren. Het moet op de stack worden toegewezen en aan functies worden doorgegeven, hetzij per waarde, hetzij per const‑referentie in C++."
type: docs
weight: 1300
url: /nl/cpp/system.collections.generic/dictionaryptr/
---
## DictionaryPtr class


[Dictionary](../dictionary/) pointer class with operator overloads. This type is a pointer to manage other object's deletion. It should be allocated on stack and passed to functions either by value or by const reference.

```cpp
template<typename T,typename V>class DictionaryPtr : public System::SmartPtr<Dictionary<T, V>>
```


| Parameter | Beschrijving |
| --- | --- |
| T | Sleuteltype. |
| V | Waarde‑type. |
## Methoden

| Methode | Beschrijving |
| --- | --- |
| [DictionaryPtr](./dictionaryptr/)() | Initialiseert null-pointer. |
| [DictionaryPtr](./dictionaryptr/)(const SharedPtr\<Dictionary\<T, V\>\>\&) | Converteert pointertype. |
| [operator[]](./operator[]/)(const X\&) const | Toegangsoperator om te werken met sleuteltype‑conversie. |
| [operator[]](./operator[]/)(const T\&) const | Toegangsoperator. |

## Zie ook

* Class [SmartPtr](../../system/smartptr/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)

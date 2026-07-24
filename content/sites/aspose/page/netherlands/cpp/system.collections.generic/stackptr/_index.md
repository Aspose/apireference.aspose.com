---
title: "System::Collections::Generic::StackPtr klasse"
linktitle: "StackPtr"
second_title: "Aspose.Page voor C++"
description: "System::Collections::Generic::StackPtr klasse. Stack‑pointer. Dit type is een pointer om de verwijdering van een ander object''s te beheren. Het moet op de stack worden toegewezen en aan functies worden doorgegeven, hetzij per waarde, hetzij per const‑referentie in C++."
type: docs
weight: 4700
url: /nl/cpp/system.collections.generic/stackptr/
---
## StackPtr class


[Stack](../stack/) pointer. This type is a pointer to manage other object's deletion. It should be allocated on stack and passed to functions either by value or by const reference.

```cpp
template<typename T>class StackPtr : public System::SmartPtr<Stack<T>>
```


| Parameter | Beschrijving |
| --- | --- |
| T | Elementtype. |
## Methoden

| Methode | Beschrijving |
| --- | --- |
| [StackPtr](./stackptr/)() | Construeert null-pointer. |
| [StackPtr](./stackptr/)(const SharedPtr\<Stack\<T\>\>\&) | Construeert een pointer die naar een specifieke stack verwijst. |

## Zie ook

* Class [SmartPtr](../../system/smartptr/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)

---
title: "System::Collections::Generic::QueuePtr klasse"
linktitle: "QueuePtr"
second_title: "Aspose.Page voor C++"
description: "System::Collections::Generic::QueuePtr klasse. Queue‑pointer. Dit type is een pointer om de verwijdering van andere objecten te beheren. Het moet op de stack worden gealloceerd en aan functies worden doorgegeven, hetzij per waarde, hetzij per const‑referentie in C++."
type: docs
weight: 3700
url: /nl/cpp/system.collections.generic/queueptr/
---
## QueuePtr class


[Queue](../queue/) pointer. This type is a pointer to manage other object's deletion. It should be allocated on stack and passed to functions either by value or by const reference.

```cpp
template<typename T>class QueuePtr : public System::SmartPtr<Queue<T>>
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [QueuePtr](./queueptr/)() | Construeert null-pointer. |
| [QueuePtr](./queueptr/)(const SharedPtr\<Queue\<T\>\>\&) | Construeert een pointer naar een specifieke queue. |

## Zie ook

* Class [SmartPtr](../../system/smartptr/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)

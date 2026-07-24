---
title: "System::Collections::Generic::QueuePtr classe"
linktitle: "QueuePtr"
second_title: "Aspose.Page per C++"
description: "System::Collections::Generic::QueuePtr classe. Puntatore di coda. Questo tipo è un puntatore per gestire la cancellazione di altri oggetti''. Dovrebbe essere allocato sullo stack e passato alle funzioni sia per valore sia per riferimento costante in C++."
type: docs
weight: 3700
url: /it/cpp/system.collections.generic/queueptr/
---
## QueuePtr class


[Queue](../queue/) pointer. This type is a pointer to manage other object's deletion. It should be allocated on stack and passed to functions either by value or by const reference.

```cpp
template<typename T>class QueuePtr : public System::SmartPtr<Queue<T>>
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [QueuePtr](./queueptr/)() | Costruisce un puntatore nullo. |
| [QueuePtr](./queueptr/)(const SharedPtr\<Queue\<T\>\>\&) | Costruisce un puntatore a una coda specifica. |

## Vedi anche

* Class [SmartPtr](../../system/smartptr/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)

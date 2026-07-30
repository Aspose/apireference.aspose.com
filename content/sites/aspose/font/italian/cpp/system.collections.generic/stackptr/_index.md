---
title: "System::Collections::Generic::StackPtr classe"
linktitle: "StackPtr"
second_title: "Aspose.Font per C++"
description: "System::Collections::Generic::StackPtr classe. Puntatore di stack. Questo tipo è un puntatore per gestire la cancellazione di altri oggetti. Dovrebbe essere allocato sullo stack e passato alle funzioni sia per valore sia per riferimento costante in C++."
type: docs
weight: 4700
url: /it/cpp/system.collections.generic/stackptr/
---
## StackPtr class


[Stack](../stack/) pointer. This type is a pointer to manage other object's deletion. It should be allocated on stack and passed to functions either by value or by const reference.

```cpp
template<typename T>class StackPtr : public System::SmartPtr<T0>
```


| Parametro | Descrizione |
| --- | --- |
| T | Tipo di elemento. |
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [StackPtr](./stackptr/)() | Costruisce un puntatore nullo. |
| [StackPtr](./stackptr/)(const SharedPtr\<Stack\<T\>\>\&) | Costruisce un puntatore che fa riferimento a uno stack specifico. |

## Vedi anche

* Class [SmartPtr](../../system/smartptr/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)

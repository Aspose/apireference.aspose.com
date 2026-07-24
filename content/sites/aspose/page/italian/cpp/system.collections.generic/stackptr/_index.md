---
title: "Classe System::Collections::Generic::StackPtr"
linktitle: "StackPtr"
second_title: "Aspose.Page per C++"
description: "Classe System::Collections::Generic::StackPtr. Puntatore di stack. Questo tipo è un puntatore per gestire l'eliminazione di altri oggetti. Deve essere allocato sullo stack e passato alle funzioni per valore o per riferimento costante in C++."
type: docs
weight: 4700
url: /it/cpp/system.collections.generic/stackptr/
---
## StackPtr class


[Stack](../stack/) pointer. This type is a pointer to manage other object's deletion. It should be allocated on stack and passed to functions either by value or by const reference.

```cpp
template<typename T>class StackPtr : public System::SmartPtr<Stack<T>>
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
* Library [Aspose.Page for C++](../../)

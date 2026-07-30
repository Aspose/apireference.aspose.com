---
title: "System::Collections::IEnumeratorImplValueType classe"
linktitle: "IEnumeratorImplValueType"
second_title: "Aspose.Font per C++"
description: "System::Collections::IEnumeratorImplValueType classe. Wrapper che crea un'implementazione non generica di IEnumerator sull'Iterator generico IEnumeratorImplRefType - wrapper per i tipi valore in C++."
type: docs
weight: 800
url: /it/cpp/system.collections/ienumeratorimplvaluetype/
---
## IEnumeratorImplValueType class


Wrapper che crea un'implementazione non generica di [IEnumerator](../ienumerator/) sopra l'Iterator generico [IEnumeratorImplRefType](../ienumeratorimplreftype/) - wrapper per i tipi valore.

```cpp
template<typename T>class IEnumeratorImplValueType : public System::Collections::IEnumerator
```


| Parametro | Descrizione |
| --- | --- |
| T | Tipo di elemento. |
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [get_Current](./get_current/)() const override | Restituisce l'elemento corrente. |
| [IEnumeratorImplValueType](./ienumeratorimplvaluetype/)(System::SharedPtr\<System::Collections::Generic::IEnumerator\<T\>\>) | costruttore del wrapper |
| [MoveNext](./movenext/)() override | Sposta l'enumeratore al prossimo elemento. Se non è stato referenziato alcun elemento prima, imposta il riferimento al primo elemento disponibile. Se si raggiunge la fine del contenitore, non fa nulla. |

## Vedi anche

* Class [IEnumerator](../ienumerator/)
* Namespace [System::Collections](../)
* Library [Aspose.Font for C++](../../)

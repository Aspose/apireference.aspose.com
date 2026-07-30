---
title: "classe System::Collections::IEnumeratorImplRefType"
linktitle: "IEnumeratorImplRefType"
second_title: "Aspose.Font per C++"
description: "classe System::Collections::IEnumeratorImplRefType. Wrapper che crea un'implementazione non generica di IEnumerator sopra l'Iterator generico IEnumeratorImplRefType - wrapper per i tipi di riferimento in C++."
type: docs
weight: 700
url: /it/cpp/system.collections/ienumeratorimplreftype/
---
## IEnumeratorImplRefType class


Wrapper che crea un'implementazione non generica di [IEnumerator](../ienumerator/) sopra l'Iteratore generico [IEnumeratorImplRefType](./) - wrapper per i tipi di riferimento.

```cpp
template<typename T>class IEnumeratorImplRefType : public System::Collections::IEnumerator
```


| Parametro | Descrizione |
| --- | --- |
| T | Tipo di elemento. |
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [get_Current](./get_current/)() const override | Restituisce l'elemento corrente. |
| [IEnumeratorImplRefType](./ienumeratorimplreftype/)(System::SharedPtr\<System::Collections::Generic::IEnumerator\<System::SharedPtr\<T\>\>\>) | costruttore del wrapper |
| [MoveNext](./movenext/)() override | Sposta l'enumeratore al prossimo elemento. Se non è stato referenziato alcun elemento prima, imposta il riferimento al primo elemento disponibile. Se si raggiunge la fine del contenitore, non fa nulla. |

## Vedi anche

* Class [IEnumerator](../ienumerator/)
* Namespace [System::Collections](../)
* Library [Aspose.Font for C++](../../)

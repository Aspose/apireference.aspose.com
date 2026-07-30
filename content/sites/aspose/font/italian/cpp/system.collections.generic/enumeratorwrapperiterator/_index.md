---
title: "System::Collections::Generic::EnumeratorWrapperIterator classe"
linktitle: "EnumeratorWrapperIterator"
second_title: "Aspose.Font per C++"
description: "System::Collections::Generic::EnumeratorWrapperIterator classe. Iteratore che avvolge l'enumeratore pre-creato e reindirizza tutte le chiamate verso di esso in C++."
type: docs
weight: 1500
url: /it/cpp/system.collections.generic/enumeratorwrapperiterator/
---
## EnumeratorWrapperIterator class


Iteratore che avvolge l'enumeratore pre-creato e reindirizza tutte le chiamate verso di esso.

```cpp
template<typename Element>class EnumeratorWrapperIterator : public System::Details::VirtualizedIteratorBase<Element>
```


| Parametro | Descrizione |
| --- | --- |
| Element | Tipo di elemento. |
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [CloneIterator](./cloneiterator/)() const override | Clona l'iteratore corrente. |
| [EnumeratorWrapperIterator](./enumeratorwrapperiterator/)(const SharedPtr\<IEnumerator\<Element\>\>\&) |  |
| [IncrementIterator](./incrementiterator/)() override | Sposta l'iteratore di un passo in avanti. Deve aggiornare m_is_end e m_pointer. |
| [IteratorEquals](./iteratorequals/)(System::Details::VirtualizedIteratorBase\<Element\> *) const override | Verifica se due iteratori puntano allo stesso elemento. |
| virtual [~EnumeratorWrapperIterator](./~enumeratorwrapperiterator/)() | Distruttore. |

## Vedi anche

* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)

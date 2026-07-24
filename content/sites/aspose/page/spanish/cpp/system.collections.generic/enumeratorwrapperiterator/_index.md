---
title: "Clase System::Collections::Generic::EnumeratorWrapperIterator"
linktitle: "EnumeratorWrapperIterator"
second_title: "Aspose.Page para C++"
description: "Clase System::Collections::Generic::EnumeratorWrapperIterator. Iterador que envuelve el enumerador precreado y redirige todas las llamadas a él en C++."
type: docs
weight: 1500
url: /es/cpp/system.collections.generic/enumeratorwrapperiterator/
---
## EnumeratorWrapperIterator class


Iterador que envuelve el enumerador precreado y redirige todas las llamadas a él.

```cpp
template<typename Element>class EnumeratorWrapperIterator : public System::Details::VirtualizedIteratorBase<Element>
```


| Parámetro | Descripción |
| --- | --- |
| Element | Tipo de elemento. |
## Métodos

| Método | Descripción |
| --- | --- |
| [CloneIterator](./cloneiterator/)() const override | Clona el iterador actual. |
| [EnumeratorWrapperIterator](./enumeratorwrapperiterator/)(const SharedPtr\<IEnumerator\<Element\>\>\&) |  |
| [IncrementIterator](./incrementiterator/)() override | Mueve el iterador un paso adelante. Debe actualizar m_is_end y m_pointer. |
| [IteratorEquals](./iteratorequals/)(System::Details::VirtualizedIteratorBase\<Element\> *) const override | Comprueba si dos iteradores apuntan al mismo elemento. |
| virtual [~EnumeratorWrapperIterator](./~enumeratorwrapperiterator/)() | Destructor. |

## Ver también

* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)

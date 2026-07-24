---
title: "System::Collections::Generic::EnumeratorWrapperIterator sınıfı"
linktitle: "EnumeratorWrapperIterator"
second_title: "Aspose.Page için C++"
description: "System::Collections::Generic::EnumeratorWrapperIterator sınıfı. Önceden oluşturulmuş enumeratörü saran ve C++'ta tüm çağrıları ona yönlendiren yineleyici."
type: docs
weight: 1500
url: /tr/cpp/system.collections.generic/enumeratorwrapperiterator/
---
## EnumeratorWrapperIterator class


Önceden oluşturulmuş enumeratörü saran ve tüm çağrıları ona yönlendiren yineleyici.

```cpp
template<typename Element>class EnumeratorWrapperIterator : public System::Details::VirtualizedIteratorBase<Element>
```


| Parameter | Açıklama |
| --- | --- |
| Element | Öğe türü. |
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [CloneIterator](./cloneiterator/)() const override | Mevcut yineleyiciyi kopyalar. |
| [EnumeratorWrapperIterator](./enumeratorwrapperiterator/)(const SharedPtr\<IEnumerator\<Element\>\>\&) |  |
| [IncrementIterator](./incrementiterator/)() override | Yineleyiciyi bir adım ileri hareket ettirir. m_is_end ve m_pointer güncellenmelidir. |
| [IteratorEquals](./iteratorequals/)(System::Details::VirtualizedIteratorBase\<Element\> *) const override | İki yineleyicinin aynı öğeye işaret edip etmediğini denetler. |
| virtual [~EnumeratorWrapperIterator](./~enumeratorwrapperiterator/)() | Yıkıcı. |

## Ayrıca Bakınız

* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)

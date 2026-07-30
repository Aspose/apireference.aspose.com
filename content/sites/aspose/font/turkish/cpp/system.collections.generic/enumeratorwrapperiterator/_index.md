---
title: "System::Collections::Generic::EnumeratorWrapperIterator sınıfı"
linktitle: "EnumeratorWrapperIterator"
second_title: "Aspose.Font için C++"
description: "System::Collections::Generic::EnumeratorWrapperIterator sınıfı. Önceden oluşturulmuş yineleyiciyi saran ve tüm çağrıları C++'ta ona yönlendiren yineleyici."
type: docs
weight: 1500
url: /tr/cpp/system.collections.generic/enumeratorwrapperiterator/
---
## EnumeratorWrapperIterator class


Iterator that wraps the pre-created enumerator and redirects all calls into it.

```cpp
template<typename Element>class EnumeratorWrapperIterator : public System::Details::VirtualizedIteratorBase<Element>
```


| Parametre | Açıklama |
| --- | --- |
| Element | Eleman tipi. |
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [CloneIterator](./cloneiterator/)() const override | Mevcut yineleyiciyi klonlar. |
| [EnumeratorWrapperIterator](./enumeratorwrapperiterator/)(const SharedPtr\<IEnumerator\<Element\>\>\&) |  |
| [IncrementIterator](./incrementiterator/)() override | Yineleyiciyi bir adım ileri hareket ettirir. m_is_end ve m_pointer değerleri güncellenmelidir. |
| [IteratorEquals](./iteratorequals/)(System::Details::VirtualizedIteratorBase\<Element\> *) const override | İki yineleyicinin aynı öğeye işaret edip etmediğini kontrol eder. |
| virtual [~EnumeratorWrapperIterator](./~enumeratorwrapperiterator/)() | Yıkıcı. |

## Ayrıca Bakınız

* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)

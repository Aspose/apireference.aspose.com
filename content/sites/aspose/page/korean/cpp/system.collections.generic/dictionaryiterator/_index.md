---
title: "System::Collections::Generic::DictionaryIterator 클래스"
linktitle: "DictionaryIterator"
second_title: "C++용 Aspose.Page"
description: "System::Collections::Generic::DictionaryIterator 클래스. C++에서 KeyValuePair 표기법을 제공하는 사전 반복자."
type: docs
weight: 1200
url: /ko/cpp/system.collections.generic/dictionaryiterator/
---
## DictionaryIterator class


[Dictionary](../dictionary/) iterator that provides [KeyValuePair](../keyvaluepair/) notation.

```cpp
template<typename Dict>class DictionaryIterator : public System::Details::NativeIteratorWrapperBase<Dict::KeyValuePairType, Dict::map_t::const_iterator>,
                                                  private System::Details::IteratorPointerUpdater<Dict::KeyValuePairType, false>
```


| 매개변수 | 설명 |
| --- | --- |
| Dict | [Dictionary](../dictionary/) 클래스. |
## 메서드

| 메서드 | 설명 |
| --- | --- |
| [CloneIterator](./cloneiterator/)() const override | 현재 반복자를 복제합니다. |
| [DecrementIterator](./decrementiterator/)() override | 반복자를 한 단계 뒤로 이동합니다. |
| [DictionaryIterator](./dictionaryiterator/)(typename Dict::map_t::const_iterator\&&, typename Dict::map_t::const_iterator\&&) | 생성자. |
| [DictionaryIterator](./dictionaryiterator/)(const typename Dict::map_t::const_iterator\&, const typename Dict::map_t::const_iterator\&) | 생성자. |
| [DictionaryIterator](./dictionaryiterator/)(DictionaryIterator\&&) | 이동 생성자. |
| [IncrementIterator](./incrementiterator/)() override | 반복자를 한 단계 앞으로 이동합니다. |
| [ShiftIteratorBy](./shiftiteratorby/)(std::ptrdiff_t) override | 반복자를 지정된 단계 수만큼 이동합니다. |
| virtual [~DictionaryIterator](./~dictionaryiterator/)() | 소멸자. |

## 또 보기

* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)

---
title: "System::Collections::Generic::ValueIterator 클래스"
linktitle: "ValueIterator"
second_title: "C++용 Aspose.Page"
description: "System::Collections::Generic::ValueIterator 클래스. C++에서 값 접근을 제공하는 Dictionary 이터레이터입니다."
type: docs
weight: 4800
url: /ko/cpp/system.collections.generic/valueiterator/
---
## ValueIterator class


[Dictionary](../dictionary/) iterator that provides value access.

```cpp
template<typename Dict>class ValueIterator : public System::Details::NativeIteratorWrapperBase<Dict::map_t::mapped_type, Dict::map_t::const_iterator>,
                                             private System::Details::IteratorPointerUpdater<Dict::map_t::mapped_type, false>
```


| 매개변수 | 설명 |
| --- | --- |
| Dict | [Dictionary](../dictionary/) 클래스. |
## 메서드

| 메서드 | 설명 |
| --- | --- |
| [CloneIterator](./cloneiterator/)() const override | 현재 반복자를 복제합니다. |
| [DecrementIterator](./decrementiterator/)() override | 반복자를 한 단계 뒤로 이동합니다. |
| [IncrementIterator](./incrementiterator/)() override | 반복자를 한 단계 앞으로 이동합니다. |
| [ShiftIteratorBy](./shiftiteratorby/)(std::ptrdiff_t) override | 반복자를 지정된 단계 수만큼 이동합니다. |
| [ValueIterator](./valueiterator/)(typename Dict::map_t::const_iterator\&&, typename Dict::map_t::const_iterator\&&) | 생성자. |
| [ValueIterator](./valueiterator/)(const typename Dict::map_t::const_iterator\&, const typename Dict::map_t::const_iterator\&) | 생성자. |
| [ValueIterator](./valueiterator/)(ValueIterator\&&) | 이동 생성자. |
| virtual [~ValueIterator](./~valueiterator/)() | 소멸자. |

## 또 보기

* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)

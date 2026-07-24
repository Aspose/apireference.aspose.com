---
title: "System::Collections::Generic::EnumeratorWrapperIterator 클래스"
linktitle: "EnumeratorWrapperIterator"
second_title: "C++용 Aspose.Page"
description: "System::Collections::Generic::EnumeratorWrapperIterator 클래스. 미리 생성된 열거자를 래핑하고 모든 호출을 C++에서 해당 열거자로 전달하는 반복자입니다."
type: docs
weight: 1500
url: /ko/cpp/system.collections.generic/enumeratorwrapperiterator/
---
## EnumeratorWrapperIterator class


미리 생성된 열거자를 래핑하고 모든 호출을 해당 열거자로 전달하는 이터레이터입니다.

```cpp
template<typename Element>class EnumeratorWrapperIterator : public System::Details::VirtualizedIteratorBase<Element>
```


| 매개변수 | 설명 |
| --- | --- |
| Element | 요소 타입. |
## 메서드

| 메서드 | 설명 |
| --- | --- |
| [CloneIterator](./cloneiterator/)() const override | 현재 반복자를 복제합니다. |
| [EnumeratorWrapperIterator](./enumeratorwrapperiterator/)(const SharedPtr\<IEnumerator\<Element\>\>\&) |  |
| [IncrementIterator](./incrementiterator/)() override | 반복자를 한 단계 앞으로 이동합니다. m_is_end와 m_pointer를 업데이트해야 합니다. |
| [IteratorEquals](./iteratorequals/)(System::Details::VirtualizedIteratorBase\<Element\> *) const override | 두 반복자가 같은 항목을 가리키는지 확인합니다. |
| virtual [~EnumeratorWrapperIterator](./~enumeratorwrapperiterator/)() | 소멸자. |

## 또 보기

* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)

---
title: "System::Span 클래스"
linktitle: "Span"
second_title: "C++용 Aspose.Page"
description: "System::Span 클래스. C++에서 C++20의 std::span과 유사한 임의 메모리의 연속 영역을 나타냅니다."
type: docs
weight: 5700
url: /ko/cpp/system/span/
---
## Span class


C++20의 std::span과 유사한 임의 메모리의 연속 영역을 나타냅니다.

```cpp
template<typename T>class Span : public System::Details::SpanCore<T, Span<T>, Span<T>>
```


| 매개변수 | 설명 |
| --- | --- |
| T | Span에 포함된 요소의 유형입니다. 이 클래스는 연속된 객체 시퀀스를 타입 안전하게 다룰 수 있는 방법을 제공합니다. 배열, 스택 배열 또는 원시 포인터를 감싸면서 경계 검사를 유지하는 데 사용할 수 있습니다. [Span](./)은 가리키는 메모리를 소유하지 않으며, 기존 메모리에 대한 뷰일 뿐입니다. |
## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Clear](./clear/)() const | 모든 요소를 기본값으로 설정하여 Span의 내용을 지웁니다. |
| [Fill](./fill/)(const T\&) const | 지정된 값으로 Span을 채웁니다. |
| static [to_Span](./to_span/)(const typename BaseType::ArrayPtrT\&) | 배열을 [Span](./)으로 변환합니다. |

## 또 보기

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)

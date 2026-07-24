---
title: "System::ReadOnlySpan 클래스"
linktitle: "ReadOnlySpan"
second_title: "C++용 Aspose.Page"
description: "System::ReadOnlySpan 클래스. C++의 Span 클래스 내에서 사용하기 위한 전달입니다."
type: docs
weight: 5300
url: /ko/cpp/system/readonlyspan/
---
## ReadOnlySpan class


[Span](../span/) 클래스 내에서 사용하기 위한 전달입니다.

```cpp
template<typename T>class ReadOnlySpan : public System::Details::SpanCore<const T, ReadOnlySpan<T>, Span<T>>
```


| 매개변수 | 설명 |
| --- | --- |
| T | span 내 요소들의 타입입니다. 이 클래스는 읽기 전용 방식으로 연속된 객체 시퀀스를 타입 안전하게 작업할 수 있는 방법을 제공합니다. 배열, 스택 배열 또는 원시 포인터를 래핑하면서 경계 검사를 유지하는 데 사용할 수 있습니다. [ReadOnlySpan](./)은 가리키는 메모리를 소유하지 않으며, 기존 메모리에 대한 뷰일 뿐입니다. |
## 메서드

| 메서드 | 설명 |
| --- | --- |
| [ReadOnlySpan](./readonlyspan/)(const Span\<T\>\&) | 일반 span에서 읽기 전용 span을 생성합니다. |
| static [to_ReadOnlySpan](./to_readonlyspan/)(const typename BaseType::ArrayPtrT\&) | 배열을 [ReadOnlySpan](./)으로 변환합니다. |
## 비고


임의 메모리의 읽기 전용 연속 영역을 나타냅니다.

## 또 보기

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)

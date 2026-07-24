---
title: "System::Linq::IOrderedEnumerable 클래스"
linktitle: "IOrderedEnumerable"
second_title: "C++용 Aspose.Page"
description: "System::Linq::IOrderedEnumerable 클래스. C++에서 정렬된 시퀀스를 나타냅니다."
type: docs
weight: 300
url: /ko/cpp/system.linq/iorderedenumerable/
---
## IOrderedEnumerable class


정렬된 시퀀스를 나타냅니다.

```cpp
template<typename T>class IOrderedEnumerable : public System::Collections::Generic::IEnumerable<T>
```


| 매개변수 | 설명 |
| --- | --- |
| T | 시퀀스 요소들의 타입입니다. |
## 메서드

| 메서드 | 설명 |
| --- | --- |
| [GetEnumerator](./getenumerator/)() override | 열거자를 가져옵니다. |
| [IOrderedEnumerable](./iorderedenumerable/)(const System::SharedPtr\<System::Collections::Generic::IEnumerable\<T\>\>\&, const Comparator\&) |  |
| [LINQ_ThenBy](./linq_thenby/)(const Func\<T, Key\>\&) | 키에 따라 시퀀스의 요소들을 오름차순으로 추가 정렬합니다. |
| [LINQ_ThenBy](./linq_thenby/)(const Func\<Source, Key\>\&) |  |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [Comparator](./comparator/) | RTTI 정보. |

## 또 보기

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Linq](../)
* Library [Aspose.Page for C++](../../)

---
title: "System::Collections::Generic::IEnumerable::LINQ_FirstOrDefault 메서드"
linktitle: "LINQ_FirstOrDefault"
second_title: "C++용 Aspose.Page"
description: "System::Collections::Generic::IEnumerable::LINQ_FirstOrDefault 메서드. C++에서 시퀀스의 첫 번째 요소를 반환하거나, 시퀀스가 비어 있을 경우 기본값을 반환합니다."
type: docs
weight: 1600
url: /ko/cpp/system.collections.generic/ienumerable/linq_firstordefault/
---
## IEnumerable::LINQ_FirstOrDefault() method


시퀀스의 첫 번째 요소를 반환하거나, 시퀀스가 비어 있으면 기본값을 반환합니다.

```cpp
T System::Collections::Generic::IEnumerable<T>::LINQ_FirstOrDefault()
```


### ReturnValue

시퀀스의 첫 번째 요소 또는 시퀀스가 비어 있을 경우 기본 생성된 값.

## 또 보기

* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## IEnumerable::LINQ_FirstOrDefault(std::function\<bool(T)>) method


시퀀스에서 조건을 만족하는 첫 번째 요소를 반환하거나, 해당 요소가 없으면 기본값을 반환합니다.

```cpp
T System::Collections::Generic::IEnumerable<T>::LINQ_FirstOrDefault(std::function<bool(T)> predicate)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 프레디케이트 | std::function\<bool(T)> | 조건을 테스트하기 위한 각 요소에 대한 함수. |

### ReturnValue

소스가 비어 있거나 predicate에 의해 지정된 테스트를 통과하는 요소가 없을 경우 default(T); 그렇지 않으면 predicate에 의해 지정된 테스트를 통과하는 소스의 첫 번째 요소.

## 또 보기

* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)

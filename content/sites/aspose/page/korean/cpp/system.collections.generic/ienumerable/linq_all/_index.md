---
title: "System::Collections::Generic::IEnumerable::LINQ_All method"
linktitle: "LINQ_All"
second_title: "C++용 Aspose.Page"
description: "System::Collections::Generic::IEnumerable::LINQ_All method. C++에서 시퀀스의 모든 요소가 조건을 만족하는지 확인합니다."
type: docs
weight: 700
url: /ko/cpp/system.collections.generic/ienumerable/linq_all/
---
## IEnumerable::LINQ_All method


시퀀스의 모든 요소가 조건을 만족하는지 확인합니다.

```cpp
bool System::Collections::Generic::IEnumerable<T>::LINQ_All(std::function<bool(T)> predicate)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 프레디케이트 | std::function\<bool(T)> | 조건을 테스트하기 위한 각 요소에 대한 함수. |

### ReturnValue

지정된 프레디케이트에서 테스트를 통과하면 소스 시퀀스의 모든 요소가 true이고, 시퀀스가 비어 있으면 true; 그렇지 않으면 false.

## 또 보기

* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)

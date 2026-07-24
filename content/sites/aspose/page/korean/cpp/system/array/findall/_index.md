---
title: "System::Array::FindAll method"
linktitle: "FindAll"
second_title: "C++용 Aspose.Page"
description: "System::Array::FindAll method. C++에서 지정된 프레디케이트에 의해 정의된 조건과 일치하는 모든 요소를 검색합니다."
type: docs
weight: 5200
url: /ko/cpp/system/array/findall/
---
## Array::FindAll method


지정된 술어에 정의된 조건과 일치하는 모든 요소를 검색합니다.

```cpp
static System::ArrayPtr<T> System::Array<T>::FindAll(System::ArrayPtr<T> arr, System::Predicate<T> match)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| arr | System::ArrayPtr\<T\> | [Array](../)에서 요소를 검색하기 위해 |
| 일치 | System::Predicate\<T\> | 배열 요소와 일치시키기 위한 조건을 정의하는 프레디케이트 |

### ReturnValue

지정된 프레디케이트에 의해 정의된 조건과 일치하는 모든 요소를 포함하는 [Array](../)이며, 찾지 못하면 빈 [Array](../)입니다.

## 또 보기

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [Predicate](../../predicate/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)

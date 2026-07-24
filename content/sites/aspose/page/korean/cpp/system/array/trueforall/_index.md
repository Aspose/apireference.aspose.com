---
title: "System::Array::TrueForAll 메서드"
linktitle: "TrueForAll"
second_title: "C++용 Aspose.Page"
description: "System::Array::TrueForAll 메서드. 지정된 배열의 모든 요소가 지정된 프레디케이트가 정의한 조건을 만족하는지 C++에서 판단합니다."
type: docs
weight: 5900
url: /ko/cpp/system/array/trueforall/
---
## Array::TrueForAll method


지정된 배열의 모든 요소가 지정된 술어가 정의한 조건을 만족하는지 여부를 결정합니다.

```cpp
static bool System::Array<T>::TrueForAll(System::ArrayPtr<T> arr, System::Predicate<T> match)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| arr | System::ArrayPtr\<T\> | [Array](../) 요소를 조건에 맞추어 매칭합니다. |
| 일치 | System::Predicate\<T\> | 배열 요소와 일치시키기 위한 조건을 정의하는 프레디케이트 |

### ReturnValue

배열 arr의 모든 요소가 프레디케이트 match가 정의한 조건을 만족하면 true, 그렇지 않으면 false

## 또 보기

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [Predicate](../../predicate/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)

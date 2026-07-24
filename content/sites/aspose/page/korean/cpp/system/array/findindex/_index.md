---
title: "System::Array::FindIndex 메서드"
linktitle: "FindIndex"
second_title: "C++용 Aspose.Page"
description: "System::Array::FindIndex 메서드. 지정된 배열에서 지정된 프레디케이트 조건을 만족하는 첫 번째 요소를 C++에서 검색합니다."
type: docs
weight: 5300
url: /ko/cpp/system/array/findindex/
---
## Array::FindIndex method


지정된 배열에서 지정된 술어의 조건을 만족하는 첫 번째 요소를 검색합니다.

```cpp
static int System::Array<T>::FindIndex(System::ArrayPtr<T> arr, System::Predicate<T> match)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| arr | System::ArrayPtr\<T\> | 요소를 검색할 [Array](../) |
| 일치 | System::Predicate\<T\> | 배열 요소와 일치시키기 위한 조건을 정의하는 프레디케이트 |

### ReturnValue

프레디케이트가 정의한 조건을 만족하는 배열 내 첫 번째 요소의 인덱스, 만족하지 않으면 -1

## 또 보기

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [Predicate](../../predicate/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)

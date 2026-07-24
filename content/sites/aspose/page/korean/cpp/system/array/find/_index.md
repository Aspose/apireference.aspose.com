---
title: "System::Array::Find 메서드"
linktitle: "찾기"
second_title: "C++용 Aspose.Page"
description: "System::Array::Find 메서드. C++에서 지정된 배열에서 지정된 프레디케이트 조건을 만족하는 첫 번째 요소를 검색합니다."
type: docs
weight: 5100
url: /ko/cpp/system/array/find/
---
## Array::Find method


지정된 배열에서 지정된 술어의 조건을 만족하는 첫 번째 요소를 검색합니다.

```cpp
static T System::Array<T>::Find(System::ArrayPtr<T> arr, System::Predicate<T> match)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| arr | System::ArrayPtr\<T\> | 요소를 검색할 [Array](../) |
| 일치 | System::Predicate\<T\> | 배열 요소와 일치시키기 위한 조건을 정의하는 프레디케이트 |

### ReturnValue

프레디케이트에 의해 정의된 조건을 만족하는 배열의 첫 번째 요소를 복사하고, 그렇지 않으면 타입 T의 기본값을 반환합니다.

## 또 보기

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [Predicate](../../predicate/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)

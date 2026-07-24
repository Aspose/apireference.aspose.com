---
title: "System::Array::Exists 메서드"
linktitle: "Exists"
second_title: "C++용 Aspose.Page"
description: "System::Array::Exists 메서드. 지정된 Array 객체가 지정된 프레디케이트의 요구 사항을 만족하는 요소를 포함하고 있는지 판단합니다 (C++)."
type: docs
weight: 5000
url: /ko/cpp/system/array/exists/
---
## Array::Exists method


지정된 [Array](../) 객체가 지정된 프레디케이트의 요구 사항을 만족하는 요소를 포함하고 있는지 판단합니다.

```cpp
static bool System::Array<T>::Exists(ArrayPtr<T> arr, std::function<bool(T)> match)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| arr | ArrayPtr\<T\> | 요소를 찾을 배열 |
| 일치 | std::function\<bool(T)> | 요구 사항을 정의하고 요소가 이를 만족하는지 확인하는 함수 객체 |

### ReturnValue

**arr**이(가) **match**에 의해 정의된 요구 사항을 만족하는 요소를 포함하면 true

## 또 보기

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)

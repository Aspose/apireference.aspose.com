---
title: "System::Nullable::NullableBoolHelper method"
linktitle: "NullableBoolHelper"
second_title: "C++용 Aspose.Page"
description: "System::Nullable::NullableBoolHelper method. this와 other가 모두 null이 아닌지 확인하고, 그렇다면 람다를 호출하는 도우미 함수입니다. C++ 구현에서 사용됩니다."
type: docs
weight: 800
url: /ko/cpp/system/nullable/nullableboolhelper/
---
## Nullable::NullableBoolHelper method


이 객체와 **other**가 모두 null이 아닌지 확인하고, 그렇다면 람다를 호출하는 도우미 함수입니다. 구현에서 사용됩니다.

```cpp
template<typename T1> bool System::Nullable<T>::NullableBoolHelper(const T1 &other, const std::function<bool()> &f, bool default_if_both_are_null=false) const
```


| 매개변수 | 설명 |
| --- | --- |
| T1 | 다른 nullable 유형. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 기타 | const T1\& | 비교할 다른 nullable 값. |
| f | const std::function\<bool()>\& | 두 **this**와 **other**가 모두 null이 아닐 때 호출할 람다. |
| default_if_both_are_null | bool | 두 값이 모두 null일 경우 반환값. |

### ReturnValue

두 중 하나가 null이면 false; 두 값이 모두 null이면 **default_if_both_are_null**; 두 값이 모두 null이 아니면 **f** 호출 결과.

## 또 보기

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)

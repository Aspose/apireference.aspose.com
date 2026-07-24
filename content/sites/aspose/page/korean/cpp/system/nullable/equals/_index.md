---
title: "System::Nullable::Equals 메서드"
linktitle: "같음"
second_title: "C++용 Aspose.Page"
description: "System::Nullable::Equals 메서드. 현재 객체가 나타내는 값이 지정된 Nullable 객체가 나타내는 값과 C++에서 동일한지 판단합니다."
type: docs
weight: 200
url: /ko/cpp/system/nullable/equals/
---
## Nullable::Equals method


현재 객체가 나타내는 값이 지정된 [Nullable](../) 객체가 나타내는 값과 같은지 판단합니다.

```cpp
template<typename T1> std::enable_if<IsNullable<T1>::value, bool>::type System::Nullable<T>::Equals(const T1 &other) const
```


| 매개변수 | 설명 |
| --- | --- |
| T1 | 비교할 [Nullable](../) 객체의 기본 형식 |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| other | const T1\& | 비교할 [Nullable](../) 객체에 대한 상수 참조 |

### ReturnValue

현재 객체가 나타내는 값이 지정된 [Nullable](../) 객체가 나타내는 값과 같으면 true, 그렇지 않으면 false

## 또 보기

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)

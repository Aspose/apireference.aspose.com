---
title: "System::Nullable::operator&= 메서드"
linktitle: "operator&="
second_title: "C++용 Aspose.Page"
description: "System::Nullable::operator&= 메서드. 지정된 값을 오른쪽 인수로 사용하여 현재 객체가 나타내는 값에 operator&=()를 적용합니다 (C++)."
type: docs
weight: 1100
url: /ko/cpp/system/nullable/operator&=/
---
## Nullable::operator&= method


지정된 값을 오른쪽 인수로 사용하여 현재 객체가 나타내는 값에 [operator&=()](./)를 적용합니다.

```cpp
template<typename T1> std::enable_if<std::is_same<T1, bool>::value, Nullable<T>>::type System::Nullable<T>::operator&=(bool other)
```


| 매개변수 | 설명 |
| --- | --- |
| T1 | SFINAE가 작동하도록 하는 템플릿 매개변수입니다. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| other | bool | 현재 객체가 나타내는 값에 적용되는 [operator&=()](./)의 오른쪽 값으로 사용되는 부울 값입니다. |

### ReturnValue

self에 대한 참조입니다.

## 또 보기

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)

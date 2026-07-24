---
title: "System::Nullable::operator!= 메서드"
linktitle: "operator!="
second_title: "C++용 Aspose.Page"
description: "System::Nullable::operator!= 메서드. 현재 객체가 나타내는 값이 지정된 Nullable 객체가 나타내는 값과 C++에서 같지 않은지 판단합니다."
type: docs
weight: 1000
url: /ko/cpp/system/nullable/operator!=/
---
## Nullable::operator!=(const Nullable\<T1\>\&) const method


현재 객체가 나타내는 값이 지정된 [Nullable](../) 객체가 나타내는 값과 같지 않은지 여부를 결정합니다.

```cpp
template<typename T1> bool System::Nullable<T>::operator!=(const Nullable<T1> &other) const
```


| 매개변수 | 설명 |
| --- | --- |
| T1 | 비교할 [Nullable](../) 객체의 기본 형식 |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| other | const Nullable\<T1\>\& | 비교할 [Nullable](../) 객체에 대한 상수 참조 |

### ReturnValue

현재 객체가 나타내는 값이 지정된 [Nullable](../) 객체가 나타내는 값과 같지 않으면 true, 그렇지 않으면 false

## 또 보기

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator!=(const T1\&) const method


현재 객체가 나타내는 값이 지정된 값과 같지 않은지 판단합니다.

```cpp
template<typename T1> std::enable_if<!IsNullable<T1>::value, bool>::type System::Nullable<T>::operator!=(const T1 &other) const
```


| 매개변수 | 설명 |
| --- | --- |
| T1 | 비교할 값의 형식 |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 기타 | const T1\& | 비교할 값에 대한 상수 참조 |

### ReturnValue

현재 객체가 나타내는 값이 지정된 값과 같지 않으면 true, 그렇지 않으면 false

## 또 보기

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator!=(std::nullptr_t) const method


현재 객체가 나타내는 값이 null이 아닌지 판단합니다.

```cpp
bool System::Nullable<T>::operator!=(std::nullptr_t) const
```


### ReturnValue

현재 객체가 나타내는 값이 null이 아니면 true, 그렇지 않으면 false

## 또 보기

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)

---
title: "System::Nullable::operator= 메서드"
linktitle: "operator="
second_title: "C++용 Aspose.Page"
description: "System::Nullable::operator= 메서드. C++에서 객체가 현재 나타내는 값을 지정된 값으로 교체합니다."
type: docs
weight: 1800
url: /ko/cpp/system/nullable/operator=/
---
## Nullable::operator=(const Nullable\<T1\>\&) method


객체가 현재 나타내는 값을 지정된 값으로 교체합니다.

```cpp
template<typename T1> Nullable<T> & System::Nullable<T>::operator=(const Nullable<T1> &x)
```


| 매개변수 | 설명 |
| --- | --- |
| 그 | 현재 객체가 나타낼 새로운 값의 형식 |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| x | const Nullable\<T1\>\& | 현재 객체가 나타낼 새로운 값 |

### ReturnValue

self에 대한 참조

## 또 보기

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator=(const T1\&) method


객체가 현재 나타내는 값을 지정된 값으로 교체합니다.

```cpp
template<typename T1> std::enable_if<!IsNullable<T1>::value &&!std::is_null_pointer<T1>::value, Nullable<T> &>::type System::Nullable<T>::operator=(const T1 &x)
```


| 매개변수 | 설명 |
| --- | --- |
| 그 | 현재 객체가 나타낼 새로운 값의 형식 |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| x | const T1\& | 현재 객체가 나타낼 새로운 값 |

### ReturnValue

self에 대한 참조

## 또 보기

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator=(std::nullptr_t) method


현재 객체에 null을 할당합니다.

```cpp
template<typename T1,typename> Nullable<T> System::Nullable<T>::operator=(std::nullptr_t)
```


### ReturnValue

null 값을 나타내는 [Nullable](../) 객체.

## 또 보기

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)

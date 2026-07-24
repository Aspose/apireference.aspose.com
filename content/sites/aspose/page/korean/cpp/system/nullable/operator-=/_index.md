---
title: "System::Nullable::operator-= 메서드"
linktitle: "operator-="
second_title: "C++용 Aspose.Page"
description: "System::Nullable::operator-= 메서드. 지정된 Nullable 객체가 나타내는 값을 오른쪽 인수로 사용하여 현재 객체가 나타내는 값에 operator-=()를 적용합니다 (C++)."
type: docs
weight: 1500
url: /ko/cpp/system/nullable/operator-=/
---
## Nullable::operator-=(const Nullable\<T1\>\&) method


지정된 [Nullable](../) 객체가 나타내는 값을 오른쪽 인수로 사용하여 현재 객체가 나타내는 값에 [operator-=()](./)를 적용합니다.

```cpp
template<typename T1> Nullable<T> System::Nullable<T>::operator-=(const Nullable<T1> &other)
```


| 매개변수 | 설명 |
| --- | --- |
| T1 | 그 값이 [operator-=()](./)의 오른쪽 인수로 사용되는 [Nullable](../) 객체의 기본 형식입니다. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| other | const Nullable\<T1\>\& | 현재 객체가 나타내는 값에 적용되는 [operator-=()](./)의 오른쪽 인수로 사용되는 [Nullable](../) 객체의 값을 가리키는 상수 참조입니다. |

### ReturnValue

self에 대한 참조

## 또 보기

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator-=(const T1\&) method


지정된 값을 오른쪽 인수로 사용하여 현재 객체가 나타내는 값에 [operator-=()](./)를 적용합니다.

```cpp
template<typename T1,typename> std::enable_if<!IsNullable<T1>::value, Nullable<T>>::type System::Nullable<T>::operator-=(const T1 &other)
```


| 매개변수 | 설명 |
| --- | --- |
| T1 | [operator-=()](./)의 오른쪽 값으로 사용되는 값의 형식입니다. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| other | const T1\& | 현재 객체가 나타내는 값에 적용되는 [operator-=()](./)의 오른쪽 값으로 사용되는 값에 대한 상수 참조입니다. |

### ReturnValue

self에 대한 참조

## 또 보기

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator-=(T1) method


[Nullable](../) 클래스의 인스턴스를 반환하며, 이는 null 값을 나타냅니다.

```cpp
template<typename T1,typename> Nullable<T> System::Nullable<T>::operator-=(T1)
```

## 또 보기

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)

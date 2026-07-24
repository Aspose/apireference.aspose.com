---
title: "System::Nullable::operator< method"
linktitle: "operator<"
second_title: "C++용 Aspose.Page"
description: "System::Nullable::operator< method. 현재 객체가 나타내는 값이 지정된 Nullable 객체가 나타내는 값보다 작은지, 이 값들에 operator<()를 적용하여 C++에서 판단합니다."
type: docs
weight: 1600
url: /ko/cpp/system/nullable/operator_/
---
## Nullable::operator<(const Nullable\<T1\>\&) const method


현재 객체가 나타내는 값이 지정된 [Nullable](../) 객체가 나타내는 값보다 작은지, 이 값들에 [operator<()](./)를 적용하여 판단합니다.

```cpp
template<typename T1> bool System::Nullable<T>::operator<(const Nullable<T1> &other) const
```


| 매개변수 | 설명 |
| --- | --- |
| T1 | 비교할 [Nullable](../) 객체의 기본 형식 |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| other | const Nullable\<T1\>\& | 비교할 [Nullable](../) 객체에 대한 상수 참조 |

### ReturnValue

현재 객체가 나타내는 값이 지정된 [Nullable](../) 객체보다 작으면 true, 그렇지 않으면 - false

## 또 보기

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator<(const T1\&) const method


현재 객체가 나타내는 값이 지정된 값보다 작은지, 이 값들에 [operator<()](./)를 적용하여 판단합니다.

```cpp
template<typename T1> std::enable_if<!IsNullable<T1>::value, bool>::type System::Nullable<T>::operator<(const T1 &other) const
```


| 매개변수 | 설명 |
| --- | --- |
| T1 | 비교할 값의 형식 |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 기타 | const T1\& | 비교할 값에 대한 상수 참조 |

### ReturnValue

현재 객체가 나타내는 값이 지정된 값보다 작으면 true, 그렇지 않으면 - false

## 또 보기

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator<(std::nullptr_t) const method


항상 false를 반환합니다.

```cpp
bool System::Nullable<T>::operator<(std::nullptr_t) const
```

## 또 보기

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
---
제목: System::Nullable::operator> method
링크제목: operator>
second_title: Aspose.Page for C++
설명: 'System::Nullable::operator> method. 현재 객체가 나타내는 값이 지정된 Nullable 객체가 나타내는 값보다 큰지, 이 값들에 operator>()를 적용하여 C++에서 판단합니다.'
type: docs
가중치: 2000
URL: /cpp/system/nullable/operator_/
---
## Nullable::operator>(const Nullable\<T1\>\&) const method


현재 객체가 나타내는 값이 지정된 [Nullable](../) 객체가 나타내는 값보다 큰지, 이 값들에 [operator>()](./)를 적용하여 판단합니다.

```cpp
template<typename T1> bool System::Nullable<T>::operator>(const Nullable<T1> &other) const
```


| 매개변수 | 설명 |
| --- | --- |
| T1 | 비교할 [Nullable](../) 객체의 기본 형식 |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| other | const Nullable\<T1\>\& | 비교할 [Nullable](../) 객체에 대한 상수 참조 |

### ReturnValue

현재 객체가 나타내는 값이 지정된 [Nullable](../) 객체보다 크면 true, 그렇지 않으면 - false

## 또 보기

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator>(const T1\&) const method


현재 객체가 나타내는 값이 지정된 값보다 큰지, 이 값들에 [operator>()](./)를 적용하여 판단합니다.

```cpp
template<typename T1> std::enable_if<!IsNullable<T1>::value, bool>::type System::Nullable<T>::operator>(const T1 &other) const
```


| 매개변수 | 설명 |
| --- | --- |
| T1 | 비교할 값의 형식 |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 기타 | const T1\& | 비교할 값에 대한 상수 참조 |

### ReturnValue

현재 객체가 나타내는 값이 지정된 값보다 크면 true, 그렇지 않으면 false

## 또 보기

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator>(std::nullptr_t) const method


항상 false를 반환합니다.

```cpp
bool System::Nullable<T>::operator>(std::nullptr_t) const
```

## 또 보기

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)

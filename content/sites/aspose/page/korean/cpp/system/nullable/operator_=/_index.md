---
title: "System::Nullable::operator<= 메서드"
linktitle: "operator<="
second_title: "C++용 Aspose.Page"
description: "System::Nullable::operator<= 메서드. C++에서 operator<=()를 적용하여 현재 객체가 나타내는 값이 지정된 Nullable 객체가 나타내는 값보다 작거나 같은지 여부를 결정합니다."
type: docs
weight: 1700
url: /ko/cpp/system/nullable/operator_=/
---
## Nullable::operator<=(const Nullable\<T1\>\&) const method


현재 객체가 나타내는 값이 지정된 [Nullable](../) 객체가 나타내는 값보다 작거나 같은지, [operator<=()](./)를 적용하여 결정합니다.

```cpp
template<typename T1> bool System::Nullable<T>::operator<=(const Nullable<T1> &other) const
```


| 매개변수 | 설명 |
| --- | --- |
| T1 | 비교할 [Nullable](../) 객체의 기본 형식 |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| other | const Nullable\<T1\>\& | 비교할 [Nullable](../) 객체에 대한 상수 참조 |

### ReturnValue

현재 객체가 나타내는 값이 지정된 [Nullable](../) 객체가 나타내는 값보다 작거나 같으면 true, 그렇지 않으면 false

## 또 보기

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator<=(const T1\&) const method


현재 객체가 나타내는 값이 지정된 값보다 작거나 같은지, [operator<=()](./)를 적용하여 결정합니다.

```cpp
template<typename T1> std::enable_if<!IsNullable<T1>::value, bool>::type System::Nullable<T>::operator<=(const T1 &other) const
```


| 매개변수 | 설명 |
| --- | --- |
| T1 | 비교할 값의 형식 |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 기타 | const T1\& | 비교할 값에 대한 상수 참조 |

### ReturnValue

현재 객체가 나타내는 값이 지정된 값보다 작거나 같으면 true, 그렇지 않으면 false

## 또 보기

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator<=(std::nullptr_t) const method


항상 false를 반환합니다.

```cpp
bool System::Nullable<T>::operator<=(std::nullptr_t) const
```

## 또 보기

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
---
title: System::Nullable::operator>= 메서드
linktitle: operator>=
second_title: Aspose.Page for C++
description: 'System::Nullable::operator>= 메서드. C++에서 operator>=()를 적용하여 현재 객체가 나타내는 값이 지정된 Nullable 객체가 나타내는 값보다 크거나 같은지 여부를 결정합니다.'
type: docs
weight: 2100
url: /cpp/system/nullable/operator_=/
---
## Nullable::operator>=(const Nullable\<T1\>\&) const method


현재 객체가 나타내는 값이 지정된 [Nullable](../) 객체가 나타내는 값보다 크거나 같은지, [operator>=()](./)를 적용하여 결정합니다.

```cpp
template<typename T1> bool System::Nullable<T>::operator>=(const Nullable<T1> &other) const
```


| 매개변수 | 설명 |
| --- | --- |
| T1 | 비교할 [Nullable](../) 객체의 기본 형식 |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| other | const Nullable\<T1\>\& | 비교할 [Nullable](../) 객체에 대한 상수 참조 |

### ReturnValue

현재 객체가 나타내는 값이 지정된 [Nullable](../) 객체가 나타내는 값보다 크거나 같으면 True, 그렇지 않으면 false

## 또 보기

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator>=(const T1\&) const method


현재 객체가 나타내는 값에 [operator>=()](./)을 적용하여 지정된 객체가 나타내는 값보다 크거나 같은지 판단합니다.

```cpp
template<typename T1> std::enable_if<!IsNullable<T1>::value, bool>::type System::Nullable<T>::operator>=(const T1 &other) const
```


| 매개변수 | 설명 |
| --- | --- |
| T1 | 현재 객체가 나타내는 값과 비교할 값의 기본 형식 |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 기타 | const T1\& | 현재 객체와 비교할 객체에 대한 상수 참조 |

### ReturnValue

현재 객체가 나타내는 값이 지정된 객체가 나타내는 값보다 크거나 같으면 True, 그렇지 않으면 false

## 또 보기

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator>=(std::nullptr_t) const method


항상 false를 반환합니다.

```cpp
bool System::Nullable<T>::operator>=(std::nullptr_t) const
```


### ReturnValue

항상 - false

## 또 보기

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
---
title: System::Nullable::operator|= 메서드
링크제목: operator|=
second_title: Aspose.Page for C++
description: 'System::Nullable::operator|= 메서드. 지정된 값을 오른쪽 인수로 사용하여 현재 객체가 나타내는 값에 operator|=()을 적용합니다 (C++).'
type: docs
가중치: 2200
url: /cpp/system/nullable/operator_=/
---
## Nullable::operator|= method


지정된 값을 오른쪽 인수로 사용하여 현재 객체가 나타내는 값에 [operator|=()](./)을 적용합니다.

```cpp
template<typename T1> std::enable_if<std::is_same<T1, bool>::value, Nullable<T>>::type System::Nullable<T>::operator|=(bool other)
```


| 매개변수 | 설명 |
| --- | --- |
| T1 | SFINAE가 작동하도록 하는 템플릿 매개변수입니다. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 기타 | bool | 오른쪽 값으로 사용되는 부울 값 [operator | =()](./) 현재 객체가 나타내는 값에 적용됩니다. |

### ReturnValue

self에 대한 참조입니다.

## 또 보기

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)

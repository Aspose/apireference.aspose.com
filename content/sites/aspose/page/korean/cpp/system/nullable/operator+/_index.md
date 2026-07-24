---
title: "System::Nullable::operator+ 메서드"
linktitle: "operator+"
second_title: "C++용 Aspose.Page"
description: "System::Nullable::operator+ 메서드. C++에서 nullable 값을 합칩니다."
type: docs
weight: 1200
url: /ko/cpp/system/nullable/operator+/
---
## Nullable::operator+(const Nullable\<T1\>\&) const method


nullable 값을 합산합니다.

```cpp
template<typename T1> System::Nullable<decltype(get_Value()+other.get_Value())> System::Nullable<T>::operator+(const Nullable<T1> &other) const
```


| 매개변수 | 설명 |
| --- | --- |
| T1 | 오른쪽 피연산자 타입. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 기타 | const Nullable\<T1\>\& | 더할 값. |

### ReturnValue

합산 결과.

## 또 보기

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator+(const T1\&) const method


nullable 값과 non-nullable 값을 합산합니다.

```cpp
template<typename T1,typename> Nullable<decltype(get_Value()+other)> System::Nullable<T>::operator+(const T1 &other) const
```


| 매개변수 | 설명 |
| --- | --- |
| T1 | 오른쪽 피연산자 타입. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 기타 | const T1\& | 더할 값. |

### ReturnValue

합산 결과.

## 또 보기

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator+(std::nullptr_t) const method


Nullable<T> 클래스의 기본 생성된 인스턴스를 반환합니다.

```cpp
Nullable<T> System::Nullable<T>::operator+(std::nullptr_t) const
```

## 또 보기

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)

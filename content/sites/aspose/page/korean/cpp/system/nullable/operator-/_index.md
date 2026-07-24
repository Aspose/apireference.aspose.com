---
title: "System::Nullable::operator- 메서드"
linktitle: "operator-"
second_title: "C++용 Aspose.Page"
description: "System::Nullable::operator- 메서드. C++에서 nullable 값을 빼습니다."
type: docs
weight: 1400
url: /ko/cpp/system/nullable/operator-/
---
## Nullable::operator-(const Nullable\<T1\>\&) const method


nullable 값을 뺍니다.

```cpp
template<typename T1> System::Nullable<decltype(get_Value() - other.get_Value())> System::Nullable<T>::operator-(const Nullable<T1> &other) const
```


| 매개변수 | 설명 |
| --- | --- |
| T1 | 오른쪽 피연산자 타입. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 기타 | const Nullable\<T1\>\& | 뺄 값. |

### ReturnValue

뺄셈 결과.

## 또 보기

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator-(const T1\&) const method


nullable 값과 non-nullable 값을 뺍니다.

```cpp
template<typename T1,typename> Nullable<decltype(get_Value() - other)> System::Nullable<T>::operator-(const T1 &other) const
```


| 매개변수 | 설명 |
| --- | --- |
| T1 | 오른쪽 피연산자 타입. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 기타 | const T1\& | 뺄 값. |

### ReturnValue

뺄셈 결과.

## 또 보기

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator-(T1) const method


nullable 값과 null을 가리키는 값을 뺍니다.

```cpp
template<typename T1,typename> Nullable<T> System::Nullable<T>::operator-(T1) const
```


| 매개변수 | 설명 |
| --- | --- |
| T1 | 오른쪽 피연산자 타입, nullptr_t여야 합니다. |

### ReturnValue

빈 [Nullable](../) 객체.

## 또 보기

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)

---
title: "System::String::operator+ 메서드"
linktitle: "operator+"
second_title: "C++용 Aspose.Page"
description: "System::String::operator+ 메서드. C++에서 문자열 끝에 문자를 추가합니다."
type: docs
weight: 2800
url: /ko/cpp/system/string/operator+/
---
## String::operator+(char_t) const method


문자열 끝에 문자를 추가합니다.

```cpp
String System::String::operator+(char_t x) const
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| x | char_t | 추가할 문자. |

### ReturnValue

[String](../) concatenation result.

## 또 보기

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::operator+(const String\&) const method


[String](../) concatenation operator.

```cpp
String System::String::operator+(const String &str) const
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| str | const String\& | [String](../)을 현재 문자열 끝에 추가합니다. |

### ReturnValue

연결된 문자열.

## 또 보기

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::operator+(const T\&) const method


[String](../) concatenation with string literal or character string pointer.

```cpp
template<typename T,std::enable_if_t< IsStringLiteral< T, char_t >::value > *> String System::String::operator+(const T &arg) const
```


| 매개변수 | 설명 |
| --- | --- |
| T | 문자열 리터럴 또는 문자 문자열 포인터 형태 중 하나. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| arg | const T\& | 현재 문자열에 연결할 엔터티. |

### ReturnValue

연결된 문자열.

## 또 보기

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::operator+(const T\&) const method


문자열 끝에 참조 형식 객체의 문자열 표현을 추가합니다.

```cpp
template<typename T,std::enable_if_t< IsSmartPtr< T >::value > *> String System::String::operator+(const T &value) const
```


| 매개변수 | 설명 |
| --- | --- |
| T | 포인터 타입. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | const T\& | [Object](../../object/)를 [ToString()](../tostring/) 호출을 사용해 문자열로 변환하고 현재 문자열에 추가합니다. |

### ReturnValue

[String](../) concatenation result.

## 또 보기

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::operator+(const T\&) const method


값 형식 객체의 문자열 표현을 문자열 끝에 추가합니다.

```cpp
template<typename T,std::enable_if_t<!IsSmartPtr< T >::value &&!std::is_scalar< T >::value &&!std::is_array< T >::value > *> String System::String::operator+(const T &value) const
```


| 매개변수 | 설명 |
| --- | --- |
| T | 값 형식에 대해 [ToString()](../tostring/)을 호출합니다. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | const T\& | [Object](../../object/)를 [ToString()](../tostring/) 호출을 사용해 문자열로 변환하고 현재 문자열에 추가합니다. |

### ReturnValue

[String](../) concatenation result.

## 또 보기

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::operator+(double) const method


문자열 끝에 부동 소수점 값의 문자열 표현을 추가합니다.

```cpp
String System::String::operator+(double d) const
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| d | double | 문자열로 변환하고 추가할 값입니다. |

### ReturnValue

[String](../) concatenation result.

## 또 보기

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::operator+(int) const method


문자열 끝에 정수 값의 문자열 표현을 추가합니다.

```cpp
String System::String::operator+(int i) const
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| i | int | 문자열로 변환하고 추가할 정수 값입니다. |

### ReturnValue

[String](../) concatenation result.

## 또 보기

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::operator+(int64_t) const method


문자열 끝에 정수 값의 문자열 표현을 추가합니다.

```cpp
String System::String::operator+(int64_t v) const
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| v | int64_t | 문자열로 변환하고 추가할 값을 추가합니다. |

### ReturnValue

[String](../) concatenation result.

## 또 보기

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::operator+(T) const method


문자열 끝에 불리언 값의 문자열 표현을 추가합니다.

```cpp
template<typename T,std::enable_if_t< std::is_same< T, bool >::value > *> String System::String::operator+(T arg) const
```


| 매개변수 | 설명 |
| --- | --- |
| T | 문자열과 연결할 값 형식. bool이어야 합니다. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| arg | T | [Boolean](../../boolean/) 값을 문자열로 변환하고 추가합니다. |

### ReturnValue

[String](../) concatenation result.

## 또 보기

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::operator+(uint32_t) const method


문자열 끝에 부호 없는 정수 값의 문자열 표현을 추가합니다.

```cpp
String System::String::operator+(uint32_t i) const
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| i | uint32_t | 문자열로 변환하고 추가할 값입니다. |

### ReturnValue

[String](../) concatenation result.

## 또 보기

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)

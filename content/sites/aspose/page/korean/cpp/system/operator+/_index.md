---
title: "System::operator+ 메서드"
linktitle: "operator+"
second_title: "C++용 Aspose.Page"
description: "System::operator+ 메서드. C++에서 문자열 연결."
type: docs
weight: 27500
url: /ko/cpp/system/operator+/
---
## System::operator+(const char_t, const String\&) method


[String](../string/) concatenation.

```cpp
String System::operator+(const char_t left, const String &right)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 왼쪽 | const char_t | 문자열에 연결할 문자. |
| right | const String\& | [String](../string/)에 연결. |

### ReturnValue

연결된 문자열.

## 또 보기

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator+(const T\&, const Decimal\&) method


지정된 값과 지정된 [Decimal](../decimal/) 객체가 나타내는 값의 합을 나타내는 새로운 [Decimal](../decimal/) 클래스 인스턴스를 반환합니다.

```cpp
template<typename T,typename _> Decimal System::operator+(const T &x, const Decimal &d)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| x | const T\& | 첫 번째 피연산자 |
| d | const Decimal\& | 두 번째 피연산자를 나타내는 [Decimal](../decimal/) 객체에 대한 상수 참조 |

### ReturnValue

새로운 [Decimal](../decimal/) 클래스 인스턴스로, **x**의 합과 **d**가 나타내는 값을 합한 값을 나타냅니다.

## 또 보기

* Class [Decimal](../decimal/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator+(const T1\&, const Nullable\<T2\>\&) method


null이 아닌 값과 nullable 값을 합산합니다.

```cpp
template<typename T1,typename T2,typename> System::Nullable<decltype(some+other.get_Value())> System::operator+(const T1 &some, const Nullable<T2> &other)
```


| 매개변수 | 설명 |
| --- | --- |
| T1 | 왼쪽 피연산자 타입. |
| T2 | 오른쪽 피연산자 타입. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 일부 | const T1\& | 왼쪽 피연산자. |
| 기타 | const Nullable\<T2\>\& | 오른쪽 피연산자. |

### ReturnValue

합산 결과.

## 또 보기

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator+(MulticastDelegate\<T\>, MulticastDelegate\<T\>) method


오른쪽 대리자의 모든 콜백을 왼쪽 대리자 콜백 목록의 끝까지 연결합니다.

```cpp
template<typename T> MulticastDelegate<T> System::operator+(MulticastDelegate<T> lhv, MulticastDelegate<T> rhv)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| lhv | MulticastDelegate\<T\> | 콜백이 추가되는 대리자입니다. |
| rhv | MulticastDelegate\<T\> | 콜백이 추가되고 있는 대리자입니다. |

### ReturnValue

왼쪽 값의 콜백을 포함하고 그 다음에 오른쪽 콜백을 포함하는 대리자를 반환합니다.

## 또 보기

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator+(T\&, const String\&) method


[String](../string/) concatenation.

```cpp
template<typename T> std::enable_if<IsStringLiteral<T, char_t>::value, String>::type System::operator+(T &left, const String &right)
```


| 매개변수 | 설명 |
| --- | --- |
| T | [String](../string/) 리터럴 유형. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 왼쪽 | T\& | 문자열에 연결할 리터럴입니다. |
| right | const String\& | [String](../string/)에 연결. |

### ReturnValue

연결된 문자열.

## 또 보기

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator+(T\&, const String\&) method


[String](../string/) concatenation.

```cpp
template<typename T> std::enable_if<IsStringPointer<T, char_t>::value, String>::type System::operator+(T &left, const String &right)
```


| 매개변수 | 설명 |
| --- | --- |
| T | [String](../string/) 포인터 유형. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| left | T\& | [String](../string/) 문자열에 연결할 포인터입니다. |
| right | const String\& | [String](../string/)에 연결. |

### ReturnValue

연결된 문자열.

## 또 보기

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)

---
title: "System::operator!= 메서드"
linktitle: "operator!="
second_title: "C++용 Aspose.Page"
description: "C++에서 클래스의 operator!= 메서드를 사용하는 방법."
type: docs
weight: 25800
url: /ko/cpp/system/operator!=/
---
## System::operator!=(ArraySegment\<T\>, ArraySegment\<T\>) method




```cpp
template<typename T> bool System::operator!=(ArraySegment<T> a, ArraySegment<T> b)
```

## 또 보기

* Class [ArraySegment](../arraysegment/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator!=(Chars\&, const String\&) method


[String](../string/) comparison.

```cpp
template<class Chars,typename std::enable_if< IsStringLiteral< Chars, char_t >::value >::type *> bool System::operator!=(Chars &left, const String &right)
```


| 매개변수 | 설명 |
| --- | --- |
| Chars | [String](../string/) 리터럴 유형. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| left | Chars\& | [String](../string/) 비교용 리터럴. |
| right | const String\& | [String](../string/) 비교할. |

### ReturnValue

문자열이 일치하면 false, 그렇지 않으면 true.

## 또 보기

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator!=(const SharedPtr\<Object\>\&, const String\&) method


[Object](../object/) and string comparison.

```cpp
bool System::operator!=(const SharedPtr<Object> &left, const String &right)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| left | const SharedPtr\<Object\>\& | [Object](../object/)을 문자열로 변환하고 비교합니다. |
| right | const String\& | [String](../string/) 비교할. |

### ReturnValue

객체 문자열 표현이 문자열과 같으면 false, 그렇지 않으면 true.

## 또 보기

* Typedef [SharedPtr](../sharedptr/)
* Class [Object](../object/)
* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator!=(const SharedPtr\<Uri\>\&, const SharedPtr\<Uri\>\&) method


현재 및 지정된 객체가 나타내는 URI가 같지 않은지 여부를 결정합니다.

```cpp
bool System::operator!=(const SharedPtr<Uri> &uri1, const SharedPtr<Uri> &uri2)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| uri1 | const SharedPtr\<Uri\>\& | 비교할 첫 번째 [Uri](../uri/) 객체 |
| uri2 | const SharedPtr\<Uri\>\& | 비교할 두 번째 [Uri](../uri/) 객체 |

### ReturnValue

URI가 같지 않으면 true, 그렇지 않으면 false

## 또 보기

* Typedef [SharedPtr](../sharedptr/)
* Class [Uri](../uri/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator!=(const SmartPtr\<X\>\&, const SmartPtr\<Y\>\&) method


두 스마트 포인터를 같지 않게 비교합니다.

```cpp
template<class X,class Y> bool System::operator!=(const SmartPtr<X> &x, const SmartPtr<Y> &y)
```


| 매개변수 | 설명 |
| --- | --- |
| X | 첫 번째 포인터의 pointee 타입. |
| Y | 두 번째 포인터의 pointee 타입. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| x | const SmartPtr\<X\>\& | 비교할 첫 번째 포인터. |
| y | const SmartPtr\<Y\>\& | 비교할 두 번째 포인터. |

### ReturnValue

포인터가 일치하면 False, 그렇지 않으면 true.

## 또 보기

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator!=(const SmartPtr\<X\>\&, const Y *) method


스마트 포인터와 단순 (C) 포인터의 부등 비교.

```cpp
template<class X,class Y> std::enable_if<std::is_base_of<Object, Y>::value &&detail::has_no_operator_equal<X, Y>::value, bool>::type System::operator!=(const SmartPtr<X> &x, const Y *y)
```


| 매개변수 | 설명 |
| --- | --- |
| X | 스마트 포인터의 타입. |
| Y | 단순 포인터의 타입. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| x | const SmartPtr\<X\>\& | 비교할 스마트 포인터 (왼쪽). |
| y | const Y * | 비교할 포인터 (오른쪽). |

### ReturnValue

포인터가 일치하면 False, 그렇지 않으면 true.

## 또 보기

* Class [Object](../object/)
* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator!=(const T1\&, const Nullable\<T2\>\&) method


지정된 값이 지정된 [Nullable](../nullable/) 객체가 나타내는 값과 같지 않은지, [operator!=()](./) 를 적용하여 판단합니다.

```cpp
template<typename T1,typename T2> std::enable_if<!IsNullable<T1>::value, bool>::type System::operator!=(const T1 &some, const Nullable<T2> &other)
```


| 매개변수 | 설명 |
| --- | --- |
| T1 | 첫 번째 비교 피연산자 값의 유형 |
| T2 | 두 번째 비교 피연산자 값을 나타내는 [Nullable](../nullable/) 객체의 기본 유형 |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 일부 | const T1\& | 첫 번째 비교 피연산자로 사용될 값에 대한 상수 참조 |
| other | const Nullable\<T2\>\& | 두 번째 비교 피연산자로 사용될 값을 나타내는 [Nullable](../nullable/) 객체에 대한 상수 참조 |

### ReturnValue

비교 피연산자가 같지 않으면 true, 그렇지 않으면 false

## 또 보기

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator!=(const X *, const SmartPtr\<Y\>\&) method


스마트 포인터와 일반 (C) 포인터 간의 동등성 비교.

```cpp
template<class X,class Y> std::enable_if<std::is_base_of<Object, X>::value &&detail::has_no_operator_equal<X, Y>::value, bool>::type System::operator!=(const X *x, const SmartPtr<Y> &y)
```


| 매개변수 | 설명 |
| --- | --- |
| X | 단순 포인터의 타입. |
| Y | 스마트 포인터의 타입. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| x | const X * | 비교할 포인터 (오른쪽). |
| y | const SmartPtr\<Y\>\& | 비교할 스마트 포인터 (왼쪽). |

### ReturnValue

포인터가 일치하면 False, 그렇지 않으면 true.

## 또 보기

* Class [Object](../object/)
* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator!=(SmartPtr\<X\> const\&, std::nullptr_t) method


스마트 포인터가 null이 아닌지 확인합니다.

```cpp
template<class X> bool System::operator!=(SmartPtr<X> const &x, std::nullptr_t)
```


| 매개변수 | 설명 |
| --- | --- |
| X | 포인터가 가리키는 타입. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| x | SmartPtr\<X\> const\& | 확인할 포인터. |

### ReturnValue

포인터가 null이면 false, 그렇지 않으면 true.

## 또 보기

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator!=(std::nullptr_t, const DateTimeOffset\&) method




```cpp
bool System::operator!=(std::nullptr_t, const DateTimeOffset &)
```

## 또 보기

* Class [DateTimeOffset](../datetimeoffset/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator!=(std::nullptr_t, const Nullable\<T\>\&) method


지정된 [Nullable](../nullable/) 객체가 null과 같지 않은 값을 나타내는지 판단합니다.

```cpp
template<typename T> bool System::operator!=(std::nullptr_t, const Nullable<T> &other)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| other | std::nullptr_t | 테스트할 [Nullable](../nullable/) 객체에 대한 상수 참조 |

### ReturnValue

지정된 객체가 null이 아닌 값을 나타내면 true, 그렇지 않으면 false

## 또 보기

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator!=(std::nullptr_t, const String\&) method


문자열이 null인지 확인합니다.

```cpp
bool System::operator!=(std::nullptr_t, const String &str)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| str | std::nullptr_t | 확인할 [String](../string/) |

### ReturnValue

문자열이 null이면 false, 그렇지 않으면 true

## 또 보기

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator!=(std::nullptr_t, DateTime) method




```cpp
bool System::operator!=(std::nullptr_t, DateTime)
```

## 또 보기

* Class [DateTime](../datetime/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator!=(std::nullptr_t, SmartPtr\<X\> const\&) method


스마트 포인터가 null이 아닌지 확인합니다.

```cpp
template<class X> bool System::operator!=(std::nullptr_t, SmartPtr<X> const &x)
```


| 매개변수 | 설명 |
| --- | --- |
| X | 포인터가 가리키는 타입. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| x | std::nullptr_t | 확인할 포인터. |

### ReturnValue

포인터가 null이면 false, 그렇지 않으면 true.

## 또 보기

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator!=(std::nullptr_t, TimeSpan) method




```cpp
bool System::operator!=(std::nullptr_t, TimeSpan)
```

## 또 보기

* Class [TimeSpan](../timespan/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator!=(T\&, const String\&) method


[String](../string/) comparison.

```cpp
template<class T,typename std::enable_if< IsStringPointer< T, char_t >::value >::type *> bool System::operator!=(T &left, const String &right)
```


| 매개변수 | 설명 |
| --- | --- |
| T | [String](../string/) 포인터 유형. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| left | T\& | [String](../string/) 비교용 포인터. |
| right | const String\& | [String](../string/) 비교할. |

### ReturnValue

문자열이 일치하면 false, 그렇지 않으면 true.

## 또 보기

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)

---
title: "System::ObjectExt::Unbox 메서드"
linktitle: "언박스"
second_title: "C++용 Aspose.Page"
description: "System::ObjectExt::Unbox 메서드. 객체로 변환한 후 값 타입을 언박스합니다. C++에서 enum 타입에 대한 구현입니다."
type: docs
weight: 1400
url: /ko/cpp/system/objectext/unbox/
---
## ObjectExt::Unbox(const SmartPtr\<Object\>\&) method


값 타입을 [Object](../../object/)로 변환한 후 언박스합니다. enum 타입에 대한 구현입니다.

```cpp
template<typename T> static std::enable_if<std::is_enum<T>::value, T>::type System::ObjectExt::Unbox(const SmartPtr<Object> &obj)
```


| 매개변수 | 설명 |
| --- | --- |
| T | [Enum](../../enum/) 타입. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/)를 언박스합니다. |

### ReturnValue

[Enum](../../enum/) value.

## 또 보기

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Unbox(const SmartPtr\<Object\>\&) method


값 타입을 [Object](../../object/)로 변환한 후 언박스합니다. 비 enum 및 비 nullable 타입에 대한 구현입니다.

```cpp
template<class T> static std::enable_if<!std::is_enum<T>::value &&detail::has_operator_equal<T>::value, T>::type System::ObjectExt::Unbox(const SmartPtr<Object> &obj)
```


| 매개변수 | 설명 |
| --- | --- |
| T | 값 형식. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/)를 언박스합니다. |

### ReturnValue

언박스된 값.

## 또 보기

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Unbox(const SmartPtr\<Object\>\&) method


값 타입을 [Object](../../object/)로 변환한 후 언박스합니다. 비 enum 및 비 nullable 타입에 대한 구현입니다.

```cpp
template<class T> static std::enable_if<!std::is_enum<T>::value &&!detail::has_operator_equal<T>::value, T>::type System::ObjectExt::Unbox(const SmartPtr<Object> &obj)
```


| 매개변수 | 설명 |
| --- | --- |
| T | 값 형식. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/)를 언박스합니다. |

### ReturnValue

언박스된 값.

## 또 보기

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Unbox(const SmartPtr\<Object\>\&) method


문자열 값을 언박싱합니다.

```cpp
String System::ObjectExt::Unbox(const SmartPtr<Object> &obj)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/)를 언박스합니다 |

### ReturnValue

[String](../../string/) representation of boxed string, can be null if boxed string was null.

## 또 보기

* Class [String](../../string/)
* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Unbox(E) method


enum 유형을 정수로 언박싱합니다.

```cpp
template<class T,class E> static std::enable_if<std::is_enum<E>::value &&std::numeric_limits<T>::is_integer, T>::type System::ObjectExt::Unbox(E e)
```


| 매개변수 | 설명 |
| --- | --- |
| T | 대상 정수 타입. |
| E | 원본 enum 타입. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| e | E | 언박싱할 값. |

### ReturnValue

열거형의 정수 표현.

## 또 보기

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Unbox(E) method


enum 유형을 변환합니다.

```cpp
template<class T,class E> static std::enable_if<std::is_enum<E>::value &&std::is_enum<T>::value, T>::type System::ObjectExt::Unbox(E e)
```


| 매개변수 | 설명 |
| --- | --- |
| T | 대상 열거형 타입. |
| E | 원본 enum 타입. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| e | E | 언박싱할 값. |

### ReturnValue

변환된 열거형 값.

## 또 보기

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)

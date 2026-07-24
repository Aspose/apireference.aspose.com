---
title: "System::ObjectExt::ToString 메서드"
linktitle: "ToString"
second_title: "C++용 Aspose.Page"
description: "System::ObjectExt::ToString 메서드. C# ToString 메서드의 대체로, C++에서 모든 C++ 타입에 대해 작동합니다."
type: docs
weight: 1300
url: /ko/cpp/system/objectext/tostring/
---
## ObjectExt::ToString(const char_t *) method


C# ToString 메서드의 대체 구현으로, 모든 C++ 유형에서 작동하도록 합니다.

```cpp
static String System::ObjectExt::ToString(const char_t *obj)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| obj | const char_t * | [String](../../string/) 리터럴을 문자열로 변환합니다. |

### ReturnValue

[String](../../string/) representation of **obj**.

## 또 보기

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ToString(const Nullable\<T\>\&) method


C# ToString 메서드의 대체 구현으로, 모든 C++ 유형에서 작동하도록 합니다.

```cpp
template<typename T> static String System::ObjectExt::ToString(const Nullable<T> &obj)
```


| 매개변수 | 설명 |
| --- | --- |
| T | [Nullable](../../nullable/) 타입. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| obj | const Nullable\<T\>\& | [Nullable](../../nullable/) 객체를 문자열로 변환합니다. |

### ReturnValue

[String](../../string/) representation of **obj**.

## 또 보기

* Class [String](../../string/)
* Class [Nullable](../../nullable/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ToString(const T\&) method


C# ToString 메서드의 대체 구현으로, 모든 C++ 유형에서 작동하도록 합니다.

```cpp
template<typename T> static std::enable_if<std::is_enum<T>::value, String>::type System::ObjectExt::ToString(const T &obj)
```


| 매개변수 | 설명 |
| --- | --- |
| T | [Enum](../../enum/) 타입. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| obj | const T\& | [Enum](../../enum/) 값을 문자열로 변환합니다. |

### ReturnValue

[String](../../string/) representation of **obj**.

## 또 보기

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ToString(const T\&) method


C# ToString 메서드의 대체 구현으로, 모든 C++ 유형에서 작동하도록 합니다.

```cpp
template<typename T> static std::enable_if<IsSmartPtr<T>::value, String>::type System::ObjectExt::ToString(const T &obj)
```


| 매개변수 | 설명 |
| --- | --- |
| T | 스마트 포인터 타입. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| obj | const T\& | [SmartPtr](../../smartptr/) 값을 문자열로 변환합니다. |

### ReturnValue

[String](../../string/) representation of **obj**.

## 또 보기

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ToString(const T\&) method


C# ToString 메서드의 대체 구현으로, 모든 C++ 유형에서 작동하도록 합니다.

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value &&!std::is_scalar<T>::value &&!IsNullable<T>::value, String>::type System::ObjectExt::ToString(const T &obj)
```


| 매개변수 | 설명 |
| --- | --- |
| T | 구조체 타입. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| obj | const T\& | 구조체 값을 문자열로 변환합니다. |

### ReturnValue

[String](../../string/) representation of **obj**.

## 또 보기

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ToString(T\&&) method


C# ToString 메서드의 대체 구현으로, 모든 C++ 유형에서 작동하도록 합니다.

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value &&std::is_scalar<T>::value &&!std::is_enum<T>::value, String>::type System::ObjectExt::ToString(T &&obj)
```


| 매개변수 | 설명 |
| --- | --- |
| T | 스칼라 타입. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| obj | T\&& | 스칼라 값을 문자열로 변환합니다. |

### ReturnValue

[String](../../string/) representation of **obj**.

## 또 보기

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ToString(T\&&) method


C# ToString 메서드의 대체 구현으로, 모든 C++ 유형에서 작동하도록 합니다.

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value &&!std::is_scalar<T>::value &&!IsNullable<T>::value &&!std::is_reference<T>::value, String>::type System::ObjectExt::ToString(T &&obj)
```


| 매개변수 | 설명 |
| --- | --- |
| T | 스칼라 타입. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| obj | T\&& | 스칼라 값을 문자열로 변환합니다. |

### ReturnValue

[String](../../string/) representation of **obj**.

## 또 보기

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ToString(T\&) method


C# ToString 메서드의 대체 구현으로, 모든 C++ 유형에서 작동하도록 합니다.

```cpp
template<typename T> static std::enable_if<IsSmartPtr<T>::value||std::is_pointer<T>::value||IsExceptionWrapper<T>::value, String>::type System::ObjectExt::ToString(T &obj)
```


| 매개변수 | 설명 |
| --- | --- |
| T | 스마트 포인터 타입 또는 [ExceptionWrapper](../../exceptionwrapper/). |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| obj | T\& | 스마트 포인터 또는 [ExceptionWrapper](../../exceptionwrapper/)를 문자열로 변환합니다. |

### ReturnValue

[String](../../string/) representation of **obj**.

## 또 보기

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ToString(T\&) method


C# ToString 메서드의 대체 구현으로, 모든 C++ 유형에서 작동하도록 합니다.

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value &&std::is_scalar<T>::value &&!std::is_enum<T>::value, String>::type System::ObjectExt::ToString(T &obj)
```


| 매개변수 | 설명 |
| --- | --- |
| T | 스칼라 타입. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| obj | T\& | 스칼라 값을 문자열로 변환합니다. |

### ReturnValue

[String](../../string/) representation of **obj**.

## 또 보기

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ToString(T\&) method


C# ToString 메서드의 대체 구현으로, 모든 C++ 유형에서 작동하도록 합니다.

```cpp
template<typename T> static std::enable_if<!IsExceptionWrapper<T>::value &&!IsSmartPtr<T>::value &&!std::is_scalar<T>::value &&!IsNullable<T>::value, String>::type System::ObjectExt::ToString(T &obj)
```


| 매개변수 | 설명 |
| --- | --- |
| T | 구조체 타입. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| obj | T\& | 구조체 값을 문자열로 변환합니다. |

### ReturnValue

[String](../../string/) representation of **obj**.

## 또 보기

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)

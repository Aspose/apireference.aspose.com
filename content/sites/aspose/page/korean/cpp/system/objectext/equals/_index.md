---
title: "System::ObjectExt::Equals 메서드"
linktitle: "같음"
second_title: "C++용 Aspose.Page"
description: "System::ObjectExt::Equals 메서드. C# Object.Equals 호출을 대체하여 C++에서 모든 타입에 대해 작동합니다. 문자열 리터럴에 대한 문자열 비교를 포함한 오버로드."
type: docs
weight: 700
url: /ko/cpp/system/objectext/equals/
---
## ObjectExt::Equals(const char_t(&), String) method


C# [Object.Equals](../../object/equals/) 호출을 대체하여 C++에서 모든 타입에 대해 작동합니다. 문자열 리터럴에 대한 문자열 비교를 포함한 오버로드.

```cpp
template<size_t> static bool System::ObjectExt::Equals(const char_t(&obj)[N], String another)
```


| 매개변수 | 설명 |
| --- | --- |
| N | [String](../../string/) 리터럴 크기. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| obj | const char_t(&) | [String](../../string/) 리터럴. |
| another | String | [String](../../string/). |

### ReturnValue

문자열이 일치하면 True, 그렇지 않으면 false.

## 또 보기

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Equals(const double\&, const double\&) method


IEC 60559:1989에 따르면 NaN은 어떤 값과도, NaN 자체와도 같지 않지만, C#-style 부동소수점 비교를 에뮬레이트하여 두 NaN을 동일하게 간주합니다.

```cpp
bool System::ObjectExt::Equals(const double &obj, const double &another)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| obj | const double\& | LHS 부동 소수점 값. |
| 다른 | const double\& | RHS 부동 소수점 값. |

### ReturnValue

두 **obj**와 **another**가 모두 NaN이거나 동일하면 True, 그렇지 않으면 false.

## 또 보기

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Equals(const float\&, const float\&) method


IEC 60559:1989에 따르면 NaN은 어떤 값과도, NaN 자체와도 같지 않지만, C#-style 부동소수점 비교를 에뮬레이트하여 두 NaN을 동일하게 간주합니다.

```cpp
bool System::ObjectExt::Equals(const float &obj, const float &another)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| obj | const float\& | LHS 부동 소수점 값. |
| 다른 | const float\& | RHS 부동 소수점 값. |

### ReturnValue

두 **obj**와 **another**가 모두 NaN이거나 동일하면 True, 그렇지 않으면 false.

## 또 보기

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Equals(const T\&, const T2\&) method




```cpp
template<typename T,typename T2> static std::enable_if<IsExceptionWrapper<T>::value, bool>::type System::ObjectExt::Equals(const T &obj, const T2 &another)
```

## 또 보기

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Equals(const T\&, const T2\&) method


C# [Object.Equals](../../object/equals/) 호출을 대체하여 C++의 모든 타입에서 작동합니다. 스마트 포인터 타입에 대한 오버로드.

```cpp
template<typename T,typename T2> static std::enable_if<IsSmartPtr<T>::value, bool>::type System::ObjectExt::Equals(const T &obj, const T2 &another)
```


| 매개변수 | 설명 |
| --- | --- |
| T | 첫 번째 객체 타입. |
| T2 | 두 번째 객체 타입. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| obj | const T\& | 첫 번째 객체. |
| 다른 | const T2\& | 두 번째 객체. |

### ReturnValue

객체가 동일하다고 간주되면 True, 그렇지 않으면 false.

## 또 보기

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Equals(const T\&, const T2\&) method


C# [Object.Equals](../../object/equals/) 호출을 대체하여 C++의 모든 타입에서 작동합니다. 스칼라 타입에 대한 오버로드.

```cpp
template<typename T,typename T2> static std::enable_if<!IsSmartPtr<T>::value &&std::is_scalar<T>::value, bool>::type System::ObjectExt::Equals(const T &obj, const T2 &another)
```


| 매개변수 | 설명 |
| --- | --- |
| T | 첫 번째 객체 타입. |
| T2 | 두 번째 객체 타입. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| obj | const T\& | 첫 번째 객체. |
| 다른 | const T2\& | 두 번째 객체. |

### ReturnValue

객체가 동일하다고 간주되면 True, 그렇지 않으면 false.

## 또 보기

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Equals(T, const T2\&) method


C# [Object.Equals](../../object/equals/) 호출을 대체하여 C++의 모든 타입에서 작동합니다. 구조체 타입에 대한 오버로드.

```cpp
template<typename T,typename T2> static std::enable_if<!IsExceptionWrapper<T>::value &&!IsSmartPtr<T>::value &&!std::is_scalar<T>::value, bool>::type System::ObjectExt::Equals(T obj, const T2 &another)
```


| 매개변수 | 설명 |
| --- | --- |
| T | 첫 번째 객체 타입. |
| T2 | 두 번째 객체 타입. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| obj | T | 첫 번째 객체. |
| 다른 | const T2\& | 두 번째 객체. |

### ReturnValue

객체가 동일하다고 간주되면 True, 그렇지 않으면 false.

## 또 보기

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)

---
title: "System::Object::Equals method"
linktitle: "같음"
second_title: "C++용 Aspose.Page"
description: "System::Object::Equals method. C++에서 C# Object.Equals 의미를 사용하여 객체를 비교합니다."
type: docs
weight: 300
url: /ko/cpp/system/object/equals/
---
## Object::Equals(ptr) method


C# [Object.Equals](./) 의미를 사용하여 객체를 비교합니다.

```cpp
virtual bool System::Object::Equals(ptr obj)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| obj | ptr | 현재 객체와 비교할 [Object](../). |

### ReturnValue

객체가 동일하다고 판단되면 true, 그렇지 않으면 false.

## 또 보기

* Typedef [ptr](../ptr/)
* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Object::Equals(double const\&, double const\&) method


IEC 60559:1989에 따르면 NaN은 어떤 값과도, NaN 자체와도 같지 않지만, C#-style 부동소수점 비교를 에뮬레이트하여 두 NaN을 동일하게 간주합니다.

```cpp
bool System::Object::Equals(double const &objA, double const &objB)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| objA | double const\& | LHS 부동 소수점 값. |
| objB | double const\& | RHS 부동 소수점 값. |

### ReturnValue

**objA**와 **objB**가 모두 NaN이거나 동일한 경우 True, 그렇지 않으면 false.

## 또 보기

* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Object::Equals(float const\&, float const\&) method


IEC 60559:1989에 따르면 NaN은 어떤 값과도, NaN 자체와도 같지 않지만, C#-style 부동소수점 비교를 에뮬레이트하여 두 NaN을 동일하게 간주합니다.

```cpp
bool System::Object::Equals(float const &objA, float const &objB)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| objA | float const\& | LHS 부동 소수점 값. |
| objB | float const\& | RHS 부동 소수점 값. |

### ReturnValue

**objA**와 **objB**가 모두 NaN이거나 동일한 경우 True, 그렇지 않으면 false.

## 또 보기

* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Object::Equals(T1 const\&, T2 const\&) method


C# 스타일로 참조형 객체를 비교합니다.

```cpp
template<typename T1,typename T2> static std::enable_if<IsSmartPtr<T1>::value &&IsSmartPtr<T2>::value, bool>::type System::Object::Equals(T1 const &objA, T2 const &objB)
```


| 매개변수 | 설명 |
| --- | --- |
| T1 | 비교할 첫 번째 객체의 유형. |
| T2 | 비교할 두 번째 객체의 유형. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| objA | T1 const\& | 비교할 첫 번째 객체. |
| objB | T2 const\& | 비교할 두 번째 객체. |

### ReturnValue

객체가 레퍼런스로 또는 의미적으로 ([Object.Equals](./)와 유사한 비교) 일치하면 true, 그렇지 않으면 false.

## 또 보기

* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Object::Equals(T1 const\&, T2 const\&) method


C# 스타일로 값형 객체를 비교합니다.

```cpp
template<typename T1,typename T2> static std::enable_if<!IsSmartPtr<T1>::value &&!IsSmartPtr<T2>::value, bool>::type System::Object::Equals(T1 const &objA, T2 const &objB)
```


| 매개변수 | 설명 |
| --- | --- |
| T1 | 비교할 첫 번째 객체의 유형. |
| T2 | 비교할 두 번째 객체의 유형. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| objA | T1 const\& | 비교할 첫 번째 객체. |
| objB | T2 const\& | 비교할 두 번째 객체. |

### ReturnValue

사용 가능한 동등 연산자로 객체가 동일하다고 판단되면 true, 그렇지 않으면 false.

## 또 보기

* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)

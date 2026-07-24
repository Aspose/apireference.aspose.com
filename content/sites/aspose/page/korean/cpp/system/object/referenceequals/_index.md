---
title: "System::Object::ReferenceEquals 메서드"
linktitle: "ReferenceEquals"
second_title: "C++용 Aspose.Page"
description: "System::Object::ReferenceEquals 메서드. C++에서 문자열과 nullptr 경우에 대한 Object::ReferenceEquals 특수화입니다."
type: docs
weight: 1200
url: /ko/cpp/system/object/referenceequals/
---
## Object::ReferenceEquals(String const\&, std::nullptr_t) method


문자열과 nullptr 경우에 대한 [Object::ReferenceEquals](./) 특수화.

```cpp
bool System::Object::ReferenceEquals(String const &str, std::nullptr_t)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| str | String const\& | [String](../../string/)을 nullptr와 비교하기 위해. |

### ReturnValue

문자열이 null이면 true, 그렇지 않으면 false.

## 또 보기

* Class [String](../../string/)
* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Object::ReferenceEquals(String const\&, String const\&) method


문자열들의 경우에 대한 [Object::ReferenceEquals](./) 특수화.

```cpp
bool System::Object::ReferenceEquals(String const &str1, String const &str2)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| str1 | String const\& | 비교할 첫 번째 문자열. |
| str2 | String const\& | 비교할 두 번째 문자열. |

### ReturnValue

문자열이 일치하면 true, 그렇지 않으면 false.

## 또 보기

* Class [String](../../string/)
* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Object::ReferenceEquals(ptr const\&, ptr const\&) method


객체를 참조로 비교합니다.

```cpp
static bool System::Object::ReferenceEquals(ptr const &objA, ptr const &objB)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| objA | ptr const\& | 비교할 첫 번째 포인터. |
| objB | ptr const\& | 비교할 두 번째 포인터. |

### ReturnValue

포인터가 일치하면 true, 그렇지 않으면 false.

## 또 보기

* Typedef [ptr](../ptr/)
* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Object::ReferenceEquals(T const\&, std::nullptr_t) method


Reference는 값 형식 객체를 nullptr와 비교합니다.

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value, bool>::type System::Object::ReferenceEquals(T const &objA, std::nullptr_t)
```


| 매개변수 | 설명 |
| --- | --- |
| T | 비교할 객체의 타입. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| objA | T const\& | 비교할 첫 번째 객체. |

### ReturnValue

값 타입은 null이 될 수 없으므로 항상 false를 반환합니다.

## 또 보기

* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Object::ReferenceEquals(T const\&, T const\&) method


객체를 참조로 비교합니다.

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value, bool>::type System::Object::ReferenceEquals(T const &objA, T const &objB)
```


| 매개변수 | 설명 |
| --- | --- |
| T | 비교할 객체들의 타입. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| objA | T const\& | 비교할 첫 번째 객체. |
| objB | T const\& | 비교할 두 번째 객체. |

### ReturnValue

객체 주소가 일치하면 true, 그렇지 않으면 false.

## 또 보기

* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)

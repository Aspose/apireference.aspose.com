---
title: "System::ObjectExt::Box 메서드"
linktitle: "Box"
second_title: "C++용 Aspose.Page"
description: "System::ObjectExt::Box 메서드. C++에서 문자열 값을 박싱합니다."
type: docs
weight: 200
url: /ko/cpp/system/objectext/box/
---
## ObjectExt::Box(const String\&) method


문자열 값을 박싱합니다.

```cpp
SmartPtr<Object> System::ObjectExt::Box(const String &value)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | const String\& | 박싱할 값. |

### ReturnValue

소스 문자열이 null인 경우 박싱된 값 또는 null.

## 또 보기

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Box(const T\&) method


열거형 타입에 대한 구현으로, [Object](../../object/)로 변환하기 위해 값 타입을 박싱합니다.

```cpp
template<typename T> static std::enable_if<std::is_enum<T>::value, System::SmartPtr<System::Object>>::type System::ObjectExt::Box(const T &value)
```


| 매개변수 | 설명 |
| --- | --- |
| T | [Enum](../../enum/) 타입. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | const T\& | 박싱할 [Enum](../../enum/) 값. |

### ReturnValue

박싱된 값을 보관하는 객체에 대한 스마트 포인터.

## 또 보기

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Box(const T\&) method


비열거형 타입에 대한 구현으로, [Object](../../object/)로 변환하기 위해 값 타입을 박싱합니다.

```cpp
template<typename T> static std::enable_if<!std::is_enum<T>::value &&!IsNullable<T>::value, System::SmartPtr<System::Object>>::type System::ObjectExt::Box(const T &value)
```


| 매개변수 | 설명 |
| --- | --- |
| T | 값 형식. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | const T\& | 박싱할 값. |

### ReturnValue

박싱된 값을 보관하는 객체에 대한 스마트 포인터.

## 또 보기

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Box(const T\&) method


[Nullable](../../nullable/) 타입을 [Object](../../object/)로 변환하기 위해 박싱합니다.

```cpp
template<typename T> static std::enable_if<IsNullable<T>::value, System::SmartPtr<System::Object>>::type System::ObjectExt::Box(const T &value)
```


| 매개변수 | 설명 |
| --- | --- |
| T | 값 형식. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | const T\& | 박싱할 값. |

### ReturnValue

박싱된 값을 보관하는 객체에 대한 스마트 포인터.

## 또 보기

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)

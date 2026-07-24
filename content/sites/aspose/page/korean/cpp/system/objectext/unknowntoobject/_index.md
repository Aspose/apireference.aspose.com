---
title: "System::ObjectExt::UnknownToObject 메서드"
linktitle: "UnknownToObject"
second_title: "C++용 Aspose.Page"
description: "System::ObjectExt::UnknownToObject 메서드. 알 수 없는 타입을 Object로 변환하며, C++에서 스마트 포인터 타입과 값 타입 상황을 모두 처리합니다."
type: docs
weight: 1800
url: /ko/cpp/system/objectext/unknowntoobject/
---
## ObjectExt::UnknownToObject(const T\&) method


알 수 없는 타입을 [Object](../../object/) 로 변환하고, 스마트 포인터 타입과 값 타입 상황을 모두 처리합니다.

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value, System::SmartPtr<Object>>::type System::ObjectExt::UnknownToObject(const T &obj)
```


| 매개변수 | 설명 |
| --- | --- |
| T | [Object](../../object/) 로 변환할 타입. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| obj | const T\& | 변환할 [Object](../../object/). |

### ReturnValue

[Object](../../object/)에 대한 스마트 포인터이며, 변환된 포인터이거나 박싱된 값일 수 있습니다.

## 또 보기

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::UnknownToObject(T) method


알 수 없는 타입을 [Object](../../object/) 로 변환하고, 스마트 포인터 타입과 값 타입 상황을 모두 처리합니다.

```cpp
template<typename T> static std::enable_if<IsSmartPtr<T>::value, System::SmartPtr<Object>>::type System::ObjectExt::UnknownToObject(T obj)
```


| 매개변수 | 설명 |
| --- | --- |
| T | [Object](../../object/) 로 변환할 타입. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| obj | T | 변환할 [Object](../../object/). |

### ReturnValue

[Object](../../object/)에 대한 스마트 포인터이며, 변환된 포인터이거나 박싱된 값일 수 있습니다.

## 또 보기

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)

---
title: "System::ObjectExt::ObjectToUnknown method"
linktitle: "ObjectToUnknown"
second_title: "C++용 Aspose.Page"
description: "System::ObjectExt::ObjectToUnknown 메서드. C++에서 스마트 포인터 타입과 박스된 값 상황을 모두 처리하여 Object를 알 수 없는 타입으로 변환합니다."
type: docs
weight: 1200
url: /ko/cpp/system/objectext/objecttounknown/
---
## ObjectExt::ObjectToUnknown(SmartPtr\<Object\>) method


스마트 포인터 타입과 박스된 값 상황을 모두 처리하여 [Object](../../object/)를 알 수 없는 타입으로 변환합니다.

```cpp
template<typename T> static std::enable_if<IsSmartPtr<T>::value, T>::type System::ObjectExt::ObjectToUnknown(SmartPtr<Object> obj)
```


| 매개변수 | 설명 |
| --- | --- |
| T | [Object](../../object/)를 변환할 타입. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| obj | SmartPtr\<Object\> | 변환할 [Object](../../object/). |

### ReturnValue

언박싱된 값 또는 변환된 포인터 중 하나.

## 또 보기

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ObjectToUnknown(SmartPtr\<Object\>) method


스마트 포인터 타입과 박스된 값 상황을 모두 처리하여 [Object](../../object/)를 알 수 없는 타입으로 변환합니다.

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value, T>::type System::ObjectExt::ObjectToUnknown(SmartPtr<Object> obj)
```


| 매개변수 | 설명 |
| --- | --- |
| T | [Object](../../object/)를 변환할 타입. |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| obj | SmartPtr\<Object\> | 변환할 [Object](../../object/). |

### ReturnValue

언박싱된 값 또는 변환된 포인터 중 하나.

## 또 보기

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)

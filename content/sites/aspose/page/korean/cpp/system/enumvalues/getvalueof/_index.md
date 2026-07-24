---
title: "System::EnumValues::GetValueOf 메서드"
linktitle: "GetValueOf"
second_title: "C++용 Aspose.Page"
description: "System::EnumValues::GetValueOf 메서드. C++에서 지정된 이름을 가진 열거형 상수의 박싱된 값을 반환합니다."
type: docs
weight: 500
url: /ko/cpp/system/enumvalues/getvalueof/
---
## EnumValues::GetValueOf(const String\&, bool) const method


지정된 이름을 가진 열거형 상수의 박싱된 값을 반환합니다.

```cpp
virtual SharedPtr<Object> System::EnumValues<E, Guard>::GetValueOf(const String &str, bool ignoreCase) const override
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| str | const String\& | 열거형 상수의 이름 |
| ignoreCase | bool | 열거형 상수 이름을 해석할 때 대소문자를 무시해야 하는지를 지정합니다. |

### ReturnValue

이름이 **str**에 지정된 enum 상수의 박싱된 값입니다.

## 또 보기

* Typedef [SharedPtr](../../sharedptr/)
* Class [Object](../../object/)
* Class [String](../../string/)
* Class [EnumValues](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## EnumValues::GetValueOf(long) const method


지정된 값으로 enum 상수의 박싱된 값을 반환합니다.

```cpp
virtual SharedPtr<Object> System::EnumValues<E, Guard>::GetValueOf(long val) const override
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| val | long | enum 상수의 값 |

### ReturnValue

값이 **str**에 지정된 enum 상수의 박싱된 값입니다.

## 또 보기

* Typedef [SharedPtr](../../sharedptr/)
* Class [Object](../../object/)
* Class [EnumValues](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)

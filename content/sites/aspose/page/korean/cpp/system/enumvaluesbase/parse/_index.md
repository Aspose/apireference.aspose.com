---
title: "System::EnumValuesBase::Parse 메서드"
linktitle: "Parse"
second_title: "C++용 Aspose.Page"
description: "System::EnumValuesBase::Parse 메서드. 지정된 열거형 유형에서 지정된 이름을 가진 열거형 상수 값을 나타내는 객체를 반환합니다(C++)."
type: docs
weight: 400
url: /ko/cpp/system/enumvaluesbase/parse/
---
## EnumValuesBase::Parse method


지정된 열거형 타입의 열거형 상수 값을 지정된 이름으로 나타내는 객체를 반환합니다.

```cpp
static SharedPtr<Object> System::EnumValuesBase::Parse(const TypeInfo &type, const String &str, bool ignoreCase)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| type | const TypeInfo\& | 반환할 열거형 값의 타입을 나타내는 [TypeInfo](../../typeinfo/) 객체 |
| str | const String\& | 열거형 상수의 이름 |
| ignoreCase | bool | 열거형 상수 이름을 해석할 때 대소문자를 무시해야 하는지를 지정합니다. |

### ReturnValue

**str**에 지정된 이름을 가진 열거형 상수 값을 나타내는 객체입니다.

## 또 보기

* Typedef [SharedPtr](../../sharedptr/)
* Class [Object](../../object/)
* Class [TypeInfo](../../typeinfo/)
* Class [String](../../string/)
* Class [EnumValuesBase](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)

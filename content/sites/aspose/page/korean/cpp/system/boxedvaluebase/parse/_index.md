---
title: "System::BoxedValueBase::Parse 메서드"
linktitle: "Parse"
second_title: "C++용 Aspose.Page"
description: "System::BoxedValueBase::Parse 메서드. 지정된 이름을 가진 지정된 열거형의 열거형 상수 값을 C++에서 박싱합니다."
type: docs
weight: 500
url: /ko/cpp/system/boxedvaluebase/parse/
---
## BoxedValueBase::Parse(const TypeInfo\&, const String\&) method


지정된 열거형의 지정된 이름을 가진 열거 상수 값을 박싱합니다.

```cpp
static SharedPtr<Object> System::BoxedValueBase::Parse(const TypeInfo &type, const String &str)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 유형 | const TypeInfo\& | 열거형의 타입을 지정합니다 |
| str | const String\& | 박싱할 값의 열거형 상수 이름 |

### ReturnValue

지정된 열거형 상수의 박싱된 값을 나타내는 객체에 대한 공유 포인터

## 또 보기

* Typedef [SharedPtr](../../sharedptr/)
* Class [Object](../../object/)
* Class [TypeInfo](../../typeinfo/)
* Class [String](../../string/)
* Class [BoxedValueBase](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## BoxedValueBase::Parse(const TypeInfo\&, const String\&, bool) method


지정된 열거형의 지정된 이름을 가진 열거 상수 값을 박싱합니다. 매개변수는 열거 상수 이름 문자열을 해석할 때 대소문자를 무시할지 여부를 지정합니다.

```cpp
static SharedPtr<Object> System::BoxedValueBase::Parse(const TypeInfo &type, const String &str, bool ignoreCase)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 유형 | const TypeInfo\& | 열거형의 타입을 지정합니다 |
| str | const String\& | 박싱할 값의 열거형 상수 이름 |
| ignoreCase | bool | 열거형 상수 이름을 나타내는 문자열을 해석할 때 대소문자를 무시할지 여부를 지정합니다 |

### ReturnValue

지정된 열거형 상수의 박싱된 값을 나타내는 객체에 대한 공유 포인터

## 또 보기

* Typedef [SharedPtr](../../sharedptr/)
* Class [Object](../../object/)
* Class [TypeInfo](../../typeinfo/)
* Class [String](../../string/)
* Class [BoxedValueBase](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)

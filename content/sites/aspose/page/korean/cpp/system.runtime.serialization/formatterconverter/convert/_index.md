---
title: "System::Runtime::Serialization::FormatterConverter::Convert 메서드"
linktitle: "Convert"
second_title: "C++용 Aspose.Page"
description: "System::Runtime::Serialization::FormatterConverter::Convert 메서드. C++의 RTTI 정보."
type: docs
weight: 100
url: /ko/cpp/system.runtime.serialization/formatterconverter/convert/
---
## FormatterConverter::Convert(System::SharedPtr\<Object\>, const TypeInfo\&) method


RTTI 정보.

```cpp
System::SharedPtr<Object> System::Runtime::Serialization::FormatterConverter::Convert(System::SharedPtr<Object> value, const TypeInfo &type) override
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | System::SharedPtr\<Object\> | 변환될 객체. |
| type | const TypeInfo\& | 값이 변환될 [System::TypeInfo](../../../system/typeinfo/) 입니다. |

### ReturnValue

변환된 값.
## 비고


값을 지정된 [System::TypeInfo](../../../system/typeinfo/) 로 변환합니다.
## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [FormatterConverter](../)
* Namespace [System::Runtime::Serialization](../../)
* Library [Aspose.Page for C++](../../../)
## FormatterConverter::Convert(System::SharedPtr\<Object\>, TypeCode) method


값을 지정된 [System::TypeCode](../../../system/typecode/) 로 변환합니다.

```cpp
System::SharedPtr<Object> System::Runtime::Serialization::FormatterConverter::Convert(System::SharedPtr<Object> value, TypeCode typeCode) override
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | System::SharedPtr\<Object\> | 변환될 객체. |
| typeCode | TypeCode | 값이 변환될 [System::TypeCode](../../../system/typecode/). |

### ReturnValue

변환된 값.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Enum [TypeCode](../../../system/typecode/)
* Class [FormatterConverter](../)
* Namespace [System::Runtime::Serialization](../../)
* Library [Aspose.Page for C++](../../../)

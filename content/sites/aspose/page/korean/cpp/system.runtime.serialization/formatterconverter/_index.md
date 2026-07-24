---
title: "System::Runtime::Serialization::FormatterConverter 클래스"
linktitle: "FormatterConverter"
second_title: "C++용 Aspose.Page"
description: "System::Runtime::Serialization::FormatterConverter 클래스. C++에서 System::Runtime::Serialization::IFormatterConverter 인터페이스의 기본 구현을 나타냅니다."
type: docs
weight: 100
url: /ko/cpp/system.runtime.serialization/formatterconverter/
---
## FormatterConverter class


[System::Runtime::Serialization::IFormatterConverter](../iformatterconverter/) 인터페이스의 기본 구현을 나타냅니다.

```cpp
class FormatterConverter : public System::Runtime::Serialization::IFormatterConverter
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Convert](./convert/)(System::SharedPtr\<Object\>, const TypeInfo\&) override | RTTI 정보. |
| [Convert](./convert/)(System::SharedPtr\<Object\>, TypeCode) override | 값을 지정된 [System::TypeCode](../../system/typecode/) 로 변환합니다. |
| [ToBoolean](./toboolean/)(System::SharedPtr\<Object\>) override | 값을 bool 로 변환합니다. |
| [ToByte](./tobyte/)(System::SharedPtr\<Object\>) override | 값을 uint8_t 로 변환합니다. |
| [ToChar](./tochar/)(System::SharedPtr\<Object\>) override | 값을 char16_t 로 변환합니다. |
| [ToDateTime](./todatetime/)(System::SharedPtr\<Object\>) override | 값을 [DateTime](../../system/datetime/) 로 변환합니다. |
| [ToDecimal](./todecimal/)(System::SharedPtr\<Object\>) override | 값을 [Decimal](../../system/decimal/) 로 변환합니다. |
| [ToDouble](./todouble/)(System::SharedPtr\<Object\>) override | 값을 double 로 변환합니다. |
| [ToInt16](./toint16/)(System::SharedPtr\<Object\>) override | 값을 int16_t 로 변환합니다. |
| [ToInt32](./toint32/)(System::SharedPtr\<Object\>) override | 값을 int32_t 로 변환합니다. |
| [ToInt64](./toint64/)(System::SharedPtr\<Object\>) override | 값을 int64_t 로 변환합니다. |
| [ToSByte](./tosbyte/)(System::SharedPtr\<Object\>) override | 값을 int8_t 로 변환합니다. |
| [ToSingle](./tosingle/)(System::SharedPtr\<Object\>) override | 값을 float 로 변환합니다. |
| [ToString](./tostring/)(System::SharedPtr\<Object\>) override | 값을 [String](../../system/string/) 로 변환합니다. |
| [ToUInt16](./touint16/)(System::SharedPtr\<Object\>) override | 값을 uint16_t 로 변환합니다. |
| [ToUInt32](./touint32/)(System::SharedPtr\<Object\>) override | 값을 uint32_t 로 변환합니다. |
| [ToUInt64](./touint64/)(System::SharedPtr\<Object\>) override | 값을 uint64_t 로 변환합니다. |
## 또 보기

* Class [IFormatterConverter](../iformatterconverter/)
* Namespace [System::Runtime::Serialization](../)
* Library [Aspose.Page for C++](../../)

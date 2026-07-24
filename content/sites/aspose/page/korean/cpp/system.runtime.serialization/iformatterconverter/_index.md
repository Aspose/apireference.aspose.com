---
title: "System::Runtime::Serialization::IFormatterConverter 클래스"
linktitle: "IFormatterConverter"
second_title: "C++용 Aspose.Page"
description: "System::Runtime::Serialization::IFormatterConverter 클래스. System::Runtime::Serialization::SerializationInfo 인스턴스와 해당 SerializationInfo 내부 데이터를 파싱하기에 가장 적합한 포맷터 제공 클래스 간의 연결을 제공합니다. C++에서."
type: docs
weight: 200
url: /ko/cpp/system.runtime.serialization/iformatterconverter/
---
## IFormatterConverter class


값을 [System::Runtime::Serialization::SerializationInfo](../serializationinfo/) 인스턴스와 포맷터가 제공하는, 해당 [System::Runtime::Serialization::SerializationInfo](../serializationinfo/) 내부 데이터를 파싱하기에 가장 적합한 클래스 간의 연결을 제공합니다.

```cpp
class IFormatterConverter : public System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| virtual [Convert](./convert/)(System::SharedPtr\<Object\>, const TypeInfo\&) | RTTI 정보. |
| virtual [Convert](./convert/)(System::SharedPtr\<Object\>, TypeCode) | 값을 지정된 [System::TypeCode](../../system/typecode/) 로 변환합니다. |
| virtual [ToBoolean](./toboolean/)(System::SharedPtr\<Object\>) | 값을 bool 로 변환합니다. |
| virtual [ToByte](./tobyte/)(System::SharedPtr\<Object\>) | 값을 uint8_t 로 변환합니다. |
| virtual [ToChar](./tochar/)(System::SharedPtr\<Object\>) | 값을 char16_t 로 변환합니다. |
| virtual [ToDateTime](./todatetime/)(System::SharedPtr\<Object\>) | 값을 [DateTime](../../system/datetime/) 로 변환합니다. |
| virtual [ToDecimal](./todecimal/)(System::SharedPtr\<Object\>) | 값을 [Decimal](../../system/decimal/) 로 변환합니다. |
| virtual [ToDouble](./todouble/)(System::SharedPtr\<Object\>) | 값을 double 로 변환합니다. |
| virtual [ToInt16](./toint16/)(System::SharedPtr\<Object\>) | 값을 int16_t 로 변환합니다. |
| virtual [ToInt32](./toint32/)(System::SharedPtr\<Object\>) | 값을 int32_t 로 변환합니다. |
| virtual [ToInt64](./toint64/)(System::SharedPtr\<Object\>) | 값을 int64_t 로 변환합니다. |
| virtual [ToSByte](./tosbyte/)(System::SharedPtr\<Object\>) | 값을 int8_t 로 변환합니다. |
| virtual [ToSingle](./tosingle/)(System::SharedPtr\<Object\>) | 값을 float 로 변환합니다. |
| virtual [ToString](./tostring/)(System::SharedPtr\<Object\>) | 값을 [String](../../system/string/) 로 변환합니다. |
| virtual [ToUInt16](./touint16/)(System::SharedPtr\<Object\>) | 값을 uint16_t 로 변환합니다. |
| virtual [ToUInt32](./touint32/)(System::SharedPtr\<Object\>) | 값을 uint32_t 로 변환합니다. |
| virtual [ToUInt64](./touint64/)(System::SharedPtr\<Object\>) | 값을 uint64_t 로 변환합니다. |
## 또 보기

* Class [Object](../../system/object/)
* Namespace [System::Runtime::Serialization](../)
* Library [Aspose.Page for C++](../../)

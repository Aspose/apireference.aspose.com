---
title: "System::Runtime::Serialization::FormatterConverter क्लास"
linktitle: "FormatterConverter"
second_title: "Aspose.Page C++ के लिए"
description: "System::Runtime::Serialization::FormatterConverter क्लास। C++ में System::Runtime::Serialization::IFormatterConverter इंटरफ़ेस की बेस इम्प्लीमेंटेशन का प्रतिनिधित्व करता है।"
type: docs
weight: 100
url: /hi/cpp/system.runtime.serialization/formatterconverter/
---
## FormatterConverter class


एक बेस इम्प्लीमेंटेशन का प्रतिनिधित्व करता है [System::Runtime::Serialization::IFormatterConverter](../iformatterconverter/) इंटरफ़ेस का।

```cpp
class FormatterConverter : public System::Runtime::Serialization::IFormatterConverter
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Convert](./convert/)(System::SharedPtr\<Object\>, const TypeInfo\&) override | RTTI जानकारी। |
| [Convert](./convert/)(System::SharedPtr\<Object\>, TypeCode) override | एक मान को दिए गए [System::TypeCode](../../system/typecode/) में परिवर्तित करता है। |
| [ToBoolean](./toboolean/)(System::SharedPtr\<Object\>) override | एक मान को bool में परिवर्तित करता है। |
| [ToByte](./tobyte/)(System::SharedPtr\<Object\>) override | एक मान को uint8_t में परिवर्तित करता है। |
| [ToChar](./tochar/)(System::SharedPtr\<Object\>) override | एक मान को char16_t में परिवर्तित करता है। |
| [ToDateTime](./todatetime/)(System::SharedPtr\<Object\>) override | एक मान को [DateTime](../../system/datetime/) में परिवर्तित करता है। |
| [ToDecimal](./todecimal/)(System::SharedPtr\<Object\>) override | एक मान को [Decimal](../../system/decimal/) में परिवर्तित करता है। |
| [ToDouble](./todouble/)(System::SharedPtr\<Object\>) override | एक मान को double में परिवर्तित करता है। |
| [ToInt16](./toint16/)(System::SharedPtr\<Object\>) override | एक मान को int16_t में परिवर्तित करता है। |
| [ToInt32](./toint32/)(System::SharedPtr\<Object\>) override | एक मान को int32_t में परिवर्तित करता है। |
| [ToInt64](./toint64/)(System::SharedPtr\<Object\>) override | एक मान को int64_t में परिवर्तित करता है। |
| [ToSByte](./tosbyte/)(System::SharedPtr\<Object\>) override | एक मान को int8_t में परिवर्तित करता है। |
| [ToSingle](./tosingle/)(System::SharedPtr\<Object\>) override | एक मान को float में परिवर्तित करता है। |
| [ToString](./tostring/)(System::SharedPtr\<Object\>) override | एक मान को [String](../../system/string/) में परिवर्तित करता है। |
| [ToUInt16](./touint16/)(System::SharedPtr\<Object\>) override | एक मान को uint16_t में परिवर्तित करता है। |
| [ToUInt32](./touint32/)(System::SharedPtr\<Object\>) override | एक मान को uint32_t में परिवर्तित करता है। |
| [ToUInt64](./touint64/)(System::SharedPtr\<Object\>) override | एक मान को uint64_t में परिवर्तित करता है। |
## संबंधित देखें

* Class [IFormatterConverter](../iformatterconverter/)
* Namespace [System::Runtime::Serialization](../)
* Library [Aspose.Page for C++](../../)

---
title: "System::Runtime::Serialization::IFormatterConverter क्लास"
linktitle: "IFormatterConverter"
second_title: "Aspose.Page C++ के लिए"
description: "System::Runtime::Serialization::IFormatterConverter क्लास। यह System::Runtime::Serialization::SerializationInfo के एक इंस्टेंस और formatter‑द्वारा प्रदान किए गए क्लास के बीच कनेक्शन प्रदान करता है, जो C++ में System::Runtime::Serialization::SerializationInfo के भीतर डेटा को पार्स करने के लिए सबसे उपयुक्त है।"
type: docs
weight: 200
url: /hi/cpp/system.runtime.serialization/iformatterconverter/
---
## IFormatterConverter class


एक [System::Runtime::Serialization::SerializationInfo](../serializationinfo/) के इंस्टेंस और formatter‑द्वारा प्रदान किए गए क्लास के बीच कनेक्शन प्रदान करता है, जो [System::Runtime::Serialization::SerializationInfo](../serializationinfo/) के भीतर डेटा को पार्स करने के लिए सबसे उपयुक्त है।

```cpp
class IFormatterConverter : public System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| virtual [Convert](./convert/)(System::SharedPtr\<Object\>, const TypeInfo\&) | RTTI जानकारी। |
| virtual [Convert](./convert/)(System::SharedPtr\<Object\>, TypeCode) | एक मान को दिए गए [System::TypeCode](../../system/typecode/) में परिवर्तित करता है। |
| virtual [ToBoolean](./toboolean/)(System::SharedPtr\<Object\>) | एक मान को bool में परिवर्तित करता है। |
| virtual [ToByte](./tobyte/)(System::SharedPtr\<Object\>) | एक मान को uint8_t में परिवर्तित करता है। |
| virtual [ToChar](./tochar/)(System::SharedPtr\<Object\>) | एक मान को char16_t में परिवर्तित करता है। |
| virtual [ToDateTime](./todatetime/)(System::SharedPtr\<Object\>) | एक मान को [DateTime](../../system/datetime/) में परिवर्तित करता है। |
| virtual [ToDecimal](./todecimal/)(System::SharedPtr\<Object\>) | एक मान को [Decimal](../../system/decimal/) में परिवर्तित करता है। |
| virtual [ToDouble](./todouble/)(System::SharedPtr\<Object\>) | एक मान को double में परिवर्तित करता है। |
| virtual [ToInt16](./toint16/)(System::SharedPtr\<Object\>) | एक मान को int16_t में परिवर्तित करता है। |
| virtual [ToInt32](./toint32/)(System::SharedPtr\<Object\>) | एक मान को int32_t में परिवर्तित करता है। |
| virtual [ToInt64](./toint64/)(System::SharedPtr\<Object\>) | एक मान को int64_t में परिवर्तित करता है। |
| virtual [ToSByte](./tosbyte/)(System::SharedPtr\<Object\>) | एक मान को int8_t में परिवर्तित करता है। |
| virtual [ToSingle](./tosingle/)(System::SharedPtr\<Object\>) | एक मान को float में परिवर्तित करता है। |
| virtual [ToString](./tostring/)(System::SharedPtr\<Object\>) | एक मान को [String](../../system/string/) में परिवर्तित करता है। |
| virtual [ToUInt16](./touint16/)(System::SharedPtr\<Object\>) | एक मान को uint16_t में परिवर्तित करता है। |
| virtual [ToUInt32](./touint32/)(System::SharedPtr\<Object\>) | एक मान को uint32_t में परिवर्तित करता है। |
| virtual [ToUInt64](./touint64/)(System::SharedPtr\<Object\>) | एक मान को uint64_t में परिवर्तित करता है। |
## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [System::Runtime::Serialization](../)
* Library [Aspose.Page for C++](../../)

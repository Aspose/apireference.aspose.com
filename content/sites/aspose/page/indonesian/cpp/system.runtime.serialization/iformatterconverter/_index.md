---
title: "Kelas System::Runtime::Serialization::IFormatterConverter"
linktitle: "IFormatterConverter"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Runtime::Serialization::IFormatterConverter. Menyediakan koneksi antara sebuah instance dari System::Runtime::Serialization::SerializationInfo dan kelas yang disediakan formatter yang paling cocok untuk mengurai data di dalam System::Runtime::Serialization::SerializationInfo dalam C++."
type: docs
weight: 200
url: /id/cpp/system.runtime.serialization/iformatterconverter/
---
## IFormatterConverter class


Menyediakan koneksi antara sebuah instance dari [System::Runtime::Serialization::SerializationInfo](../serializationinfo/) dan kelas yang disediakan formatter yang paling cocok untuk mengurai data di dalam [System::Runtime::Serialization::SerializationInfo](../serializationinfo/).

```cpp
class IFormatterConverter : public System::Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| virtual [Convert](./convert/)(System::SharedPtr\<Object\>, const TypeInfo\&) | Informasi RTTI. |
| virtual [Convert](./convert/)(System::SharedPtr\<Object\>, TypeCode) | Mengonversi nilai ke [System::TypeCode](../../system/typecode/) yang diberikan. |
| virtual [ToBoolean](./toboolean/)(System::SharedPtr\<Object\>) | Mengonversi nilai ke bool. |
| virtual [ToByte](./tobyte/)(System::SharedPtr\<Object\>) | Mengonversi nilai ke uint8_t. |
| virtual [ToChar](./tochar/)(System::SharedPtr\<Object\>) | Mengonversi nilai ke char16_t. |
| virtual [ToDateTime](./todatetime/)(System::SharedPtr\<Object\>) | Mengonversi nilai ke [DateTime](../../system/datetime/). |
| virtual [ToDecimal](./todecimal/)(System::SharedPtr\<Object\>) | Mengonversi nilai ke [Decimal](../../system/decimal/). |
| virtual [ToDouble](./todouble/)(System::SharedPtr\<Object\>) | Mengonversi nilai ke double. |
| virtual [ToInt16](./toint16/)(System::SharedPtr\<Object\>) | Mengonversi nilai ke int16_t. |
| virtual [ToInt32](./toint32/)(System::SharedPtr\<Object\>) | Mengonversi nilai ke int32_t. |
| virtual [ToInt64](./toint64/)(System::SharedPtr\<Object\>) | Mengonversi nilai ke int64_t. |
| virtual [ToSByte](./tosbyte/)(System::SharedPtr\<Object\>) | Mengonversi nilai ke int8_t. |
| virtual [ToSingle](./tosingle/)(System::SharedPtr\<Object\>) | Mengonversi nilai ke float. |
| virtual [ToString](./tostring/)(System::SharedPtr\<Object\>) | Mengonversi nilai ke [String](../../system/string/). |
| virtual [ToUInt16](./touint16/)(System::SharedPtr\<Object\>) | Mengonversi nilai ke uint16_t. |
| virtual [ToUInt32](./touint32/)(System::SharedPtr\<Object\>) | Mengonversi nilai ke uint32_t. |
| virtual [ToUInt64](./touint64/)(System::SharedPtr\<Object\>) | Mengonversi nilai ke uint64_t. |
## Lihat Juga

* Class [Object](../../system/object/)
* Namespace [System::Runtime::Serialization](../)
* Library [Aspose.Page for C++](../../)

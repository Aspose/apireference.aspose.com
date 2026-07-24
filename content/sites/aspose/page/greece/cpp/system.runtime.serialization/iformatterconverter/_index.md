---
title: "System::Runtime::Serialization::IFormatterConverter κλάση"
linktitle: "IFormatterConverter"
second_title: "Aspose.Page για C++"
description: "System::Runtime::Serialization::IFormatterConverter κλάση. Παρέχει τη σύνδεση μεταξύ μιας παρουσίας του System::Runtime::Serialization::SerializationInfo και της κλάσης που παρέχεται από τον μορφοποιητή, η οποία είναι η πιο κατάλληλη για την ανάλυση των δεδομένων μέσα στο System::Runtime::Serialization::SerializationInfo σε C++."
type: docs
weight: 200
url: /el/cpp/system.runtime.serialization/iformatterconverter/
---
## IFormatterConverter class


Παρέχει τη σύνδεση μεταξύ μιας παρουσίας του [System::Runtime::Serialization::SerializationInfo](../serializationinfo/) και της κλάσης που παρέχεται από τον μορφοποιητή, η οποία είναι η πιο κατάλληλη για την ανάλυση των δεδομένων μέσα στο [System::Runtime::Serialization::SerializationInfo](../serializationinfo/).

```cpp
class IFormatterConverter : public System::Object
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| virtual [Convert](./convert/)(System::SharedPtr\<Object\>, const TypeInfo\&) | Πληροφορίες RTTI. |
| virtual [Convert](./convert/)(System::SharedPtr\<Object\>, TypeCode) | Μετατρέπει μια τιμή στον δεδομένο [System::TypeCode](../../system/typecode/). |
| virtual [ToBoolean](./toboolean/)(System::SharedPtr\<Object\>) | Μετατρέπει μια τιμή σε bool. |
| virtual [ToByte](./tobyte/)(System::SharedPtr\<Object\>) | Μετατρέπει μια τιμή σε uint8_t. |
| virtual [ToChar](./tochar/)(System::SharedPtr\<Object\>) | Μετατρέπει μια τιμή σε char16_t. |
| virtual [ToDateTime](./todatetime/)(System::SharedPtr\<Object\>) | Μετατρέπει μια τιμή σε [DateTime](../../system/datetime/). |
| virtual [ToDecimal](./todecimal/)(System::SharedPtr\<Object\>) | Μετατρέπει μια τιμή σε [Decimal](../../system/decimal/). |
| virtual [ToDouble](./todouble/)(System::SharedPtr\<Object\>) | Μετατρέπει μια τιμή σε double. |
| virtual [ToInt16](./toint16/)(System::SharedPtr\<Object\>) | Μετατρέπει μια τιμή σε int16_t. |
| virtual [ToInt32](./toint32/)(System::SharedPtr\<Object\>) | Μετατρέπει μια τιμή σε int32_t. |
| virtual [ToInt64](./toint64/)(System::SharedPtr\<Object\>) | Μετατρέπει μια τιμή σε int64_t. |
| virtual [ToSByte](./tosbyte/)(System::SharedPtr\<Object\>) | Μετατρέπει μια τιμή σε int8_t. |
| virtual [ToSingle](./tosingle/)(System::SharedPtr\<Object\>) | Μετατρέπει μια τιμή σε float. |
| virtual [ToString](./tostring/)(System::SharedPtr\<Object\>) | Μετατρέπει μια τιμή σε [String](../../system/string/). |
| virtual [ToUInt16](./touint16/)(System::SharedPtr\<Object\>) | Μετατρέπει μια τιμή σε uint16_t. |
| virtual [ToUInt32](./touint32/)(System::SharedPtr\<Object\>) | Μετατρέπει μια τιμή σε uint32_t. |
| virtual [ToUInt64](./touint64/)(System::SharedPtr\<Object\>) | Μετατρέπει μια τιμή σε uint64_t. |
## Δείτε επίσης

* Class [Object](../../system/object/)
* Namespace [System::Runtime::Serialization](../)
* Library [Aspose.Page for C++](../../)

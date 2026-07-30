---
title: "الفئة System::Runtime::Serialization::IFormatterConverter"
linktitle: "IFormatterConverter"
second_title: "Aspose.Font لـ C++"
description: "الفئة System::Runtime::Serialization::IFormatterConverter. توفر الاتصال بين نسخة من System::Runtime::Serialization::SerializationInfo والفئة التي يوفرها المُنسق (formatter) والتي تكون الأنسب لتحليل البيانات داخل System::Runtime::Serialization::SerializationInfo في C++."
type: docs
weight: 200
url: /ar/cpp/system.runtime.serialization/iformatterconverter/
---
## IFormatterConverter class


توفر الاتصال بين نسخة من [System::Runtime::Serialization::SerializationInfo](../serializationinfo/) والفئة التي يوفرها المُنسق (formatter) والتي تكون الأنسب لتحليل البيانات داخل [System::Runtime::Serialization::SerializationInfo](../serializationinfo/).

```cpp
class IFormatterConverter : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [Convert](./convert/)(System::SharedPtr\<Object\>, const TypeInfo\&) | معلومات RTTI. |
| virtual [Convert](./convert/)(System::SharedPtr\<Object\>, TypeCode) | يحوّل قيمة إلى [System::TypeCode](../../system/typecode/) المحدد. |
| virtual [ToBoolean](./toboolean/)(System::SharedPtr\<Object\>) | يحوّل قيمة إلى نوع bool. |
| virtual [ToByte](./tobyte/)(System::SharedPtr\<Object\>) | يقوم بتحويل قيمة إلى uint8_t. |
| virtual [ToChar](./tochar/)(System::SharedPtr\<Object\>) | يقوم بتحويل قيمة إلى char16_t. |
| virtual [ToDateTime](./todatetime/)(System::SharedPtr\<Object\>) | يقوم بتحويل قيمة إلى [DateTime](../../system/datetime/). |
| virtual [ToDecimal](./todecimal/)(System::SharedPtr\<Object\>) | يقوم بتحويل قيمة إلى [Decimal](../../system/decimal/). |
| virtual [ToDouble](./todouble/)(System::SharedPtr\<Object\>) | يقوم بتحويل قيمة إلى double. |
| virtual [ToInt16](./toint16/)(System::SharedPtr\<Object\>) | يقوم بتحويل قيمة إلى int16_t. |
| virtual [ToInt32](./toint32/)(System::SharedPtr\<Object\>) | يقوم بتحويل قيمة إلى int32_t. |
| virtual [ToInt64](./toint64/)(System::SharedPtr\<Object\>) | يقوم بتحويل قيمة إلى int64_t. |
| virtual [ToSByte](./tosbyte/)(System::SharedPtr\<Object\>) | يقوم بتحويل قيمة إلى int8_t. |
| virtual [ToSingle](./tosingle/)(System::SharedPtr\<Object\>) | يقوم بتحويل قيمة إلى float. |
| virtual [ToString](./tostring/)(System::SharedPtr\<Object\>) | يقوم بتحويل قيمة إلى [String](../../system/string/). |
| virtual [ToUInt16](./touint16/)(System::SharedPtr\<Object\>) | يقوم بتحويل قيمة إلى uint16_t. |
| virtual [ToUInt32](./touint32/)(System::SharedPtr\<Object\>) | يقوم بتحويل قيمة إلى uint32_t. |
| virtual [ToUInt64](./touint64/)(System::SharedPtr\<Object\>) | يقوم بتحويل قيمة إلى uint64_t. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Runtime::Serialization](../)
* Library [Aspose.Font for C++](../../)

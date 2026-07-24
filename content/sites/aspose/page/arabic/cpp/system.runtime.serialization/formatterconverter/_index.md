---
title: "System::Runtime::Serialization::FormatterConverter class"
linktitle: "FormatterConverter"
second_title: "Aspose.Page لـ C++"
description: "System::Runtime::Serialization::FormatterConverter class. يمثل تنفيذًا أساسيًا لواجهة System::Runtime::Serialization::IFormatterConverter في C++."
type: docs
weight: 100
url: /ar/cpp/system.runtime.serialization/formatterconverter/
---
## FormatterConverter class


يمثل تنفيذًا أساسيًا لواجهة [System::Runtime::Serialization::IFormatterConverter](../iformatterconverter/).

```cpp
class FormatterConverter : public System::Runtime::Serialization::IFormatterConverter
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Convert](./convert/)(System::SharedPtr\<Object\>, const TypeInfo\&) override | معلومات RTTI. |
| [Convert](./convert/)(System::SharedPtr\<Object\>, TypeCode) override | يحوِّل قيمة إلى [System::TypeCode](../../system/typecode/) المحدد. |
| [ToBoolean](./toboolean/)(System::SharedPtr\<Object\>) override | يحوِّل قيمة إلى قيمة منطقية (bool). |
| [ToByte](./tobyte/)(System::SharedPtr\<Object\>) override | يحوِّل قيمة إلى uint8_t. |
| [ToChar](./tochar/)(System::SharedPtr\<Object\>) override | يحوِّل قيمة إلى char16_t. |
| [ToDateTime](./todatetime/)(System::SharedPtr\<Object\>) override | يحوِّل قيمة إلى [DateTime](../../system/datetime/). |
| [ToDecimal](./todecimal/)(System::SharedPtr\<Object\>) override | يحوِّل قيمة إلى [Decimal](../../system/decimal/). |
| [ToDouble](./todouble/)(System::SharedPtr\<Object\>) override | يحوِّل قيمة إلى double. |
| [ToInt16](./toint16/)(System::SharedPtr\<Object\>) override | يحوِّل قيمة إلى int16_t. |
| [ToInt32](./toint32/)(System::SharedPtr\<Object\>) override | يحوِّل قيمة إلى int32_t. |
| [ToInt64](./toint64/)(System::SharedPtr\<Object\>) override | يحوِّل قيمة إلى int64_t. |
| [ToSByte](./tosbyte/)(System::SharedPtr\<Object\>) override | يحوِّل قيمة إلى int8_t. |
| [ToSingle](./tosingle/)(System::SharedPtr\<Object\>) override | يحوِّل قيمة إلى float. |
| [ToString](./tostring/)(System::SharedPtr\<Object\>) override | يحوِّل قيمة إلى [String](../../system/string/). |
| [ToUInt16](./touint16/)(System::SharedPtr\<Object\>) override | يحوِّل قيمة إلى uint16_t. |
| [ToUInt32](./touint32/)(System::SharedPtr\<Object\>) override | يحوِّل قيمة إلى uint32_t. |
| [ToUInt64](./touint64/)(System::SharedPtr\<Object\>) override | يحوِّل قيمة إلى uint64_t. |
## انظر أيضًا

* Class [IFormatterConverter](../iformatterconverter/)
* Namespace [System::Runtime::Serialization](../)
* Library [Aspose.Page for C++](../../)

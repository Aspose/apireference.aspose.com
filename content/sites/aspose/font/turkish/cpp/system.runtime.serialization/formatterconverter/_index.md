---
title: "System::Runtime::Serialization::FormatterConverter sınıfı"
linktitle: "FormatterConverter"
second_title: "Aspose.Font için C++"
description: "System::Runtime::Serialization::FormatterConverter sınıfı. C++'ta System::Runtime::Serialization::IFormatterConverter arabiriminin temel bir uygulamasını temsil eder."
type: docs
weight: 100
url: /tr/cpp/system.runtime.serialization/formatterconverter/
---
## FormatterConverter class


Bu, [System::Runtime::Serialization::IFormatterConverter](../iformatterconverter/) arabiriminin temel bir uygulamasını temsil eder.

```cpp
class FormatterConverter : public System::Runtime::Serialization::IFormatterConverter
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Convert](./convert/)(System::SharedPtr\<Object\>, const TypeInfo\&) override | RTTI bilgisi. |
| [Convert](./convert/)(System::SharedPtr\<Object\>, TypeCode) override | Bir değeri verilen [System::TypeCode](../../system/typecode/) değerine dönüştürür. |
| [ToBoolean](./toboolean/)(System::SharedPtr\<Object\>) override | Bir değeri bool tipine dönüştürür. |
| [ToByte](./tobyte/)(System::SharedPtr\<Object\>) override | Bir değeri uint8_t'ye dönüştürür. |
| [ToChar](./tochar/)(System::SharedPtr\<Object\>) override | Bir değeri char16_t'ye dönüştürür. |
| [ToDateTime](./todatetime/)(System::SharedPtr\<Object\>) override | Bir değeri [DateTime](../../system/datetime/) tipine dönüştürür. |
| [ToDecimal](./todecimal/)(System::SharedPtr\<Object\>) override | Bir değeri [Decimal](../../system/decimal/) tipine dönüştürür. |
| [ToDouble](./todouble/)(System::SharedPtr\<Object\>) override | Bir değeri double tipine dönüştürür. |
| [ToInt16](./toint16/)(System::SharedPtr\<Object\>) override | Bir değeri int16_t'ye dönüştürür. |
| [ToInt32](./toint32/)(System::SharedPtr\<Object\>) override | Bir değeri int32_t'ye dönüştürür. |
| [ToInt64](./toint64/)(System::SharedPtr\<Object\>) override | Bir değeri int64_t'ye dönüştürür. |
| [ToSByte](./tosbyte/)(System::SharedPtr\<Object\>) override | Bir değeri int8_t'ye dönüştürür. |
| [ToSingle](./tosingle/)(System::SharedPtr\<Object\>) override | Bir değeri float tipine dönüştürür. |
| [ToString](./tostring/)(System::SharedPtr\<Object\>) override | Bir değeri [String](../../system/string/) tipine dönüştürür. |
| [ToUInt16](./touint16/)(System::SharedPtr\<Object\>) override | Bir değeri uint16_t'ye dönüştürür. |
| [ToUInt32](./touint32/)(System::SharedPtr\<Object\>) override | Bir değeri uint32_t'ye dönüştürür. |
| [ToUInt64](./touint64/)(System::SharedPtr\<Object\>) override | Bir değeri uint64_t'ye dönüştürür. |
## Ayrıca Bakınız

* Class [IFormatterConverter](../iformatterconverter/)
* Namespace [System::Runtime::Serialization](../)
* Library [Aspose.Font for C++](../../)

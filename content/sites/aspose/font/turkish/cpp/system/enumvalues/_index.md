---
title: "System::EnumValues sınıfı"
linktitle: "EnumValues"
second_title: "Aspose.Font için C++"
description: "System::EnumValues sınıfı. C++'da E enum tipinin sabitleri hakkında meta bilgi sağlar."
type: docs
weight: 2300
url: /tr/cpp/system/enumvalues/
---
## EnumValues class


**E** enum tipinin sabitleri hakkında meta bilgi sağlar.

```cpp
template<typename E,class Guard>class EnumValues : public System::EnumValuesBase
```


| Parametre | Açıklama |
| --- | --- |
| E | Enum tipinin türü |
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [EnumValues](./enumvalues/)() | Bir örnek oluşturur. |
| [GetNames](./getnames/)() const override | **E** enumunun tüm adlarını içeren bir dizi döndürür. |
| static [GetNames](../enumvaluesbase/getnames/)(const TypeInfo\&) | Belirtilen bir enumdaki sabitlerin adlarını içeren bir dizi alır. |
| [GetUnderlyingType](./getunderlyingtype/)() const override | Belirtilen enumun temel tipini döndürür. |
| static [GetUnderlyingType](../enumvaluesbase/getunderlyingtype/)(const TypeInfo\&) | Belirtilen enumun temel tipini döndürür. |
| [GetValueOf](./getvalueof/)(const String\&, bool) const override | Belirtilen ada sahip enum sabitinin kutulanmış değerini döndürür. |
| [GetValueOf](./getvalueof/)(long) const override | Belirtilen değere sahip enum sabitinin kutulanmış değerini döndürür. |
| [GetValues](./getvalues/)() const override | **E** enumunun tüm değerlerini içeren bir dizi döndürür. |
| static [GetValues](../enumvaluesbase/getvalues/)(const TypeInfo\&) | Belirtilen enum tipinin tüm değerlerini içeren bir dizi döndürür. |
| static [Parse](../enumvaluesbase/parse/)(const TypeInfo\&, const String\&, bool) | Belirtilen isimle, belirtilen enum tipinin sabit değerini temsil eden bir nesne döndürür. |
| static [ToObject](../enumvaluesbase/toobject/)(const TypeInfo\&, uint64_t) | Belirtilen 64 bit işaretsiz tamsayı değerini bir enum üyesine dönüştürür. |
| static [ToObject](../enumvaluesbase/toobject/)(const TypeInfo\&, const SharedPtr\<Object\>\&) | Belirtilen tamsayı değerine sahip nesneyi bir enum üyesine dönüştürür. |
| virtual [~EnumValues](./~enumvalues/)() | Yıkıcı. |

## Ayrıca Bakınız

* Class [EnumValuesBase](../enumvaluesbase/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)

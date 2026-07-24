---
title: "System::BoxedValueBase sınıfı"
linktitle: "BoxedValueBase"
second_title: "Aspose.Page için C++"
description: "System::BoxedValueBase sınıfı. Kutulanmış bir değeri temsil eden türetilmiş sınıfın arayüzünü tanımlayan ve bazı temel yöntemleri uygulayan bir temel sınıftır. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek asla yığına (stack) ya da new operatörüyle oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 900
url: /tr/cpp/system/boxedvaluebase/
---
## BoxedValueBase class


Kutulanmış bir değeri temsil eden türetilmiş sınıfın arayüzünü tanımlayan ve bazı temel yöntemleri uygulayan bir temel sınıftır. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek asla yığına (stack) ya da new operatörüyle oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class BoxedValueBase : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| virtual [GetTypeCode](./gettypecode/)() const | Geçerli nesne tarafından temsil edilen kutulanmış değerin türünü temsil eden değeri döndürür. |
| virtual [GetUnsignedLongLongValue](./getunsignedlonglongvalue/)() const | Geçerli nesne tarafından temsil edilen kutulanmış değeri 64-bit tamsayı değerine dönüştürür. |
| virtual [IsBoxedEnum](./isboxedenum/)() | Geçerli nesnenin bir enum türünün kutulanmış değerini temsil edip etmediğini belirler. |
| static [Parse](./parse/)(const TypeInfo\&, const String\&, bool) | Belirtilen adla belirtilen enum'un sabit değerini kutular. Bir parametre, enum sabitinin adını belirten dize yorumlanırken büyük/küçük harfin göz ardı edilip edilmeyeceğini belirtir. |
| static [Parse](./parse/)(const TypeInfo\&, const String\&) | Belirtilen adla belirtilen enum'un sabit değerini kutular. |
| [ToString](./tostring/)(const System::String\&) const | Kutulanmış nesneyi belirtilen biçim dizesiyle dizeye dönüştürür. |
| virtual [ToString](./tostring/)() const | C# [Object.ToString()](../object/tostring/) metodunun benzeri. Özel nesnelerin dizeye dönüştürülmesini sağlar. |
## Ayrıca Bakınız

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)

---
title: "System::BoxedValue sınıfı"
linktitle: "BoxedValue"
second_title: "Aspose.Font için C++"
description: "System::BoxedValue sınıfı. Kutulanmış bir değeri temsil eder. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak tahsis edilmelidir. Bu tür bir örneği yığına (stack) ya da new operatörüyle oluşturmaya çalışmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 800
url: /tr/cpp/system/boxedvalue/
---
## BoxedValue class


Kutulanmış bir değeri temsil eder. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../makeobject/) işlevi kullanılarak tahsis edilmelidir. Bu tür bir örneği yığına (stack) ya da new operatörüyle oluşturmaya çalışmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../smartptr/) işaretçisiyle sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
template<class T>class BoxedValue : public System::BoxedValueBase
```


| Parametre | Açıklama |
| --- | --- |
| T | Sınıf tarafından temsil edilen kutulanmış değerin türü |
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [BoxedValue](./boxedvalue/)(const T\&) | Belirtilen değeri kutulanmış olarak temsil eden bir nesne oluşturur. |
| [Equals](./equals/)(ptr) override | Geçerli ve belirtilen nesneler tarafından temsil edilen kutulanmış değerlerin eşitliğini belirler. |
| [GetHashCode](./gethashcode/)() const override | Mevcut nesne için bir karma kodu döndürür. |
| [GetType](./gettype/)() const override | Nesnenin gerçek türünü alır. |
| [GetTypeCode](./gettypecode/)() const override | Geçerli nesne tarafından temsil edilen kutulanmış değerin türünü temsil eden değeri döndürür. |
| [GetUnsignedLongLongValue](./getunsignedlonglongvalue/)() const override | Kutulanmış nesnenin sayısal değerini döndürür; eğer dönüştürülebiliyorsa, aksi takdirde sıfır döner. |
| [is](./is/)() const | Geçerli nesne tarafından temsil edilen kutulanmış değerin türünün **V** olup olmadığını belirler. |
| [IsBoxedEnum](./isboxedenum/)() override | Geçerli nesnenin bir enum türünün kutulanmış değerini temsil edip etmediğini belirler. |
| static [Parse](../boxedvaluebase/parse/)(const TypeInfo\&, const String\&, bool) | Belirtilen adla belirtilen enum'un sabit değerini kutular. Bir parametre, enum sabitinin adını belirten dizeyi yorumlarken büyük/küçük harf duyarlılığının göz ardı edilip edilmeyeceğini belirtir. |
| static [Parse](../boxedvaluebase/parse/)(const TypeInfo\&, const String\&) | Belirtilen adla belirtilen enum'un sabit değerini kutular. |
| [ToString](./tostring/)() const override | Geçerli nesne tarafından temsil edilen kutulanmış değeri dizeye dönüştürür. |
| [ToString](../boxedvaluebase/tostring/)(const System::String\&) const | Kutulanmış nesneyi belirtilen biçim dizesiyle dizeye dönüştürür. |
| [unbox](./unbox/)() const | Geçerli nesne tarafından temsil edilen değeri kutudan çıkarır. |

## Ayrıca Bakınız

* Class [BoxedValueBase](../boxedvaluebase/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)

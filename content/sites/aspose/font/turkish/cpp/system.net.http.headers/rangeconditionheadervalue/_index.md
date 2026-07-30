---
title: "System::Net::Http::Headers::RangeConditionHeaderValue sınıfı"
linktitle: "RangeConditionHeaderValue"
second_title: "Aspose.Font için C++"
description: "System::Net::Http::Headers::RangeConditionHeaderValue sınıfı. ''If-Range'' başlığının bir değerini temsil eder. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığıt üzerinde veya operator new kullanarak oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 1900
url: /tr/cpp/system.net.http.headers/rangeconditionheadervalue/
---
## RangeConditionHeaderValue class


'If-Range' başlığının bir değerini temsil eder. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığıt üzerinde veya operator new kullanarak oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class RangeConditionHeaderValue : public System::ICloneable
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Nesneleri C# [Object.Equals](../../system/object/equals/) semantiği kullanarak karşılaştırır. |
| [get_Date](./get_date/)() | RTTI bilgisi. |
| [get_EntityTag](./get_entitytag/)() | Bir 'ETag' başlık değeri döndürür. |
| [GetHashCode](./gethashcode/)() const override | C# [Object.GetHashCode()](../../system/object/gethashcode/) yönteminin benzeri. Özel nesnelerin hash'lenmesini sağlar. |
| static [GetRangeConditionLength](./getrangeconditionlength/)(String, int32_t, System::SharedPtr\<Object\>\&) | Belirtilen indeksden geçen bir dizeyi [RangeConditionHeaderValue](./) sınıfının bir örneğine dönüştürür. |
| static [Parse](./parse/)(String) | Geçilen bir dizeyi [RangeConditionHeaderValue](./) sınıfının bir örneğine dönüştürür. |
| [RangeConditionHeaderValue](./rangeconditionheadervalue/)(DateTimeOffset) | Yeni bir örnek oluşturur. |
| [RangeConditionHeaderValue](./rangeconditionheadervalue/)(System::SharedPtr\<EntityTagHeaderValue\>) | Yeni bir örnek oluşturur. |
| [RangeConditionHeaderValue](./rangeconditionheadervalue/)(String) | Yeni bir örnek oluşturur. |
| [ToString](./tostring/)() const override | C# [Object.ToString()](../../system/object/tostring/) yönteminin benzeri. Özel nesnelerin dizeye dönüştürülmesini sağlar. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<RangeConditionHeaderValue\>\&) | Geçilen bir dizeyi [RangeConditionHeaderValue](./) sınıfının bir örneğine dönüştürmeye çalışır. |
## Ayrıca Bakınız

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)

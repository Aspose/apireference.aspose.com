---
title: "System::Net::Http::Headers::RangeHeaderValue class"
linktitle: "RangeHeaderValue"
second_title: "Aspose.Font için C++"
description: "System::Net::Http::Headers::RangeHeaderValue sınıfı. ''Range'' başlığının bir değerini temsil eder. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığına (stack) ya da operator new ile oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirin."
type: docs
weight: 2000
url: /tr/cpp/system.net.http.headers/rangeheadervalue/
---
## RangeHeaderValue class


‘Range’ başlığının bir değerini temsil eder. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığına (stack) ya da operator new ile oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin.

```cpp
class RangeHeaderValue : public System::ICloneable
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Nesneleri C# [Object.Equals](../../system/object/equals/) semantiği kullanarak karşılaştırır. |
| [get_Ranges](./get_ranges/)() | Aralıkların koleksiyonunu döndürür. |
| [get_Unit](./get_unit/)() | RTTI bilgisi. |
| [GetHashCode](./gethashcode/)() const override | C# [Object.GetHashCode()](../../system/object/gethashcode/) yönteminin benzeri. Özel nesnelerin hash'lenmesini sağlar. |
| static [GetRangeLength](./getrangelength/)(String, int32_t, System::SharedPtr\<Object\>\&) | Belirtilen indeksden başlayan verilen dizeyi [RangeHeaderValue](./) sınıfının bir örneğine dönüştürür. |
| static [Parse](./parse/)(String) | Geçilen bir dizeyi [RangeHeaderValue](./) sınıfının bir örneğine dönüştürür. |
| [RangeHeaderValue](./rangeheadervalue/)() | Yeni bir örnek oluşturur. |
| [RangeHeaderValue](./rangeheadervalue/)(Nullable\<int64_t\>, Nullable\<int64_t\>) | Yeni bir örnek oluşturur. |
| [set_Unit](./set_unit/)(String) | Bir birim ayarlar. |
| [ToString](./tostring/)() const override | C# [Object.ToString()](../../system/object/tostring/) yönteminin benzeri. Özel nesnelerin dizeye dönüştürülmesini sağlar. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<RangeHeaderValue\>\&) | Geçilen bir dizeyi [RangeHeaderValue](./) sınıfının bir örneğine dönüştürmeye çalışır. |
## Ayrıca Bakınız

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)

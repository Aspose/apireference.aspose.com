---
title: "System::Net::Http::Headers::RangeItemHeaderValue sınıfı"
linktitle: "RangeItemHeaderValue"
second_title: "Aspose.Font için C++"
description: "System::Net::Http::Headers::RangeItemHeaderValue sınıfı. ''Range'' başlığının değerindeki bayt aralığını temsil eder. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığıt üzerinde veya operator new kullanarak oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 2100
url: /tr/cpp/system.net.http.headers/rangeitemheadervalue/
---
## RangeItemHeaderValue class


'Range' başlığının değerindeki bayt aralığını temsil eder. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığıt üzerinde veya operator new kullanarak oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class RangeItemHeaderValue : public System::ICloneable
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Nesneleri C# [Object.Equals](../../system/object/equals/) semantiği kullanarak karşılaştırır. |
| [get_From](./get_from/)() | RTTI bilgisi. |
| [get_To](./get_to/)() | Veri gönderiminin durması gereken konumu döndürür. |
| [GetHashCode](./gethashcode/)() const override | C# [Object.GetHashCode()](../../system/object/gethashcode/) yönteminin benzeri. Özel nesnelerin hash'lenmesini sağlar. |
| static [GetRangeItemLength](./getrangeitemlength/)(String, int32_t, System::SharedPtr\<RangeItemHeaderValue\>\&) | Belirtilen indeksden geçen bir dizeyi [RangeItemHeaderValue](./) sınıfının bir örneğine dönüştürür. |
| static [GetRangeItemListLength](./getrangeitemlistlength/)(String, int32_t, System::SharedPtr\<Collections::Generic::ICollection\<System::SharedPtr\<RangeItemHeaderValue\>\>\>) | Belirtilen konumdan geçen bir dizeyi RangeItemHeaderValue sınıfı örneklerinin koleksiyonuna dönüştürür. |
| [RangeItemHeaderValue](./rangeitemheadervalue/)(Nullable\<int64_t\>, Nullable\<int64_t\>) | Yeni bir örnek oluşturur. |
| [ToString](./tostring/)() const override | C# [Object.ToString()](../../system/object/tostring/) yönteminin benzeri. Özel nesnelerin dizeye dönüştürülmesini sağlar. |
## Ayrıca Bakınız

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)

---
title: "System::Net::Http::Headers::ProductHeaderValue sınıfı"
linktitle: "ProductHeaderValue"
second_title: "Aspose.Font için C++"
description: "System::Net::Http::Headers::ProductHeaderValue sınıfı. ''User-Agent'' başlığının değerinde bir ürün belirtecini temsil eder. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak tahsis edilmelidir. Bu tür bir örnek, yığıt üzerinde veya new operatörüyle oluşturulmamalıdır, aksi takdirde çalışma zamanı hataları ve/veya doğrulama hataları ortaya çıkar. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi fonksiyonlara argüman olarak C++ içinde geçirin."
type: docs
weight: 1700
url: /tr/cpp/system.net.http.headers/productheadervalue/
---
## ProductHeaderValue class


''User-Agent'' başlığının değerinde bir ürün belirtecini temsil eder. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak tahsis edilmelidir. Bu tür bir örnek, yığıt üzerinde veya new operatörüyle oluşturulmamalıdır, aksi takdirde çalışma zamanı hataları ve/veya doğrulama hataları ortaya çıkar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisiyle sarmalayın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin.

```cpp
class ProductHeaderValue : public System::ICloneable
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Nesneleri C# [Object.Equals](../../system/object/equals/) semantiği kullanarak karşılaştırır. |
| [get_Name](./get_name/)() | RTTI bilgisi. |
| [get_Version](./get_version/)() | Ürün belirteci sürümünü döndürür. |
| [GetHashCode](./gethashcode/)() const override | C# [Object.GetHashCode()](../../system/object/gethashcode/) yönteminin benzeri. Özel nesnelerin hash'lenmesini sağlar. |
| static [GetProductLength](./getproductlength/)(String, int32_t, System::SharedPtr\<ProductHeaderValue\>\&) | Belirtilen indeksden geçirilen bir dizeyi [ProductHeaderValue](./) sınıfının bir örneğine dönüştürür. |
| static [Parse](./parse/)(String) | Geçirilen bir dizeyi [ProductHeaderValue](./) sınıfının bir örneğine dönüştürür. |
| [ProductHeaderValue](./productheadervalue/)(String) | Yeni bir örnek oluşturur. |
| [ProductHeaderValue](./productheadervalue/)(String, String) | Yeni bir örnek oluşturur. |
| [ToString](./tostring/)() const override | C# [Object.ToString()](../../system/object/tostring/) yönteminin benzeri. Özel nesnelerin dizeye dönüştürülmesini sağlar. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<ProductHeaderValue\>\&) | Geçirilen bir dizeyi [ProductHeaderValue](./) sınıfının bir örneğine dönüştürmeyi dener. |
## Ayrıca Bakınız

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)

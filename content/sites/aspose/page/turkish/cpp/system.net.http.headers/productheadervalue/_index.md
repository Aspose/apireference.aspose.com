---
title: "System::Net::Http::Headers::ProductHeaderValue sınıfı"
linktitle: "ProductHeaderValue"
second_title: "Aspose.Page için C++"
description: "System::Net::Http::Headers::ProductHeaderValue sınıfı. ''User-Agent'' başlığının değerinde bir ürün belirtecini temsil eder. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak tahsis edilmelidir. Yığın üzerinde veya operator new kullanarak bu tipten bir örnek oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirin."
type: docs
weight: 1700
url: /tr/cpp/system.net.http.headers/productheadervalue/
---
## ProductHeaderValue class


Bir ürün belirtecini 'User-Agent' başlığının değerinde temsil eder. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak tahsis edilmelidir. Yığın üzerinde veya operator new kullanarak bu tipten bir örnek oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin.

```cpp
class ProductHeaderValue : public System::ICloneable
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Nesneleri C# [Object.Equals](../../system/object/equals/) semantiği kullanarak karşılaştırır. |
| [get_Name](./get_name/)() | RTTI bilgisi. |
| [get_Version](./get_version/)() | Ürün belirteci sürümünü döndürür. |
| [GetHashCode](./gethashcode/)() const override | C# [Object.GetHashCode()](../../system/object/gethashcode/) yönteminin benzeri. Özel nesnelerin hashlenmesini sağlar. |
| static [GetProductLength](./getproductlength/)(String, int32_t, System::SharedPtr\<ProductHeaderValue\>\&) | Belirtilen indeksden verilen bir dizeyi [ProductHeaderValue](./) sınıfının bir örneğine dönüştürür. |
| static [Parse](./parse/)(String) | Verilen bir dizeyi [ProductHeaderValue](./) sınıfının bir örneğine dönüştürür. |
| [ProductHeaderValue](./productheadervalue/)(String) | Yeni bir örnek oluşturur. |
| [ProductHeaderValue](./productheadervalue/)(String, String) | Yeni bir örnek oluşturur. |
| [ToString](./tostring/)() const override | C# [Object.ToString()](../../system/object/tostring/) yönteminin benzeri. Özel nesnelerin dizeye dönüştürülmesini sağlar. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<ProductHeaderValue\>\&) | Verilen bir dizeyi [ProductHeaderValue](./) sınıfının bir örneğine dönüştürmeye çalışır. |
## Ayrıca Bakınız

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)

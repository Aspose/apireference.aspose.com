---
title: "System::Net::Http::Headers::ProductInfoHeaderValue sınıfı"
linktitle: "ProductInfoHeaderValue"
second_title: "Aspose.Font için C++"
description: "System::Net::Http::Headers::ProductInfoHeaderValue sınıfı. ''User-Agent'' başlığının değerinde bir ürün veya yorum temsil eder. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığına (stack) veya new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 1800
url: /tr/cpp/system.net.http.headers/productinfoheadervalue/
---
## ProductInfoHeaderValue class


‘User-Agent’ başlığının değerinde bir ürün veya yorumu temsil eder. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığına (stack) veya new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class ProductInfoHeaderValue : public System::ICloneable
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Nesneleri C# [Object.Equals](../../system/object/equals/) semantiği kullanarak karşılaştırır. |
| [get_Comment](./get_comment/)() | Bir yorumu döndürür. |
| [get_Product](./get_product/)() | RTTI bilgisi. |
| [GetHashCode](./gethashcode/)() const override | C# [Object.GetHashCode()](../../system/object/gethashcode/) yönteminin benzeri. Özel nesnelerin hash'lenmesini sağlar. |
| static [GetProductInfoLength](./getproductinfolength/)(String, int32_t, System::SharedPtr\<ProductInfoHeaderValue\>\&) | Belirtilen indeksden itibaren verilen bir dizeyi [ProductInfoHeaderValue](./) sınıfının bir örneğine dönüştürür. |
| static [Parse](./parse/)(String) | Verilen bir dizeyi [ProductInfoHeaderValue](./) sınıfının bir örneğine dönüştürür. |
| [ProductInfoHeaderValue](./productinfoheadervalue/)(String, String) | Yeni bir örnek oluşturur. |
| [ProductInfoHeaderValue](./productinfoheadervalue/)(System::SharedPtr\<ProductHeaderValue\>) | Yeni bir örnek oluşturur. |
| [ProductInfoHeaderValue](./productinfoheadervalue/)(String) | Yeni bir örnek oluşturur. |
| [ToString](./tostring/)() const override | C# [Object.ToString()](../../system/object/tostring/) yönteminin benzeri. Özel nesnelerin dizeye dönüştürülmesini sağlar. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<ProductInfoHeaderValue\>\&) | Verilen bir dizeyi [ProductInfoHeaderValue](./) sınıfının bir örneğine dönüştürmeye çalışır. |
## Ayrıca Bakınız

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)

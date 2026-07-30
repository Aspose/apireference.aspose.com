---
title: "System::Net::Http::Headers::StringWithQualityHeaderValue sınıfı"
linktitle: "StringWithQualityHeaderValue"
second_title: "Aspose.Font için C++"
description: "System::Net::Http::Headers::StringWithQualityHeaderValue sınıfı. Bir dize başlığının ek kaliteyle birlikte bir değerini temsil eder. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu türün bir örneğini yığıt üzerinde veya new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına neden olur. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 2300
url: /tr/cpp/system.net.http.headers/stringwithqualityheadervalue/
---
## StringWithQualityHeaderValue class


Bir dize başlığının ek bir kalite değeriyle temsil eder. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak tahsis edilmelidir. Bu tür bir örnek, yığıt üzerinde veya new operatörüyle oluşturulmamalıdır, aksi takdirde çalışma zamanı hataları ve/veya doğrulama hataları ortaya çıkar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisiyle sarmalayın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin.

```cpp
class StringWithQualityHeaderValue : public System::ICloneable
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Nesneleri C# [Object.Equals](../../system/object/equals/) semantiği kullanarak karşılaştırır. |
| [get_Quality](./get_quality/)() | Bir kalite döndürür. |
| [get_Value](./get_value/)() | RTTI bilgisi. |
| [GetHashCode](./gethashcode/)() const override | C# [Object.GetHashCode()](../../system/object/gethashcode/) yönteminin benzeri. Özel nesnelerin hash'lenmesini sağlar. |
| static [GetStringWithQualityLength](./getstringwithqualitylength/)(String, int32_t, System::SharedPtr\<Object\>\&) | Belirtilen indeksden geçirilen bir dizeyi [StringWithQualityHeaderValue](./) sınıfının bir örneğine dönüştürür. |
| static [Parse](./parse/)(String) | Geçirilen bir dizeyi [StringWithQualityHeaderValue](./) sınıfının bir örneğine dönüştürür. |
| [StringWithQualityHeaderValue](./stringwithqualityheadervalue/)(String) | Yeni bir örnek oluşturur. |
| [StringWithQualityHeaderValue](./stringwithqualityheadervalue/)(String, double) | Yeni bir örnek oluşturur. |
| [ToString](./tostring/)() const override | C# [Object.ToString()](../../system/object/tostring/) yönteminin benzeri. Özel nesnelerin dizeye dönüştürülmesini sağlar. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<StringWithQualityHeaderValue\>\&) | Geçirilen bir dizeyi [StringWithQualityHeaderValue](./) sınıfının bir örneğine dönüştürmeyi dener. |
## Ayrıca Bakınız

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)

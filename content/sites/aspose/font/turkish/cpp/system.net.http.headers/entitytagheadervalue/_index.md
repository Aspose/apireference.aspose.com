---
title: "System::Net::Http::Headers::EntityTagHeaderValue sınıfı"
linktitle: "EntityTagHeaderValue"
second_title: "Aspose.Font için C++"
description: "System::Net::Http::Headers::EntityTagHeaderValue sınıfı. ''Entity-Tag'' başlığının bir değerini temsil eder. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Yığın (stack) üzerinde veya new operatörüyle örnek oluşturmaktan kaçının, çünkü bu çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve C++'ta fonksiyonlara argüman olarak geçirmek için bu işaretçiyi kullanın."
type: docs
weight: 500
url: /tr/cpp/system.net.http.headers/entitytagheadervalue/
---
## EntityTagHeaderValue class


''Entity-Tag'' başlığının bir değerini temsil eder. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Yığın (stack) üzerinde veya new operatörüyle örnek oluşturmaktan kaçının, çünkü bu çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve fonksiyonlara argüman olarak geçirmek için bu işaretçiyi kullanın.

```cpp
class EntityTagHeaderValue : public System::ICloneable
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [EntityTagHeaderValue](./entitytagheadervalue/)(String) | Yeni bir örnek oluşturur. |
| [EntityTagHeaderValue](./entitytagheadervalue/)(String, bool) | Yeni bir örnek oluşturur. |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Nesneleri C# [Object.Equals](../../system/object/equals/) semantiği kullanarak karşılaştırır. |
| static [get_Any](./get_any/)() | 'ETag' başlığının bir değerini alır. |
| [get_IsWeak](./get_isweak/)() | Geçerli örneğin zayıf bir doğrulayıcı olup olmadığını gösteren bir değer alır. |
| [get_Tag](./get_tag/)() | RTTI bilgisi. |
| static [GetEntityTagLength](./getentitytaglength/)(String, int32_t, System::SharedPtr\<EntityTagHeaderValue\>\&) | Belirtilen indeksden itibaren verilen bir dizeyi [EntityTagHeaderValue](./) sınıfının bir örneğine dönüştürür. |
| [GetHashCode](./gethashcode/)() const override | C# [Object.GetHashCode()](../../system/object/gethashcode/) yönteminin benzeri. Özel nesnelerin hash'lenmesini sağlar. |
| static [Parse](./parse/)(String) | Verilen bir dizeyi [EntityTagHeaderValue](./) sınıfının bir örneğine dönüştürür. |
| [ToString](./tostring/)() const override | C# [Object.ToString()](../../system/object/tostring/) yönteminin benzeri. Özel nesnelerin dizeye dönüştürülmesini sağlar. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<EntityTagHeaderValue\>\&) | Verilen bir dizeyi [EntityTagHeaderValue](./) sınıfının bir örneğine dönüştürmeye çalışır. |
## Ayrıca Bakınız

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)

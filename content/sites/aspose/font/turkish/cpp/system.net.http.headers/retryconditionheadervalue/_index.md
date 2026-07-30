---
title: "System::Net::Http::Headers::RetryConditionHeaderValue class"
linktitle: "RetryConditionHeaderValue"
second_title: "Aspose.Font için C++"
description: "System::Net::Http::Headers::RetryConditionHeaderValue sınıfı. ''Retry-After'' başlığının bir değerini temsil eder. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığına (stack) ya da operator new ile oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirin."
type: docs
weight: 2200
url: /tr/cpp/system.net.http.headers/retryconditionheadervalue/
---
## RetryConditionHeaderValue class


‘Retry-After’ başlığının bir değerini temsil eder. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığına (stack) ya da operator new ile oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin.

```cpp
class RetryConditionHeaderValue : public System::ICloneable
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Nesneleri C# [Object.Equals](../../system/object/equals/) semantiği kullanarak karşılaştırır. |
| [get_Date](./get_date/)() | RTTI bilgisi. |
| [get_Delta](./get_delta/)() | Delta değerini döndürür. |
| [GetHashCode](./gethashcode/)() const override | C# [Object.GetHashCode()](../../system/object/gethashcode/) yönteminin benzeri. Özel nesnelerin hash'lenmesini sağlar. |
| static [GetRetryConditionLength](./getretryconditionlength/)(String, int32_t, System::SharedPtr\<Object\>\&) | Belirtilen indeksden başlayan verilen dizeyi [RetryConditionHeaderValue](./) sınıfının bir örneğine dönüştürür. |
| static [Parse](./parse/)(String) | Verilen dizeyi [RetryConditionHeaderValue](./) sınıfının bir örneğine dönüştürür. |
| [RetryConditionHeaderValue](./retryconditionheadervalue/)(DateTimeOffset) | Yeni bir örnek oluşturur. |
| [RetryConditionHeaderValue](./retryconditionheadervalue/)(TimeSpan) | Yeni bir örnek oluşturur. |
| [ToString](./tostring/)() const override | C# [Object.ToString()](../../system/object/tostring/) yönteminin benzeri. Özel nesnelerin dizeye dönüştürülmesini sağlar. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<RetryConditionHeaderValue\>\&) | Verilen dizeyi [RetryConditionHeaderValue](./) sınıfının bir örneğine dönüştürmeye çalışır. |
## Ayrıca Bakınız

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)

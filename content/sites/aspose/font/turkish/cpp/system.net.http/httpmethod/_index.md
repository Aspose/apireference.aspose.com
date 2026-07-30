---
title: "System::Net::Http::HttpMethod sınıfı"
linktitle: "HttpMethod"
second_title: "Aspose.Font için C++"
description: "System::Net::Http::HttpMethod sınıfı. Bir HTTP metodunu temsil eder. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek, yığıt üzerinde veya new operatörüyle oluşturulmamalıdır; aksi takdirde çalışma zamanı hataları ve/veya doğrulama hataları ortaya çıkar. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 700
url: /tr/cpp/system.net.http/httpmethod/
---
## HttpMethod class


Bir HTTP metodunu temsil eder. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek, yığıt üzerinde veya new operatörüyle oluşturulmamalıdır; aksi takdirde çalışma zamanı hataları ve/veya doğrulama hataları ortaya çıkar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisiyle sarmalayın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class HttpMethod : public System::IEquatable<System::SharedPtr<System::Net::Http::HttpMethod>>
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<HttpMethod\>) override | Mevcut ve belirtilen nesnelerin eşit olup olmadığını belirler. |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Nesneleri C# [Object.Equals](../../system/object/equals/) semantiği kullanarak karşılaştırır. |
| static [get_Delete](./get_delete/)() | 'DELETE' HTTP yöntemini döndürür. |
| static [get_Get](./get_get/)() | 'GET' HTTP yöntemini döndürür. |
| static [get_Head](./get_head/)() | 'HEAD' HTTP yöntemini döndürür. |
| [get_Method](./get_method/)() | HTTP yönteminin bir dize temsilini döndürür. |
| static [get_Options](./get_options/)() | 'OPTIONS' HTTP yöntemini döndürür. |
| static [get_Post](./get_post/)() | 'POST' HTTP yöntemini döndürür. |
| static [get_Put](./get_put/)() | 'PUT' HTTP yöntemini döndürür. |
| static [get_Trace](./get_trace/)() | 'TRACE' HTTP yöntemini döndürür. |
| [GetHashCode](./gethashcode/)() const override | C# [Object.GetHashCode()](../../system/object/gethashcode/) yönteminin benzeri. Özel nesnelerin hash'lenmesini sağlar. |
| [HttpMethod](./httpmethod/)(String) | Yeni bir örnek oluşturur. |
| [ToString](./tostring/)() const override | C# [Object.ToString()](../../system/object/tostring/) yönteminin benzeri. Özel nesnelerin dizeye dönüştürülmesini sağlar. |
## Ayrıca Bakınız

* Class [IEquatable](../../system/iequatable/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Font for C++](../../)

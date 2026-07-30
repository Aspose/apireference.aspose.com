---
title: "System::Net::Http::Headers::ViaHeaderValue sınıfı"
linktitle: "ViaHeaderValue"
second_title: "Aspose.Font için C++"
description: "System::Net::Http::Headers::ViaHeaderValue sınıfı. ''Via'' başlığının bir değerini temsil eder. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek, yığıt üzerinde veya new operatörüyle oluşturulmamalıdır; aksi takdirde çalışma zamanı hataları ve/veya doğrulama hataları ortaya çıkar. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 2600
url: /tr/cpp/system.net.http.headers/viaheadervalue/
---
## ViaHeaderValue class


Bu sınıf, 'Via' başlığının bir değerini temsil eder. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek, yığıt üzerinde veya new operatörüyle oluşturulmamalıdır; aksi takdirde çalışma zamanı hataları ve/veya doğrulama hataları ortaya çıkar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisiyle sarmalayın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class ViaHeaderValue : public System::ICloneable
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Nesneleri C# [Object.Equals](../../system/object/equals/) semantiği kullanarak karşılaştırır. |
| [get_Comment](./get_comment/)() | ''Via'' başlık değerinden yorumu döndürür. |
| [get_ProtocolName](./get_protocolname/)() | RTTI bilgisi. |
| [get_ProtocolVersion](./get_protocolversion/)() | ''Via'' başlık değerinden protokol sürümünü döndürür. |
| [get_ReceivedBy](./get_receivedby/)() | İsteğin veya yanıtın alındığı ana bilgisayar ve bağlantı noktasını döndürür. |
| [GetHashCode](./gethashcode/)() const override | C# [Object.GetHashCode()](../../system/object/gethashcode/) yönteminin benzeri. Özel nesnelerin hash'lenmesini sağlar. |
| static [GetViaLength](./getvialength/)(String, int32_t, System::SharedPtr\<Object\>\&) | Belirtilen indeksden başlayan bir dizeyi [ViaHeaderValue](./) sınıfının bir örneğine dönüştürür. |
| static [Parse](./parse/)(String) | Verilen bir dizeyi [ViaHeaderValue](./) sınıfının bir örneğine dönüştürür. |
| [ToString](./tostring/)() const override | C# [Object.ToString()](../../system/object/tostring/) yönteminin benzeri. Özel nesnelerin dizeye dönüştürülmesini sağlar. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<ViaHeaderValue\>\&) | Verilen bir dizeyi [ViaHeaderValue](./) sınıfının bir örneğine dönüştürmeye çalışır. |
| [ViaHeaderValue](./viaheadervalue/)(String, String) | Yeni bir örnek oluşturur. |
| [ViaHeaderValue](./viaheadervalue/)(String, String, String) | Yeni bir örnek oluşturur. |
| [ViaHeaderValue](./viaheadervalue/)(String, String, String, String) | Yeni bir örnek oluşturur. |
## Ayrıca Bakınız

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)

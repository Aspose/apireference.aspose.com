---
title: "System::Net::DnsEndPoint sınıfı"
linktitle: "DnsEndPoint"
second_title: "Aspose.Font için C++"
description: "System::Net::DnsEndPoint sınıfı. Uygulamanın hizmete bağlanmak için kullandığı bilgileri içerir. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığıt üzerinde veya new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 800
url: /tr/cpp/system.net/dnsendpoint/
---
## DnsEndPoint class


Uygulamanın hizmete bağlanmak için kullandığı bilgileri içerir. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığıt üzerinde veya new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class DnsEndPoint : public System::Net::EndPoint
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [DnsEndPoint](./dnsendpoint/)(String, int32_t) | Yeni bir örnek oluşturur. |
| [DnsEndPoint](./dnsendpoint/)(String, int32_t, System::Net::Sockets::AddressFamily) | Yeni bir örnek oluşturur. |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Nesneleri C# [Object.Equals](../../system/object/equals/) semantiği kullanarak karşılaştırır. |
| [get_AddressFamily](./get_addressfamily/)() override | RTTI bilgisi. |
| [get_Host](./get_host/)() | RTTI bilgisi. |
| [get_Port](./get_port/)() | Bağlantı noktasının numarasını döndürür. |
| [GetHashCode](./gethashcode/)() const override | C# [Object.GetHashCode()](../../system/object/gethashcode/) yönteminin benzeri. Özel nesnelerin hash'lenmesini sağlar. |
| [ToString](./tostring/)() const override | C# [Object.ToString()](../../system/object/tostring/) yönteminin benzeri. Özel nesnelerin dizeye dönüştürülmesini sağlar. |
## Ayrıca Bakınız

* Class [EndPoint](../endpoint/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)

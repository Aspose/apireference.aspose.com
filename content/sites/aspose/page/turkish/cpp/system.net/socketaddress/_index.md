---
title: "System::Net::SocketAddress class"
linktitle: "SocketAddress"
second_title: "Aspose.Page için C++"
description: "System::Net::SocketAddress sınıfı. EndPoint sınıfı örnekleri hakkında serileştirilmiş bilgileri depolamak için kullanılır. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığına (stack) veya new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirin."
type: docs
weight: 3300
url: /tr/cpp/system.net/socketaddress/
---
## SocketAddress class


Bu sınıf, [EndPoint](../endpoint/) sınıfı örnekleri hakkında serileştirilmiş bilgileri depolamak için kullanılır. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığına (stack) veya new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisiyle sarmalayın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin.

```cpp
class SocketAddress : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Nesneleri C# [Object.Equals](../../system/object/equals/) semantiği kullanarak karşılaştırır. |
| [get_Family](./get_family/)() | RTTI bilgisi. |
| [get_Size](./get_size/)() | Temel tampon boyutunu döndürür. |
| [GetHashCode](./gethashcode/)() const override | C# [Object.GetHashCode()](../../system/object/gethashcode/) yönteminin benzeri. Özel nesnelerin hashlenmesini sağlar. |
| [idx_get](./idx_get/)(int32_t) | Belirtilen indeksteki temel tampon değerini alır. |
| [idx_set](./idx_set/)(int32_t, uint8_t) | Belirtilen indeksteki temel tampon değerini ayarlar. |
| [SocketAddress](./socketaddress/)(Sockets::AddressFamily) | Yeni bir örnek oluşturur. |
| [SocketAddress](./socketaddress/)(Sockets::AddressFamily, int32_t) | Yeni bir örnek oluşturur. |
| [ToString](./tostring/)() const override | C# [Object.ToString()](../../system/object/tostring/) yönteminin benzeri. Özel nesnelerin dizeye dönüştürülmesini sağlar. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)

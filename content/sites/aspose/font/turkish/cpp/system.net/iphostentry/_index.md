---
title: "System::Net::IPHostEntry sınıfı"
linktitle: "IPHostEntry"
second_title: "Aspose.Font için C++"
description: "System::Net::IPHostEntry sınıfı. Bir internet ana bilgisayar adresiyle ilgili bilgileri temsil eder. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Yığın üzerinde veya operator new kullanılarak bu tipin örneği oluşturulmaz; aksi takdirde çalışma zamanı hataları ve/veya doğrulama hataları ortaya çıkar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 2600
url: /tr/cpp/system.net/iphostentry/
---
## IPHostEntry class


Bir internet ana bilgisayar adresiyle ilgili bilgileri temsil eder. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Yığın üzerinde veya operator new kullanılarak bu tipin örneği oluşturulmaz; aksi takdirde çalışma zamanı hataları ve/veya doğrulama hataları ortaya çıkar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class IPHostEntry : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_AddressList](./get_addresslist/)() | Ana bilgisayarın IP adresi koleksiyonunu alır. |
| [get_Aliases](./get_aliases/)() | Ana bilgisayarın takma adlar koleksiyonunu alır. |
| [get_HostName](./get_hostname/)() const | RTTI bilgisi. |
| [IPHostEntry](./iphostentry/)() | Yeni bir örnek oluşturur. |
| [set_AddressList](./set_addresslist/)(System::ArrayPtr\<System::SharedPtr\<IPAddress\>\>) | Ana bilgisayarın IP adresi koleksiyonunu ayarlar. |
| [set_Aliases](./set_aliases/)(System::ArrayPtr\<String\>) | Ana bilgisayarın takma adlar koleksiyonunu ayarlar. |
| [set_HostName](./set_hostname/)(String) | Ana bilgisayar adını ayarlar. |
| [ToString](./tostring/)() const override | C# [Object.ToString()](../../system/object/tostring/) yönteminin benzeri. Özel nesnelerin dizeye dönüştürülmesini sağlar. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)

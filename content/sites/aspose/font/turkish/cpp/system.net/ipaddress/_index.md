---
title: "System::Net::IPAddress sınıfı"
linktitle: "IPAddress"
second_title: "Aspose.Font için C++"
description: "System::Net::IPAddress sınıfı. IP adresini temsil eder. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığına (stack) ya da operator new ile asla oluşturmamalısınız, çünkü bu çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 2400
url: /tr/cpp/system.net/ipaddress/
---
## IPAddress class


IP adresini temsil eder. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığına (stack) ya da operator new ile asla oluşturmamalısınız, çünkü bu çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class IPAddress : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Nesneleri C# [Object.Equals](../../system/object/equals/) semantiği kullanarak karşılaştırır. |
| [get_AddressFamily](./get_addressfamily/)() | Adres ailesini döndürür. |
| [get_IsIPv4MappedToIPv6](./get_isipv4mappedtoipv6/)() | Adresin bir IPv4 adresi olup IPv6 adresine eşlendiğini gösteren bir değer döndürür. |
| [get_IsIPv6LinkLocal](./get_isipv6linklocal/)() | Adresin bir IPv6 link-local adresi olup olmadığını gösteren bir değer döndürür. |
| [get_IsIPv6Multicast](./get_isipv6multicast/)() | Adresin küresel bir IPv6 çoklu yayın adresi olup olmadığını gösteren bir değer döndürür. |
| [get_IsIPv6SiteLocal](./get_isipv6sitelocal/)() | Adresin bir IPv6 site-local adresi olup olmadığını gösteren bir değer döndürür. |
| [get_IsIPv6Teredo](./get_isipv6teredo/)() | Adresin bir IPv6 Teredo adresi olup olmadığını gösteren bir değer döndürür. |
| [get_ScopeId](./get_scopeid/)() | IPv6 adresinin kapsam tanımlayıcısını alır. |
| [GetAddressBytes](./getaddressbytes/)() | IP adresinin bir bayt dizisini döndürür. |
| [GetHashCode](./gethashcode/)() const override | C# [Object.GetHashCode()](../../system/object/gethashcode/) yönteminin benzeri. Özel nesnelerin hash'lenmesini sağlar. |
| [GetImpl](./getimpl/)() const | Uygulamaya bir işaretçi döndürür. |
| static [HostToNetworkOrder](./hosttonetworkorder/)(int64_t) | Belirtilen ana bilgisayar bayt sırasını karşılık gelen ağ bayt sırasına dönüştürür. |
| static [HostToNetworkOrder](./hosttonetworkorder/)(int32_t) | Belirtilen ana bilgisayar bayt sırasını karşılık gelen ağ bayt sırasına dönüştürür. |
| static [HostToNetworkOrder](./hosttonetworkorder/)(int16_t) | Belirtilen ana bilgisayar bayt sırasını karşılık gelen ağ bayt sırasına dönüştürür. |
| [IPAddress](./ipaddress/)(int64_t) | Yeni bir örnek oluşturur. |
| [IPAddress](./ipaddress/)(System::ArrayPtr\<uint8_t\>, int64_t) | Yeni bir örnek oluşturur. |
| [IPAddress](./ipaddress/)(System::ArrayPtr\<uint8_t\>) | Yeni bir örnek oluşturur. |
| [IPAddress](./ipaddress/)() | Yeni bir örnek oluşturur. |
| static [IsLoopback](./isloopback/)(System::SharedPtr\<IPAddress\>) | Belirtilen adresin bir loopback adresi olup olmadığını gösteren bir değer döndürür. |
| [MapToIPv4](./maptoipv4/)() | Adresi IPv4 adresine eşler. |
| [MapToIPv6](./maptoipv6/)() | Adresi IPv6 adresine eşler. |
| static [NetworkToHostOrder](./networktohostorder/)(int64_t) | Belirtilen ağ bayt sırasını karşılık gelen ana bilgisayar bayt sırasına dönüştürür. |
| static [NetworkToHostOrder](./networktohostorder/)(int32_t) | Belirtilen ağ bayt sırasını karşılık gelen ana bilgisayar bayt sırasına dönüştürür. |
| static [NetworkToHostOrder](./networktohostorder/)(int16_t) | Belirtilen ağ bayt sırasını karşılık gelen ana bilgisayar bayt sırasına dönüştürür. |
| static [Parse](./parse/)(String) | Geçilen bir dizeyi [IPAddress](./) sınıfının bir örneğine dönüştürür. |
| [set_ScopeId](./set_scopeid/)(int64_t) | IPv6 adresinin kapsam tanımlayıcısını ayarlar. |
| [SetImpl](./setimpl/)(ImplPtr) | Uygulamaya bir işaretçi ayarlar. |
| [ToString](./tostring/)() const override | C# [Object.ToString()](../../system/object/tostring/) yönteminin benzeri. Özel nesnelerin dizeye dönüştürülmesini sağlar. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<IPAddress\>\&) | Geçilen bir dizeyi [IPAddress](./) sınıfının bir örneğine dönüştürmeye çalışır. |
## Alanlar

| Alan | Açıklama |
| --- | --- |
| static [Any](./any/) | RTTI bilgisi. |
| static [Broadcast](./broadcast/) | IPv4 yayın adresi. |
| static [IPv6Any](./ipv6any/) | Sunucunun tüm ağ arayüzlerini dinlemesi gerektiğini gösteren IPv6 adresi. |
| static [IPv6Loopback](./ipv6loopback/) | IPv6 loopback adresi. |
| static [IPv6None](./ipv6none/) | Sunucunun hiçbir ağ arayüzünü dinlememesi gerektiğini gösteren IPv6 adresi. |
| static [Loopback](./loopback/) | IPv4 loopback adresi. |
| static [None](./none/) | Sunucunun hiçbir ağ arayüzünü dinlememesi gerektiğini gösteren IPv4 adresi. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [ImplPtr](./implptr/) | Uygulama tipine bir işaretçi. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)

---
title: "System::Net::NetworkInformation::IPGlobalProperties sınıfı"
linktitle: "IPGlobalProperties"
second_title: "Aspose.Page için C++"
description: "System::Net::NetworkInformation::IPGlobalProperties sınıfı. Yerel bilgisayarın ağ bağlantısı hakkında bilgi temsil eder. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek hiçbir zaman yığına (stack) veya new operatörüyle oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıf her zaman System::SmartPtr işaretçisiyle sarılmalı ve bu işaretçi C++'ta fonksiyonlara argüman olarak geçirilmelidir."
type: docs
weight: 200
url: /tr/cpp/system.net.networkinformation/ipglobalproperties/
---
## IPGlobalProperties class


Yerel bilgisayarın ağ bağlantısı hakkında bilgi temsil eder. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığına (stack) veya operator new ile oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin.

```cpp
class IPGlobalProperties : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| virtual [get_DomainName](./get_domainname/)() | Yerel bilgisayarın kayıtlı olduğu alan adını döndürür. |
| virtual [get_HostName](./get_hostname/)() | Yerel bilgisayarın ana bilgisayar adını döndürür. |
| static [GetIPGlobalProperties](./getipglobalproperties/)() | RTTI bilgisi. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Net::NetworkInformation](../)
* Library [Aspose.Page for C++](../../)

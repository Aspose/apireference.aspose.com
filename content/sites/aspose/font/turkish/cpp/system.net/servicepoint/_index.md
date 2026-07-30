---
title: "System::Net::ServicePoint sınıfı"
linktitle: "ServicePoint"
second_title: "Aspose.Font için C++"
description: "System::Net::ServicePoint sınıfı. HTTP bağlantı yönetimi sağlar. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek, yığıt (stack) üzerinde veya new operatörüyle oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve C++'ta fonksiyonlara argüman olarak geçirmek için bu işaretçiyi kullanın."
type: docs
weight: 3100
url: /tr/cpp/system.net/servicepoint/
---
## ServicePoint class


HTTP bağlantı yönetimi sağlar. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örnek, yığıt (stack) üzerinde veya new operatörüyle oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisiyle sarmalayın ve fonksiyonlara argüman olarak geçirmek için bu işaretçiyi kullanın.

```cpp
class ServicePoint : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [CloseConnectionGroup](./closeconnectiongroup/)(String) | Belirtilen bağlantı grubuna ait bağlantıları kapatır ve kaldırır. |
| [get_Address](./get_address/)() | Geçerli örneğin bağlandığı sunucu URI'sını döndürür. |
| [get_BindIPEndPointDelegate](./get_bindipendpointdelegate/)() | RTTI bilgisi. |
| [get_Certificate](./get_certificate/)() | Geçerli örnek tarafından kullanılan bir sertifika döndürür. |
| [get_ClientCertificate](./get_clientcertificate/)() | Son istemci sertifikasını döndürür. |
| [get_ConnectionLeaseTimeout](./get_connectionleasetimeout/)() | Etkin [ServicePoint](./) nesnesinin kapatılacağı milisaniye cinsinden zaman aşımını alır. |
| [get_ConnectionLimit](./get_connectionlimit/)() | Geçerli örnek tarafından izin verilen maksimum bağlantı sayısını alır. |
| [get_ConnectionName](./get_connectionname/)() | Bağlantı adını döndürür. |
| [get_CurrentConnections](./get_currentconnections/)() | Açık bağlantı sayısını döndürür. |
| [get_Expect100Continue](./get_expect100continue/)() | 100-Continue davranışının kullanılıp kullanılmadığını gösteren bir değeri alır. |
| [get_IdleSince](./get_idlesince/)() | Bir ana bilgisayara yapılan son bağlantının tarih ve saatini döndürür. |
| [get_MaxIdleTime](./get_maxidletime/)() | Boşta kalan bir bağlantının kapatılacağı milisaniye cinsinden süreyi alır. |
| virtual [get_ProtocolVersion](./get_protocolversion/)() | HTTP sürümünü döndürür. |
| [get_ReceiveBufferSize](./get_receivebuffersize/)() | Alma tamponunun boyutunu alır. |
| [get_SupportsPipelining](./get_supportspipelining/)() | Geçerli örneğin boru hattı bağlantılarını destekleyip desteklemediğini gösteren bir değeri döndürür. |
| [get_UseNagleAlgorithm](./get_usenaglealgorithm/)() | Geçerli örnek tarafından yönetilen bağlantılar tarafından Nagle algoritmasının kullanılıp kullanılmadığını gösteren bir değeri alır. |
| [set_BindIPEndPointDelegate](./set_bindipendpointdelegate/)(BindIPEndPoint) | Yerel [IPEndPoint](../ipendpoint/) ile geçerli örneği ilişkilendirmek için kullanılan temsilciyi ayarlar. |
| [set_ConnectionLeaseTimeout](./set_connectionleasetimeout/)(int32_t) | Etkin [ServicePoint](./) nesnesinin kapatılacağı milisaniye cinsinden zaman aşımını ayarlar. |
| [set_ConnectionLimit](./set_connectionlimit/)(int32_t) | Geçerli örnek tarafından izin verilen maksimum bağlantı sayısını ayarlar. |
| [set_Expect100Continue](./set_expect100continue/)(bool) | 100-Continue davranışının kullanılıp kullanılmadığını gösteren bir değeri ayarlar. |
| [set_MaxIdleTime](./set_maxidletime/)(int32_t) | Boşta kalan bir bağlantının kapatılacağı milisaniye cinsinden süreyi ayarlar. |
| [set_ReceiveBufferSize](./set_receivebuffersize/)(int32_t) | Alma tamponunun boyutunu ayarlar. |
| [set_UseNagleAlgorithm](./set_usenaglealgorithm/)(bool) | Geçerli örnek tarafından yönetilen bağlantılar tarafından Nagle algoritmasının kullanılıp kullanılmadığını gösteren bir değeri ayarlar. |
| [SetTcpKeepAlive](./settcpkeepalive/)(bool, int32_t, int32_t) | 'Keep-Alive' seçeneğinin etkin olup olmadığını gösteren değeri ayarlar. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)

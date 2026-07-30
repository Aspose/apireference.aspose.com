---
title: "System::Net::ServicePointManager sınıfı"
linktitle: "ServicePointManager"
second_title: "Aspose.Font için C++"
description: "System::Net::ServicePointManager sınıfı. ServicePoint sınıfı örneklerinin yaşam döngüsü aşamalarını (oluşturma, sürdürme ve silme) yönetir. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığıt üzerinde veya new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 3200
url: /tr/cpp/system.net/servicepointmanager/
---
## ServicePointManager class


[ServicePoint](../servicepoint/) sınıfı örneklerinin yaşam döngüsü aşamalarını (oluşturma, sürdürme ve silme) yönetir. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığıt üzerinde veya new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class ServicePointManager : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| static [get_CertificatePolicy](./get_certificatepolicy/)() | Bir sertifika politikası alır. |
| static [get_CheckCertificateRevocationList](./get_checkcertificaterevocationlist/)() | Sertifikanın sertifika otoritesi iptal listesine karşı kontrol edilip edilmemesi gerektiğini gösteren bir değeri alır. |
| static [get_DefaultConnectionLimit](./get_defaultconnectionlimit/)() | ServicePoint sınıfı örnekleri tarafından izin verilen eşzamanlı bağlantıların azami sayısını alır. |
| static [get_DnsRefreshTimeout](./get_dnsrefreshtimeout/)() | Bir DNS çözümlemesinin geçerli kabul edildiği milisaniye cinsinden zaman aşımını alır. |
| static [get_EnableDnsRoundRobin](./get_enablednsroundrobin/)() | Bir DNS çözümlemesinin geçerli IP adresleri arasında döndürülüp döndürülmediğini gösteren bir değeri alır. |
| static [get_EncryptionPolicy](./get_encryptionpolicy/)() | Geçerli örnek tarafından kullanılan şifreleme politikasını döndürür. |
| static [get_Expect100Continue](./get_expect100continue/)() | ServicePoint sınıfı örneklerinin 100-Continue davranışını kullanıp kullanmadığını gösteren bir değeri alır. |
| static [get_MaxServicePointIdleTime](./get_maxservicepointidletime/)() | ServicePoint sınıfı örneklerinin azami boşta kalma süresini alır. |
| static [get_MaxServicePoints](./get_maxservicepoints/)() | Geçerli örnek tarafından yönetilebilecek ServicePoint sınıfı örneklerinin azami sayısını alır. |
| static [get_ReusePort](./get_reuseport/)() | Çıktı bağlantı soketlerinin 'SO_REUSE_UNICASTPORT' seçeneğini kullanıp kullanmadığını gösteren bir değeri alır. |
| static [get_SecurityProtocol](./get_securityprotocol/)() | Geçerli örnek tarafından yönetilen ServicePoint sınıfı örnekleri tarafından kullanılan güvenlik protokolü tipini alır. |
| static [get_ServerCertificateValidationCallback](./get_servercertificatevalidationcallback/)() | Bir sunucu sertifikasını doğrulamak için kullanılan geri çağırma işlevini alır. |
| static [get_UseNagleAlgorithm](./get_usenaglealgorithm/)() | ServicePoint sınıfı örneklerinin Nagle algoritmasını kullanıp kullanmadığını gösteren bir değeri alır. |
| static [set_CertificatePolicy](./set_certificatepolicy/)(System::SharedPtr\<ICertificatePolicy\>) | Bir sertifika politikası ayarlar. |
| static [set_CheckCertificateRevocationList](./set_checkcertificaterevocationlist/)(bool) | Sertifikanın sertifika otoritesi iptal listesine karşı kontrol edilmesi gerekip gerekmediğini gösteren bir değer ayarlar. |
| static [set_DefaultConnectionLimit](./set_defaultconnectionlimit/)(int32_t) | ServicePoint-class örnekleri tarafından izin verilen eşzamanlı bağlantıların azami sayısını ayarlar. |
| static [set_DnsRefreshTimeout](./set_dnsrefreshtimeout/)(int32_t) | Bir DNS çözümlemesinin geçerli kabul edildiği süreyi milisaniye cinsinden zaman aşımı olarak ayarlar. |
| static [set_EnableDnsRoundRobin](./set_enablednsroundrobin/)(bool) | Bir DNS çözümlemesinin uygulanabilir IP adresleri arasında döndürülüp döndürülmediğini gösteren bir değer ayarlar. |
| static [set_Expect100Continue](./set_expect100continue/)(bool) | ServicePoint-class örneklerinin 100-Continue davranışını kullanıp kullanmadığını gösteren bir değer ayarlar. |
| static [set_MaxServicePointIdleTime](./set_maxservicepointidletime/)(int32_t) | ServicePoint-class örneklerinin azami boşta kalma süresini ayarlar. |
| static [set_MaxServicePoints](./set_maxservicepoints/)(int32_t) | Geçerli örnek tarafından yönetilebilecek ServicePoint-class örneklerinin azami sayısını ayarlar. |
| static [set_ReusePort](./set_reuseport/)(bool) | Çıktı bağlantı soketlerinin 'SO_REUSE_UNICASTPORT' seçeneğini kullanıp kullanmadığını gösteren bir değer ayarlar. |
| static [set_SecurityProtocol](./set_securityprotocol/)(SecurityProtocolType) | Geçerli örnek tarafından yönetilen ServicePoint-class örnekleri tarafından kullanılan güvenlik protokolü tipini ayarlar. |
| static [set_ServerCertificateValidationCallback](./set_servercertificatevalidationcallback/)(Security::RemoteCertificateValidationCallback) | Sunucu sertifikasını doğrulamak için kullanılan geri çağırma işlevini ayarlar. |
| static [set_UseNagleAlgorithm](./set_usenaglealgorithm/)(bool) | ServicePoint-class örneklerinin Nagle algoritmasını kullanıp kullanmadığını gösteren bir değer ayarlar. |
| static [SetTcpKeepAlive](./settcpkeepalive/)(bool, int32_t, int32_t) | 'Keep-Alive' seçeneğinin etkin olup olmadığını gösteren değeri ayarlar. |
## Alanlar

| Alan | Açıklama |
| --- | --- |
| static [DefaultNonPersistentConnectionLimit](./defaultnonpersistentconnectionlimit/) | RTTI bilgisi. |
| static [DefaultPersistentConnectionLimit](./defaultpersistentconnectionlimit/) | Kalıcı bağlantıların varsayılan sayısı. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)

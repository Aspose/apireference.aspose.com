---
title: "Класс System::Net::ServicePointManager"
linktitle: "ServicePointManager"
second_title: "Aspose.Font для C++"
description: "Класс System::Net::ServicePointManager. Управляет этапами жизненного цикла (созданием, поддержкой и удалением) экземпляров класса ServicePoint. Объекты этого класса должны создаваться только с помощью функции System::MakeObject(). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель System::SmartPtr и используйте этот указатель для передачи его в функции в качестве аргумента в C++."
type: docs
weight: 3200
url: /ru/cpp/system.net/servicepointmanager/
---
## ServicePointManager class


Управляет этапами жизненного цикла (созданием, поддержкой и удалением) экземпляров класса [ServicePoint](../servicepoint/). Объекты этого класса должны создаваться только с помощью функции [System::MakeObject()](../../system/makeobject/). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель [System::SmartPtr](../../system/smartptr/) и используйте этот указатель для передачи его в функции в качестве аргумента.

```cpp
class ServicePointManager : public System::Object
```

## Методы

| Метод | Описание |
| --- | --- |
| static [get_CertificatePolicy](./get_certificatepolicy/)() | Получает политику сертификатов. |
| static [get_CheckCertificateRevocationList](./get_checkcertificaterevocationlist/)() | Получает значение, указывающее, должен ли сертификат проверяться по списку отзыва сертификатов удостоверяющего центра. |
| static [get_DefaultConnectionLimit](./get_defaultconnectionlimit/)() | Получает максимальное количество одновременных соединений, разрешённых экземплярами класса ServicePoint. |
| static [get_DnsRefreshTimeout](./get_dnsrefreshtimeout/)() | Получает тайм‑аут в миллисекундах, в течение которого разрешение DNS считается действительным. |
| static [get_EnableDnsRoundRobin](./get_enablednsroundrobin/)() | Получает значение, указывающее, вращается ли разрешение DNS среди применимых IP‑адресов. |
| static [get_EncryptionPolicy](./get_encryptionpolicy/)() | Возвращает политику шифрования, используемую текущим экземпляром. |
| static [get_Expect100Continue](./get_expect100continue/)() | Получает значение, указывающее, используют ли экземпляры класса ServicePoint поведение 100‑Continue. |
| static [get_MaxServicePointIdleTime](./get_maxservicepointidletime/)() | Получает максимальное время простоя экземпляров класса ServicePoint. |
| static [get_MaxServicePoints](./get_maxservicepoints/)() | Получает максимальное количество экземпляров класса ServicePoint, которые могут управляться текущим экземпляром. |
| static [get_ReusePort](./get_reuseport/)() | Получает значение, указывающее, используют ли выходные сокеты соединений опцию 'SO_REUSE_UNICASTPORT'. |
| static [get_SecurityProtocol](./get_securityprotocol/)() | Получает тип протокола безопасности, используемый экземплярами класса ServicePoint, управляемыми текущим экземпляром. |
| static [get_ServerCertificateValidationCallback](./get_servercertificatevalidationcallback/)() | Получает обратный вызов, используемый для проверки сертификата сервера. |
| static [get_UseNagleAlgorithm](./get_usenaglealgorithm/)() | Получает значение, указывающее, используют ли экземпляры класса ServicePoint алгоритм Нагла. |
| static [set_CertificatePolicy](./set_certificatepolicy/)(System::SharedPtr\<ICertificatePolicy\>) | Устанавливает политику сертификатов. |
| static [set_CheckCertificateRevocationList](./set_checkcertificaterevocationlist/)(bool) | Устанавливает значение, указывающее, должен ли сертификат проверяться по списку отзыва сертификатов удостоверяющего центра. |
| static [set_DefaultConnectionLimit](./set_defaultconnectionlimit/)(int32_t) | Устанавливает максимальное количество одновременных соединений, разрешённых экземплярами ServicePoint-class. |
| static [set_DnsRefreshTimeout](./set_dnsrefreshtimeout/)(int32_t) | Устанавливает тайм‑аут в миллисекундах, в течение которого разрешение DNS считается действительным. |
| static [set_EnableDnsRoundRobin](./set_enablednsroundrobin/)(bool) | Устанавливает значение, указывающее, вращается ли разрешение DNS среди соответствующих IP‑адресов. |
| static [set_Expect100Continue](./set_expect100continue/)(bool) | Устанавливает значение, указывающее, используют ли экземпляры ServicePoint-class поведение 100‑Continue. |
| static [set_MaxServicePointIdleTime](./set_maxservicepointidletime/)(int32_t) | Устанавливает максимальное время простоя экземпляров ServicePoint-class. |
| static [set_MaxServicePoints](./set_maxservicepoints/)(int32_t) | Устанавливает максимальное количество экземпляров ServicePoint-class, которые могут управляться текущим экземпляром. |
| static [set_ReusePort](./set_reuseport/)(bool) | Устанавливает значение, указывающее, используют ли выходные сокеты соединений опцию 'SO_REUSE_UNICASTPORT'. |
| static [set_SecurityProtocol](./set_securityprotocol/)(SecurityProtocolType) | Устанавливает тип протокола безопасности, используемый экземплярами ServicePoint-class, управляемыми текущим экземпляром. |
| static [set_ServerCertificateValidationCallback](./set_servercertificatevalidationcallback/)(Security::RemoteCertificateValidationCallback) | Устанавливает обратный вызов, используемый для проверки серверного сертификата. |
| static [set_UseNagleAlgorithm](./set_usenaglealgorithm/)(bool) | Устанавливает значение, указывающее, используют ли экземпляры ServicePoint-class алгоритм Нейгла. |
| static [SetTcpKeepAlive](./settcpkeepalive/)(bool, int32_t, int32_t) | Устанавливает значение, указывающее, включена ли опция 'Keep-Alive'. |
## Поля

| Поле | Описание |
| --- | --- |
| static [DefaultNonPersistentConnectionLimit](./defaultnonpersistentconnectionlimit/) | Информация RTTI. |
| static [DefaultPersistentConnectionLimit](./defaultpersistentconnectionlimit/) | Количество постоянных соединений по умолчанию. |
## См. также

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)

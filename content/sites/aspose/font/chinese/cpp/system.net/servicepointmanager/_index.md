---
title: "System::Net::ServicePointManager 类"
linktitle: "ServicePointManager"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::ServicePointManager 类。管理 ServicePoint 类实例的生命周期阶段（创建、维护和删除）。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针在 C++ 中将其作为参数传递给函数。"
type: docs
weight: 3200
url: /zh/cpp/system.net/servicepointmanager/
---
## ServicePointManager class


管理 [ServicePoint](../servicepoint/) 类实例的生命周期阶段（创建、维护和删除）。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class ServicePointManager : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| static [get_CertificatePolicy](./get_certificatepolicy/)() | 获取证书策略。 |
| static [get_CheckCertificateRevocationList](./get_checkcertificaterevocationlist/)() | 获取一个值，指示是否必须将证书与证书颁发机构的吊销列表进行检查。 |
| static [get_DefaultConnectionLimit](./get_defaultconnectionlimit/)() | 获取 ServicePoint 类实例允许的最大并发连接数。 |
| static [get_DnsRefreshTimeout](./get_dnsrefreshtimeout/)() | 获取 DNS 解析被视为有效的超时时间（毫秒）。 |
| static [get_EnableDnsRoundRobin](./get_enablednsroundrobin/)() | 获取一个值，指示 DNS 解析是否在适用的 IP 地址之间轮换。 |
| static [get_EncryptionPolicy](./get_encryptionpolicy/)() | 返回当前实例使用的加密策略。 |
| static [get_Expect100Continue](./get_expect100continue/)() | 获取一个值，指示 ServicePoint 类实例是否使用 100-Continue 行为。 |
| static [get_MaxServicePointIdleTime](./get_maxservicepointidletime/)() | 获取 ServicePoint 类实例的最大空闲时间。 |
| static [get_MaxServicePoints](./get_maxservicepoints/)() | 获取当前实例可以管理的 ServicePoint 类实例的最大数量。 |
| static [get_ReusePort](./get_reuseport/)() | 获取一个值，指示输出连接套接字是否使用 'SO_REUSE_UNICASTPORT' 选项。 |
| static [get_SecurityProtocol](./get_securityprotocol/)() | 获取当前实例管理的 ServicePoint 类实例使用的安全协议类型。 |
| static [get_ServerCertificateValidationCallback](./get_servercertificatevalidationcallback/)() | 获取用于验证服务器证书的回调函数。 |
| static [get_UseNagleAlgorithm](./get_usenaglealgorithm/)() | 获取一个值，指示 ServicePoint 类实例是否使用 Nagle 算法。 |
| static [set_CertificatePolicy](./set_certificatepolicy/)(System::SharedPtr\<ICertificatePolicy\>) | 设置证书策略。 |
| static [set_CheckCertificateRevocationList](./set_checkcertificaterevocationlist/)(bool) | 设置一个值，指示是否必须将证书与证书颁发机构的吊销列表进行检查。 |
| static [set_DefaultConnectionLimit](./set_defaultconnectionlimit/)(int32_t) | 设置 ServicePoint 类实例允许的最大并发连接数。 |
| static [set_DnsRefreshTimeout](./set_dnsrefreshtimeout/)(int32_t) | 设置 DNS 解析在毫秒内被视为有效的超时时间。 |
| static [set_EnableDnsRoundRobin](./set_enablednsroundrobin/)(bool) | 设置一个值，以指示 DNS 解析是否在适用的 IP 地址之间轮转。 |
| static [set_Expect100Continue](./set_expect100continue/)(bool) | 设置一个值，以指示 ServicePoint 类实例是否使用 100-Continue 行为。 |
| static [set_MaxServicePointIdleTime](./set_maxservicepointidletime/)(int32_t) | 设置 ServicePoint 类实例的最大空闲时间。 |
| static [set_MaxServicePoints](./set_maxservicepoints/)(int32_t) | 设置当前实例可以管理的 ServicePoint 类实例的最大数量。 |
| static [set_ReusePort](./set_reuseport/)(bool) | 设置一个值，以指示输出连接套接字是否使用 'SO_REUSE_UNICASTPORT' 选项。 |
| static [set_SecurityProtocol](./set_securityprotocol/)(SecurityProtocolType) | 设置当前实例管理的 ServicePoint 类实例使用的安全协议类型。 |
| static [set_ServerCertificateValidationCallback](./set_servercertificatevalidationcallback/)(Security::RemoteCertificateValidationCallback) | 设置用于验证服务器证书的回调函数。 |
| static [set_UseNagleAlgorithm](./set_usenaglealgorithm/)(bool) | 设置一个值，以指示 ServicePoint 类实例是否使用 Nagle 算法。 |
| static [SetTcpKeepAlive](./settcpkeepalive/)(bool, int32_t, int32_t) | 设置指示是否启用 'Keep-Alive' 选项的值。 |
## 字段

| 字段 | 描述 |
| --- | --- |
| static [DefaultNonPersistentConnectionLimit](./defaultnonpersistentconnectionlimit/) | RTTI 信息。 |
| static [DefaultPersistentConnectionLimit](./defaultpersistentconnectionlimit/) | 默认的持久连接数。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)

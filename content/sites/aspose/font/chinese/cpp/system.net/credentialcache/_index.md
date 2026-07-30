---
title: "System::Net::CredentialCache 类"
linktitle: "CredentialCache"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::CredentialCache 类。提供凭据存储。此类的对象应仅使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并在 C++ 中使用该指针将其作为参数传递给函数。"
type: docs
weight: 600
url: /zh/cpp/system.net/credentialcache/
---
## CredentialCache class


提供凭据存储。此类的对象应仅使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class CredentialCache : public System::Net::ICredentials,
                        public System::Net::ICredentialsByHost
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Add](./add/)(System::SharedPtr\<Uri\>, String, System::SharedPtr\<NetworkCredential\>) | 将指定的网络凭据添加到缓存中。 |
| [Add](./add/)(String, int32_t, String, System::SharedPtr\<NetworkCredential\>) | 将指定的网络凭据添加到缓存中。 |
| [CredentialCache](./credentialcache/)() | 构造一个新实例。 |
| static [get_DefaultCredentials](./get_defaultcredentials/)() | RTTI 信息。 |
| static [get_DefaultNetworkCredentials](./get_defaultnetworkcredentials/)() | 返回当前用户或应用程序的网络凭据。 |
| [GetCredential](./getcredential/)(System::SharedPtr\<Uri\>, String) override | 返回指定 URI 前缀和身份验证类型的凭据。 |
| [GetCredential](./getcredential/)(String, int32_t, String) override | 返回指定主机名、端口和身份验证类型的凭据。 |
| [Remove](./remove/)(System::SharedPtr\<Uri\>, String) | 移除指定 URI 前缀和身份验证类型的网络凭据。 |
| [Remove](./remove/)(String, int32_t, String) | 移除指定主机名、端口和身份验证类型的网络凭据。 |
## 另见

* Class [ICredentials](../icredentials/)
* Class [ICredentialsByHost](../icredentialsbyhost/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)

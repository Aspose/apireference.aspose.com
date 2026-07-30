---
title: "System::Net::CredentialCache::GetCredential 方法"
linktitle: "GetCredential"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::CredentialCache::GetCredential 方法。返回 C++ 中指定主机名、端口和身份验证类型的凭据。"
type: docs
weight: 500
url: /zh/cpp/system.net/credentialcache/getcredential/
---
## CredentialCache::GetCredential(String, int32_t, String) method


返回指定主机名、端口和身份验证类型的凭据。

```cpp
System::SharedPtr<NetworkCredential> System::Net::CredentialCache::GetCredential(String host, int32_t port, String authenticationType) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| host | String | 与凭据关联的主机名。 |
| port | int32_t | 端口号。 |
| authenticationType | String | 身份验证类型。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [NetworkCredential](../../networkcredential/)
* Class [String](../../../system/string/)
* Class [CredentialCache](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)
## CredentialCache::GetCredential(System::SharedPtr\<Uri\>, String) method


返回指定 URI 前缀和身份验证类型的凭据。

```cpp
System::SharedPtr<NetworkCredential> System::Net::CredentialCache::GetCredential(System::SharedPtr<Uri> uriPrefix, String authenticationType) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| uriPrefix | System::SharedPtr\<Uri\> | URI 前缀。 |
| authenticationType | String | 身份验证类型。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [NetworkCredential](../../networkcredential/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [CredentialCache](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)

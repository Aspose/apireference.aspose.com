---
title: "System::Net::CredentialCache::Add 方法"
linktitle: "Add"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::CredentialCache::Add 方法。将指定的网络凭据添加到 C++ 中的缓存。"
type: docs
weight: 400
url: /zh/cpp/system.net/credentialcache/add/
---
## CredentialCache::Add(String, int32_t, String, System::SharedPtr\<NetworkCredential\>) method


将指定的网络凭据添加到缓存中。

```cpp
void System::Net::CredentialCache::Add(String host, int32_t port, String authenticationType, System::SharedPtr<NetworkCredential> credential)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| host | String | 与凭据关联的主机名。 |
| port | int32_t | 端口号。 |
| authenticationType | String | 身份验证方案。 |
| credential | System::SharedPtr\<NetworkCredential\> | 要添加的凭据。 |

## 另见

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [NetworkCredential](../../networkcredential/)
* Class [CredentialCache](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)
## CredentialCache::Add(System::SharedPtr\<Uri\>, String, System::SharedPtr\<NetworkCredential\>) method


将指定的网络凭据添加到缓存中。

```cpp
void System::Net::CredentialCache::Add(System::SharedPtr<Uri> uriPrefix, String authenticationType, System::SharedPtr<NetworkCredential> credential)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| uriPrefix | System::SharedPtr\<Uri\> | 与凭据关联的资源 URI 前缀。 |
| authenticationType | String | 身份验证方案。 |
| credential | System::SharedPtr\<NetworkCredential\> | 要添加的凭据。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [NetworkCredential](../../networkcredential/)
* Class [CredentialCache](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)

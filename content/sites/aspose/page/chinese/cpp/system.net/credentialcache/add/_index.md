---
title: "System::Net::CredentialCache::Add 方法"
linktitle: "Add"
second_title: "Aspose.Page 适用于 C++"
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


| Parameter | Type | 描述 |
| --- | --- | --- |
| host | 字符串 | 与凭据关联的主机名。 |
| port | int32_t | 端口号。 |
| authenticationType | 字符串 | 身份验证方案。 |
| 凭据 | System::SharedPtr\<NetworkCredential\> | 要添加的凭据。 |

## 另见

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [NetworkCredential](../../networkcredential/)
* Class [CredentialCache](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
## CredentialCache::Add(System::SharedPtr\<Uri\>, String, System::SharedPtr\<NetworkCredential\>) method


将指定的网络凭据添加到缓存中。

```cpp
void System::Net::CredentialCache::Add(System::SharedPtr<Uri> uriPrefix, String authenticationType, System::SharedPtr<NetworkCredential> credential)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| uriPrefix | System::SharedPtr\<Uri\> | 与凭据关联的资源的 URI 前缀。 |
| authenticationType | 字符串 | 身份验证方案。 |
| 凭据 | System::SharedPtr\<NetworkCredential\> | 要添加的凭据。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [NetworkCredential](../../networkcredential/)
* Class [CredentialCache](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)

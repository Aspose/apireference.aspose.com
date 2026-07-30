---
title: "System::Net::CredentialCache::GetCredential yöntemi"
linktitle: "GetCredential"
second_title: "Aspose.Font için C++"
description: "System::Net::CredentialCache::GetCredential yöntemi. C++'da belirtilen ana bilgisayar adı, bağlantı noktası ve kimlik doğrulama türü için kimlik bilgilerini döndürür."
type: docs
weight: 500
url: /tr/cpp/system.net/credentialcache/getcredential/
---
## CredentialCache::GetCredential(String, int32_t, String) method


Belirtilen ana bilgisayar adı, bağlantı noktası ve kimlik doğrulama türü için kimlik bilgilerini döndürür.

```cpp
System::SharedPtr<NetworkCredential> System::Net::CredentialCache::GetCredential(String host, int32_t port, String authenticationType) override
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| host | Dize | Kimlik bilgilerinin ilişkilendirildiği ana bilgisayar adı. |
| bağlantı noktası | int32_t | Bağlantı noktası numarası. |
| authenticationType | Dize | Kimlik doğrulama türü. |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [NetworkCredential](../../networkcredential/)
* Class [String](../../../system/string/)
* Class [CredentialCache](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)
## CredentialCache::GetCredential(System::SharedPtr\<Uri\>, String) method


Belirtilen URI öneki ve kimlik doğrulama türü için kimlik bilgilerini döndürür.

```cpp
System::SharedPtr<NetworkCredential> System::Net::CredentialCache::GetCredential(System::SharedPtr<Uri> uriPrefix, String authenticationType) override
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| uriPrefix | System::SharedPtr\<Uri\> | URI öneki. |
| authenticationType | Dize | Bir kimlik doğrulama türü. |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [NetworkCredential](../../networkcredential/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [CredentialCache](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)

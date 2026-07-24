---
title: "System::Net::CredentialCache::Add yöntemi"
linktitle: "Add"
second_title: "Aspose.Page için C++"
description: "System::Net::CredentialCache::Add yöntemi. Belirtilen ağ kimlik bilgilerini C++'da önbelleğe ekler."
type: docs
weight: 400
url: /tr/cpp/system.net/credentialcache/add/
---
## CredentialCache::Add(String, int32_t, String, System::SharedPtr\<NetworkCredential\>) method


Belirtilen ağ kimlik bilgilerini önbelleğe ekler.

```cpp
void System::Net::CredentialCache::Add(String host, int32_t port, String authenticationType, System::SharedPtr<NetworkCredential> credential)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| ana bilgisayar | String | Kimlik bilgilerinin ilişkilendirildiği ana bilgisayar adı. |
| bağlantı noktası | int32_t | Bağlantı noktası numarası. |
| authenticationType | String | Kimlik doğrulama şeması. |
| kimlik bilgisi | System::SharedPtr\<NetworkCredential\> | Eklenecek kimlik bilgileri. |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [NetworkCredential](../../networkcredential/)
* Class [CredentialCache](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
## CredentialCache::Add(System::SharedPtr\<Uri\>, String, System::SharedPtr\<NetworkCredential\>) method


Belirtilen ağ kimlik bilgilerini önbelleğe ekler.

```cpp
void System::Net::CredentialCache::Add(System::SharedPtr<Uri> uriPrefix, String authenticationType, System::SharedPtr<NetworkCredential> credential)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| uriPrefix | System::SharedPtr\<Uri\> | Kimlik bilgilerinin ilişkilendirildiği kaynağın URI öneki. |
| authenticationType | String | Kimlik doğrulama şeması. |
| kimlik bilgisi | System::SharedPtr\<NetworkCredential\> | Eklenecek kimlik bilgileri. |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [NetworkCredential](../../networkcredential/)
* Class [CredentialCache](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)

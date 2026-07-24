---
title: "System::Net::CredentialCache::GetCredential methode"
linktitle: "GetCredential"
second_title: "Aspose.Page voor C++"
description: "System::Net::CredentialCache::GetCredential methode. Retourneert referenties voor de opgegeven hostnaam, poort en authenticatietype in C++."
type: docs
weight: 500
url: /nl/cpp/system.net/credentialcache/getcredential/
---
## CredentialCache::GetCredential(String, int32_t, String) method


Retourneert referenties voor de opgegeven hostnaam, poort en authenticatietype.

```cpp
System::SharedPtr<NetworkCredential> System::Net::CredentialCache::GetCredential(String host, int32_t port, String authenticationType) override
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| host | String | De hostnaam waaraan de referenties zijn gekoppeld. |
| port | int32_t | Het poortnummer. |
| authenticationType | String | Het authenticatietype. |

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [NetworkCredential](../../networkcredential/)
* Class [String](../../../system/string/)
* Class [CredentialCache](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
## CredentialCache::GetCredential(System::SharedPtr\<Uri\>, String) method


Retourneert referenties voor het opgegeven URI-voorvoegsel en authenticatietype.

```cpp
System::SharedPtr<NetworkCredential> System::Net::CredentialCache::GetCredential(System::SharedPtr<Uri> uriPrefix, String authenticationType) override
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| uriPrefix | System::SharedPtr\<Uri\> | Het URI-voorvoegsel. |
| authenticationType | String | Een authenticatietype. |

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [NetworkCredential](../../networkcredential/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [CredentialCache](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)

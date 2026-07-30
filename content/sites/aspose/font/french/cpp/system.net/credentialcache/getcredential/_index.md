---
title: "System::Net::CredentialCache::GetCredential méthode"
linktitle: "GetCredential"
second_title: "Aspose.Font pour C++"
description: "System::Net::CredentialCache::GetCredential méthode. Renvoie les informations d'identification pour le nom d'hôte, le port et le type d'authentification spécifiés en C++."
type: docs
weight: 500
url: /fr/cpp/system.net/credentialcache/getcredential/
---
## CredentialCache::GetCredential(String, int32_t, String) method


Renvoie les informations d'identification pour le nom d'hôte, le port et le type d'authentification spécifiés.

```cpp
System::SharedPtr<NetworkCredential> System::Net::CredentialCache::GetCredential(String host, int32_t port, String authenticationType) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| hôte | String | Le nom d'hôte avec lequel les informations d'identification sont associées. |
| port | int32_t | Le numéro de port. |
| authenticationType | String | Le type d’authentification. |

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [NetworkCredential](../../networkcredential/)
* Class [String](../../../system/string/)
* Class [CredentialCache](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)
## CredentialCache::GetCredential(System::SharedPtr\<Uri\>, String) method


Renvoie les informations d'identification pour le préfixe URI spécifié et le type d'authentification.

```cpp
System::SharedPtr<NetworkCredential> System::Net::CredentialCache::GetCredential(System::SharedPtr<Uri> uriPrefix, String authenticationType) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| uriPrefix | System::SharedPtr\<Uri\> | Le préfixe URI. |
| authenticationType | String | Un type d'authentification. |

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [NetworkCredential](../../networkcredential/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [CredentialCache](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)

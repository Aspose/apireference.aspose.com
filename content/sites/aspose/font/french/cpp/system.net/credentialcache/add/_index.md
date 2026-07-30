---
title: "System::Net::CredentialCache::Add méthode"
linktitle: "Add"
second_title: "Aspose.Font pour C++"
description: "System::Net::CredentialCache::Add méthode. Ajoute les informations d'identification réseau spécifiées au cache en C++."
type: docs
weight: 400
url: /fr/cpp/system.net/credentialcache/add/
---
## CredentialCache::Add(String, int32_t, String, System::SharedPtr\<NetworkCredential\>) method


Ajoute les informations d'identification réseau spécifiées au cache.

```cpp
void System::Net::CredentialCache::Add(String host, int32_t port, String authenticationType, System::SharedPtr<NetworkCredential> credential)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| hôte | String | Le nom d'hôte avec lequel les informations d'identification sont associées. |
| port | int32_t | Le numéro de port. |
| authenticationType | String | Le schéma d'authentification. |
| identifiant | System::SharedPtr\<NetworkCredential\> | Les informations d'identification à ajouter. |

## Voir aussi

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [NetworkCredential](../../networkcredential/)
* Class [CredentialCache](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)
## CredentialCache::Add(System::SharedPtr\<Uri\>, String, System::SharedPtr\<NetworkCredential\>) method


Ajoute les informations d'identification réseau spécifiées au cache.

```cpp
void System::Net::CredentialCache::Add(System::SharedPtr<Uri> uriPrefix, String authenticationType, System::SharedPtr<NetworkCredential> credential)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| uriPrefix | System::SharedPtr\<Uri\> | Le préfixe d'URI de la ressource avec lequel les informations d'identification sont associées. |
| authenticationType | String | Le schéma d'authentification. |
| identifiant | System::SharedPtr\<NetworkCredential\> | Les informations d'identification à ajouter. |

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [NetworkCredential](../../networkcredential/)
* Class [CredentialCache](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)

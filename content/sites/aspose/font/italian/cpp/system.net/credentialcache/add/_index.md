---
title: "Metodo System::Net::CredentialCache::Add"
linktitle: "Add"
second_title: "Aspose.Font per C++"
description: "Metodo System::Net::CredentialCache::Add. Aggiunge le credenziali di rete specificate alla cache in C++."
type: docs
weight: 400
url: /it/cpp/system.net/credentialcache/add/
---
## CredentialCache::Add(String, int32_t, String, System::SharedPtr\<NetworkCredential\>) method


Aggiunge le credenziali di rete specificate alla cache.

```cpp
void System::Net::CredentialCache::Add(String host, int32_t port, String authenticationType, System::SharedPtr<NetworkCredential> credential)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| host | Stringa | Il nome host a cui sono associate le credenziali. |
| porta | int32_t | Il numero di porta. |
| authenticationType | Stringa | Lo schema di autenticazione. |
| credential | System::SharedPtr\<NetworkCredential\> | Le credenziali da aggiungere. |

## Vedi anche

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [NetworkCredential](../../networkcredential/)
* Class [CredentialCache](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)
## CredentialCache::Add(System::SharedPtr\<Uri\>, String, System::SharedPtr\<NetworkCredential\>) method


Aggiunge le credenziali di rete specificate alla cache.

```cpp
void System::Net::CredentialCache::Add(System::SharedPtr<Uri> uriPrefix, String authenticationType, System::SharedPtr<NetworkCredential> credential)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| uriPrefix | System::SharedPtr\<Uri\> | Il prefisso URI della risorsa con cui sono associate le credenziali. |
| authenticationType | Stringa | Lo schema di autenticazione. |
| credential | System::SharedPtr\<NetworkCredential\> | Le credenziali da aggiungere. |

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [NetworkCredential](../../networkcredential/)
* Class [CredentialCache](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)

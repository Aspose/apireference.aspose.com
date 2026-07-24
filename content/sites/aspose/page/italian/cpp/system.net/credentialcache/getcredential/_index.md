---
title: "System::Net::CredentialCache::GetCredential metodo"
linktitle: "GetCredential"
second_title: "Aspose.Page per C++"
description: "System::Net::CredentialCache::GetCredential metodo. Restituisce le credenziali per il nome host, la porta e il tipo di autenticazione specificati in C++."
type: docs
weight: 500
url: /it/cpp/system.net/credentialcache/getcredential/
---
## CredentialCache::GetCredential(String, int32_t, String) method


Restituisce le credenziali per il nome host specificato, la porta e il tipo di autenticazione.

```cpp
System::SharedPtr<NetworkCredential> System::Net::CredentialCache::GetCredential(String host, int32_t port, String authenticationType) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| host | String | Il nome host a cui sono associate le credenziali. |
| porta | int32_t | Il numero di porta. |
| authenticationType | String | Il tipo di autenticazione. |

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [NetworkCredential](../../networkcredential/)
* Class [String](../../../system/string/)
* Class [CredentialCache](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
## CredentialCache::GetCredential(System::SharedPtr\<Uri\>, String) method


Restituisce le credenziali per il prefisso URI specificato e il tipo di autenticazione.

```cpp
System::SharedPtr<NetworkCredential> System::Net::CredentialCache::GetCredential(System::SharedPtr<Uri> uriPrefix, String authenticationType) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| uriPrefix | System::SharedPtr\<Uri\> | Il prefisso URI. |
| authenticationType | String | Un tipo di autenticazione. |

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [NetworkCredential](../../networkcredential/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [CredentialCache](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)

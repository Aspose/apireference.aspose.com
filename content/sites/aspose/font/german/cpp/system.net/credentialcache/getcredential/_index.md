---
title: "System::Net::CredentialCache::GetCredential Methode"
linktitle: "GetCredential"
second_title: "Aspose.Font für C++"
description: "System::Net::CredentialCache::GetCredential Methode. Gibt Anmeldeinformationen für den angegebenen Hostnamen, Port und Authentifizierungstyp in C++ zurück."
type: docs
weight: 500
url: /de/cpp/system.net/credentialcache/getcredential/
---
## CredentialCache::GetCredential(String, int32_t, String) method


Gibt Anmeldeinformationen für den angegebenen Hostnamen, Port und Authentifizierungstyp zurück.

```cpp
System::SharedPtr<NetworkCredential> System::Net::CredentialCache::GetCredential(String host, int32_t port, String authenticationType) override
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| host | String | Der Hostname, dem die Anmeldeinformationen zugeordnet sind. |
| port | int32_t | Die Portnummer. |
| authenticationType | String | Der Authentifizierungstyp. |

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [NetworkCredential](../../networkcredential/)
* Class [String](../../../system/string/)
* Class [CredentialCache](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)
## CredentialCache::GetCredential(System::SharedPtr\<Uri\>, String) method


Gibt Anmeldedaten für das angegebene URI-Präfix und den Authentifizierungstyp zurück.

```cpp
System::SharedPtr<NetworkCredential> System::Net::CredentialCache::GetCredential(System::SharedPtr<Uri> uriPrefix, String authenticationType) override
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| uriPrefix | System::SharedPtr\<Uri\> | Der URI-Präfix. |
| authenticationType | String | Ein Authentifizierungstyp. |

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [NetworkCredential](../../networkcredential/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [CredentialCache](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)

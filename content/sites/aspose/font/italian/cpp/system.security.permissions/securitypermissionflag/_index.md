---
title: "System::Security::Permissions::SecurityPermissionFlag enum"
linktitle: "SecurityPermissionFlag"
second_title: "Aspose.Font per C++"
description: "System::Security::Permissions::SecurityPermissionFlag enum. Flag del permesso di sicurezza in C++."
type: docs
weight: 300
url: /it/cpp/system.security.permissions/securitypermissionflag/
---
## SecurityPermissionFlag enum


Flag del permesso di sicurezza.

```cpp
enum class SecurityPermissionFlag
```

### Valori

| Nome | Valore | Descrizione |
| --- | --- | --- |
| NoFlags | 0 | Nessun accesso. |
| Asserzione | 1 | Verifica che il permesso sia concesso. |
| UnmanagedCode | 2 | Chiama codice non gestito. |
| SkipVerification | 4 | Ignora la verifica del codice. |
| Esecuzione | 8 | Esegui il codice. |
| ControlThread | 16 | Esegui operazioni sui thread. |
| ControlEvidence | 32 | Controlla o modifica le prove CLR. |
| ControlPolicy | 64 | Visualizza e modifica la politica. |
| SerializationFormatter | 128 | Serializza. |
| ControlDomainPolicy | 256 | Imposta la politica del dominio. |
| ControlPrincipal | 512 | Controlla l'oggetto principale. |
| ControlAppDomain | 1024 | Controlla il dominio dell'applicazione. |
| RemotingConfiguration | 2048 | Configura il remoting. |
| Infrastruttura | 4096 | Collegati all'infrastruttura CLR. |
| BindingRedirects | 8192 | Esegui il reindirizzamento esplicito del binding. |
| AllFlags | 16383 | Illimitato. |

## Vedi anche

* Namespace [System::Security::Permissions](../)
* Library [Aspose.Font for C++](../../)

---
title: "Enum System::Security::Permissions::SecurityPermissionFlag"
linktitle: "SecurityPermissionFlag"
second_title: "Aspose.Page per C++"
description: "Enum System::Security::Permissions::SecurityPermissionFlag. Flag dell'autorizzazione di sicurezza in C++."
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
| Affermazione | 1 | Verifica che il permesso sia concesso. |
| CodiceNonGestito | 2 | Chiama codice non gestito. |
| SaltaVerifica | 4 | Salta la verifica del codice. |
| Esecuzione | 8 | Esegui il codice. |
| ControllaThread | 16 | Esegui operazioni sui thread. |
| ControllaProve | 32 | Controlla o modifica le prove CLR. |
| ControllaPolitica | 64 | Visualizza e modifica la politica. |
| FormattatoreSerializzazione | 128 | Serializza. |
| ControllaPoliticaDominio | 256 | Imposta la politica del dominio. |
| ControllaPrincipale | 512 | Controlla l'oggetto principale. |
| ControllaAppDomain | 1024 | Controlla il dominio dell'applicazione. |
| ConfigurazioneRemoting | 2048 | Configura il remoting. |
| Infrastruttura | 4096 | Collega all'infrastruttura CLR. |
| BindingRedirects | 8192 | Esegui il reindirizzamento esplicito del binding. |
| AllFlags | 16383 | Non limitato. |

## Vedi anche

* Namespace [System::Security::Permissions](../)
* Library [Aspose.Page for C++](../../)

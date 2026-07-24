---
title: "System::Security::Permissions::SecurityPermissionFlag enum"
linktitle: "SecurityPermissionFlag"
second_title: "Aspose.Page voor C++"
description: "System::Security::Permissions::SecurityPermissionFlag enum. Vlaggen van beveiligingspermissie in C++."
type: docs
weight: 300
url: /nl/cpp/system.security.permissions/securitypermissionflag/
---
## SecurityPermissionFlag enum


Vlaggen van de beveiligingsmachtiging.

```cpp
enum class SecurityPermissionFlag
```

### Waarden

| Naam | Waarde | Beschrijving |
| --- | --- | --- |
| NoFlags | 0 | Geen toegang. |
| Assertion | 1 | Bevestig dat de permissie is verleend. |
| UnmanagedCode | 2 | Roep unmanaged code aan. |
| SkipVerification | 4 | Sla code‑verificatie over. |
| Execution | 8 | Voer code uit. |
| ControlThread | 16 | Voer bewerkingen uit op threads. |
| ControlEvidence | 32 | Beheer of wijzig CLR-evidence. |
| ControlPolicy | 64 | Bekijk en wijzig beleid. |
| SerializationFormatter | 128 | Serialiseren. |
| ControlDomainPolicy | 256 | Stel domeinbeleid in. |
| ControlPrincipal | 512 | Beheer principal-object. |
| ControlAppDomain | 1024 | Beheer toepassingsdomein. |
| RemotingConfiguration | 2048 | Configureer remoting. |
| Infrastructuur | 4096 | Aansluiten op CLR-infrastructuur. |
| BindingRedirects | 8192 | Voer expliciete binding-omleiding uit. |
| AllFlags | 16383 | Onbeperkt. |

## Zie ook

* Namespace [System::Security::Permissions](../)
* Library [Aspose.Page for C++](../../)

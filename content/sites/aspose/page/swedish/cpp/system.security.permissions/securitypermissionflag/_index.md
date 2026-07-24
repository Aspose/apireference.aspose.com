---
title: "System::Security::Permissions::SecurityPermissionFlag‑enum"
linktitle: "SecurityPermissionFlag"
second_title: "Aspose.Page för C++"
description: "System::Security::Permissions::SecurityPermissionFlag‑enum. Flaggor för säkerhetsbehörighet i C++."
type: docs
weight: 300
url: /sv/cpp/system.security.permissions/securitypermissionflag/
---
## SecurityPermissionFlag enum


Flaggor för säkerhetsbehörigheten.

```cpp
enum class SecurityPermissionFlag
```

### Värden

| Namn | Värde | Beskrivning |
| --- | --- | --- |
| IngaFlaggor | 0 | Ingen åtkomst. |
| Påstående | 1 | Påstå att behörigheten är beviljad. |
| OhanteradKod | 2 | Anropa ohanterad kod. |
| HoppaÖverVerifiering | 4 | Hoppa över kodverifiering. |
| Exekvering | 8 | Kör kod. |
| StyrTråd | 16 | Utför operationer på trådar. |
| StyrBevis | 32 | Styr eller ändra CLR-bevis. |
| StyrPolicy | 64 | Visa och ändra policy. |
| Serialiseringsformaterare | 128 | Serialisera. |
| StyrDomänpolicy | 256 | Ställ in domänpolicy. |
| StyrPrincipal | 512 | Styr principal-objekt. |
| StyrAppDomain | 1024 | Styr applikationsdomän. |
| Fjärrkonfiguration | 2048 | Konfigurera fjärrkommunikation. |
| Infrastruktur | 4096 | Anslut till CLR-infrastrukturen. |
| BindingRedirects | 8192 | Utför explicit bindningsomdirigering. |
| AllFlags | 16383 | Obegränsad. |

## Se även

* Namespace [System::Security::Permissions](../)
* Library [Aspose.Page for C++](../../)

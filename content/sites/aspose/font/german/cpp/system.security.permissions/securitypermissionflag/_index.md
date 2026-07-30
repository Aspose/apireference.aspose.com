---
title: "System::Security::Permissions::SecurityPermissionFlag Enum"
linktitle: "SecurityPermissionFlag"
second_title: "Aspose.Font für C++"
description: "System::Security::Permissions::SecurityPermissionFlag Enum. Flags der Sicherheitsberechtigung in C++."
type: docs
weight: 300
url: /de/cpp/system.security.permissions/securitypermissionflag/
---
## SecurityPermissionFlag enum


Flags der Sicherheitsberechtigung.

```cpp
enum class SecurityPermissionFlag
```

### Werte

| Name | Wert | Beschreibung |
| --- | --- | --- |
| NoFlags | 0 | Kein Zugriff. |
| Assertion | 1 | Stelle sicher, dass die Berechtigung erteilt wurde. |
| UnmanagedCode | 2 | Rufe nicht verwalteten Code auf. |
| SkipVerification | 4 | Code-Überprüfung überspringen. |
| Ausführung | 8 | Code ausführen. |
| ControlThread | 16 | Operationen auf Threads ausführen. |
| ControlEvidence | 32 | CLR-Evidence steuern oder ändern. |
| ControlPolicy | 64 | Richtlinie anzeigen und ändern. |
| SerializationFormatter | 128 | Serialisieren. |
| ControlDomainPolicy | 256 | Domain-Richtlinie festlegen. |
| ControlPrincipal | 512 | Principal-Objekt steuern. |
| ControlAppDomain | 1024 | Anwendungsdomäne steuern. |
| RemotingConfiguration | 2048 | Remoting konfigurieren. |
| Infrastruktur | 4096 | In die CLR-Infrastruktur einbinden. |
| BindingRedirects | 8192 | Explizite Bindungsumleitung durchführen. |
| AllFlags | 16383 | Uneingeschränkt. |

## Siehe auch

* Namespace [System::Security::Permissions](../)
* Library [Aspose.Font for C++](../../)

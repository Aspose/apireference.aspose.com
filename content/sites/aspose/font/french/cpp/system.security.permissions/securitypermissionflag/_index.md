---
title: "Énumération System::Security::Permissions::SecurityPermissionFlag"
linktitle: "SecurityPermissionFlag"
second_title: "Aspose.Font pour C++"
description: "Énumération System::Security::Permissions::SecurityPermissionFlag. Indicateurs de l'autorisation de sécurité en C++."
type: docs
weight: 300
url: /fr/cpp/system.security.permissions/securitypermissionflag/
---
## SecurityPermissionFlag enum


Drapeaux de l'autorisation de sécurité.

```cpp
enum class SecurityPermissionFlag
```

### Valeurs

| Nom | Valeur | Description |
| --- | --- | --- |
| NoFlags | 0 | Aucun accès. |
| Assertion | 1 | Affirme que l'autorisation est accordée. |
| UnmanagedCode | 2 | Appeler du code non géré. |
| SkipVerification | 4 | Ignorer la vérification du code. |
| Execution | 8 | Exécuter du code. |
| ControlThread | 16 | Effectuer des opérations sur les threads. |
| ControlEvidence | 32 | Contrôler ou modifier les preuves CLR. |
| ControlPolicy | 64 | Afficher et modifier la politique. |
| SerializationFormatter | 128 | Sérialiser. |
| ControlDomainPolicy | 256 | Définir la stratégie de domaine. |
| ControlPrincipal | 512 | Objet principal de contrôle. |
| ControlAppDomain | 1024 | Contrôler le domaine d'application. |
| RemotingConfiguration | 2048 | Configurer le remoting. |
| Infrastructure | 4096 | Brancher dans l'infrastructure CLR. |
| BindingRedirects | 8192 | Effectuer une redirection de liaison explicite. |
| TousLesDrapeaux | 16383 | Non restreint. |

## Voir aussi

* Namespace [System::Security::Permissions](../)
* Library [Aspose.Font for C++](../../)

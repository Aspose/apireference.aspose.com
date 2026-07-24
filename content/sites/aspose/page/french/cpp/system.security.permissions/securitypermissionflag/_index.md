---
title: "Énumération System::Security::Permissions::SecurityPermissionFlag"
linktitle: "SecurityPermissionFlag"
second_title: "Aspose.Page pour C++"
description: "Énumération System::Security::Permissions::SecurityPermissionFlag. Drapeaux de l'autorisation de sécurité en C++."
type: docs
weight: 300
url: /fr/cpp/system.security.permissions/securitypermissionflag/
---
## SecurityPermissionFlag enum


Indicateurs de l'autorisation de sécurité.

```cpp
enum class SecurityPermissionFlag
```

### Valeurs

| Nom | Valeur | Description |
| --- | --- | --- |
| NoFlags | 0 | Aucun accès. |
| Assertion | 1 | Vérifier que la permission est accordée. |
| UnmanagedCode | 2 | Appeler du code non géré. |
| SkipVerification | 4 | Ignorer la vérification du code. |
| Exécution | 8 | Exécuter le code. |
| ControlThread | 16 | Effectuer des opérations sur les threads. |
| ControlEvidence | 32 | Contrôler ou modifier les preuves CLR. |
| ControlPolicy | 64 | Afficher et modifier la politique. |
| SerializationFormatter | 128 | Sérialiser. |
| ControlDomainPolicy | 256 | Définir la politique de domaine. |
| ControlPrincipal | 512 | Contrôler l'objet principal. |
| ControlAppDomain | 1024 | Contrôler le domaine d'application. |
| RemotingConfiguration | 2048 | Configurer le remoting. |
| Infrastructure | 4096 | Branchez-vous à l'infrastructure CLR. |
| Redirections de liaison | 8192 | Effectuez une redirection de liaison explicite. |
| AllFlags | 16383 | Non restreint. |

## Voir aussi

* Namespace [System::Security::Permissions](../)
* Library [Aspose.Page for C++](../../)

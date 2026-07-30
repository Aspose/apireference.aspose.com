---
title: "System::Net::AuthenticationSchemes énumération"
linktitle: "AuthenticationSchemes"
second_title: "Aspose.Font pour C++"
description: "System::Net::AuthenticationSchemes enum. Énumère les schémas d'authentification en C++."
type: docs
weight: 4100
url: /fr/cpp/system.net/authenticationschemes/
---
## AuthenticationSchemes enum


Énumère les schémas d'authentification. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
enum class AuthenticationSchemes
```

### Valeurs

| Nom | Valeur | Description |
| --- | --- | --- |
| Aucun | 0 | Aucune authentification n'est requise. |
| Digest | 1 | Authentification d'accès Digest. |
| Negotiate | 2 | Négocie avec le client le schéma d'authentification qui sera utilisé (NTML ou Kerberos). |
| Ntlm | 4 | Authentification NTLM. |
| Basic | 8 | Authentification Basic. |
| Anonymous | 32768 | Authentification anonyme. |
| IntegratedWindowsAuthentication | n/a | [Windows](../../system.windows/) authentification. |

## Voir aussi

* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)

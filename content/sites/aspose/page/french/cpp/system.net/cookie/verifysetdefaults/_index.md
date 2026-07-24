---
title: "System::Net::Cookie::VerifySetDefaults method"
linktitle: "VerifySetDefaults"
second_title: "Aspose.Page pour C++"
description: "Méthode System::Net::Cookie::VerifySetDefaults. Vérifie et définit les valeurs par défaut de l'attribut''s en C++."
type: docs
weight: 4200
url: /fr/cpp/system.net/cookie/verifysetdefaults/
---
## Cookie::VerifySetDefaults method


Vérifie et définit les valeurs par défaut de l'attribut.

```cpp
bool System::Net::Cookie::VerifySetDefaults(CookieVariant variant, System::SharedPtr<Uri> uri, bool isLocalDomain, String localDomain, bool setDefault, bool shouldThrow)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| variant | CookieVariant | La spécification du cookie. |
| uri | System::SharedPtr\<Uri\> | L'instance de la classe Uri utilisée pour initialiser les champs internes. |
| isLocalDomain | bool | Une valeur qui indique si le cookie est poussé dans le domaine local. |
| localDomain | String | Un nom de domaine local. |
| setDefault | bool | Une valeur qui indique si les attributs du cookie doivent être initialisés en utilisant leurs valeurs par défaut. |
| shouldThrow | bool | Une valeur qui indique si une exception doit être levée lorsque les valeurs spécifiées sont invalides. |

### ReturnValue

Vrai lorsque toutes les valeurs sont valides, sinon faux.

## Voir aussi

* Enum [CookieVariant](../../cookievariant/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [Cookie](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)

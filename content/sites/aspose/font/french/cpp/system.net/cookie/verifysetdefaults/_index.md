---
title: "System::Net::Cookie::VerifySetDefaults méthode"
linktitle: "VerifySetDefaults"
second_title: "Aspose.Font pour C++"
description: "System::Net::Cookie::VerifySetDefaults méthode. Vérifie et définit les valeurs des attributs par défaut en C++."
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
| uri | System::SharedPtr\<Uri\> | L'instance de la classe Uri qui est utilisée pour initialiser les champs internes. |
| isLocalDomain | bool | Une valeur qui indique si le cookie est poussé dans le domaine local. |
| localDomain | String | Un nom de domaine local. |
| setDefault | bool | Une valeur qui indique si les attributs du cookie doivent être initialisés en utilisant leurs valeurs par défaut. |
| shouldThrow | bool | Une valeur qui indique si une exception doit être levée lorsque les valeurs spécifiées sont invalides. |

### ReturnValue

True lorsque toutes les valeurs sont valides, sinon false.

## Voir aussi

* Enum [CookieVariant](../../cookievariant/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [Cookie](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)

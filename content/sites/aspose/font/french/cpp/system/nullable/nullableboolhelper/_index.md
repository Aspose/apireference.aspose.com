---
title: "System::Nullable::NullableBoolHelper méthode"
linktitle: "NullableBoolHelper"
second_title: "Aspose.Font pour C++"
description: "System::Nullable::NullableBoolHelper méthode. Fonction d'assistance pour vérifier si cet objet et l'autre ne sont pas nuls et appeler une lambda le cas échéant. Utilisée dans les implémentations en C++."
type: docs
weight: 800
url: /fr/cpp/system/nullable/nullableboolhelper/
---
## Nullable::NullableBoolHelper method


Fonction d'assistance pour vérifier si **other** et cet objet ne sont pas nuls et appeler une lambda le cas échéant. Utilisée dans implementation.s.

```cpp
template<typename T1> bool System::Nullable<T>::NullableBoolHelper(const T1 &other, const std::function<bool()> &f, bool default_if_both_are_null=false) const
```


| Paramètre | Description |
| --- | --- |
| T1 | Autre type nullable. |

| Paramètre | Type | Description |
| --- | --- | --- |
| autre | const T1\& | Autre valeur nullable à comparer. |
| f | const std::function\<bool()>\& | Lambda à appeler si **this** et **other** ne sont pas nuls. |
| default_if_both_are_null | bool | Valeur de retour si les deux valeurs sont nulles. |

### ReturnValue

false si **this** ou **other** est nul ; **default_if_both_are_null** si les deux sont nuls ; résultat de l'appel **f** si les deux ne sont pas nuls.

## Voir aussi

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)

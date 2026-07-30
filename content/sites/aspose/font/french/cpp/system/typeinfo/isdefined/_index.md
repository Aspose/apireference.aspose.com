---
title: "System::TypeInfo::IsDefined méthode"
linktitle: "IsDefined"
second_title: "Aspose.Font pour C++"
description: "System::TypeInfo::IsDefined méthode. NON IMPLEMENTÉ. Indique si un ou plusieurs attributs du type spécifié ou de ses types dérivés sont appliqués à ce membre en C++."
type: docs
weight: 4400
url: /fr/cpp/system/typeinfo/isdefined/
---
## TypeInfo::IsDefined method


NON IMPLEMENTÉ. Indique si un ou plusieurs attributs du type spécifié ou de ses types dérivés sont appliqués à ce membre.

```cpp
bool System::TypeInfo::IsDefined(const TypeInfo &attributeType, bool inherit) const
```


| Paramètre | Type | Description |
| --- | --- | --- |
| attributeType | const TypeInfo\& | Le type d'attribut personnalisé à rechercher. La recherche inclut les types dérivés. |
| inherit | bool | true pour rechercher dans la chaîne d'héritage de ce membre afin de trouver les attributs ; sinon, false. Ce paramètre est ignoré pour les propriétés et les événements. |

### ReturnValue

true si une ou plusieurs instances de attributeType ou de l’un de ses types dérivés sont appliquées à ce membre ; sinon, false.

## Voir aussi

* Class [TypeInfo](../)
* Class [TypeInfo](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)

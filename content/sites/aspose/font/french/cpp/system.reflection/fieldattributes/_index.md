---
title: "System::Reflection::FieldAttributes enum"
linktitle: "FieldAttributes"
second_title: "Aspose.Font pour C++"
description: "System::Reflection::FieldAttributes enum. Attributs de champ reflétés en C++."
type: docs
weight: 1200
url: /fr/cpp/system.reflection/fieldattributes/
---
## FieldAttributes enum


Attributs de champ reflétés.

```cpp
enum class FieldAttributes
```

### Valeurs

| Nom | Valeur | Description |
| --- | --- | --- |
| FieldAccessMask | 7 | Masque d'accès aux membres. Utilisez ce masque pour récupérer les informations d'accessibilité. |
| PrivateScope | 0 | Membres non référencables. |
| Private | 1 | Membres privés. |
| FamANDAssem | 2 | Membres privés et à portée d'assembly. |
| Assembly | 3 | Membres à portée d'assembly. |
| Famille | 4 | Membres accessibles par type et sous-types. |
| FamORAssem | 5 | Membres accessibles par type, sous-types et assembly. |
| Public | 6 | Membres accessibles par tout le monde. |
| Statique | 16 | Membres statiques par opposition aux membres d'instance. |
| InitOnly | 32 | Membres const qui ne peuvent être initialisés qu'une fois et ne peuvent pas être modifiés. |
| Littéral | 64 | Membres constants à la compilation. |
| NotSerialized | 128 | Membres non sérialisés. |
| SpecialName | 512 | Champ spécial parmi les noms ci‑dessous. |
| PinvokeImpl | 8192 | Implémentation interopérabilité transférée. |
| ReservedMask | 38144 | Drapeaux réservés à l'usage du runtime uniquement. |
| RTSpecialName | 1024 | Runtim devrait vérifier l'encodage du nom. |
| HasFieldMarshal | 4096 | Les informations de marshaling sont présentes. |
| HasDefault | 32768 | La valeur par défaut est présente. |
| HasFieldRVA | 256 | RVA est présent. |

## Voir aussi

* Namespace [System::Reflection](../)
* Library [Aspose.Font for C++](../../)

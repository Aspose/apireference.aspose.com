---
title: "System::Reflection::BindingFlags énum"
linktitle: "BindingFlags"
second_title: "Aspose.Font pour C++"
description: "System::Reflection::BindingFlags énum. Définit les membres et les modes de recherche de types ainsi que les liaisons en C++."
type: docs
weight: 1100
url: /fr/cpp/system.reflection/bindingflags/
---
## BindingFlags enum


Définit les membres et les modes de recherche de types ainsi que les liaisons.

```cpp
enum class BindingFlags
```

### Valeurs

| Nom | Valeur | Description |
| --- | --- | --- |
| Default | 0 | Aucune option spéciale. |
| IgnoreCase | 1 | Ignorer la casse du nom lors de la recherche d'un élément. |
| DeclaredOnly | 2 | Ne rechercher que les membres déclarés dans le type et non dans les types de base. |
| Instance | 4 | Parcourir les membres d'instance. |
| Statique | 8 | Parcourir les membres statiques. |
| Public | 16 | Parcourir les membres publics. |
| NonPublic | 32 | Parcourir les membres non-publics. |
| FlattenHierarchy | 64 | Parcourir les membres statiques publics et protégés du type de base. |
| InvokeMethod | 256 | Exécute la méthode. |
| CreateInstance | 512 | Crée une instance de type reflété. |
| GetField | 1024 | Obtient la valeur du champ. |
| SetField | 2048 | Définit la valeur du champ. |
| GetProperty | 4096 | Obtient la valeur de la propriété. |
| SetProperty | 8192 | Définit la valeur de la propriété. |
| PutDispProperty | 16384 | Définit la propriété COM. |
| PutRefDispProperty | 32768 | Définit la propriété de référence COM. |
| ExactBinding | 65536 | La liaison de type doit être exacte, sans aucune conversion de type. |
| SuppressChangeType | 131072 | Non pris en charge. |
| OptionalParamBinding | 262144 | Sélectionne la surcharge en fonction du nombre d'arguments. |
| IgnoreReturn | 16777216 | Ignore la valeur de retour de l'interop COM. |

## Voir aussi

* Namespace [System::Reflection](../)
* Library [Aspose.Font for C++](../../)

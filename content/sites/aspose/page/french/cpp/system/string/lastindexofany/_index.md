---
title: "System::String::LastIndexOfAny method"
linktitle: "LastIndexOfAny"
second_title: "Aspose.Page pour C++"
description: "System::String::LastIndexOfAny method. Recherche l'un des caractères fournis dans toute la chaîne en partant de la fin. Compare le dernier caractère de la chaîne à tous les caractères de anyOf, puis le précédent, et ainsi de suite. Retourne l'index de la première correspondance trouvée en C++."
type: docs
weight: 2500
url: /fr/cpp/system/string/lastindexofany/
---
## String::LastIndexOfAny(const ArrayPtr\<char_t\>\&) const method


Recherche l'un des caractères fournis dans toute la chaîne en arrière. Compare le dernier caractère de la chaîne à tous les caractères de anyOf, puis compare le précédent et ainsi de suite. Retourne l'index de la première correspondance trouvée.

```cpp
int System::String::LastIndexOfAny(const ArrayPtr<char_t> &anyOf) const
```


| Paramètre | Type | Description |
| --- | --- | --- |
| anyOf | const ArrayPtr\<char_t\>\& | [Array](../../array/) de caractères à rechercher. L'ordre n'a pas d'importance. |

### ReturnValue

Index du dernier caractère correspondant ou -1 si non trouvé.

## Voir aussi

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::LastIndexOfAny(const ArrayPtr\<char_t\>\&, int32_t) const method


Recherche l'un des caractères fournis dans la sous-chaîne en arrière. Compare le dernier caractère de la chaîne à tous les caractères de anyOf, puis compare le précédent et ainsi de suite. Retourne l'index de la première correspondance trouvée.

```cpp
int System::String::LastIndexOfAny(const ArrayPtr<char_t> &anyOf, int32_t startindex) const
```


| Paramètre | Type | Description |
| --- | --- | --- |
| anyOf | const ArrayPtr\<char_t\>\& | [Array](../../array/) de caractères à rechercher. L'ordre n'a pas d'importance. |
| startindex | int32_t | Index à partir duquel commencer la recherche. |

### ReturnValue

Index du dernier caractère correspondant ou -1 si non trouvé.

## Voir aussi

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::LastIndexOfAny(const ArrayPtr\<char_t\>\&, int32_t, int32_t) const method


Recherche l'un des caractères fournis dans la sous-chaîne en arrière. Compare le dernier caractère de la chaîne à tous les caractères de anyOf, puis compare le précédent et ainsi de suite. Retourne l'index de la première correspondance trouvée.

```cpp
int System::String::LastIndexOfAny(const ArrayPtr<char_t> &anyOf, int32_t startindex, int32_t count) const
```


| Paramètre | Type | Description |
| --- | --- | --- |
| anyOf | const ArrayPtr\<char_t\>\& | [Array](../../array/) de caractères à rechercher. L'ordre n'a pas d'importance. |
| startindex | int32_t | Index à partir duquel commencer la recherche. |
| count | int32_t | Nombre de caractères à parcourir. |

### ReturnValue

Index du dernier caractère correspondant ou -1 si non trouvé.

## Voir aussi

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)

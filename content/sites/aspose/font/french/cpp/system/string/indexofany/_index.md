---
title: "System::String::IndexOfAny méthode"
linktitle: "IndexOfAny"
second_title: "Aspose.Font pour C++"
description: "System::String::IndexOfAny méthode. Recherche de caractère en avant en C++."
type: docs
weight: 1600
url: /fr/cpp/system/string/indexofany/
---
## String::IndexOfAny(char_t, int) const method


Recherche avant de caractère.

```cpp
int System::String::IndexOfAny(char_t c, int startIndex=0) const
```


| Paramètre | Type | Description |
| --- | --- | --- |
| c | char_t | Caractère à rechercher. |
| startIndex | int | Indice à partir duquel commencer la recherche. |

### ReturnValue

Indice de la première position de caractère depuis startIndex ou -1 si non trouvé.

## Voir aussi

* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::IndexOfAny(const ArrayPtr\<char_t\>\&) const method


Recherche n'importe lequel des caractères fournis dans toute la chaîne. Compare le premier caractère de la chaîne à tous les caractères de anyOf, puis compare le deuxième et ainsi de suite. Retourne l'index du premier correspondant à l'un des caractères cibles.

```cpp
int System::String::IndexOfAny(const ArrayPtr<char_t> &anyOf) const
```


| Paramètre | Type | Description |
| --- | --- | --- |
| anyOf | const ArrayPtr\<char_t\>\& | [Array](../../array/) de caractères à rechercher. L'ordre n'a pas d'importance. |

### ReturnValue

Indice du premier caractère correspondant ou -1 si non trouvé.

## Voir aussi

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::IndexOfAny(const ArrayPtr\<char_t\>\&, int32_t) const method


Recherche n'importe lequel des caractères fournis dans la sous-chaîne. Compare le premier caractère de la chaîne à tous les caractères de anyOf, puis compare le deuxième et ainsi de suite. Retourne l'index du premier correspondant à l'un des caractères cibles.

```cpp
int System::String::IndexOfAny(const ArrayPtr<char_t> &anyOf, int32_t startindex) const
```


| Paramètre | Type | Description |
| --- | --- | --- |
| anyOf | const ArrayPtr\<char_t\>\& | [Array](../../array/) de caractères à rechercher. L'ordre n'a pas d'importance. |
| startindex | int32_t | Index à partir duquel commencer la recherche. |

### ReturnValue

Indice du premier caractère correspondant ou -1 si non trouvé.

## Voir aussi

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::IndexOfAny(const ArrayPtr\<char_t\>\&, int32_t, int32_t) const method


Recherche n'importe lequel des caractères fournis dans la sous-chaîne. Compare le premier caractère de la chaîne à tous les caractères de anyOf, puis compare le deuxième et ainsi de suite. Retourne l'index du premier correspondant à l'un des caractères cibles.

```cpp
int System::String::IndexOfAny(const ArrayPtr<char_t> &anyOf, int32_t startindex, int32_t count) const
```


| Paramètre | Type | Description |
| --- | --- | --- |
| anyOf | const ArrayPtr\<char_t\>\& | [Array](../../array/) de caractères à rechercher. L'ordre n'a pas d'importance. |
| startindex | int32_t | Index à partir duquel commencer la recherche. |
| count | int32_t | Nombre de caractères à parcourir. |

### ReturnValue

Indice du premier caractère correspondant ou -1 si non trouvé.

## Voir aussi

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::IndexOfAny(const String\&, int) const method


Recherche donc tous les caractères de str dans ceci. Si le premier caractère est trouvé, sa position est renvoyée, sinon il recherche le deuxième et ainsi de suite.

```cpp
int System::String::IndexOfAny(const String &str, int startIndex=0) const
```


| Paramètre | Type | Description |
| --- | --- | --- |
| str | const String\& | [String](../) des caractères à rechercher. L'ordre des caractères est important. |
| startIndex | int | Position à partir de laquelle commencer la recherche. |

### ReturnValue

Indice du premier caractère trouvé ou -1 si aucun n'est trouvé.

## Voir aussi

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)

---
title: "Méthode System::String::Join"
linktitle: "Join"
second_title: "Aspose.Font pour C++"
description: "Méthode System::String::Join. Joint un tableau en utilisant la chaîne comme séparateur en C++."
type: docs
weight: 7300
url: /fr/cpp/system/string/join/
---
## String::Join(const String\&, const ArrayPtr\<SharedPtr\<Object\>\>\&) method


Joint le tableau en utilisant la chaîne comme séparateur.

```cpp
static String System::String::Join(const String &separator, const ArrayPtr<SharedPtr<Object>> &parts)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| separator | const String\& | [String](../) à placer entre les éléments du tableau lors de la jointure. |
| parts | const ArrayPtr\<SharedPtr\<Object\>\>\& | [Array](../../array/) des parties à joindre. |

### ReturnValue

[String](../) representing joint elements.

## Voir aussi

* Class [String](../)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [Object](../../object/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::Join(const String\&, const ArrayPtr\<String\>\&, int, int) method


Joint le tableau en utilisant la chaîne comme séparateur.

```cpp
static String System::String::Join(const String &separator, const ArrayPtr<String> &parts, int startIndex=0, int count=-1)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| separator | const String\& | [String](../) à placer entre les éléments du tableau lors de la jointure. |
| parts | const ArrayPtr\<String\>\& | [Array](../../array/) des parties à joindre. |
| startIndex | int | Premier indice du tableau à partir duquel commencer la jointure. |
| count | int | Nombre d'éléments du tableau à joindre. -1 signifie « jusqu'à la fin du tableau ». |

### ReturnValue

[String](../) representing joint array elements.

## Voir aussi

* Class [String](../)
* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::Join(const String\&, const SharedPtr\<System::Collections::Generic::IEnumerable\<String\>\>\&) method


Joint le tableau en utilisant la chaîne comme séparateur.

```cpp
static String System::String::Join(const String &separator, const SharedPtr<System::Collections::Generic::IEnumerable<String>> &parts)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| separator | const String\& | [String](../) à placer entre les éléments du tableau lors de la jointure. |
| parties | const SharedPtr\<System::Collections::Generic::IEnumerable\<String\>\>\& | - objet énumérable de parties |

### ReturnValue

[String](../) representing joint elements.

## Voir aussi

* Class [String](../)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::Join(const String\&, const System::Details::ArrayView\<String\>\&, int, int) method


Joint le tableau en utilisant la chaîne comme séparateur.

```cpp
static String System::String::Join(const String &separator, const System::Details::ArrayView<String> &parts, int startIndex=0, int count=-1)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| separator | const String\& | [String](../) à placer entre les éléments du tableau lors de la jointure. |
| parties | const System::Details::ArrayView\<String\>\& | ArrayView des parties à joindre. |
| startIndex | int | Premier indice du tableau à partir duquel commencer la jointure. |
| count | int | Nombre d'éléments du tableau à joindre. -1 signifie « jusqu'à la fin du tableau ». |

### ReturnValue

[String](../) representing joint array elements.

## Voir aussi

* Class [String](../)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)

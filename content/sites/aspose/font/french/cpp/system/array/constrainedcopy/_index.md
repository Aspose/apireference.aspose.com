---
title: "Méthode System::Array::ConstrainedCopy"
linktitle: "ConstrainedCopy"
second_title: "Aspose.Font pour C++"
description: "Méthode System::Array::ConstrainedCopy. Copie une plage d'éléments d'un System.Array à partir de la source spécifiée en C++."
type: docs
weight: 4700
url: /fr/cpp/system/array/constrainedcopy/
---
## Array::ConstrainedCopy method


Copie une plage d'éléments d'un [System.Array](../) à partir de la source spécifiée.

```cpp
template<typename SrcType,typename DstType> static void System::Array<T>::ConstrainedCopy(const ArrayPtr<SrcType> &srcArray, int64_t srcIndex, const ArrayPtr<DstType> &dstArray, int64_t dstIndex, int64_t count)
```


| Paramètre | Description |
| --- | --- |
| SrcType | Type des éléments dans le tableau source |
| DstType | Type des éléments dans le tableau de destination |

| Paramètre | Type | Description |
| --- | --- | --- |
| srcArray | const ArrayPtr\<SrcType\>\& | Tableau source |
| srcIndex | int64_t | Indice dans le tableau source désignant le début de la plage d'éléments à copier |
| dstArray | const ArrayPtr\<DstType\>\& | Tableau de destination |
| dstIndex | int64_t | Indice dans le tableau de destination où commencer à insérer les éléments copiés |
| count | int64_t | Le nombre d'éléments à copier |
## Remarques


IMPLEMENTATION BRUTE TEMPORAIRE SANS AUCUNE RÉVISION !
## Voir aussi

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)

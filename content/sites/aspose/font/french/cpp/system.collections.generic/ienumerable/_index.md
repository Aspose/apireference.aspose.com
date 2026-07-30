---
title: "Classe System::Collections::Generic::IEnumerable"
linktitle: "IEnumerable"
second_title: "Aspose.Font pour C++"
description: "Classe System::Collections::Generic::IEnumerable. Interface d'un objet fournissant un énumérateur sur les éléments contenus en C++."
type: docs
weight: 2200
url: /fr/cpp/system.collections.generic/ienumerable/
---
## IEnumerable class


Interface d'un objet fournissant un énumérateur sur les éléments contenus.

```cpp
template<typename T>class IEnumerable : public virtual System::Object
```


| Paramètre | Description |
| --- | --- |
| T | Type d'élément. |
## Méthodes

| Méthode | Description |
| --- | --- |
| [begin](./begin/)() | Obtient un itérateur pointant vers le premier élément (s'il existe) de la collection. Cet itérateur ne peut pas être utilisé pour modifier un objet référencé car [GetEnumerator()](./getenumerator/) renvoie un objet copie de T. |
| [begin](./begin/)() const | Obtient un itérateur pointant vers le premier élément (s'il existe) de l'instance const-qualified de la collection. |
| [cbegin](./cbegin/)() const | Obtient un itérateur pointant vers le premier élément const-qualified (s'il existe) de la collection. |
| [cend](./cend/)() const | Obtient un itérateur pointant juste après le dernier élément const-qualified (s'il existe) de la collection. |
| [end](./end/)() | Obtient un itérateur pointant juste après le dernier élément (s'il existe) de la collection. Cet itérateur ne peut pas être utilisé pour modifier un objet référencé car [GetEnumerator()](./getenumerator/) renvoie un objet copie de T. |
| [end](./end/)() const | Obtient un itérateur pointant juste après le dernier élément (s'il existe) de l'instance const-qualified de la collection. |
| virtual [GetEnumerator](./getenumerator/)() | Obtient l'énumérateur. |
| [LINQ_Aggregate](./linq_aggregate/)(const Func\<T, T, T\>\&) | Applique une fonction d'accumulateur sur une séquence. |
| [LINQ_All](./linq_all/)(std::function\<bool(T)>) | Détermine si tous les éléments d'une séquence satisfont une condition. |
| [LINQ_Any](./linq_any/)() | Détermine si une séquence contient des éléments. |
| [LINQ_Any](./linq_any/)(std::function\<bool(T)>) | Détermine si un élément quelconque d'une séquence existe ou satisfait une condition. |
| [LINQ_Cast](./linq_cast/)() | Convertit les éléments au type spécifié. |
| [LINQ_Cast](./linq_cast/)() |  |
| [LINQ_Concat](./linq_concat/)(SharedPtr\<IEnumerable\<T\>\>) | Concatène deux séquences. |
| [LINQ_Contains](./linq_contains/)(T) | Détermine si une séquence contient une valeur spécifiée. |
| [LINQ_Count](./linq_count/)() | Renvoie le nombre d'éléments dans la séquence (calculé par comptage direct). |
| [LINQ_Count](./linq_count/)(const Func\<T, bool\>\&) | Renvoie le nombre d'éléments dans la séquence qui satisfont la condition spécifiée. |
| [LINQ_ElementAt](./linq_elementat/)(int) | Renvoie l'élément à un indice spécifié dans une séquence. |
| [LINQ_ElementAtOrDefault](./linq_elementatordefault/)(int) | Renvoie l'élément à un indice spécifié dans une séquence. |
| [LINQ_First](./linq_first/)() | Renvoie le premier élément d'une séquence. |
| [LINQ_First](./linq_first/)(const Func\<T, bool\>\&) | Renvoie le premier élément d'une séquence qui satisfait la condition spécifiée. |
| [LINQ_FirstOrDefault](./linq_firstordefault/)() | Renvoie le premier élément d'une séquence, ou une valeur par défaut si la séquence est vide. |
| [LINQ_FirstOrDefault](./linq_firstordefault/)(std::function\<bool(T)>) | Renvoie le premier élément de la séquence qui satisfait une condition ou une valeur par défaut si aucun élément de ce type n'est trouvé. |
| [LINQ_GroupBy](./linq_groupby/)(System::Func\<T, Key\>) | Regroupe les éléments d'une séquence. |
| [LINQ_GroupBy](./linq_groupby/)(System::Func\<T, Key\>, System::Func\<T, Element\>) | Regroupe les éléments d'une séquence. |
| [LINQ_GroupBy](./linq_groupby/)(System::Func\<Source, Key\>) |  |
| [LINQ_GroupBy](./linq_groupby/)(System::Func\<Source, Key\>, System::Func\<Source, Element\>) |  |
| [LINQ_Last](./linq_last/)() | Renvoie le dernier élément d'une séquence. |
| [LINQ_LastOrDefault](./linq_lastordefault/)() | Renvoie le dernier élément d'une séquence, ou une valeur par défaut si la séquence est vide. |
| [LINQ_Max](./linq_max/)(const Func\<T, ResultType\>\&) | Applique une fonction de transformation à chaque élément d'une séquence générique et renvoie la valeur maximale résultante. |
| [LINQ_Max](./linq_max/)(const Func\<Source, ResultType\>\&) |  |
| [LINQ_Min](./linq_min/)(const Func\<T, ResultType\>\&) | Applique une fonction de transformation à chaque élément d'une séquence générique et renvoie la valeur minimale résultante. |
| [LINQ_Min](./linq_min/)(const Func\<Source, ResultType\>\&) |  |
| [LINQ_OfType](./linq_oftype/)() | Filtre les éléments de la séquence en fonction du type spécifié. |
| [LINQ_OfType](./linq_oftype/)() |  |
| [LINQ_OrderBy](./linq_orderby/)(const Func\<T, Key\>\&) | Trie les éléments d'une séquence par ordre croissant selon les valeurs de clé sélectionnées par keySelector. |
| [LINQ_OrderBy](./linq_orderby/)(const Func\<Source, Key\>\&) |  |
| [LINQ_OrderByDescending](./linq_orderbydescending/)(const Func\<T, Key\>\&) | Trie les éléments d'une séquence par ordre décroissant selon les valeurs de clé sélectionnées par keySelector. |
| [LINQ_OrderByDescending](./linq_orderbydescending/)(const Func\<Source, Key\>\&) |  |
| [LINQ_Reverse](./linq_reverse/)() | Inverse l'ordre des éléments d'une séquence. |
| [LINQ_Select](./linq_select/)(const Func\<T, ResultType\>\&) | Transforme les éléments d'une séquence. |
| [LINQ_Select](./linq_select/)(const Func\<T, int32_t, ResultType\>\&) | Transforme chaque élément d'une séquence en une nouvelle forme en incorporant l'index de l'élément. |
| [LINQ_Select](./linq_select/)(const Func\<Source, Result\>\&) |  |
| [LINQ_Select](./linq_select/)(const Func\<Source, int32_t, Result\>\&) |  |
| [LINQ_SelectMany](./linq_selectmany/)(const Func\<T, SharedPtr\<IEnumerable\<ResultType\>\>\>\&) | Projette chaque élément d'une séquence et combine les séquences résultantes en une seule séquence. |
| [LINQ_SelectMany](./linq_selectmany/)(const Func\<Source, SharedPtr\<IEnumerable\<Result\>\>\>\&) |  |
| [LINQ_Take](./linq_take/)(int32_t) | Renvoie un nombre spécifié d'éléments contigus depuis le début d'une séquence. |
| [LINQ_ToArray](./linq_toarray/)() | Crée un tableau à partir d'une séquence. |
| [LINQ_ToList](./linq_tolist/)() | Crée une [List<T>](../list/) à partir d'une séquence. |
| [LINQ_Where](./linq_where/)(std::function\<bool(T)>) | Filtre une séquence en fonction du prédicat spécifié. |
| virtual [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const | Obtient l'implémentation de l'itérateur const begin pour le conteneur actuel. |
| virtual [virtualizeBeginIterator](./virtualizebeginiterator/)() | Obtient l'implémentation de l'itérateur begin pour le conteneur actuel. |
| virtual [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const | Obtient l'implémentation de l'itérateur const end pour le conteneur actuel. |
| virtual [virtualizeEndIterator](./virtualizeenditerator/)() | Obtient l'implémentation de l'itérateur end pour le conteneur actuel. |
## Typedefs

| Typedef | Description |
| --- | --- |
| [const_iterator](./const_iterator/) | Type d'itérateur const. |
| [IEnumeratorType](./ienumeratortype/) | Informations RTTI. |
| [iterator](./iterator/) | Type d'itérateur. |
| [ValueType](./valuetype/) |  |
| [virtualized_iterator](./virtualized_iterator/) | Type de base de l'itérateur interne. |
| [virtualized_iterator_element](./virtualized_iterator_element/) | Type d'élément de l'itérateur interne. |

## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)

---
title: "System::Collections::Generic::SortedDictionaryPtr class"
linktitle: "SortedDictionaryPtr"
second_title: "Aspose.Page pour C++"
description: "System::Collections::Generic::SortedDictionaryPtr class. Pointeur de dictionnaire trié avec opérateurs d'accès. Ce type est un pointeur pour gérer la suppression d'autres objets. Il doit être alloué sur la pile et passé aux fonctions soit par valeur, soit par référence constante en C++."
type: docs
weight: 4100
url: /fr/cpp/system.collections.generic/sorteddictionaryptr/
---
## SortedDictionaryPtr class


Pointeur de dictionnaire trié avec opérateurs d'accès. Ce type est un pointeur destiné à gérer la suppression d'un autre objet. Il doit être alloué sur la pile et passé aux fonctions soit par valeur, soit par référence constante.

```cpp
template<typename T,typename V>class SortedDictionaryPtr : public System::SmartPtr<SortedDictionary<T, V>>
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [operator[]](./operator[]/)(const T\&) const | Fonction d'accès. |
| [SortedDictionaryPtr](./sorteddictionaryptr/)() | Construit un pointeur nul. |
| [SortedDictionaryPtr](./sorteddictionaryptr/)(const SharedPtr\<SortedDictionary\<T, V\>\>\&) | Construit un pointeur vers le dictionnaire trié spécifié. |
## Voir aussi

* Class [SmartPtr](../../system/smartptr/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)

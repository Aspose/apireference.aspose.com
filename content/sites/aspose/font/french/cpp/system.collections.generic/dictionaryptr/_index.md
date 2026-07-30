---
title: "System::Collections::Generic::DictionaryPtr classe"
linktitle: "DictionaryPtr"
second_title: "Aspose.Font pour C++"
description: "System::Collections::Generic::DictionaryPtr classe. Classe de pointeur de dictionnaire avec surcharge d'opérateurs. Ce type est un pointeur permettant de gérer la suppression d'autres objets. Il doit être alloué sur la pile et passé aux fonctions soit par valeur, soit par référence constante en C++."
type: docs
weight: 1300
url: /fr/cpp/system.collections.generic/dictionaryptr/
---
## DictionaryPtr class


[Dictionary](../dictionary/) pointer class with operator overloads. This type is a pointer to manage other object's deletion. It should be allocated on stack and passed to functions either by value or by const reference.

```cpp
template<typename T,typename V>class DictionaryPtr : public System::SmartPtr<T0>
```


| Paramètre | Description |
| --- | --- |
| T | Type de clé. |
| V | Type valeur. |
## Méthodes

| Méthode | Description |
| --- | --- |
| [DictionaryPtr](./dictionaryptr/)() | Initialise un pointeur nul. |
| [DictionaryPtr](./dictionaryptr/)(const SharedPtr\<Dictionary\<T, V\>\>\&) | Convertit le type de pointeur. |
| [operator[]](./operator[]/)(const X\&) const | Opérateur d'accès pour travailler avec la conversion du type de clé. |
| [operator[]](./operator[]/)(const T\&) const | Opérateur d'accès. |

## Voir aussi

* Class [SmartPtr](../../system/smartptr/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)

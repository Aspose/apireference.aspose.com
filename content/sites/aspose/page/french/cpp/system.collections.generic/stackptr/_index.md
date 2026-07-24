---
title: "System::Collections::Generic::StackPtr classe"
linktitle: "StackPtr"
second_title: "Aspose.Page pour C++"
description: "System::Collections::Generic::StackPtr classe. Pointeur de pile. Ce type est un pointeur pour gérer la suppression d''autres objets. Il doit être alloué sur la pile et passé aux fonctions soit par valeur, soit par référence constante en C++."
type: docs
weight: 4700
url: /fr/cpp/system.collections.generic/stackptr/
---
## StackPtr class


[Stack](../stack/) pointer. This type is a pointer to manage other object's deletion. It should be allocated on stack and passed to functions either by value or by const reference.

```cpp
template<typename T>class StackPtr : public System::SmartPtr<Stack<T>>
```


| Paramètre | Description |
| --- | --- |
| T | Type d'élément. |
## Méthodes

| Méthode | Description |
| --- | --- |
| [StackPtr](./stackptr/)() | Construit un pointeur nul. |
| [StackPtr](./stackptr/)(const SharedPtr\<Stack\<T\>\>\&) | Construit un pointeur référant une pile spécifique. |

## Voir aussi

* Class [SmartPtr](../../system/smartptr/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)

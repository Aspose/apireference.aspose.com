---
title: "System::Collections::Generic::ListPtr classe"
linktitle: "ListPtr"
second_title: "Aspose.Font pour C++"
description: "System::Collections::Generic::ListPtr classe. Pointeur de liste avec opérateurs d'accès. Ce type est un pointeur pour gérer la suppression d''autre object''s. Il doit être alloué sur la pile et passé aux fonctions soit par valeur, soit par référence constante en C++."
type: docs
weight: 3500
url: /fr/cpp/system.collections.generic/listptr/
---
## ListPtr class


[List](../list/) pointer with access operators. This type is a pointer to manage other object's deletion. It should be allocated on stack and passed to functions either by value or by const reference.

```cpp
template<typename T>class ListPtr : public System::SmartPtr<T0>
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [ListPtr](./listptr/)(std::nullptr_t) | Initialise le pointeur nul. |
| [ListPtr](./listptr/)(const SharedPtr\<List\<T\>\>\&) | Initialise le pointeur vers la liste spécifiée. |
| [operator==](./operator==/)(std::nullptr_t) const | Vérifie si le pointeur [List](../list/) est nul. |
| [operator[]](./operator[]/)(int) | Accesseur. |
| [operator[]](./operator[]/)(int) const | Accesseur. |
## Voir aussi

* Class [SmartPtr](../../system/smartptr/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)

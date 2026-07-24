---
title: "System::Text::RegularExpressions::GroupCollectionPtr classe"
linktitle: "GroupCollectionPtr"
second_title: "Aspose.Page pour C++"
description: "System::Text::RegularExpressions::GroupCollectionPtr classe. Pointeur de collection de groupes. Ce type est un pointeur pour gérer la suppression d'autres objets. Il doit être alloué sur la pile et transmis aux fonctions soit par valeur, soit par référence constante en C++."
type: docs
weight: 500
url: /fr/cpp/system.text.regularexpressions/groupcollectionptr/
---
## GroupCollectionPtr class


[Group](../group/) collection pointer. This type is a pointer to manage other object's deletion. It should be allocated on stack and passed to functions either by value or by const reference.

```cpp
class GroupCollectionPtr : public System::SmartPtr<GroupCollection>
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [GroupCollectionPtr](./groupcollectionptr/)() | Constructeur de pointeur nul. |
| [GroupCollectionPtr](./groupcollectionptr/)(const SharedPtr\<GroupCollection\>\&) | Constructeur de conversion de type. |
| [operator[]](./operator[]/)(size_t) const | [Group](../group/) accesseur. |
## Voir aussi

* Class [SmartPtr](../../system/smartptr/)
* Namespace [System::Text::RegularExpressions](../)
* Library [Aspose.Page for C++](../../)

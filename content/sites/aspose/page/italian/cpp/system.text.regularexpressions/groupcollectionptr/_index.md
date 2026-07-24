---
title: "System::Text::RegularExpressions::GroupCollectionPtr class"
linktitle: "GroupCollectionPtr"
second_title: "Aspose.Page per C++"
description: "System::Text::RegularExpressions::GroupCollectionPtr class. Puntatore alla collezione di gruppi. Questo tipo è un puntatore per gestire l'eliminazione di altri oggetti. Deve essere allocato sullo stack e passato alle funzioni sia per valore sia per riferimento costante in C++."
type: docs
weight: 500
url: /it/cpp/system.text.regularexpressions/groupcollectionptr/
---
## GroupCollectionPtr class


[Group](../group/) collection pointer. This type is a pointer to manage other object's deletion. It should be allocated on stack and passed to functions either by value or by const reference.

```cpp
class GroupCollectionPtr : public System::SmartPtr<GroupCollection>
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [GroupCollectionPtr](./groupcollectionptr/)() | Costruttore di puntatore nullo. |
| [GroupCollectionPtr](./groupcollectionptr/)(const SharedPtr\<GroupCollection\>\&) | Costruttore di conversione di tipo. |
| [operator[]](./operator[]/)(size_t) const | Accessore [Group](../group/). |
## Vedi anche

* Class [SmartPtr](../../system/smartptr/)
* Namespace [System::Text::RegularExpressions](../)
* Library [Aspose.Page for C++](../../)

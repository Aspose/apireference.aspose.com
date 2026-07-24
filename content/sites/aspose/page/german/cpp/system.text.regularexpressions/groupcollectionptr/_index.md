---
title: "System::Text::RegularExpressions::GroupCollectionPtr Klasse"
linktitle: "GroupCollectionPtr"
second_title: "Aspose.Page für C++"
description: "System::Text::RegularExpressions::GroupCollectionPtr Klasse. Zeiger auf eine Gruppensammlung. Dieser Typ ist ein Zeiger zur Verwaltung der Löschung anderer Objekte. Er sollte auf dem Stack alloziert und an Funktionen entweder per Wert oder per const‑Referenz in C++ übergeben werden."
type: docs
weight: 500
url: /de/cpp/system.text.regularexpressions/groupcollectionptr/
---
## GroupCollectionPtr class


[Group](../group/) collection pointer. This type is a pointer to manage other object's deletion. It should be allocated on stack and passed to functions either by value or by const reference.

```cpp
class GroupCollectionPtr : public System::SmartPtr<GroupCollection>
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [GroupCollectionPtr](./groupcollectionptr/)() | Null‑Zeiger‑Konstruktor. |
| [GroupCollectionPtr](./groupcollectionptr/)(const SharedPtr\<GroupCollection\>\&) | Typkonvertierungs‑Konstruktor. |
| [operator[]](./operator[]/)(size_t) const | [Group](../group/) Zugriff. |
## Siehe auch

* Class [SmartPtr](../../system/smartptr/)
* Namespace [System::Text::RegularExpressions](../)
* Library [Aspose.Page for C++](../../)

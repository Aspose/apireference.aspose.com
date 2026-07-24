---
title: "System::Text::RegularExpressions::GroupCollectionPtr class"
linktitle: "GroupCollectionPtr"
second_title: "Aspose.Page για C++"
description: "System::Text::RegularExpressions::GroupCollectionPtr class. Δείκτης συλλογής ομάδων. Αυτός ο τύπος είναι ένας δείκτης για τη διαχείριση της διαγραφής άλλων αντικειμένων. Θα πρέπει να κατανεμηθεί στο στοίβα και να περάσει σε συναρτήσεις είτε ως τιμή είτε ως σταθερή αναφορά σε C++."
type: docs
weight: 500
url: /el/cpp/system.text.regularexpressions/groupcollectionptr/
---
## GroupCollectionPtr class


[Group](../group/) collection pointer. This type is a pointer to manage other object's deletion. It should be allocated on stack and passed to functions either by value or by const reference.

```cpp
class GroupCollectionPtr : public System::SmartPtr<GroupCollection>
```

## Μέθοδοι

| Μέθοδος | Περιγραφή |
| --- | --- |
| [GroupCollectionPtr](./groupcollectionptr/)() | Κατασκευαστής μηδενικού δείκτη. |
| [GroupCollectionPtr](./groupcollectionptr/)(const SharedPtr\<GroupCollection\>\&) | Κατασκευαστής μετατροπής τύπου. |
| [operator[]](./operator[]/)(size_t) const | [Group](../group/) πρόσβαση. |
## Δείτε επίσης

* Class [SmartPtr](../../system/smartptr/)
* Namespace [System::Text::RegularExpressions](../)
* Library [Aspose.Page for C++](../../)

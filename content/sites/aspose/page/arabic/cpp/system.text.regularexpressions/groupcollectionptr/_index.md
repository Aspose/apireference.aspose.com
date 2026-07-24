---
title: "System::Text::RegularExpressions::GroupCollectionPtr class"
linktitle: "GroupCollectionPtr"
second_title: "Aspose.Page لـ C++"
description: "System::Text::RegularExpressions::GroupCollectionPtr class. مؤشر مجموعة المجموعات. هذا النوع هو مؤشر لإدارة حذف كائنات أخرى. يجب تخصيصه على المكدس وتمريره إلى الدوال إما بالقيمة أو بالمرجع الثابت في C++."
type: docs
weight: 500
url: /ar/cpp/system.text.regularexpressions/groupcollectionptr/
---
## GroupCollectionPtr class


[Group](../group/) collection pointer. This type is a pointer to manage other object's deletion. It should be allocated on stack and passed to functions either by value or by const reference.

```cpp
class GroupCollectionPtr : public System::SmartPtr<GroupCollection>
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [GroupCollectionPtr](./groupcollectionptr/)() | منشئ مؤشر فارغ. |
| [GroupCollectionPtr](./groupcollectionptr/)(const SharedPtr\<GroupCollection\>\&) | منشئ تحويل النوع. |
| [operator[]](./operator[]/)(size_t) const | [Group](../group/) مُستَخدم. |
## انظر أيضًا

* Class [SmartPtr](../../system/smartptr/)
* Namespace [System::Text::RegularExpressions](../)
* Library [Aspose.Page for C++](../../)

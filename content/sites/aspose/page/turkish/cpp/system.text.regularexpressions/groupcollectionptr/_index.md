---
title: "System::Text::RegularExpressions::GroupCollectionPtr class"
linktitle: "GroupCollectionPtr"
second_title: "Aspose.Page için C++"
description: "System::Text::RegularExpressions::GroupCollectionPtr sınıfı. Grup koleksiyonu işaretçisi. Bu tür, diğer nesnelerin silinmesini yönetmek için bir işaretçidir. C++'ta yığına (stack) ayrılmalı ve fonksiyonlara değer olarak ya da const referansla geçirilmelidir."
type: docs
weight: 500
url: /tr/cpp/system.text.regularexpressions/groupcollectionptr/
---
## GroupCollectionPtr class


[Group](../group/) collection pointer. This type is a pointer to manage other object's deletion. It should be allocated on stack and passed to functions either by value or by const reference.

```cpp
class GroupCollectionPtr : public System::SmartPtr<GroupCollection>
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [GroupCollectionPtr](./groupcollectionptr/)() | Null işaretçi yapıcı. |
| [GroupCollectionPtr](./groupcollectionptr/)(const SharedPtr\<GroupCollection\>\&) | Tip dönüşüm yapıcı. |
| [operator[]](./operator[]/)(size_t) const | [Group](../group/) erişimci. |
## Ayrıca Bakınız

* Class [SmartPtr](../../system/smartptr/)
* Namespace [System::Text::RegularExpressions](../)
* Library [Aspose.Page for C++](../../)

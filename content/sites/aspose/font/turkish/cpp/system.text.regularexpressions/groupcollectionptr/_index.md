---
title: "System::Text::RegularExpressions::GroupCollectionPtr class"
linktitle: "GroupCollectionPtr"
second_title: "Aspose.Font için C++"
description: "System::Text::RegularExpressions::GroupCollectionPtr sınıfı. Grup koleksiyonu işaretçisi. Bu tip, diğer nesnelerin silinmesini yönetmek için bir işaretçidir. C++'da yığına (stack) ayrılmalı ve fonksiyonlara değer olarak ya da const referansla geçirilmelidir."
type: docs
weight: 500
url: /tr/cpp/system.text.regularexpressions/groupcollectionptr/
---
## GroupCollectionPtr class


[Group](../group/) collection pointer. This type is a pointer to manage other object's deletion. It should be allocated on stack and passed to functions either by value or by const reference.

```cpp
class GroupCollectionPtr : public System::SmartPtr<T0>
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [GroupCollectionPtr](./groupcollectionptr/)() | Null işaretçi yapıcı. |
| [GroupCollectionPtr](./groupcollectionptr/)(const SharedPtr\<GroupCollection\>\&) | Tip dönüşüm yapıcı. |
| [operator[]](./operator[]/)(size_t) const | [Group](../group/) erişici. |
## Ayrıca Bakınız

* Class [SmartPtr](../../system/smartptr/)
* Namespace [System::Text::RegularExpressions](../)
* Library [Aspose.Font for C++](../../)

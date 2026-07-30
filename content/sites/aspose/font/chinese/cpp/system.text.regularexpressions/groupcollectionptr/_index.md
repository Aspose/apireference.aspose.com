---
title: "System::Text::RegularExpressions::GroupCollectionPtr class"
linktitle: "GroupCollectionPtr"
second_title: "Aspose.Font 适用于 C++"
description: "System::Text::RegularExpressions::GroupCollectionPtr 类。组集合指针。此类型是用于管理其他对象删除的指针。它应在栈上分配，并在 C++ 中以值传递或 const 引用方式传递给函数。"
type: docs
weight: 500
url: /zh/cpp/system.text.regularexpressions/groupcollectionptr/
---
## GroupCollectionPtr class


[Group](../group/) collection pointer. This type is a pointer to manage other object's deletion. It should be allocated on stack and passed to functions either by value or by const reference.

```cpp
class GroupCollectionPtr : public System::SmartPtr<T0>
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [GroupCollectionPtr](./groupcollectionptr/)() | 空指针构造函数。 |
| [GroupCollectionPtr](./groupcollectionptr/)(const SharedPtr\<GroupCollection\>\&) | 类型转换构造函数。 |
| [operator[]](./operator[]/)(size_t) const | [Group](../group/) 访问器。 |
## 另见

* Class [SmartPtr](../../system/smartptr/)
* Namespace [System::Text::RegularExpressions](../)
* Library [Aspose.Font for C++](../../)

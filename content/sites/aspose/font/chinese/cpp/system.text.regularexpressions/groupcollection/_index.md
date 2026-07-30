---
title: "System::Text::RegularExpressions::GroupCollection class"
linktitle: "GroupCollection"
second_title: "Aspose.Font 适用于 C++"
description: "System::Text::RegularExpressions::GroupCollection 类。单次匹配中捕获组的列表。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 400
url: /zh/cpp/system.text.regularexpressions/groupcollection/
---
## GroupCollection class


单次匹配中的捕获组列表。此类的对象应仅使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class GroupCollection : public System::Collections::Generic::List<GroupPtr>
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Add](./add/)(const GroupPtr\&) override | 禁用向集合中添加元素。 |
| [AddGroup](./addgroup/)(const GroupPtr\&) | 向集合中添加组。 |
| [Clear](./clear/)() override | 禁用从集合中删除元素。 |
| [get_Item](./get_item/)(int) const | [Group](../group/) 访问器。 |
| [get_Item](./get_item/)(const String\&) const | [Group](../group/) 访问器。 |
| [GroupCollection](./groupcollection/)(const WeakPtr\<Match\>\&) | 构造函数。 |
| virtual [idx_get](./idx_get/)(String) const | [Group](../group/) 访问器。 |
| [idx_get](./idx_get/)(int) const override | [Group](../group/) 访问器。 |
| [IsReadOnly](./isreadonly/)() const | 将集合标记为只读。 |
| [operator[]](./operator[]/)(const String\&) const | [Group](../group/) 访问器。 |
| [operator[]](./operator[]/)(int) | [Group](../group/) 访问器。 |
| [operator[]](./operator[]/)(int) const | [Group](../group/) 访问器。 |
| [Remove](./remove/)(const GroupPtr\&) override | 禁用从集合中移除元素。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [Base](./base/) | [Base](./base/) 类。 |
## 另见

* Class [List](../../system.collections.generic/list/)
* Namespace [System::Text::RegularExpressions](../)
* Library [Aspose.Font for C++](../../)

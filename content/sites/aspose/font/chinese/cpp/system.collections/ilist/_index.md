---
title: "System::Collections::IList 类"
linktitle: "IList"
second_title: "Aspose.Font 适用于 C++"
description: "System::Collections::IList 类。IList 表示一个非泛型对象集合，可以在 C++ 中通过索引单独访问。"
type: docs
weight: 1000
url: /zh/cpp/system.collections/ilist/
---
## IList class


[IList](./) Represents a non-generic collection of objects that can be individually accessed by index.

```cpp
class IList : public virtual System::Collections::ICollection
```

## 方法

| 方法 | 描述 |
| --- | --- |
| virtual [Add](./add/)(SharedPtr\<System::Object\>) | 将项目添加到列表的末尾。 |
| virtual [Clear](./clear/)() | 从列表中移除所有项目。 |
| virtual [Contains](./contains/)(SharedPtr\<System::Object\>) const | 检查该项目是否在列表中。 |
| virtual [get_IsFixedSize](./get_isfixedsize/)() const | 获取一个值，指示列表是否具有固定大小。 |
| virtual [idx_get](./idx_get/)(int, int) const | RTTI 信息。 |
| virtual [IndexOf](./indexof/)(SharedPtr\<System::Object\>) const | 获取指定项目的第一个索引。 |
| virtual [Insert](./insert/)(int, SharedPtr\<System::Object\>) | 在指定索引处将项目插入到列表中。 |
| virtual [Remove](./remove/)(SharedPtr\<System::Object\>) | 从列表中移除指定项目的第一个实例。 |
| virtual [RemoveAt](./removeat/)(int) | 在指定索引处从列表中移除项目。 |
## 另见

* Class [ICollection](../icollection/)
* Namespace [System::Collections](../)
* Library [Aspose.Font for C++](../../)

---
title: "System::Collections::Specialized::NameValueCollection 类"
linktitle: "NameValueCollection"
second_title: "Aspose.Font 适用于 C++"
description: "System::Collections::Specialized::NameValueCollection 类。该集合在 C++ 中包含关联的 String 键和值，可通过键或索引访问。"
type: docs
weight: 200
url: /zh/cpp/system.collections.specialized/namevaluecollection/
---
## NameValueCollection class


集合包含关联的 [String](../../system/string/) 键和 [String](../../system/string/) 值，可通过键或索引访问。

```cpp
class NameValueCollection : public System::Collections::Generic::ICollection<System::String>
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Add](./add/)(const String\&) override | 重写 [ICollection](../../system.collections/icollection/) 方法 - 未实现。 |
| [Add](./add/)(const System::SharedPtr\<NameValueCollection\>\&) | 将指定的 [NameValueCollection](./) 条目复制到当前集合。 |
| virtual [Add](./add/)(const String\&, const String\&) | 添加具有指定名称和值的条目。 |
| [Clear](./clear/)() override | 删除所有元素。 |
| [Contains](./contains/)(const String\&) const override | 检查集合中是否存在该项。 |
| [CopyTo](./copyto/)(System::ArrayPtr\<String\>, int32_t) override | 将集合元素复制到现有数组元素中。 |
| virtual [Get](./get/)(const String\&) | 获取与指定键关联的值。 |
| virtual [get_AllKeys](./get_allkeys/)() | 获取所有键。 |
| [get_Count](./get_count/)() const override | 获取键/值对的数量。 |
| virtual [get_Keys](./get_keys/)() | 获取所有键。 |
| [GetEnumerator](./getenumerator/)() override | 获取用于遍历集合的枚举器。 |
| virtual [GetValues](./getvalues/)(const String\&) | 获取与指定键关联的值。 |
| [HasKeys](./haskeys/)() | 获取一个值，指示 [NameValueCollection](./) 是否包含非空键。 |
| [idx_get](./idx_get/)(const String\&) | 获取指定索引处的值。 |
| [idx_set](./idx_set/)(const String\&, const String\&) | 设置条目的值。 |
| [NameValueCollection](./namevaluecollection/)() | 初始化一个空的 [NameValueCollection](./) 类的新实例。 |
| [NameValueCollection](./namevaluecollection/)(const System::SharedPtr\<NameValueCollection\>\&) | 将指定的 [NameValueCollection](./) 中的条目复制到新的 [NameValueCollection](./)。 |
| [Remove](./remove/)(const String\&) override | 移除特定项。 |
| virtual [Set](./set/)(const String\&, const String\&) | 设置条目的值。 |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | 获取当前容器的 begin const 迭代器的实现。 |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | 获取当前容器的 begin 迭代器的实现。 |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | 获取当前容器的 end const 迭代器的实现。 |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | 获取当前容器的 end 迭代器的实现。 |
## 另见

* Class [ICollection](../../system.collections.generic/icollection/)
* Namespace [System::Collections::Specialized](../)
* Library [Aspose.Font for C++](../../)

---
title: "System::Xml::Schema::XmlSchemaObjectCollection class"
linktitle: "XmlSchemaObjectCollection"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::Schema::XmlSchemaObjectCollection 类。C++ 中的 XmlSchemaObjects 集合。"
type: docs
weight: 5100
url: /zh/cpp/system.xml.schema/xmlschemaobjectcollection/
---
## XmlSchemaObjectCollection class


XmlSchemaObjects 的集合。

```cpp
class XmlSchemaObjectCollection : public System::Collections::CollectionBase<SharedPtr<System::Xml::Schema::XmlSchemaObject>>
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Add](./add/)(const SharedPtr\<XmlSchemaObject\>\&) | 将一个 [XmlSchemaObject](../xmlschemaobject/) 添加到 [XmlSchemaObjectCollection](./)。 |
| [Contains](./contains/)(const SharedPtr\<XmlSchemaObject\>\&) | 指示指定的 [XmlSchemaObject](../xmlschemaobject/) 是否在 [XmlSchemaObjectCollection](./) 中。 |
| [CopyTo](./copyto/)(const ArrayPtr\<SharedPtr\<XmlSchemaObject\>\>\&, int32_t) | 将集合中的所有 XmlSchemaObjects 复制到给定数组中，从给定索引开始。 |
| [GetEnumerator](./getenumerator/)() override | 返回一个枚举器，用于遍历包含在 [XmlSchemaObjectCollection](./) 中的 XmlSchemaObjects。 |
| virtual [idx_get](./idx_get/)(int32_t) | 返回位于指定索引的 [XmlSchemaObject](../xmlschemaobject/)。 |
| virtual [idx_set](./idx_set/)(int32_t, SharedPtr\<XmlSchemaObject\>) | 在指定索引处设置 [XmlSchemaObject](../xmlschemaobject/)。 |
| [IndexOf](./indexof/)(const SharedPtr\<XmlSchemaObject\>\&) | 返回对应于指定的 [XmlSchemaObject](../xmlschemaobject/) 的集合索引。 |
| [Insert](./insert/)(int32_t, const SharedPtr\<XmlSchemaObject\>\&) | 将 [XmlSchemaObject](../xmlschemaobject/) 插入到 [XmlSchemaObjectCollection](./)。 |
| [Remove](./remove/)(const SharedPtr\<XmlSchemaObject\>\&) | 从 [XmlSchemaObjectCollection](./) 中移除 [XmlSchemaObject](../xmlschemaobject/)。 |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | 将第 n 个模板参数设置为弱指针（而不是共享指针）。允许在容器中将指针切换为弱模式。 |
| [XmlSchemaObjectCollection](./xmlschemaobjectcollection/)() | 初始化 [XmlSchemaObjectCollection](./) 类的新实例。 |
| [XmlSchemaObjectCollection](./xmlschemaobjectcollection/)(const SharedPtr\<XmlSchemaObject\>\&) | 初始化 [XmlSchemaObjectCollection](./) 类的新实例，该实例接受一个 [XmlSchemaObject](../xmlschemaobject/)。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [Ptr](./ptr/) | 此类实例的共享指针别名。 |
## 备注



此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

## 另见

* Class [CollectionBase](../../system.collections/collectionbase/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)

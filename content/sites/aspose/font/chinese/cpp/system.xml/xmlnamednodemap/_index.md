---
title: "System::Xml::XmlNamedNodeMap 类"
linktitle: "XmlNamedNodeMap"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlNamedNodeMap 类。表示一个可以通过名称或索引在 C++ 中访问的节点集合。"
type: docs
weight: 2200
url: /zh/cpp/system.xml/xmlnamednodemap/
---
## XmlNamedNodeMap class


表示一个可通过名称或索引访问的节点集合。

```cpp
class XmlNamedNodeMap : public System::Collections::Generic::IEnumerable<SharedPtr<System::Xml::XmlNode>>
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [begin](./begin/)() const | 获取集合中第一个元素的迭代器。 |
| [cbegin](./cbegin/)() const | 获取集合中第一个元素的迭代器。 |
| [cend](./cend/)() const | 获取集合中最后一个元素之后的不存在元素的迭代器。 |
| [end](./end/)() const | 获取集合中最后一个元素之后的不存在元素的迭代器。 |
| virtual [get_Count](./get_count/)() | 返回 [XmlNamedNodeMap](./) 中的节点数量。 |
| [GetEnumerator](./getenumerator/)() override | 提供对 [XmlNamedNodeMap](./) 中节点集合的迭代支持。 |
| virtual [GetNamedItem](./getnameditem/)(String) | 检索指定名称的 [XmlNode](../xmlnode/)。 |
| virtual [GetNamedItem](./getnameditem/)(String, String) | 检索具有匹配的 [XmlNode::get_LocalName](../xmlnode/get_localname/) 和 [XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/) 值的节点。 |
| virtual [Item](./item/)(int32_t) | 检索 [XmlNamedNodeMap](./) 中指定索引处的节点。 |
| virtual [RemoveNamedItem](./removenameditem/)(String) | 从 [XmlNamedNodeMap](./) 中移除节点。 |
| virtual [RemoveNamedItem](./removenameditem/)(String, String) | 移除具有匹配的 [XmlNode::get_LocalName](../xmlnode/get_localname/) 和 [XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/) 值的节点。 |
| virtual [SetNamedItem](./setnameditem/)(SharedPtr\<XmlNode\>) | 使用其 [XmlNode::get_Name](../xmlnode/get_name/) 值添加一个 [XmlNode](../xmlnode/)。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [iterator](./iterator/) | 迭代器类型。 |
| [Ptr](./ptr/) | 此类实例的共享指针别名。 |
## 备注



此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

## 另见

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)

---
title: "System::Xml::XmlAttributeCollection 类"
linktitle: "XmlAttributeCollection"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlAttributeCollection 类。表示一个属性集合，可在 C++ 中通过名称或索引访问。"
type: docs
weight: 700
url: /zh/cpp/system.xml/xmlattributecollection/
---
## XmlAttributeCollection class


表示属性集合，可通过名称或索引访问。

```cpp
class XmlAttributeCollection : public System::Xml::XmlNamedNodeMap
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Append](./append/)(const SharedPtr\<XmlAttribute\>\&) | 将指定的属性插入为集合中的最后一个节点。 |
| [CopyTo](./copyto/)(const ArrayPtr\<SharedPtr\<XmlAttribute\>\>\&, int32_t) | 将此集合中的所有 [XmlAttribute](../xmlattribute/) 对象复制到给定的数组中。 |
| [idx_get](./idx_get/)(int32_t) | 返回具有指定索引的属性。 |
| [idx_get](./idx_get/)(const String\&) | 返回具有指定名称的属性。 |
| [idx_get](./idx_get/)(const String\&, const String\&) | 返回具有指定本地名称和命名空间统一资源标识符（URI）的属性。 |
| [InsertAfter](./insertafter/)(const SharedPtr\<XmlAttribute\>\&, const SharedPtr\<XmlAttribute\>\&) | 在指定的参考属性之后立即插入指定的属性。 |
| [InsertBefore](./insertbefore/)(const SharedPtr\<XmlAttribute\>\&, const SharedPtr\<XmlAttribute\>\&) | 在指定的参考属性之前立即插入指定的属性。 |
| [Prepend](./prepend/)(const SharedPtr\<XmlAttribute\>\&) | 将指定的属性插入为集合中的第一个节点。 |
| [Remove](./remove/)(const SharedPtr\<XmlAttribute\>\&) | 从集合中移除指定的属性。 |
| [RemoveAll](./removeall/)() | 从集合中移除所有属性。 |
| [RemoveAt](./removeat/)(int32_t) | 从集合中移除对应于指定索引的属性。 |
| [SetNamedItem](./setnameditem/)(SharedPtr\<XmlNode\>) override | 使用其 [XmlNode::get_Name](../xmlnode/get_name/) 结果添加一个 [XmlNode](../xmlnode/)。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [Ptr](./ptr/) | 此类实例的共享指针别名。 |
## 备注



此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

## 另见

* Class [XmlNamedNodeMap](../xmlnamednodemap/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)

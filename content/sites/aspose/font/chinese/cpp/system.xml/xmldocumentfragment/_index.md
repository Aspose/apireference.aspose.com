---
title: "System::Xml::XmlDocumentFragment 类"
linktitle: "XmlDocumentFragment"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlDocumentFragment 类。表示一个轻量级对象，可用于 C++ 中的树插入操作。"
type: docs
weight: 1500
url: /zh/cpp/system.xml/xmldocumentfragment/
---
## XmlDocumentFragment class


表示一种轻量级对象，可用于树的插入操作。

```cpp
class XmlDocumentFragment : public System::Xml::XmlNode
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | 创建此节点的副本。 |
| [get_InnerXml](./get_innerxml/)() override | 返回表示此节点子节点的标记。 |
| [get_LocalName](./get_localname/)() override | 返回节点的本地名称。 |
| [get_Name](./get_name/)() override | 返回节点的限定名称。 |
| [get_NodeType](./get_nodetype/)() override | 返回当前节点的类型。 |
| [get_OwnerDocument](./get_ownerdocument/)() override | 返回此节点所属的 [XmlDocument](../xmldocument/)。 |
| [set_InnerXml](./set_innerxml/)(String) override | 设置表示此节点子节点的标记。 |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | 将节点的所有子节点保存到指定的 [XmlWriter](../xmlwriter/)。 |
| [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) override | 将节点保存到指定的 [XmlWriter](../xmlwriter/)。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [Ptr](./ptr/) | 此类实例的共享指针别名。 |
## 备注



此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

## 另见

* Class [XmlNode](../xmlnode/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)

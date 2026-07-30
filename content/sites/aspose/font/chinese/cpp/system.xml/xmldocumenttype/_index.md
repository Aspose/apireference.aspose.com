---
title: "System::Xml::XmlDocumentType 类"
linktitle: "XmlDocumentType"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlDocumentType 类。表示 C++ 中的文档类型声明。"
type: docs
weight: 1600
url: /zh/cpp/system.xml/xmldocumenttype/
---
## XmlDocumentType class


表示文档类型声明。

```cpp
class XmlDocumentType : public System::Xml::XmlLinkedNode
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | 创建此节点的副本。 |
| [get_Entities](./get_entities/)() | 返回在文档类型声明中声明的 [XmlEntity](../xmlentity/) 节点集合。 |
| [get_InternalSubset](./get_internalsubset/)() | 返回 DOCTYPE 声明上文档类型定义 (DTD) 内部子集的值。 |
| [get_IsReadOnly](./get_isreadonly/)() override | 返回指示节点是否为只读的值。 |
| [get_LocalName](./get_localname/)() override | 返回节点的本地名称。 |
| [get_Name](./get_name/)() override | 返回节点的限定名称。 |
| [get_NodeType](./get_nodetype/)() override | 返回当前节点的类型。 |
| [get_Notations](./get_notations/)() | 返回文档类型声明中存在的 [XmlNotation](../xmlnotation/) 节点集合。 |
| [get_PublicId](./get_publicid/)() | 返回 DOCTYPE 声明上的公共标识符的值。 |
| [get_SystemId](./get_systemid/)() | 返回 DOCTYPE 声明上的系统标识符的值。 |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | 将节点的所有子节点保存到指定的 [XmlWriter](../xmlwriter/)。对于 [XmlDocumentType](./) 节点，此方法无效。 |
| [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) override | 将节点保存到指定的 [XmlWriter](../xmlwriter/)。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [Ptr](./ptr/) | 此类实例的共享指针别名。 |
## 备注



此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

## 另见

* Class [XmlLinkedNode](../xmllinkednode/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)

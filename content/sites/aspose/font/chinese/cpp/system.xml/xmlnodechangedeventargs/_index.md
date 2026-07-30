---
title: "System::Xml::XmlNodeChangedEventArgs 类"
linktitle: "XmlNodeChangedEventArgs"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlNodeChangedEventArgs 类。提供用于 XmlDocument::NodeChanged、XmlDocument::NodeChanging、XmlDocument::NodeInserted、XmlDocument::NodeInserting、XmlDocument::NodeRemoved 和 XmlDocument::NodeRemoving 事件的数据（在 C++ 中）。"
type: docs
weight: 2600
url: /zh/cpp/system.xml/xmlnodechangedeventargs/
---
## XmlNodeChangedEventArgs class


为 **XmlDocument::NodeChanged**、**XmlDocument::NodeChanging**、**XmlDocument::NodeInserted**、**XmlDocument::NodeInserting**、**XmlDocument::NodeRemoved** 和 **XmlDocument::NodeRemoving** 事件提供数据。

```cpp
class XmlNodeChangedEventArgs : public System::EventArgs
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [get_Action](./get_action/)() | 返回一个值，指示正在发生哪种类型的节点更改事件。 |
| [get_NewParent](./get_newparent/)() | 在操作完成后，返回 [XmlNode::get_ParentNode](../xmlnode/get_parentnode/) 的值。 |
| [get_NewValue](./get_newvalue/)() | 返回节点的新值。 |
| [get_Node](./get_node/)() | 返回被添加、删除或更改的 [XmlNode](../xmlnode/)。 |
| [get_OldParent](./get_oldparent/)() | 在操作开始前，返回 [XmlNode::get_ParentNode](../xmlnode/get_parentnode/) 的值。 |
| [get_OldValue](./get_oldvalue/)() | 返回节点的原始值。 |
| [XmlNodeChangedEventArgs](./xmlnodechangedeventargs/)(const SharedPtr\<XmlNode\>\&, const SharedPtr\<XmlNode\>\&, const SharedPtr\<XmlNode\>\&, const String\&, const String\&, XmlNodeChangedAction) | 初始化一个新的 [XmlNodeChangedEventArgs](./) 类实例。 |
## 字段

| 字段 | 描述 |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | 一个静态成员，表示一个 "empty" [EventArgs](../../system/eventargs/) 共享指针（空指针）。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [Ptr](./ptr/) | 此类实例的共享指针别名。 |
## 备注



此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

## 另见

* Class [EventArgs](../../system/eventargs/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)

---
title: "System::Xml::XPath::XPathNodeIterator 类"
linktitle: "XPathNodeIterator"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XPath::XPathNodeIterator 类。提供在 C++ 中对选定节点集合的迭代器。"
type: docs
weight: 600
url: /zh/cpp/system.xml.xpath/xpathnodeiterator/
---
## XPathNodeIterator class


提供对选定节点集合的迭代器。

```cpp
class XPathNodeIterator : public System::Collections::Generic::IEnumerable<SharedPtr<System::Xml::XPath::XPathNavigator>>
```

## 方法

| 方法 | 描述 |
| --- | --- |
| virtual [Clone](./clone/)() | 在派生类中重写时，返回此 [XPathNodeIterator](./) 对象的克隆。 |
| virtual [get_Count](./get_count/)() | 返回选定节点集合中最后一个节点的索引。 |
| virtual [get_Current](./get_current/)() | 在派生类中重写时，获取此 [XPathNodeIterator](./) 的 [XPathNavigator](../xpathnavigator/) 对象，该对象定位在当前上下文节点上。 |
| virtual [get_CurrentPosition](./get_currentposition/)() | 在派生类中重写时，获取选定节点集合中当前位置信息的索引。 |
| [GetEnumerator](./getenumerator/)() override | 返回一个 IEnumerator 对象，用于遍历选定的节点集合。 |
| virtual [MoveNext](./movenext/)() | 在派生类中重写时，将由 [XPathNodeIterator::get_Current](./get_current/) 方法返回的 [XPathNavigator](../xpathnavigator/) 对象移动到选定节点集合中的下一个节点。 |
| [XPathNodeIterator](./xpathnodeiterator/)() | 初始化 [XPathNodeIterator](./) 类的新实例。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [Ptr](./ptr/) | 此类实例的共享指针别名。 |
## 另见

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Xml::XPath](../)
* Library [Aspose.Font for C++](../../)

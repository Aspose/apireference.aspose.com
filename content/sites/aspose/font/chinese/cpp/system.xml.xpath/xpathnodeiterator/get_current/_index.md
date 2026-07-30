---
title: "System::Xml::XPath::XPathNodeIterator::get_Current 方法"
linktitle: "get_Current"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XPath::XPathNodeIterator::get_Current 方法。当在派生类中重写时，获取此 XPathNodeIterator 的 XPathNavigator 对象，该对象定位在当前上下文节点上（C++）。"
type: docs
weight: 400
url: /zh/cpp/system.xml.xpath/xpathnodeiterator/get_current/
---
## XPathNodeIterator::get_Current method


当在派生类中重写时，获取此 [XPathNodeIterator](../) 的 [XPathNavigator](../../xpathnavigator/) 对象，该对象定位在当前上下文节点上。

```cpp
virtual const SharedPtr<XPathNavigator> & System::Xml::XPath::XPathNodeIterator::get_Current()=0
```


### ReturnValue

一个定位在选取节点集的上下文节点上的 [XPathNavigator](../../xpathnavigator/) 对象。必须调用 [XPathNodeIterator::MoveNext](../movenext/) 方法将 [XPathNodeIterator](../) 移动到所选集合中的第一个节点。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../xpathnavigator/)
* Class [XPathNodeIterator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)

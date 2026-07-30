---
title: "System::Xml::XmlReader::get_IsEmptyElement 方法"
linktitle: "get_IsEmptyElement"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlReader::get_IsEmptyElement 方法。当在派生类中重写时，获取一个值，指示当前节点是否为空元素（例如，<MyElement/>) 在 C++ 中。"
type: docs
weight: 1300
url: /zh/cpp/system.xml/xmlreader/get_isemptyelement/
---
## XmlReader::get_IsEmptyElement method


当在派生类中被重写时，获取一个值，指示当前节点是否为空元素（例如，**<MyElement/>**）。

```cpp
virtual bool System::Xml::XmlReader::get_IsEmptyElement()=0
```


### ReturnValue

**true** if the current node is an element ([XmlReader::get_NodeType](../get_nodetype/) equals [XmlNodeType::Element](../../xmlnodetype/)) that ends with **/>**; otherwise, **false**.

## 另见

* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)

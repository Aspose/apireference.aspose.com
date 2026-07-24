---
title: "System::Xml::XmlReader::ReadSubtree 方法"
linktitle: "ReadSubtree"
second_title: "Aspose.Page 适用于 C++"
description: "System::Xml::XmlReader::ReadSubtree 方法。返回一个新的 XmlReader 实例，可用于在 C++ 中读取当前节点及其所有后代。"
type: docs
weight: 7000
url: /zh/cpp/system.xml/xmlreader/readsubtree/
---
## XmlReader::ReadSubtree method


返回一个新的 [XmlReader](../) 实例，可用于读取当前节点及其所有后代。

```cpp
virtual SharedPtr<XmlReader> System::Xml::XmlReader::ReadSubtree()
```


### ReturnValue

一个新的 XML 读取器实例被设置为 [ReadState::Initial](../../readstate/)。调用 [XmlReader::Read](../read/) 方法会将新读取器定位到在调用 [XmlReader::ReadSubtree](./) 方法之前当前所在的节点。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)

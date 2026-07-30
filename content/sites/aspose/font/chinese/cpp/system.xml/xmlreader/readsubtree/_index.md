---
title: "System::Xml::XmlReader::ReadSubtree 方法"
linktitle: "ReadSubtree"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlReader::ReadSubtree 方法。返回一个新的 XmlReader 实例，可用于读取当前节点及其所有子节点（在 C++ 中）。"
type: docs
weight: 7000
url: /zh/cpp/system.xml/xmlreader/readsubtree/
---
## XmlReader::ReadSubtree method


返回一个新的 [XmlReader](../) 实例，可用于读取当前节点及其所有子节点。

```cpp
virtual SharedPtr<XmlReader> System::Xml::XmlReader::ReadSubtree()
```


### ReturnValue

一个新的 XML 阅读器实例被设置为 [ReadState::Initial](../../readstate/)。调用 [XmlReader::Read](../read/) 方法会将新阅读器定位到调用 [XmlReader::ReadSubtree](./) 方法之前的当前节点。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)

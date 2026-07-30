---
title: "System::Xml::XmlReader::get_HasValue 方法"
linktitle: "get_HasValue"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlReader::get_HasValue 方法。当在派生类中被重写时，获取一个值，指示当前节点在 C++ 中是否可以具有 XmlReader::get_Value 值。"
type: docs
weight: 1100
url: /zh/cpp/system.xml/xmlreader/get_hasvalue/
---
## XmlReader::get_HasValue method


当在派生类中被重写时，获取一个值，指示当前节点是否可以拥有 [XmlReader::get_Value](../get_value/) 值。

```cpp
virtual bool System::Xml::XmlReader::get_HasValue()
```


### ReturnValue

**true** if the node on which the reader is currently positioned can have a **Value**; otherwise, **false**. If **false**, the node has a value of [String::Empty](../../../system/string/empty/).

## 另见

* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)

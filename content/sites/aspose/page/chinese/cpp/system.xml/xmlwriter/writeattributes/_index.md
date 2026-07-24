---
title: "System::Xml::XmlWriter::WriteAttributes 方法"
linktitle: "WriteAttributes"
second_title: "Aspose.Page 适用于 C++"
description: "System::Xml::XmlWriter::WriteAttributes 方法。 在派生类中重写时，以 C++ 将当前 XmlReader 位置找到的所有属性写出。"
type: docs
weight: 900
url: /zh/cpp/system.xml/xmlwriter/writeattributes/
---
## XmlWriter::WriteAttributes method


在派生类中重写时，将当前位于 [XmlReader](../../xmlreader/) 中的位置找到的所有属性写出。

```cpp
virtual void System::Xml::XmlWriter::WriteAttributes(SharedPtr<XmlReader> reader, bool defattr)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| reader | SharedPtr\<XmlReader\> | 要从中复制属性的 [XmlReader](../../xmlreader/)。 |
| defattr | bool | **true** 表示从 [XmlReader](../../xmlreader/) 复制默认属性；否则为 **false**。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../xmlreader/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)

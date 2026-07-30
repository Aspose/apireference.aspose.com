---
title: "System::Xml::XmlWriter::WriteAttributes 方法"
linktitle: "WriteAttributes"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlWriter::WriteAttributes 方法。当在派生类中被重写时，在 C++ 中写出 XmlReader 当前位置信息中找到的所有属性。"
type: docs
weight: 900
url: /zh/cpp/system.xml/xmlwriter/writeattributes/
---
## XmlWriter::WriteAttributes method


当在派生类中被重写时，写出在当前位置的 [XmlReader](../../xmlreader/) 中找到的所有属性。

```cpp
virtual void System::Xml::XmlWriter::WriteAttributes(SharedPtr<XmlReader> reader, bool defattr)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| reader | SharedPtr\<XmlReader\> | 用于复制属性的 [XmlReader](../../xmlreader/)。 |
| defattr | bool | **true** 表示从 [XmlReader](../../xmlreader/) 复制默认属性；否则为 **false**。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../xmlreader/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)

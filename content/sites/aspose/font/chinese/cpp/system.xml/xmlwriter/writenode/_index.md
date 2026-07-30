---
title: "System::Xml::XmlWriter::WriteNode 方法"
linktitle: "WriteNode"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlWriter::WriteNode 方法。当在派生类中重写时，在 C++ 中复制读取器的所有内容到写入器，并将读取器移动到下一个兄弟节点的起始位置。"
type: docs
weight: 2600
url: /zh/cpp/system.xml/xmlwriter/writenode/
---
## XmlWriter::WriteNode(SharedPtr\<XmlReader\>, bool) method


在派生类中重写时，复制读取器中的所有内容到写入器，并将读取器移动到下一个兄弟节点的开始位置。

```cpp
virtual void System::Xml::XmlWriter::WriteNode(SharedPtr<XmlReader> reader, bool defattr)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| reader | SharedPtr\<XmlReader\> | 要读取的 [XmlReader](../../xmlreader/)。 |
| defattr | bool | **true** 表示从 [XmlReader](../../xmlreader/) 复制默认属性；否则为 **false**。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../xmlreader/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlWriter::WriteNode(SharedPtr\<XPath::XPathNavigator\>, bool) method


将 XPathNavigator 对象中的所有内容复制到写入器。XPathNavigator 的位置保持不变。

```cpp
virtual void System::Xml::XmlWriter::WriteNode(SharedPtr<XPath::XPathNavigator> navigator, bool defattr)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 导航器 | SharedPtr\<XPath::XPathNavigator\> | 要复制的 XPathNavigator。 |
| defattr | bool | **true** 复制默认属性；否则为 **false**。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)

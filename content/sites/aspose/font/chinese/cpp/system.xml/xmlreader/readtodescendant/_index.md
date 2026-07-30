---
title: "System::Xml::XmlReader::ReadToDescendant 方法"
linktitle: "ReadToDescendant"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlReader::ReadToDescendant 方法。将 XmlReader 前进到下一个具有指定本地名称和命名空间 URI 的后代元素（C++）。"
type: docs
weight: 7100
url: /zh/cpp/system.xml/xmlreader/readtodescendant/
---
## XmlReader::ReadToDescendant(String, String) method


将 [XmlReader](../) 前进到下一个具有指定本地名称和命名空间 URI 的后代元素。

```cpp
virtual bool System::Xml::XmlReader::ReadToDescendant(String localName, String namespaceURI)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| localName | String | 您希望移动到的元素的本地名称。 |
| namespaceURI | String | 您希望移动到的元素的命名空间 URI。 |

### ReturnValue

**true** if a matching descendant element is found; otherwise **false**. If a matching child element is not found, the [XmlReader](../) is positioned on the end tag ([XmlReader::get_NodeType](../get_nodetype/) value is [XmlNodeType::EndElement](../../xmlnodetype/)) of the element. If the [XmlReader](../) is not positioned on an element when [XmlReader::ReadToDescendant(String,String)](./) was called, this method returns **false** and the position of the [XmlReader](../) is not changed.

## 另见

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::ReadToDescendant(String) method


将 [XmlReader](../) 前进到下一个具有指定限定名称的后代元素。

```cpp
virtual bool System::Xml::XmlReader::ReadToDescendant(String name)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 名称 | String | 您希望移动到的元素的限定名称。 |

### ReturnValue

**true** if a matching descendant element is found; otherwise **false**. If a matching child element is not found, the [XmlReader](../) is positioned on the end tag ([XmlReader::get_NodeType](../get_nodetype/) value is [XmlNodeType::EndElement](../../xmlnodetype/)) of the element. If the [XmlReader](../) is not positioned on an element when [XmlReader::ReadToDescendant(String)](./) was called, this method returns **false** and the position of the [XmlReader](../) is not changed.

## 另见

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)

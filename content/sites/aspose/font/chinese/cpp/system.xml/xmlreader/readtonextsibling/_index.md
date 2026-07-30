---
title: "System::Xml::XmlReader::ReadToNextSibling 方法"
linktitle: "ReadToNextSibling"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlReader::ReadToNextSibling 方法。在 C++ 中将 XmlReader 前移到具有指定本地名称和命名空间 URI 的下一个兄弟元素。"
type: docs
weight: 7300
url: /zh/cpp/system.xml/xmlreader/readtonextsibling/
---
## XmlReader::ReadToNextSibling(String, String) method


将 [XmlReader](../) 前移到具有指定本地名称和命名空间 URI 的下一个兄弟元素。

```cpp
virtual bool System::Xml::XmlReader::ReadToNextSibling(String localName, String namespaceURI)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| localName | String | 您希望移动到的兄弟元素的本地名称。 |
| namespaceURI | String | 您想移动到的兄弟元素的命名空间 URI。 |

### ReturnValue

**true** if a matching sibling element is found; otherwise, **false**. If a matching sibling element is not found, the [XmlReader](../) is positioned on the end tag ([XmlReader::get_NodeType](../get_nodetype/) value is [XmlNodeType::EndElement](../../xmlnodetype/)) of the parent element.

## 另见

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::ReadToNextSibling(String) method


将 [XmlReader](../) 前进到具有指定限定名的下一个兄弟元素。

```cpp
virtual bool System::Xml::XmlReader::ReadToNextSibling(String name)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 名称 | String | 您想移动到的兄弟元素的限定名称。 |

### ReturnValue

**true** if a matching sibling element is found; otherwise **false**. If a matching sibling element is not found, the [XmlReader](../) is positioned on the end tag ([XmlReader::get_NodeType](../get_nodetype/) value is [XmlNodeType::EndElement](../../xmlnodetype/)) of the parent element.

## 另见

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)

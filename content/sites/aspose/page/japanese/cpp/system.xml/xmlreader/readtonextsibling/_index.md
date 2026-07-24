---
title: "System::Xml::XmlReader::ReadToNextSibling メソッド"
linktitle: "ReadToNextSibling"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlReader::ReadToNextSibling メソッド。C++ で指定されたローカル名と名前空間 URI を持つ次の兄弟要素へ XmlReader を進めます。"
type: docs
weight: 7300
url: /ja/cpp/system.xml/xmlreader/readtonextsibling/
---
## XmlReader::ReadToNextSibling(String, String) method


指定されたローカル名と名前空間 URI を持つ次の兄弟要素へ [XmlReader](../) を進めます。

```cpp
virtual bool System::Xml::XmlReader::ReadToNextSibling(String localName, String namespaceURI)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| localName | String | 移動したい兄弟要素のローカル名です。 |
| namespaceURI | String | 移動したい兄弟要素の名前空間 URI です。 |

### ReturnValue

**true** if a matching sibling element is found; otherwise, **false**. If a matching sibling element is not found, the [XmlReader](../) is positioned on the end tag ([XmlReader::get_NodeType](../get_nodetype/) value is [XmlNodeType::EndElement](../../xmlnodetype/)) of the parent element.

## 参照

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::ReadToNextSibling(String) method


指定された修飾名を持つ次の兄弟要素へ [XmlReader](../) を進めます。

```cpp
virtual bool System::Xml::XmlReader::ReadToNextSibling(String name)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| name | String | 移動したい兄弟要素の修飾名です。 |

### ReturnValue

**true** if a matching sibling element is found; otherwise **false**. If a matching sibling element is not found, the [XmlReader](../) is positioned on the end tag ([XmlReader::get_NodeType](../get_nodetype/) value is [XmlNodeType::EndElement](../../xmlnodetype/)) of the parent element.

## 参照

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)

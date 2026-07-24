---
title: "System::Xml::XmlReader::ReadToDescendant メソッド"
linktitle: "ReadToDescendant"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlReader::ReadToDescendant メソッド。C++ で指定されたローカル名と名前空間 URI を持つ次の子孫要素へ XmlReader を進めます。"
type: docs
weight: 7100
url: /ja/cpp/system.xml/xmlreader/readtodescendant/
---
## XmlReader::ReadToDescendant(String, String) method


指定されたローカル名と名前空間URIを持つ次の子孫要素へ[XmlReader](../)を進めます。

```cpp
virtual bool System::Xml::XmlReader::ReadToDescendant(String localName, String namespaceURI)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| localName | String | 移動したい要素のローカル名です。 |
| namespaceURI | String | 移動したい要素の名前空間URIです。 |

### ReturnValue

**true** if a matching descendant element is found; otherwise **false**. If a matching child element is not found, the [XmlReader](../) is positioned on the end tag ([XmlReader::get_NodeType](../get_nodetype/) value is [XmlNodeType::EndElement](../../xmlnodetype/)) of the element. If the [XmlReader](../) is not positioned on an element when [XmlReader::ReadToDescendant(String,String)](./) was called, this method returns **false** and the position of the [XmlReader](../) is not changed.

## 参照

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::ReadToDescendant(String) method


指定された修飾名を持つ次の子孫要素へ[XmlReader](../)を進めます。

```cpp
virtual bool System::Xml::XmlReader::ReadToDescendant(String name)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| name | String | 移動したい要素の修飾名です。 |

### ReturnValue

**true** if a matching descendant element is found; otherwise **false**. If a matching child element is not found, the [XmlReader](../) is positioned on the end tag ([XmlReader::get_NodeType](../get_nodetype/) value is [XmlNodeType::EndElement](../../xmlnodetype/)) of the element. If the [XmlReader](../) is not positioned on an element when [XmlReader::ReadToDescendant(String)](./) was called, this method returns **false** and the position of the [XmlReader](../) is not changed.

## 参照

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)

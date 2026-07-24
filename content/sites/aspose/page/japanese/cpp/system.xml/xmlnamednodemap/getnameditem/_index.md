---
title: "System::Xml::XmlNamedNodeMap::GetNamedItem method"
linktitle: "GetNamedItem"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlNamedNodeMap::GetNamedItem method. C++ で XmlNode::get_LocalName と XmlNode::get_NamespaceURI の一致する値を持つノードを取得します。"
type: docs
weight: 700
url: /ja/cpp/system.xml/xmlnamednodemap/getnameditem/
---
## XmlNamedNodeMap::GetNamedItem(String, String) method


一致する [XmlNode::get_LocalName](../../xmlnode/get_localname/) と [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/) の値を持つノードを取得します。

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlNamedNodeMap::GetNamedItem(String localName, String namespaceURI)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| localName | String | 取得するノードのローカル名。 |
| namespaceURI | String | 取得するノードの名前空間の Uniform Resource Identifier (URI)。 |

### ReturnValue

一致するローカル名と名前空間 URI を持つ [XmlNode](../../xmlnode/)、または一致するノードが見つからなかった場合は **nullptr**。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [String](../../../system/string/)
* Class [XmlNamedNodeMap](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlNamedNodeMap::GetNamedItem(String) method


名前で指定された [XmlNode](../../xmlnode/) を取得します。

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlNamedNodeMap::GetNamedItem(String name)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| name | String | 取得するノードの修飾名。これは一致するノードの [XmlNode::get_Name](../../xmlnode/get_name/) の値と照合されます。 |

### ReturnValue

指定された名前を持つ [XmlNode](../../xmlnode/)、または一致するノードが見つからなかった場合は **nullptr**。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [String](../../../system/string/)
* Class [XmlNamedNodeMap](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)

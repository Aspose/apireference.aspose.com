---
title: "System::Xml::XmlNamedNodeMap::RemoveNamedItem method"
linktitle: "RemoveNamedItem"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlNamedNodeMap::RemoveNamedItem method. C++ で XmlNode::get_LocalName と XmlNode::get_NamespaceURI の一致する値を持つノードを削除します。"
type: docs
weight: 900
url: /ja/cpp/system.xml/xmlnamednodemap/removenameditem/
---
## XmlNamedNodeMap::RemoveNamedItem(String, String) method


一致する [XmlNode::get_LocalName](../../xmlnode/get_localname/) と [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/) の値を持つノードを削除します。

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlNamedNodeMap::RemoveNamedItem(String localName, String namespaceURI)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| localName | String | 削除するノードのローカル名。 |
| namespaceURI | String | 削除するノードの名前空間 URI。 |

### ReturnValue

削除された [XmlNode](../../xmlnode/)、または一致するノードが見つからなかった場合は **nullptr**。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [String](../../../system/string/)
* Class [XmlNamedNodeMap](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlNamedNodeMap::RemoveNamedItem(String) method


ノードを [XmlNamedNodeMap](../) から削除します。

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlNamedNodeMap::RemoveNamedItem(String name)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| name | String | 削除するノードの修飾名。その名前は一致するノードの [XmlNode::get_Name](../../xmlnode/get_name/) の値と照合されます。 |

### ReturnValue

この [XmlNamedNodeMap](../) から削除された [XmlNode](../../xmlnode/)、または一致するノードが見つからなかった場合は **nullptr**。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [String](../../../system/string/)
* Class [XmlNamedNodeMap](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)

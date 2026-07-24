---
title: "System::Xml::XmlDocument::GetElementsByTagName メソッド"
linktitle: "GetElementsByTagName"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlDocument::GetElementsByTagName メソッド。C++ で指定された XmlDocument::get_LocalName と XmlNode::get_NamespaceURI に一致するすべての子孫要素のリストを含む XmlNodeList を返します。"
type: docs
weight: 3200
url: /ja/cpp/system.xml/xmldocument/getelementsbytagname/
---
## XmlDocument::GetElementsByTagName(String, String) method


指定された [XmlDocument::get_LocalName](../get_localname/) と [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/) に一致するすべての子孫要素のリストを含む [XmlNodeList](../../xmlnodelist/) を返します。

```cpp
virtual SharedPtr<XmlNodeList> System::Xml::XmlDocument::GetElementsByTagName(String localName, String namespaceURI)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| localName | String | 一致させる LocalName。特別な値 **\"*\"** はすべてのタグに一致します。 |
| namespaceURI | String | 一致させる NamespaceURI。 |

### ReturnValue

一致するすべてのノードのリストを含む [XmlNodeList](../../xmlnodelist/)。指定された **localName** と **namespaceURI** に一致するノードがない場合、返されるコレクションは空になります。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNodeList](../../xmlnodelist/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlDocument::GetElementsByTagName(String) method


指定された名前に一致するすべての子孫要素のリストを含む [XmlNodeList](../../xmlnodelist/) を返します。

```cpp
virtual SharedPtr<XmlNodeList> System::Xml::XmlDocument::GetElementsByTagName(String name)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| name | String | 一致させる修飾名。対象ノードの **get_Name** 値と照合されます。特別な値 **\"*\"** はすべてのタグに一致します。 |

### ReturnValue

一致するすべてのノードのリストを含む [XmlNodeList](../../xmlnodelist/)。**name** に一致するノードがない場合、返されるコレクションは空になります。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNodeList](../../xmlnodelist/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)

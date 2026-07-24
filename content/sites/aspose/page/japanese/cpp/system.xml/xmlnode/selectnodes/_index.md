---
title: "System::Xml::XmlNode::SelectNodes method"
linktitle: "SelectNodes"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlNode::SelectNodes method. C++ で XPath 式に一致するノードのリストを選択します。"
type: docs
weight: 3800
url: /ja/cpp/system.xml/xmlnode/selectnodes/
---
## XmlNode::SelectNodes(const String\&) method


[XPath](../../../system.xml.xpath/) 式に一致するノードのリストを選択します。

```cpp
SharedPtr<XmlNodeList> System::Xml::XmlNode::SelectNodes(const String &xpath)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| xpath | const String\& | この [XPath](../../../system.xml.xpath/) 式。 |

### ReturnValue

[XmlNodeList](../../xmlnodelist/) は、[XPath](../../../system.xml.xpath/) クエリに一致するノードのコレクションを含みます。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNodeList](../../xmlnodelist/)
* Class [String](../../../system/string/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlNode::SelectNodes(const String\&, const SharedPtr\<XmlNamespaceManager\>\&) method


[XPath](../../../system.xml.xpath/) 式に一致するノードのリストを選択します。 [XPath](../../../system.xml.xpath/) 式で見つかったプレフィックスは、提供された [XmlNamespaceManager](../../xmlnamespacemanager/) を使用して解決されます。

```cpp
SharedPtr<XmlNodeList> System::Xml::XmlNode::SelectNodes(const String &xpath, const SharedPtr<XmlNamespaceManager> &nsmgr)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| xpath | const String\& | この [XPath](../../../system.xml.xpath/) 式。 |
| nsmgr | const SharedPtr\<XmlNamespaceManager\>\& | [XPath](../../../system.xml.xpath/) 式のプレフィックスの名前空間を解決するために使用する [XmlNamespaceManager](../../xmlnamespacemanager/)。 |

### ReturnValue

[XmlNodeList](../../xmlnodelist/) は、[XPath](../../../system.xml.xpath/) クエリに一致するノードのコレクションを含みます。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNodeList](../../xmlnodelist/)
* Class [String](../../../system/string/)
* Class [XmlNamespaceManager](../../xmlnamespacemanager/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)

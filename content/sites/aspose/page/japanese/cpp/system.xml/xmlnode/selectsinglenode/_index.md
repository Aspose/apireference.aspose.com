---
title: "System::Xml::XmlNode::SelectSingleNode メソッド"
linktitle: "SelectSingleNode"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlNode::SelectSingleNode メソッド。C++ で XPath 式に一致する最初の XmlNode を選択します。"
type: docs
weight: 3900
url: /ja/cpp/system.xml/xmlnode/selectsinglenode/
---
## XmlNode::SelectSingleNode(const String\&) method


最初の [XmlNode](../) が [XPath](../../../system.xml.xpath/) 式に一致するものを選択します。

```cpp
SharedPtr<XmlNode> System::Xml::XmlNode::SelectSingleNode(const String &xpath)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| xpath | const String\& | この [XPath](../../../system.xml.xpath/) 式。 |

### ReturnValue

一致するノードが見つからない場合は **nullptr** を返す、[XPath](../../../system.xml.xpath/) クエリに一致する最初の [XmlNode](../) です。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../)
* Class [String](../../../system/string/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlNode::SelectSingleNode(const String\&, const SharedPtr\<XmlNamespaceManager\>\&) method


最初の [XmlNode](../) が [XPath](../../../system.xml.xpath/) 式に一致するものを選択します。[XPath](../../../system.xml.xpath/) 式で見つかったプレフィックスは、提供された [XmlNamespaceManager](../../xmlnamespacemanager/) を使用して解決されます。

```cpp
SharedPtr<XmlNode> System::Xml::XmlNode::SelectSingleNode(const String &xpath, const SharedPtr<XmlNamespaceManager> &nsmgr)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| xpath | const String\& | この [XPath](../../../system.xml.xpath/) 式。 |
| nsmgr | const SharedPtr\<XmlNamespaceManager\>\& | [XPath](../../../system.xml.xpath/) 式のプレフィックスの名前空間を解決するために使用する [XmlNamespaceManager](../../xmlnamespacemanager/)。 |

### ReturnValue

一致するノードが見つからない場合は **nullptr** を返す、[XPath](../../../system.xml.xpath/) クエリに一致する最初の [XmlNode](../) です。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../)
* Class [String](../../../system/string/)
* Class [XmlNamespaceManager](../../xmlnamespacemanager/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)

---
title: "System::Xml::XmlNamespaceManager::AddNamespace メソッド"
linktitle: "AddNamespace"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlNamespaceManager::AddNamespace メソッド。C++ で指定された名前空間をコレクションに追加します。"
type: docs
weight: 200
url: /ja/cpp/system.xml/xmlnamespacemanager/addnamespace/
---
## XmlNamespaceManager::AddNamespace method


指定された名前空間をコレクションに追加します。

```cpp
virtual void System::Xml::XmlNamespaceManager::AddNamespace(String prefix, String uri)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| prefix | String | 追加する名前空間に関連付けるプレフィックスです。デフォルト名前空間を追加するには [String::Empty](../../../system/string/empty/) を使用します。[XmlNamespaceManager](../) が XML パス言語 ([XPath](../../../system.xml.xpath/)) 式で名前空間を解決するために使用される場合、プレフィックスを指定する必要があります。[XPath](../../../system.xml.xpath/) 式にプレフィックスが含まれていない場合、名前空間の Uniform Resource Identifier (URI) は空の名前空間であるとみなされます。[XPath](../../../system.xml.xpath/) 式および [XmlNamespaceManager](../) の詳細については、XmlNode::SelectNodes(String) と XPathExpression::SetContext(SharedPtr<XmlNamespaceManager>) メソッドを参照してください。 |
| uri | String | 追加する名前空間。 |

## 参照

* Class [String](../../../system/string/)
* Class [XmlNamespaceManager](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)

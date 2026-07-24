---
title: "System::Xml::XPath::XPathNavigator::InsertElementBefore メソッド"
linktitle: "InsertElementBefore"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XPath::XPathNavigator::InsertElementBefore メソッド。C++ で指定された名前空間プレフィックス、ローカル名、名前空間 URI を使用し、指定された値で現在のノードの前に新しい兄弟要素を作成します。"
type: docs
weight: 4400
url: /ja/cpp/system.xml.xpath/xpathnavigator/insertelementbefore/
---
## XPathNavigator::InsertElementBefore method


指定された名前空間プレフィックス、ローカル名、名前空間URIを使用し、指定された値で、現在のノードの前に新しい兄弟要素を作成します。

```cpp
virtual void System::Xml::XPath::XPathNavigator::InsertElementBefore(String prefix, String localName, String namespaceURI, String value)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| prefix | String | 新しい子要素の名前空間プレフィックス（存在する場合）。 |
| localName | String | 新しい子要素のローカル名（存在する場合）。 |
| namespaceURI | String | 新しい子要素の名前空間 URI（存在する場合）。[String::Empty](../../../system/string/empty/) と **nullptr** は同等です。 |
| value | String | 新しい子要素の値です。[String::Empty](../../../system/string/empty/) または **nullptr** が渡された場合、空の要素が作成されます。 |

## 参照

* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)

---
title: "System::Xml::XPath::XPathNavigator::AppendChildElement メソッド"
linktitle: "AppendChildElement"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XPath::XPathNavigator::AppendChildElement メソッド。指定された名前空間プレフィックス、ローカル名、名前空間 URI と C++ で指定された値を使用して、現在のノードの子ノードリストの末尾に新しい子要素ノードを作成します。"
type: docs
weight: 200
url: /ja/cpp/system.xml.xpath/xpathnavigator/appendchildelement/
---
## XPathNavigator::AppendChildElement method


指定された名前空間プレフィックス、ローカル名、および名前空間 URI とその値を使用して、現在のノードの子ノードリストの末尾に新しい子要素ノードを作成します。

```cpp
virtual void System::Xml::XPath::XPathNavigator::AppendChildElement(String prefix, String localName, String namespaceURI, String value)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| prefix | String | 新しい子要素ノードの名前空間プレフィックス（存在する場合）。 |
| localName | String | 新しい子要素ノードのローカル名（存在する場合）。 |
| namespaceURI | String | 新しい子要素ノードの名前空間 URI（該当する場合）。[String::Empty](../../../system/string/empty/) と **nullptr** は同等です。 |
| value | String | 新しい子要素ノードの値。[String::Empty](../../../system/string/empty/) または **nullptr** が渡された場合、空の要素が作成されます。 |

## 参照

* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)

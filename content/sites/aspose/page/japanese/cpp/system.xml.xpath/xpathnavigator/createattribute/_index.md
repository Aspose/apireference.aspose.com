---
title: "System::Xml::XPath::XPathNavigator::CreateAttribute メソッド"
linktitle: "CreateAttribute"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XPath::XPathNavigator::CreateAttribute メソッド。C++で指定された値を使用して、名前空間プレフィックス、ローカル名、および名前空間URIで現在の要素ノードに属性ノードを作成します。"
type: docs
weight: 700
url: /ja/cpp/system.xml.xpath/xpathnavigator/createattribute/
---
## XPathNavigator::CreateAttribute method


指定された名前空間プレフィックス、ローカル名、および名前空間 URI とその値を使用して、現在の要素ノードに属性ノードを作成します。

```cpp
virtual void System::Xml::XPath::XPathNavigator::CreateAttribute(String prefix, String localName, String namespaceURI, String value)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| prefix | String | 新しい属性ノードの名前空間プレフィックス（存在する場合）。 |
| localName | String | 新しい属性ノードのローカル名（[String::Empty](../../../system/string/empty/) または **nullptr** にはできません）。 |
| namespaceURI | String | 新しい属性ノードの名前空間URI（存在する場合）。 |
| value | String | 新しい属性ノードの値。[String::Empty](../../../system/string/empty/) または **nullptr** が渡された場合、空の属性ノードが作成されます。 |

## 参照

* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)

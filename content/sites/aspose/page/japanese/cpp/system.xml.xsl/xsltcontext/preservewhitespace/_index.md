---
title: "System::Xml::Xsl::XsltContext::PreserveWhitespace メソッド"
linktitle: "PreserveWhitespace"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::Xsl::XsltContext::PreserveWhitespace メソッド。派生クラスでオーバーライドされた場合、C++ の特定のコンテキストに対して空白ノードを保持するか除去するかを評価します。"
type: docs
weight: 300
url: /ja/cpp/system.xml.xsl/xsltcontext/preservewhitespace/
---
## XsltContext::PreserveWhitespace method


派生クラスでオーバーライドされた場合、指定されたコンテキストで空白ノードを保持するか除去するかを評価します。

```cpp
virtual bool System::Xml::Xsl::XsltContext::PreserveWhitespace(SharedPtr<System::Xml::XPath::XPathNavigator> node)=0
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| ノード | SharedPtr\<System::Xml::XPath::XPathNavigator\> | 現在のコンテキストで保持または除去される空白ノード。 |

### ReturnValue

**true** if the white space is to be preserved; **false** if the white space is to be stripped.

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltContext](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)

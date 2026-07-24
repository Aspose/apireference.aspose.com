---
title: "System::Xml::XPath::XPathNavigator::Matches メソッド"
linktitle: "一致"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XPath::XPathNavigator::Matches メソッド。現在のノードが指定された XPathExpression と一致するかどうかを C++ で判断します。"
type: docs
weight: 4900
url: /ja/cpp/system.xml.xpath/xpathnavigator/matches/
---
## XPathNavigator::Matches(SharedPtr\<XPathExpression\>) method


現在のノードが指定された [XPathExpression](../../xpathexpression/) と一致するかどうかを判断します。

```cpp
virtual bool System::Xml::XPath::XPathNavigator::Matches(SharedPtr<XPathExpression> expr)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| expr | SharedPtr\<XPathExpression\> | コンパイルされた [XPath](../../) 式を含む [XPathExpression](../../xpathexpression/) オブジェクトです。 |

### ReturnValue

**true** if the current node matches the [XPathExpression](../../xpathexpression/); otherwise, **false**.

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathExpression](../../xpathexpression/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::Matches(String) method


現在のノードが指定された [XPath](../../) 式と一致するかどうかを判断します。

```cpp
virtual bool System::Xml::XPath::XPathNavigator::Matches(String xpath)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| xpath | String | [XPath](../../) 式です。 |

### ReturnValue

**true** if the current node matches the specified [XPath](../../) expression; otherwise, **false**.

## 参照

* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)

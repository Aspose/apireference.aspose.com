---
title: "System::Xml::XPath::XPathNavigator::SelectSingleNode method"
linktitle: "SelectSingleNode"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XPath::XPathNavigator::SelectSingleNode メソッド。指定された XPathExpression オブジェクトを使用して XPathNavigator で単一ノードを選択します（C++）。"
type: docs
weight: 7500
url: /ja/cpp/system.xml.xpath/xpathnavigator/selectsinglenode/
---
## XPathNavigator::SelectSingleNode(SharedPtr\<XPathExpression\>) method


指定された [XPathExpression](../../xpathexpression/) オブジェクトを使用して、[XPathNavigator](../) で単一ノードを選択します。

```cpp
virtual SharedPtr<XPathNavigator> System::Xml::XPath::XPathNavigator::SelectSingleNode(SharedPtr<XPathExpression> expression)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| expression | SharedPtr\<XPathExpression\> | コンパイルされた [XPath](../../) クエリを含む [XPathExpression](../../xpathexpression/) オブジェクト。 |

### ReturnValue

指定された [XPath](../../) クエリに対する最初の一致ノードを含む [XPathNavigator](../) オブジェクト。結果がない場合は **nullptr** が返されます。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../)
* Class [XPathExpression](../../xpathexpression/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::SelectSingleNode(String) method


指定された [XPath](../../) クエリを使用して、[XPathNavigator](../) で単一ノードを選択します。

```cpp
virtual SharedPtr<XPathNavigator> System::Xml::XPath::XPathNavigator::SelectSingleNode(String xpath)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| xpath | String | [XPath](../../) 式を表す [String](../../../system/string/)。 |

### ReturnValue

指定された [XPath](../../) クエリに対する最初の一致ノードを含む [XPathNavigator](../) オブジェクト。結果がない場合は、**nullptr** が返されます。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../)
* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::SelectSingleNode(String, SharedPtr\<IXmlNamespaceResolver\>) method


指定された [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) オブジェクトで名前空間プレフィックスを解決しながら、指定された [XPath](../../) クエリを使用して、[XPathNavigator](../) オブジェクトで単一ノードを選択します。

```cpp
virtual SharedPtr<XPathNavigator> System::Xml::XPath::XPathNavigator::SelectSingleNode(String xpath, SharedPtr<IXmlNamespaceResolver> resolver)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| xpath | String | [XPath](../../) 式を表す [String](../../../system/string/)。 |
| resolver | SharedPtr\<IXmlNamespaceResolver\> | [XPath](../../) クエリで名前空間プレフィックスを解決するために使用される [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) オブジェクト。 |

### ReturnValue

指定された [XPath](../../) クエリに対する最初の一致ノードを含む [XPathNavigator](../) オブジェクト。結果がない場合は **nullptr** が返されます。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../)
* Class [String](../../../system/string/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)

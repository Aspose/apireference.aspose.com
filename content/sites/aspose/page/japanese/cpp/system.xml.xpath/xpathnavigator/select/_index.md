---
title: "System::Xml::XPath::XPathNavigator::Select メソッド"
linktitle: "選択"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XPath::XPathNavigator::Select メソッド。C++ で指定された XPathExpression を使用してノードセットを選択します。"
type: docs
weight: 7100
url: /ja/cpp/system.xml.xpath/xpathnavigator/select/
---
## XPathNavigator::Select(SharedPtr\<XPathExpression\>) method


指定された [XPathExpression](../../xpathexpression/) を使用してノードセットを選択します。

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::Select(SharedPtr<XPathExpression> expr)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| expr | SharedPtr\<XPathExpression\> | コンパイルされた [XPath](../../) クエリを含む [XPathExpression](../../xpathexpression/) オブジェクト。 |

### ReturnValue

選択されたノードセットを指す [XPathNodeIterator](../../xpathnodeiterator/) です。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Class [XPathExpression](../../xpathexpression/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::Select(String) method


指定された [XPath](../../) 式を使用してノードセットを選択します。

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::Select(String xpath)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| xpath | String | [XPath](../../) 式を表す [String](../../../system/string/)。 |

### ReturnValue

選択されたノードセットを指す [XPathNodeIterator](../../xpathnodeiterator/) です。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::Select(String, SharedPtr\<IXmlNamespaceResolver\>) method


指定された [XPath](../../) 式と、名前空間プレフィックスを解決するために指定された [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) オブジェクトを使用してノードセットを選択します。

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::Select(String xpath, SharedPtr<IXmlNamespaceResolver> resolver)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| xpath | String | [XPath](../../) 式を表す [String](../../../system/string/)。 |
| resolver | SharedPtr\<IXmlNamespaceResolver\> | 名前空間プレフィックスを解決するために使用される [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) オブジェクトです。 |

### ReturnValue

選択されたノードセットを指す [XPathNodeIterator](../../xpathnodeiterator/) です。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Class [String](../../../system/string/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)

---
title: "System::Xml::XPath::XPathNavigator::Evaluate method"
linktitle: "Evaluate"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XPath::XPathNavigator::Evaluate メソッド。XPathExpression を評価し、型付き結果を返します（C++）。"
type: docs
weight: 1200
url: /ja/cpp/system.xml.xpath/xpathnavigator/evaluate/
---
## XPathNavigator::Evaluate(SharedPtr\<XPathExpression\>) method


[XPathExpression](../../xpathexpression/) を評価し、型付き結果を返します。

```cpp
virtual SharedPtr<Object> System::Xml::XPath::XPathNavigator::Evaluate(SharedPtr<XPathExpression> expr)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| expr | SharedPtr\<XPathExpression\> | 評価可能な [XPathExpression](../../xpathexpression/) です。 |

### ReturnValue

式の結果（[Boolean](../../../system/boolean/)、数値、文字列、またはノードセット）。これはそれぞれ [Boolean](../../../system/boolean/)、[Double](../../../system/double/)、[String](../../../system/string/)、または [XPathNodeIterator](../../xpathnodeiterator/) オブジェクトに対応します。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [XPathExpression](../../xpathexpression/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::Evaluate(SharedPtr\<XPathExpression\>, SharedPtr\<XPathNodeIterator\>) method


提供されたコンテキストを使用して [XPathExpression](../../xpathexpression/) を評価し、型付き結果を返します。

```cpp
virtual SharedPtr<Object> System::Xml::XPath::XPathNavigator::Evaluate(SharedPtr<XPathExpression> expr, SharedPtr<XPathNodeIterator> context)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| expr | SharedPtr\<XPathExpression\> | 評価可能な [XPathExpression](../../xpathexpression/) です。 |
| context | SharedPtr\<XPathNodeIterator\> | 評価が実行される対象の選択されたノード集合を指す [XPathNodeIterator](../../xpathnodeiterator/)。 |

### ReturnValue

式の結果（[Boolean](../../../system/boolean/)、数値、文字列、またはノードセット）。これはそれぞれ [Boolean](../../../system/boolean/)、[Double](../../../system/double/)、[String](../../../system/string/)、または [XPathNodeIterator](../../xpathnodeiterator/) オブジェクトに対応します。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [XPathExpression](../../xpathexpression/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::Evaluate(String) method


指定された [XPath](../../) 式を評価し、型付き結果を返します。

```cpp
virtual SharedPtr<Object> System::Xml::XPath::XPathNavigator::Evaluate(String xpath)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| xpath | String | 評価可能な [XPath](../../) 式を表す文字列です。 |

### ReturnValue

式の結果（[Boolean](../../../system/boolean/)、数値、文字列、またはノードセット）。これはそれぞれ [Boolean](../../../system/boolean/)、[Double](../../../system/double/)、[String](../../../system/string/)、または [XPathNodeIterator](../../xpathnodeiterator/) オブジェクトに対応します。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::Evaluate(String, SharedPtr\<IXmlNamespaceResolver\>) method


指定された [XPath](../../) 式を評価し、型付き結果を返します。評価時には、[XPath](../../) 式内の名前空間プレフィックスを解決するために指定された [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) オブジェクトを使用します。

```cpp
virtual SharedPtr<Object> System::Xml::XPath::XPathNavigator::Evaluate(String xpath, SharedPtr<IXmlNamespaceResolver> resolver)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| xpath | String | 評価可能な [XPath](../../) 式を表す文字列です。 |
| resolver | SharedPtr\<IXmlNamespaceResolver\> | [XPath](../../) 式内の名前空間プレフィックスを解決するために使用される [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) オブジェクトです。 |

### ReturnValue

式の結果（[Boolean](../../../system/boolean/)、数値、文字列、またはノードセット）。これはそれぞれ [Boolean](../../../system/boolean/)、[Double](../../../system/double/)、[String](../../../system/string/)、または [XPathNodeIterator](../../xpathnodeiterator/) オブジェクトに対応します。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [String](../../../system/string/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)

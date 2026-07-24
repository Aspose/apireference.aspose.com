---
title: "System::Xml::XPath::XPathNavigator::Evaluate 方法"
linktitle: "Evaluate"
second_title: "Aspose.Page 适用于 C++"
description: "System::Xml::XPath::XPathNavigator::Evaluate 方法。评估 XPathExpression 并返回类型化结果，在 C++ 中。"
type: docs
weight: 1200
url: /zh/cpp/system.xml.xpath/xpathnavigator/evaluate/
---
## XPathNavigator::Evaluate(SharedPtr\<XPathExpression\>) method


评估 [XPathExpression](../../xpathexpression/) 并返回类型化结果。

```cpp
virtual SharedPtr<Object> System::Xml::XPath::XPathNavigator::Evaluate(SharedPtr<XPathExpression> expr)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| expr | SharedPtr\<XPathExpression\> | 一个可以评估的 [XPathExpression](../../xpathexpression/)。 |

### ReturnValue

表达式的结果（[Boolean](../../../system/boolean/)、数字、字符串或节点集）。这分别映射到 [Boolean](../../../system/boolean/)、[Double](../../../system/double/)、[String](../../../system/string/)、或 [XPathNodeIterator](../../xpathnodeiterator/) 对象。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [XPathExpression](../../xpathexpression/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::Evaluate(SharedPtr\<XPathExpression\>, SharedPtr\<XPathNodeIterator\>) method


使用提供的上下文评估 [XPathExpression](../../xpathexpression/)，并返回类型化的结果。

```cpp
virtual SharedPtr<Object> System::Xml::XPath::XPathNavigator::Evaluate(SharedPtr<XPathExpression> expr, SharedPtr<XPathNodeIterator> context)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| expr | SharedPtr\<XPathExpression\> | 一个可以评估的 [XPathExpression](../../xpathexpression/)。 |
| context | SharedPtr\<XPathNodeIterator\> | 一个指向要对其进行评估的选定节点集的 [XPathNodeIterator](../../xpathnodeiterator/)。 |

### ReturnValue

表达式的结果（[Boolean](../../../system/boolean/)、数字、字符串或节点集）。这分别映射到 [Boolean](../../../system/boolean/)、[Double](../../../system/double/)、[String](../../../system/string/)、或 [XPathNodeIterator](../../xpathnodeiterator/) 对象。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [XPathExpression](../../xpathexpression/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::Evaluate(String) method


评估指定的 [XPath](../../) 表达式并返回类型化的结果。

```cpp
virtual SharedPtr<Object> System::Xml::XPath::XPathNavigator::Evaluate(String xpath)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| xpath | String | 表示可评估的 [XPath](../../) 表达式的字符串。 |

### ReturnValue

表达式的结果（[Boolean](../../../system/boolean/)、数字、字符串或节点集）。这分别映射到 [Boolean](../../../system/boolean/)、[Double](../../../system/double/)、[String](../../../system/string/)、或 [XPathNodeIterator](../../xpathnodeiterator/) 对象。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::Evaluate(String, SharedPtr\<IXmlNamespaceResolver\>) method


使用指定的 [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) 对象解析 [XPath](../../) 表达式中的命名空间前缀，评估指定的 [XPath](../../) 表达式并返回类型化的结果。

```cpp
virtual SharedPtr<Object> System::Xml::XPath::XPathNavigator::Evaluate(String xpath, SharedPtr<IXmlNamespaceResolver> resolver)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| xpath | String | 表示可评估的 [XPath](../../) 表达式的字符串。 |
| resolver | SharedPtr\<IXmlNamespaceResolver\> | 用于解析 [XPath](../../) 表达式中命名空间前缀的 [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) 对象。 |

### ReturnValue

表达式的结果（[Boolean](../../../system/boolean/)、数字、字符串或节点集）。这分别映射到 [Boolean](../../../system/boolean/)、[Double](../../../system/double/)、[String](../../../system/string/)、或 [XPathNodeIterator](../../xpathnodeiterator/) 对象。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [String](../../../system/string/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)

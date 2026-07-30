---
title: "System::Xml::XPath::XPathNavigator::SelectSingleNode 方法"
linktitle: "SelectSingleNode"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XPath::XPathNavigator::SelectSingleNode 方法。使用指定的 XPathExpression 对象在 C++ 中选择 XPathNavigator 中的单个节点。"
type: docs
weight: 7500
url: /zh/cpp/system.xml.xpath/xpathnavigator/selectsinglenode/
---
## XPathNavigator::SelectSingleNode(SharedPtr\<XPathExpression\>) method


使用指定的 [XPathExpression](../../xpathexpression/) 对象在 [XPathNavigator](../) 中选择单个节点。

```cpp
virtual SharedPtr<XPathNavigator> System::Xml::XPath::XPathNavigator::SelectSingleNode(SharedPtr<XPathExpression> expression)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| expression | SharedPtr\<XPathExpression\> | 一个包含已编译的 [XPath](../../) 查询的 [XPathExpression](../../xpathexpression/) 对象。 |

### ReturnValue

一个 [XPathNavigator](../) 对象，包含指定的 [XPath](../../) 查询的第一个匹配节点；如果没有查询结果，则为 **nullptr**。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../)
* Class [XPathExpression](../../xpathexpression/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
## XPathNavigator::SelectSingleNode(String) method


使用指定的 [XPath](../../) 查询在 [XPathNavigator](../) 中选择单个节点。

```cpp
virtual SharedPtr<XPathNavigator> System::Xml::XPath::XPathNavigator::SelectSingleNode(String xpath)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| xpath | String | 一个表示 [XPath](../../) 表达式的 [String](../../../system/string/)。 |

### ReturnValue

一个 [XPathNavigator](../) 对象，包含指定的 [XPath](../../) 查询的第一个匹配节点；如果没有查询结果，则为 **nullptr**。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../)
* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
## XPathNavigator::SelectSingleNode(String, SharedPtr\<IXmlNamespaceResolver\>) method


使用指定的 [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) 对象解析命名空间前缀，使用指定的 [XPath](../../) 查询在 [XPathNavigator](../) 对象中选择单个节点。

```cpp
virtual SharedPtr<XPathNavigator> System::Xml::XPath::XPathNavigator::SelectSingleNode(String xpath, SharedPtr<IXmlNamespaceResolver> resolver)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| xpath | String | 一个表示 [XPath](../../) 表达式的 [String](../../../system/string/)。 |
| resolver | SharedPtr\<IXmlNamespaceResolver\> | 用于在 [XPath](../../) 查询中解析命名空间前缀的 [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) 对象。 |

### ReturnValue

一个 [XPathNavigator](../) 对象，包含指定的 [XPath](../../) 查询的第一个匹配节点；如果没有查询结果，则为 **nullptr**。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../)
* Class [String](../../../system/string/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)

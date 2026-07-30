---
title: "System::Xml::XPath::XPathNavigator::Select 方法"
linktitle: "选择"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XPath::XPathNavigator::Select 方法。使用指定的 XPathExpression 在 C++ 中选择节点集。"
type: docs
weight: 7100
url: /zh/cpp/system.xml.xpath/xpathnavigator/select/
---
## XPathNavigator::Select(SharedPtr\<XPathExpression\>) method


使用指定的 [XPathExpression](../../xpathexpression/) 选择节点集。

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::Select(SharedPtr<XPathExpression> expr)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| expr | SharedPtr\<XPathExpression\> | 一个包含已编译的 [XPath](../../) 查询的 [XPathExpression](../../xpathexpression/) 对象。 |

### ReturnValue

一个指向所选节点集的 [XPathNodeIterator](../../xpathnodeiterator/)。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Class [XPathExpression](../../xpathexpression/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
## XPathNavigator::Select(String) method


使用指定的 [XPath](../../) 表达式选择节点集。

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::Select(String xpath)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| xpath | String | 一个表示 [XPath](../../) 表达式的 [String](../../../system/string/)。 |

### ReturnValue

一个指向所选节点集的 [XPathNodeIterator](../../xpathnodeiterator/)。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
## XPathNavigator::Select(String, SharedPtr\<IXmlNamespaceResolver\>) method


使用指定的 [XPath](../../) 表达式，并使用指定的 [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) 对象来解析命名空间前缀，选择节点集。

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::Select(String xpath, SharedPtr<IXmlNamespaceResolver> resolver)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| xpath | String | 一个表示 [XPath](../../) 表达式的 [String](../../../system/string/)。 |
| resolver | SharedPtr\<IXmlNamespaceResolver\> | 用于解析命名空间前缀的 [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) 对象。 |

### ReturnValue

一个指向所选节点集的 [XPathNodeIterator](../../xpathnodeiterator/)。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Class [String](../../../system/string/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)

---
title: "System::Xml::XPath::XPathNavigator::Matches 方法"
linktitle: "匹配"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XPath::XPathNavigator::Matches 方法。 确定当前节点是否匹配指定的 XPathExpression（C++）。"
type: docs
weight: 4900
url: /zh/cpp/system.xml.xpath/xpathnavigator/matches/
---
## XPathNavigator::Matches(SharedPtr\<XPathExpression\>) method


确定当前节点是否匹配指定的 [XPathExpression](../../xpathexpression/)。

```cpp
virtual bool System::Xml::XPath::XPathNavigator::Matches(SharedPtr<XPathExpression> expr)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| expr | SharedPtr\<XPathExpression\> | 一个包含已编译的 [XPath](../../) 表达式的 [XPathExpression](../../xpathexpression/) 对象。 |

### ReturnValue

**true** if the current node matches the [XPathExpression](../../xpathexpression/); otherwise, **false**.

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathExpression](../../xpathexpression/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
## XPathNavigator::Matches(String) method


确定当前节点是否匹配指定的 [XPath](../../) 表达式。

```cpp
virtual bool System::Xml::XPath::XPathNavigator::Matches(String xpath)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| xpath | String | 该 [XPath](../../) 表达式。 |

### ReturnValue

**true** if the current node matches the specified [XPath](../../) expression; otherwise, **false**.

## 另见

* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)

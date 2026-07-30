---
title: "System::Xml::XPath::XPathExpression::Compile 方法"
linktitle: "Compile"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XPath::XPathExpression::Compile 方法。编译指定的 XPath 表达式并返回一个表示该 XPath 表达式的 XPathExpression 对象（C++）。"
type: docs
weight: 600
url: /zh/cpp/system.xml.xpath/xpathexpression/compile/
---
## XPathExpression::Compile(const String\&) method


编译指定的 [XPath](../../) 表达式并返回一个表示该 [XPath](../../) 表达式的 [XPathExpression](../) 对象。

```cpp
static SharedPtr<XPathExpression> System::Xml::XPath::XPathExpression::Compile(const String &xpath)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| xpath | const String\& | 一个 [XPath](../../) 表达式。 |

### ReturnValue

一个 [XPathExpression](../) 对象。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathExpression](../)
* Class [String](../../../system/string/)
* Class [XPathExpression](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
## XPathExpression::Compile(const String\&, const SharedPtr\<IXmlNamespaceResolver\>\&) method


编译指定的 [XPath](../../) 表达式，使用为命名空间解析指定的 [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) 对象，并返回一个表示该 [XPath](../../) 表达式的 [XPathExpression](../) 对象。

```cpp
static SharedPtr<XPathExpression> System::Xml::XPath::XPathExpression::Compile(const String &xpath, const SharedPtr<IXmlNamespaceResolver> &nsResolver)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| xpath | const String\& | 一个 [XPath](../../) 表达式。 |
| nsResolver | const SharedPtr\<IXmlNamespaceResolver\>\& | 一个实现了用于命名空间解析的 [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) 接口的对象。 |

### ReturnValue

一个 [XPathExpression](../) 对象。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathExpression](../)
* Class [String](../../../system/string/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XPathExpression](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)

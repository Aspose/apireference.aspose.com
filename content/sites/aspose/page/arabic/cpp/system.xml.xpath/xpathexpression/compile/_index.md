---
title: "طريقة System::Xml::XPath::XPathExpression::Compile"
linktitle: "تجميع"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Xml::XPath::XPathExpression::Compile. تقوم بتجميع تعبير XPath المحدد وتُرجع كائن XPathExpression يمثل تعبير XPath في C++."
type: docs
weight: 600
url: /ar/cpp/system.xml.xpath/xpathexpression/compile/
---
## XPathExpression::Compile(const String\&) method


تقوم بتجميع تعبير [XPath](../../) المحدد وتُرجع كائن [XPathExpression](../) يمثل تعبير [XPath](../../).

```cpp
static SharedPtr<XPathExpression> System::Xml::XPath::XPathExpression::Compile(const String &xpath)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| xpath | const String\& | تعبير [XPath](../../). |

### ReturnValue

كائن [XPathExpression](../).

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathExpression](../)
* Class [String](../../../system/string/)
* Class [XPathExpression](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathExpression::Compile(const String\&, const SharedPtr\<IXmlNamespaceResolver\>\&) method


يقوم بتجميع تعبير [XPath](../../) المحدد، مع كائن [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) المحدد لحل أسماء الفضاءات، ويعيد كائن [XPathExpression](../) يمثل تعبير [XPath](../../).

```cpp
static SharedPtr<XPathExpression> System::Xml::XPath::XPathExpression::Compile(const String &xpath, const SharedPtr<IXmlNamespaceResolver> &nsResolver)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| xpath | const String\& | تعبير [XPath](../../). |
| nsResolver | const SharedPtr\<IXmlNamespaceResolver\>\& | كائن ينفّذ واجهة [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) لحل أسماء الفضاءات. |

### ReturnValue

كائن [XPathExpression](../).

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathExpression](../)
* Class [String](../../../system/string/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XPathExpression](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)

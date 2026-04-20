---
title: "طريقة System::Xml::XPath::XPathNavigator::SelectSingleNode"
linktitle: "SelectSingleNode"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Xml::XPath::XPathNavigator::SelectSingleNode. تحدد عقدة واحدة في XPathNavigator باستخدام كائن XPathExpression المحدد في C++."
type: docs
weight: 7500
url: /ar/cpp/system.xml.xpath/xpathnavigator/selectsinglenode/
---
## XPathNavigator::SelectSingleNode(SharedPtr\<XPathExpression\>) method


تحدد عقدة واحدة في [XPathNavigator](../) باستخدام كائن [XPathExpression](../../xpathexpression/) المحدد.

```cpp
virtual SharedPtr<XPathNavigator> System::Xml::XPath::XPathNavigator::SelectSingleNode(SharedPtr<XPathExpression> expression)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| expression | SharedPtr\<XPathExpression\> | كائن [XPathExpression](../../xpathexpression/) يحتوي على استعلام [XPath](../../) المترجم. |

### ReturnValue

كائن [XPathNavigator](../) يحتوي على أول عقدة مطابقة لاستعلام [XPath](../../) المحدد؛ وإلا **nullptr** إذا لم تكن هناك نتائج للاستعلام.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../)
* Class [XPathExpression](../../xpathexpression/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
## XPathNavigator::SelectSingleNode(String) method


تحدد عقدة واحدة في [XPathNavigator](../) باستخدام استعلام [XPath](../../) المحدد.

```cpp
virtual SharedPtr<XPathNavigator> System::Xml::XPath::XPathNavigator::SelectSingleNode(String xpath)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| xpath | String | [String](../../../system/string/) يمثل تعبيرًا [XPath](../../). |

### ReturnValue

كائن [XPathNavigator](../) يحتوي على أول عقدة مطابقة لاستعلام [XPath](../../) المحدد؛ وإلا **nullptr** إذا لم تكن هناك نتائج للاستعلام.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../)
* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
## XPathNavigator::SelectSingleNode(String, SharedPtr\<IXmlNamespaceResolver\>) method


تحدد عقدة واحدة في كائن [XPathNavigator](../) باستخدام استعلام [XPath](../../) المحدد مع كائن [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) المحدد لحل بادئات مساحة الاسم.

```cpp
virtual SharedPtr<XPathNavigator> System::Xml::XPath::XPathNavigator::SelectSingleNode(String xpath, SharedPtr<IXmlNamespaceResolver> resolver)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| xpath | String | [String](../../../system/string/) يمثل تعبيرًا [XPath](../../). |
| resolver | SharedPtr\<IXmlNamespaceResolver\> | كائن [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) المستخدم لحل بادئات مساحة الاسم في استعلام [XPath](../../). |

### ReturnValue

كائن [XPathNavigator](../) يحتوي على أول عقدة مطابقة لاستعلام [XPath](../../) المحدد؛ وإلا **nullptr** إذا لم تكن هناك نتائج للاستعلام.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../)
* Class [String](../../../system/string/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)

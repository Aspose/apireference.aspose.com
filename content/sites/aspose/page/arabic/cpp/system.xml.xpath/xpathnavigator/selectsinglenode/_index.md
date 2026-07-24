---
title: "طريقة System::Xml::XPath::XPathNavigator::SelectSingleNode"
linktitle: "SelectSingleNode"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Xml::XPath::XPathNavigator::SelectSingleNode. تختار عقدة واحدة في XPathNavigator باستخدام كائن XPathExpression المحدد في C++."
type: docs
weight: 7500
url: /ar/cpp/system.xml.xpath/xpathnavigator/selectsinglenode/
---
## XPathNavigator::SelectSingleNode(SharedPtr\<XPathExpression\>) method


تختار عقدة واحدة في [XPathNavigator](../) باستخدام كائن [XPathExpression](../../xpathexpression/) المحدد.

```cpp
virtual SharedPtr<XPathNavigator> System::Xml::XPath::XPathNavigator::SelectSingleNode(SharedPtr<XPathExpression> expression)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| expression | SharedPtr\<XPathExpression\> | كائن [XPathExpression](../../xpathexpression/) يحتوي على استعلام [XPath](../../) المجمّع. |

### ReturnValue

كائن [XPathNavigator](../) يحتوي على أول عقدة مطابقة لاستعلام [XPath](../../) المحدد؛ وإلا **nullptr** إذا لم توجد نتائج للاستعلام.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../)
* Class [XPathExpression](../../xpathexpression/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::SelectSingleNode(String) method


تختار عقدة واحدة في [XPathNavigator](../) باستخدام استعلام [XPath](../../) المحدد.

```cpp
virtual SharedPtr<XPathNavigator> System::Xml::XPath::XPathNavigator::SelectSingleNode(String xpath)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| xpath | String | سلسلة [String](../../../system/string/) تمثل تعبيرًا [XPath](../../). |

### ReturnValue

كائن [XPathNavigator](../) يحتوي على أول عقدة مطابقة لاستعلام [XPath](../../) المحدد؛ وإلا، **nullptr** إذا لم توجد نتائج للاستعلام.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../)
* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::SelectSingleNode(String, SharedPtr\<IXmlNamespaceResolver\>) method


تختار عقدة واحدة في كائن [XPathNavigator](../) باستخدام استعلام [XPath](../../) المحدد مع كائن [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) المحدد لحل بادئات مساحات الاسم.

```cpp
virtual SharedPtr<XPathNavigator> System::Xml::XPath::XPathNavigator::SelectSingleNode(String xpath, SharedPtr<IXmlNamespaceResolver> resolver)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| xpath | String | سلسلة [String](../../../system/string/) تمثل تعبيرًا [XPath](../../). |
| resolver | SharedPtr\<IXmlNamespaceResolver\> | كائن [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) يُستخدم لحل بادئات مساحات الاسم في استعلام [XPath](../../). |

### ReturnValue

كائن [XPathNavigator](../) يحتوي على أول عقدة مطابقة لاستعلام [XPath](../../) المحدد؛ وإلا **nullptr** إذا لم توجد نتائج للاستعلام.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../)
* Class [String](../../../system/string/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)

---
title: "طريقة System::Xml::XPath::XPathNavigator::Select"
linktitle: "تحديد"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Xml::XPath::XPathNavigator::Select. يختار مجموعة عقد باستخدام XPathExpression المحدد في C++."
type: docs
weight: 7100
url: /ar/cpp/system.xml.xpath/xpathnavigator/select/
---
## XPathNavigator::Select(SharedPtr\<XPathExpression\>) method


يختار مجموعة عقد باستخدام [XPathExpression](../../xpathexpression/) المحدد.

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::Select(SharedPtr<XPathExpression> expr)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| expr | SharedPtr\<XPathExpression\> | كائن [XPathExpression](../../xpathexpression/) يحتوي على استعلام [XPath](../../) المجمّع. |

### ReturnValue

كائن [XPathNodeIterator](../../xpathnodeiterator/) يشير إلى مجموعة العقد المحددة.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Class [XPathExpression](../../xpathexpression/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::Select(String) method


يختار مجموعة عقد، باستخدام تعبير [XPath](../../) المحدد.

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::Select(String xpath)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| xpath | String | سلسلة [String](../../../system/string/) تمثل تعبيرًا [XPath](../../). |

### ReturnValue

كائن [XPathNodeIterator](../../xpathnodeiterator/) يشير إلى مجموعة العقد المحددة.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::Select(String, SharedPtr\<IXmlNamespaceResolver\>) method


يختار مجموعة عقد باستخدام تعبير [XPath](../../) المحدد مع كائن [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) المحدد لحل بادئات مساحات الأسماء.

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::Select(String xpath, SharedPtr<IXmlNamespaceResolver> resolver)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| xpath | String | سلسلة [String](../../../system/string/) تمثل تعبيرًا [XPath](../../). |
| resolver | SharedPtr\<IXmlNamespaceResolver\> | كائن [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) المستخدم لحل بادئات النطاق. |

### ReturnValue

كائن [XPathNodeIterator](../../xpathnodeiterator/) يشير إلى مجموعة العقد المحددة.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Class [String](../../../system/string/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)

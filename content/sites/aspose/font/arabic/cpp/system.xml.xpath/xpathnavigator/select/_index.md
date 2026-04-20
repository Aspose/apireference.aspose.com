---
title: "طريقة System::Xml::XPath::XPathNavigator::Select"
linktitle: "تحديد"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Xml::XPath::XPathNavigator::Select. تقوم باختيار مجموعة عقد باستخدام XPathExpression المحدد في C++."
type: docs
weight: 7100
url: /ar/cpp/system.xml.xpath/xpathnavigator/select/
---
## XPathNavigator::Select(SharedPtr\<XPathExpression\>) method


تختار مجموعة عقد باستخدام [XPathExpression](../../xpathexpression/) المحدد.

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::Select(SharedPtr<XPathExpression> expr)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| expr | SharedPtr\<XPathExpression\> | كائن [XPathExpression](../../xpathexpression/) يحتوي على استعلام [XPath](../../) المترجم. |

### ReturnValue

[XPathNodeIterator](../../xpathnodeiterator/) يشير إلى مجموعة العقد المختارة.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Class [XPathExpression](../../xpathexpression/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
## XPathNavigator::Select(String) method


تختار مجموعة عقد باستخدام تعبير [XPath](../../) المحدد.

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::Select(String xpath)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| xpath | String | [String](../../../system/string/) يمثل تعبيرًا [XPath](../../). |

### ReturnValue

[XPathNodeIterator](../../xpathnodeiterator/) يشير إلى مجموعة العقد المختارة.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
## XPathNavigator::Select(String, SharedPtr\<IXmlNamespaceResolver\>) method


تختار مجموعة عقد باستخدام تعبير [XPath](../../) المحدد مع كائن [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) المحدد لحل بادئات المساحات الاسمية.

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::Select(String xpath, SharedPtr<IXmlNamespaceResolver> resolver)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| xpath | String | [String](../../../system/string/) يمثل تعبيرًا [XPath](../../). |
| resolver | SharedPtr\<IXmlNamespaceResolver\> | كائن [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) المستخدم لحل بادئات النطاق. |

### ReturnValue

[XPathNodeIterator](../../xpathnodeiterator/) يشير إلى مجموعة العقد المختارة.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Class [String](../../../system/string/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)

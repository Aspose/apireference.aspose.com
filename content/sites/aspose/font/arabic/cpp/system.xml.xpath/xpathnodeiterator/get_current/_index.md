---
title: "طريقة System::Xml::XPath::XPathNodeIterator::get_Current"
linktitle: "get_Current"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Xml::XPath::XPathNodeIterator::get_Current. عند تجاوزها في فئة مشتقة، تحصل على كائن XPathNavigator لهذا XPathNodeIterator، المتموضع على عقدة السياق الحالية في C++."
type: docs
weight: 400
url: /ar/cpp/system.xml.xpath/xpathnodeiterator/get_current/
---
## XPathNodeIterator::get_Current method


عند تجاوزها في فئة مشتقة، تحصل على كائن [XPathNavigator](../../xpathnavigator/) لهذا [XPathNodeIterator](../)، المتموضع على عقدة السياق الحالية.

```cpp
virtual const SharedPtr<XPathNavigator> & System::Xml::XPath::XPathNodeIterator::get_Current()=0
```


### ReturnValue

كائن [XPathNavigator](../../xpathnavigator/) متموضع على عقدة السياق التي تم منها اختيار مجموعة العقد. يجب استدعاء طريقة [XPathNodeIterator::MoveNext](../movenext/) لنقل [XPathNodeIterator](../) إلى العقدة الأولى في المجموعة المحددة.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../xpathnavigator/)
* Class [XPathNodeIterator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)

---
title: "System::Xml::XPath::XPathNavigator::SelectChildren طريقة"
linktitle: "SelectChildren"
second_title: "Aspose.Page لـ C++"
description: "System::Xml::XPath::XPathNavigator::SelectChildren طريقة. يختار جميع العقد الفرعية للعقدة الحالية التي لها الاسم المحلي ومعرف مساحة الاسم المحدد في C++."
type: docs
weight: 7300
url: /ar/cpp/system.xml.xpath/xpathnavigator/selectchildren/
---
## XPathNavigator::SelectChildren(String, String) method


يختار جميع العقد الفرعية للعقدة الحالية التي لها الاسم المحلي وعنوان URI لمساحة الاسم المحددين.

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::SelectChildren(String name, String namespaceURI)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| الاسم | String | الاسم المحلي للعقد الفرعية. |
| namespaceURI | String | معرف مساحة الاسم للعقد الفرعية. |

### ReturnValue

كائن [XPathNodeIterator](../../xpathnodeiterator/) يحتوي على العقد المحددة.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::SelectChildren(XPathNodeType) method


يختار جميع العقد الفرعية للعقدة الحالية التي تطابق [XPathNodeType](../../xpathnodetype/).

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::SelectChildren(XPathNodeType type)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| type | XPathNodeType | الـ[XPathNodeType](../../xpathnodetype/) للعقد الفرعية. |

### ReturnValue

كائن [XPathNodeIterator](../../xpathnodeiterator/) يحتوي على العقد المحددة.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Enum [XPathNodeType](../../xpathnodetype/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)

---
title: "طريقة System::Xml::XPath::XPathNavigator::SelectDescendants"
linktitle: "SelectDescendants"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Xml::XPath::XPathNavigator::SelectDescendants. تُحدد جميع العقد السليلية للعقدة الحالية بالاسم المحلي وURI الفضاء الاسمي المحددين في C++."
type: docs
weight: 7400
url: /ar/cpp/system.xml.xpath/xpathnavigator/selectdescendants/
---
## XPathNavigator::SelectDescendants(String, String, bool) method


يختار جميع العقد المتفرعة للعقدة الحالية التي لها الاسم المحلي وعنوان URI لمساحة الاسم المحددين.

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::SelectDescendants(String name, String namespaceURI, bool matchSelf)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| الاسم | String | الاسم المحلي للعقد السليلية. |
| namespaceURI | String | URI الفضاء الاسمي للعقد السليلية. |
| matchSelf | bool | **true** لتضمين عقدة السياق في الاختيار؛ وإلا **false**. |

### ReturnValue

كائن [XPathNodeIterator](../../xpathnodeiterator/) يحتوي على العقد المحددة.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::SelectDescendants(XPathNodeType, bool) method


تُحدد جميع العقد السليلية للعقدة الحالية التي لها [XPathNodeType](../../xpathnodetype/) مطابق.

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::SelectDescendants(XPathNodeType type, bool matchSelf)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| type | XPathNodeType | [XPathNodeType](../../xpathnodetype/) للعقد السليلية. |
| matchSelf | bool | **true** لتضمين عقدة السياق في الاختيار؛ وإلا **false**. |

### ReturnValue

كائن [XPathNodeIterator](../../xpathnodeiterator/) يحتوي على العقد المحددة.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Enum [XPathNodeType](../../xpathnodetype/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)

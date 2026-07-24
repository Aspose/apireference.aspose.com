---
title: "طريقة System::Xml::XPath::XPathNavigator::SelectAncestors"
linktitle: "SelectAncestors"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Xml::XPath::XPathNavigator::SelectAncestors. تُحدد جميع العقد الأصلية للعقدة الحالية التي لها الاسم المحلي وعنوان URI للنطاق المحددين في C++."
type: docs
weight: 7200
url: /ar/cpp/system.xml.xpath/xpathnavigator/selectancestors/
---
## XPathNavigator::SelectAncestors(String, String, bool) method


يختار جميع العقد السلفية للعقدة الحالية التي لها الاسم المحلي وعنوان URI لمساحة الاسم المحددين.

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::SelectAncestors(String name, String namespaceURI, bool matchSelf)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| الاسم | String | الاسم المحلي للعقد الأصلية. |
| namespaceURI | String | عنوان URI للنطاق للعقد الأصلية. |
| matchSelf | bool | لتضمين عقدة السياق في الاختيار، **true**؛ وإلا، **false**. |

### ReturnValue

كائن [XPathNodeIterator](../../xpathnodeiterator/) يحتوي على العقد المحددة. العقد المرتجعة تكون بترتيب مستند عكسي.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::SelectAncestors(XPathNodeType, bool) method


يحدد جميع عقد السلف للعقدة الحالية التي لها [XPathNodeType](../../xpathnodetype/) مطابق.

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::SelectAncestors(XPathNodeType type, bool matchSelf)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| type | XPathNodeType | [XPathNodeType](../../xpathnodetype/) لعقد السلف. |
| matchSelf | bool | لتضمين عقدة السياق في الاختيار، **true**؛ وإلا، **false**. |

### ReturnValue

كائن [XPathNodeIterator](../../xpathnodeiterator/) يحتوي على العقد المحددة. العقد المرتجعة تكون بترتيب مستند عكسي.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Enum [XPathNodeType](../../xpathnodetype/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)

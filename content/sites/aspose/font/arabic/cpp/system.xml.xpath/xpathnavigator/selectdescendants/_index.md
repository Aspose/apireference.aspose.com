---
title: "System::Xml::XPath::XPathNavigator::SelectDescendants طريقة"
linktitle: "SelectDescendants"
second_title: "Aspose.Font لـ C++"
description: "System::Xml::XPath::XPathNavigator::SelectDescendants method. يحدد جميع العقد التابعة للعقدة الحالية بالاسم المحلي ومعرف مساحة الاسم المحدد في C++."
type: docs
weight: 7400
url: /ar/cpp/system.xml.xpath/xpathnavigator/selectdescendants/
---
## XPathNavigator::SelectDescendants(String, String, bool) method


يختار جميع العقد السفلية للعقدة الحالية التي لها الاسم المحلي وURI للفضاء الاسمي المحددين.

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::SelectDescendants(String name, String namespaceURI, bool matchSelf)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| name | String | الاسم المحلي للعقد التابعة. |
| namespaceURI | String | معرف مساحة الاسم للعقد التابعة. |
| matchSelf | bool | **true** لتضمين عقدة السياق في الاختيار؛ وإلا، **false**. |

### ReturnValue

كائن [XPathNodeIterator](../../xpathnodeiterator/) يحتوي على العقد المحددة.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
## XPathNavigator::SelectDescendants(XPathNodeType, bool) method


يحدد جميع العقد التابعة للعقدة الحالية التي لها [XPathNodeType](../../xpathnodetype/) مطابق.

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::SelectDescendants(XPathNodeType type, bool matchSelf)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| type | XPathNodeType | الـ [XPathNodeType](../../xpathnodetype/) للعقد التابعة. |
| matchSelf | bool | **true** لتضمين عقدة السياق في الاختيار؛ وإلا، **false**. |

### ReturnValue

كائن [XPathNodeIterator](../../xpathnodeiterator/) يحتوي على العقد المحددة.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Enum [XPathNodeType](../../xpathnodetype/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)

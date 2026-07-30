---
title: "System::Xml::XPath::XPathNavigator::SelectAncestors طريقة"
linktitle: "SelectAncestors"
second_title: "Aspose.Font لـ C++"
description: "System::Xml::XPath::XPathNavigator::SelectAncestors طريقة. يحدد جميع عقد الأجداد للعقدة الحالية التي لها الاسم المحلي المحدد وعنوان URI للنطاق في C++."
type: docs
weight: 7200
url: /ar/cpp/system.xml.xpath/xpathnavigator/selectancestors/
---
## XPathNavigator::SelectAncestors(String, String, bool) method


يختار جميع العقد الأصلية للعقدة الحالية التي لها الاسم المحلي وURI للفضاء الاسمي المحددين.

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::SelectAncestors(String name, String namespaceURI, bool matchSelf)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| name | String | الاسم المحلي لعقد الأجداد. |
| namespaceURI | String | عنوان URI للنطاق لعقد الأجداد. |
| matchSelf | bool | لتضمين عقدة السياق في الاختيار، **true**؛ وإلا، **false**. |

### ReturnValue

[XPathNodeIterator](../../xpathnodeiterator/) يحتوي على العقد المحددة. العقد المرتجعة تكون بترتيب مستند عكسي.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
## XPathNavigator::SelectAncestors(XPathNodeType, bool) method


يحدد جميع عقد الأجداد للعقدة الحالية التي لها [XPathNodeType](../../xpathnodetype/) متطابقة.

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::SelectAncestors(XPathNodeType type, bool matchSelf)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| type | XPathNodeType | [XPathNodeType](../../xpathnodetype/) لعقد الأجداد. |
| matchSelf | bool | لتضمين عقدة السياق في الاختيار، **true**؛ وإلا، **false**. |

### ReturnValue

[XPathNodeIterator](../../xpathnodeiterator/) يحتوي على العقد المحددة. العقد المرتجعة تكون بترتيب مستند عكسي.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Enum [XPathNodeType](../../xpathnodetype/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)

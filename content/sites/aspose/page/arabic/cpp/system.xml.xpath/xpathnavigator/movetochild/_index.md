---
title: "طريقة System::Xml::XPath::XPathNavigator::MoveToChild"
linktitle: "MoveToChild"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Xml::XPath::XPathNavigator::MoveToChild. ينقل XPathNavigator إلى عقدة الطفل التي لها الاسم المحلي ومسار مساحة الاسم المحددين في C++."
type: docs
weight: 5200
url: /ar/cpp/system.xml.xpath/xpathnavigator/movetochild/
---
## XPathNavigator::MoveToChild(String, String) method


ينقل [XPathNavigator](../) إلى عقدة الطفل التي لها الاسم المحلي ومسار مساحة الاسم المحددين.

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToChild(String localName, String namespaceURI)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| localName | String | الاسم المحلي لعقدة الطفل التي سيتم الانتقال إليها. |
| namespaceURI | String | مسار مساحة الاسم لعقدة الطفل التي سيتم الانتقال إليها. |

### ReturnValue

**true** if the [XPathNavigator](../) is successful moving to the child node; otherwise, **false**. If **false**, the position of the [XPathNavigator](../) is unchanged.

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::MoveToChild(XPathNodeType) method


ينقل [XPathNavigator](../) إلى عقدة الطفل من النوع [XPathNodeType](../../xpathnodetype/) المحدد.

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToChild(XPathNodeType type)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| type | XPathNodeType | نوع [XPathNodeType](../../xpathnodetype/) لعقدة الطفل التي سيتم الانتقال إليها. |

### ReturnValue

**true** if the [XPathNavigator](../) is successful moving to the child node; otherwise, **false**. If **false**, the position of the [XPathNavigator](../) is unchanged.

## انظر أيضًا

* Enum [XPathNodeType](../../xpathnodetype/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)

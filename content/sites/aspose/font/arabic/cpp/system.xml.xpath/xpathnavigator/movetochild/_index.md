---
title: "طريقة System::Xml::XPath::XPathNavigator::MoveToChild"
linktitle: "MoveToChild"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Xml::XPath::XPathNavigator::MoveToChild. تنقل XPathNavigator إلى العقدة الفرعية التي لها الاسم المحلي ومعرف مساحة الاسم المحدد في C++."
type: docs
weight: 5200
url: /ar/cpp/system.xml.xpath/xpathnavigator/movetochild/
---
## XPathNavigator::MoveToChild(String, String) method


ينقل الـ [XPathNavigator](../) إلى العقدة الفرعية التي لها الاسم المحلي ومعرف مساحة الاسم المحدد.

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToChild(String localName, String namespaceURI)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| localName | String | الاسم المحلي للعقدة الفرعية التي سيتم الانتقال إليها. |
| namespaceURI | String | معرف مساحة الاسم للعقدة الفرعية التي سيتم الانتقال إليها. |

### ReturnValue

**true** if the [XPathNavigator](../) is successful moving to the child node; otherwise, **false**. If **false**, the position of the [XPathNavigator](../) is unchanged.

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
## XPathNavigator::MoveToChild(XPathNodeType) method


ينقل الـ [XPathNavigator](../) إلى العقدة الفرعية من نوع [XPathNodeType](../../xpathnodetype/) المحدد.

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToChild(XPathNodeType type)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| type | XPathNodeType | [XPathNodeType](../../xpathnodetype/) للعقدة الفرعية التي سيتم الانتقال إليها. |

### ReturnValue

**true** if the [XPathNavigator](../) is successful moving to the child node; otherwise, **false**. If **false**, the position of the [XPathNavigator](../) is unchanged.

## انظر أيضًا

* Enum [XPathNodeType](../../xpathnodetype/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)

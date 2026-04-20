---
title: "طريقة System::Xml::XPath::XPathNavigator::MoveToNext"
linktitle: "MoveToNext"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Xml::XPath::XPathNavigator::MoveToNext. عند تجاوزها في فئة مشتقة، تنقل XPathNavigator إلى العقدة الشقيقة التالية للعقدة الحالية في C++."
type: docs
weight: 6000
url: /ar/cpp/system.xml.xpath/xpathnavigator/movetonext/
---
## XPathNavigator::MoveToNext() method


عند تجاوزها في فئة مشتقة، تنقل [XPathNavigator](../) إلى العقدة الشقيقة التالية للعقدة الحالية.

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToNext()=0
```


### ReturnValue

**true** if the [XPathNavigator](../) is successful moving to the next sibling node; otherwise **false** if there are no more siblings or if the [XPathNavigator](../) is currently positioned on an attribute node. If **false**, the position of the [XPathNavigator](../) is unchanged.

## انظر أيضًا

* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
## XPathNavigator::MoveToNext(String, String) method


تنقل [XPathNavigator](../) إلى العقدة الشقيقة التالية بالاسم المحلي وURI مساحة الاسم المحددين.

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToNext(String localName, String namespaceURI)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| localName | String | الاسم المحلي للعقدة الشقيقة التالية التي سيتم الانتقال إليها. |
| namespaceURI | String | URI مساحة الاسم للعقدة الشقيقة التالية التي سيتم الانتقال إليها. |

### ReturnValue

**true** if the [XPathNavigator](../) is successful moving to the next sibling node; **false** if there are no more siblings, or if the [XPathNavigator](../) is currently positioned on an attribute node. If **false**, the position of the [XPathNavigator](../) is unchanged.

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
## XPathNavigator::MoveToNext(XPathNodeType) method


تنقل [XPathNavigator](../) إلى العقدة الشقيقة التالية للعقدة الحالية التي تطابق [XPathNodeType](../../xpathnodetype/) المحدد.

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToNext(XPathNodeType type)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| type | XPathNodeType | الـ [XPathNodeType](../../xpathnodetype/) للعقدة الشقيقة التي سيتم الانتقال إليها. |

### ReturnValue

**true** if the [XPathNavigator](../) is successful moving to the next sibling node; otherwise, **false** if there are no more siblings or if the [XPathNavigator](../) is currently positioned on an attribute node. If **false**, the position of the [XPathNavigator](../) is unchanged.

## انظر أيضًا

* Enum [XPathNodeType](../../xpathnodetype/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)

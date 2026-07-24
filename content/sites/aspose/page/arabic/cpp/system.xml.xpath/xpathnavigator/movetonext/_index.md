---
title: "طريقة System::Xml::XPath::XPathNavigator::MoveToNext"
linktitle: "MoveToNext"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Xml::XPath::XPathNavigator::MoveToNext. عندما يتم تجاوزها في فئة مشتقة، تنقل XPathNavigator إلى العقدة الشقيقة التالية للعقدة الحالية في C++."
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
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::MoveToNext(String, String) method


ينقل [XPathNavigator](../) إلى العقدة الشقيقة التالية بالاسم المحلي ومسار مساحة الاسم المحددين.

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToNext(String localName, String namespaceURI)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| localName | String | الاسم المحلي للعقدة الشقيقة التالية التي سيتم الانتقال إليها. |
| namespaceURI | String | مسار مساحة الاسم للعقدة الشقيقة التالية التي سيتم الانتقال إليها. |

### ReturnValue

**true** if the [XPathNavigator](../) is successful moving to the next sibling node; **false** if there are no more siblings, or if the [XPathNavigator](../) is currently positioned on an attribute node. If **false**, the position of the [XPathNavigator](../) is unchanged.

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::MoveToNext(XPathNodeType) method


ينقل [XPathNavigator](../) إلى العقدة الشقيقة التالية للعقدة الحالية التي تطابق [XPathNodeType](../../xpathnodetype/) المحدد.

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToNext(XPathNodeType type)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| type | XPathNodeType | الـ [XPathNodeType](../../xpathnodetype/) للعقدة الشقيقة التي سيتم الانتقال إليها. |

### ReturnValue

**true** if the [XPathNavigator](../) is successful moving to the next sibling node; otherwise, **false** if there are no more siblings or if the [XPathNavigator](../) is currently positioned on an attribute node. If **false**, the position of the [XPathNavigator](../) is unchanged.

## انظر أيضًا

* Enum [XPathNodeType](../../xpathnodetype/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
